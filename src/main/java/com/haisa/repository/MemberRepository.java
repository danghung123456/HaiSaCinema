package com.haisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.haisa.Entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member,Integer>{

	Member findByMemberId(Integer memberId);
	
	
		
	}



