package kr.green.spring.dao;

import java.util.ArrayList;

import kr.green.spring.vo.BoardVO;

public interface BoardDAO {

	ArrayList<BoardVO> getBoardList();

	BoardVO getBoard(Integer num);

	void updateViews(Integer num);

	void updateBoard(BoardVO tmp);

	void registerBoard(BoardVO boardVo);

}
