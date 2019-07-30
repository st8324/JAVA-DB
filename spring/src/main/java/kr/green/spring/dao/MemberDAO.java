package kr.green.spring.dao;

import java.util.ArrayList;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.vo.MemberVO;

public interface MemberDAO {

	MemberVO getMember(String id);

	void signup(MemberVO mVo);

	void modify(MemberVO mVo);

	ArrayList<MemberVO> getAllMember(Criteria cri);

	int getTotalCount();

	void updateAuthority(MemberVO mVo);
	
}
