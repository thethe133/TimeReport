package com.hansol.timereport.domain.plan.repository;

import com.hansol.timereport.domain.plan.entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlanRepository extends JpaRepository<Plan, Long> {

    List<Plan> findByMemberMemberIdAndPlanDayIn(Long memberId, List<String> planDays);

    List<Plan> findByMemberMemberIdAndPlanDayBetween(Long memberId, String startDay, String endDay);

    boolean existsByMemberMemberIdAndPlanDayBetween(Long memberId, String startDay, String endDay);

    void deleteByPlanId(Long planId);

    List<Plan> findByPlanIdInAndMemberMemberIdAndPlanDay(List<Long> planIds, Long memberId, String day);

    List<Plan> findByPlanDayAndMemberMemberId(String targetDay, Long memberId);

	int countByPlanDay(String planDay);

	int countByMemberMemberId(Long memberId);
}
