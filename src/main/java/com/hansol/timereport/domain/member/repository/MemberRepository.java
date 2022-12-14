package com.hansol.timereport.domain.member.repository;

import java.util.List;
import java.util.Optional;

import com.hansol.timereport.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long>{
	
	Optional<Member> findByMemberCode(String memberCode);

	List<Member> findAllByDeptCode(String deptCode);
	
	Optional<List<Member>> findMembersByDeptCode(String deptCode);

}
