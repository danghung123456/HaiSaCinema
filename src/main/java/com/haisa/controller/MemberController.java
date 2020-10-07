package com.haisa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.haisa.DTO.MemberDTO;
import com.haisa.DTO.MovieDTO;
import com.haisa.Entity.Member;
import com.haisa.Entity.Movie;
import com.haisa.service.impl.MemberService;
import com.haisa.service.impl.MovieService;


@RestController
public class MemberController {
	
	@Autowired
	private MemberService memberService;

	@GetMapping("/member")
	public List<MemberDTO> getAllMember() {
		return memberService.findAll();
	}

	@GetMapping("/member/{memberId}")
	public MemberDTO getMemberById(@PathVariable(value = "memberId") Integer memberId){
		 Member member = new Member();
		 member.setMemberId(memberId);
		return memberService.findMember(member);
	}

	@PostMapping("/member")
	public MemberDTO createMember(@RequestBody MemberDTO member) {
		return memberService.save(member);
	}

	@PutMapping("/member/{memberId}")
	public MemberDTO updateMember(@RequestBody MemberDTO member, @PathVariable("memberId") Integer memberId) {
		member.setMemberId(memberId);
		return memberService.update(member);
	}
	@DeleteMapping("/member")
	public void deleteMemberById(@RequestBody Integer[] ids) {
		memberService.delete(ids);
		
	}
}
