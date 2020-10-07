package com.haisa.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.haisa.DTO.MemberDTO;
import com.haisa.Entity.Member;
import com.haisa.converter.MemberConverter;
import com.haisa.repository.MemberRepository;
import com.haisa.service.MemberSv;


@Service
public class MemberService implements MemberSv {
	@Autowired
	private MemberRepository memberRepository;

	@Autowired
	private MemberConverter memberConverter;

	@Override
	public MemberDTO save(MemberDTO memberDTO) {
		Member member = memberConverter.toEntity(memberDTO);
		member = memberRepository.save(member);
		return memberConverter.toDTO(member);
	}

	@Override
	public MemberDTO update(MemberDTO memberDTO) {
		Member oldMember = memberRepository.findByMemberId(memberDTO.getMemberId());
		Member member = memberConverter.toEntity(memberDTO, oldMember);
		member = memberRepository.save(member);
		return memberConverter.toDTO(member);
	}
	@Override
	public void delete(Integer[] ids) {
		for(Integer item: ids) {
			memberRepository.deleteById(item);
		}
	}
	

	@Override
	public List<MemberDTO> findAll() {
		List<MemberDTO> listmemberDTO = new ArrayList<MemberDTO>();
		List<Member> entity = memberRepository.findAll();
		for (Member item : entity) {
			MemberDTO memberDTO = memberConverter.toDTO(item);
			listmemberDTO.add(memberDTO);
		}
		return listmemberDTO;
	}

	@Override
	public MemberDTO findMember(Member entity) {
		MemberDTO memberdto ;
		entity = memberRepository.findByMemberId(entity.getMemberId());
		memberdto = memberConverter.toDTO(entity);
		return memberdto;
	}

}
