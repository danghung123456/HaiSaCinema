package com.haisa.service;

import java.util.List;
import com.haisa.DTO.MemberDTO;
import com.haisa.entity.Member;



public interface MemberSv {
	MemberDTO save(MemberDTO memberDTO);
	MemberDTO update(MemberDTO memberDTO);
	List<MemberDTO> findAll();
	MemberDTO findMember(Member member);
	void delete(Integer[] ids);
}
