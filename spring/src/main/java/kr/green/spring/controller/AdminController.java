package kr.green.spring.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.pagination.PageMaker;
import kr.green.spring.service.BoardService;
import kr.green.spring.service.MemberService;
import kr.green.spring.service.PageMakerService;
import kr.green.spring.vo.BoardVO;
import kr.green.spring.vo.MemberVO;

@Controller
public class AdminController {
	@Autowired
	MemberService memberService;
	@Autowired
	PageMakerService pageMakerService;
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value="/admin/user/list", method=RequestMethod.GET)
	public String adminUserListGet(Model model,Criteria cri) {
		cri.setPerPageNum(5);
		//리스트를 현재 페이지 정보를 기준으로 가져와야함
		ArrayList<MemberVO> list = memberService.getAllMember(cri);
		//totalCount를 db에서 검색해서 가져와야함
		int totalCount = memberService.getTotalCount();
		//jsp에서 페이지네이션 링크를 board/list가 아닌 admin/user/list로 수정해야함
		
		PageMaker pm = pageMakerService.getPageMaker(5, cri, totalCount);
		
		model.addAttribute("pageMaker",pm);
		model.addAttribute("list",list);
		return "admin/user/list";
	}
	@RequestMapping(value="/admin/user/update", method=RequestMethod.GET)
	public String adminUserUpdateGet(Model model,Criteria cri,MemberVO mVo) {
		memberService.updateAuthority(mVo);
		model.addAttribute("page", cri.getPage());
		return "redirect:/admin/user/list";
	}
	@RequestMapping(value="/admin/board/list", method=RequestMethod.GET)
	public String adminBoardListGet(Model model,Criteria cri) {
		ArrayList<BoardVO> boardList = boardService.getBoardListAll(cri);
		int totalCount = boardService.getTotalCountAll(cri);
		
		PageMaker pm = pageMakerService.getPageMaker(5, cri, totalCount);
		
		model.addAttribute("pageMaker", pm);
		model.addAttribute("list", boardList);
		
		return "admin/board/list";
	}
	@RequestMapping(value="/admin/board/update", method=RequestMethod.GET)
	public String adminBoardUpdateGet(Model model,Criteria cri,BoardVO bVo) {
		boardService.updateValid(bVo);
		model.addAttribute("page", cri.getPage());
		return "redirect:/admin/board/list";
	}
}
