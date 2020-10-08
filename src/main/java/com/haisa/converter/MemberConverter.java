package com.haisa.converter;

import org.springframework.stereotype.Component;
import com.haisa.DTO.MemberDTO;
import com.haisa.entity.Member;



@Component
public class MemberConverter {
	public Member toEntity(MemberDTO dto) {
		Member entity = new Member();
		entity.setMemberId(dto.getMemberId());
		entity.setMemberName(dto.getMemberName());
		entity.setEmail(dto.getEmail());
		entity.setPassword(dto.getPassword());
		entity.setAddress(dto.getAddress());
		entity.setBirthday(dto.getBirthday());
		entity.setIdCard(dto.getIdCard());
		entity.setPhone(dto.getPhone());
		entity.setTotalMoney(dto.getTotalMoney());
		return entity;
	}
	
	public MemberDTO toDTO(Member entity) {
		MemberDTO dto = new MemberDTO();
		dto.setMemberId(entity.getMemberId());
		dto.setMemberName(entity.getMemberName());
		dto.setEmail(entity.getEmail());
		dto.setPassword(entity.getPassword());
		dto.setAddress(entity.getAddress());
		dto.setBirthday(entity.getBirthday());
		dto.setIdCard(entity.getIdCard());
		dto.setPhone(entity.getPhone());
		dto.setTotalMoney(entity.getTotalMoney());
		return dto;
	}
	
	public Member toEntity(MemberDTO dto, Member entity) {
		entity.setMemberId(dto.getMemberId());
		entity.setMemberName(dto.getMemberName());
		entity.setEmail(dto.getEmail());
		entity.setPassword(dto.getPassword());
		entity.setAddress(dto.getAddress());
		entity.setBirthday(dto.getBirthday());
		entity.setIdCard(dto.getIdCard());
		entity.setPhone(dto.getPhone());
		entity.setTotalMoney(dto.getTotalMoney());
		return entity;
	}
}
