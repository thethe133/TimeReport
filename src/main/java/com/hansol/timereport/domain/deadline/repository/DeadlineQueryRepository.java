package com.hansol.timereport.domain.deadline.repository;

import java.util.List;

import com.hansol.timereport.domain.deadline.entity.Deadline;
import org.springframework.stereotype.Repository;

import com.hansol.timereport.deadline.entity.QDeadline;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class DeadlineQueryRepository{
	
	private final JPAQueryFactory queryFactory;
	
	public List<Deadline> findDeadlineBetween(String firstDay, String lastDay){
		
		return queryFactory.selectFrom(QDeadline.deadline)
				.where(QDeadline.deadline.deadlineDay.between(firstDay, lastDay))
				.orderBy(QDeadline.deadline.deadlineDay.asc())
				.fetch();
	}
	
	
	
	
	
	
}