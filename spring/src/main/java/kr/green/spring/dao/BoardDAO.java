package kr.green.spring.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.vo.BoardVO;
import kr.green.spring.vo.FileVO;

public interface BoardDAO {

	ArrayList<BoardVO> getBoardList(Criteria cri);

	BoardVO getBoard(Integer num);

	void updateViews(Integer num);

	void updateBoard(BoardVO tmp);

	void registerBoard(BoardVO boardVo);

	void deleteBoard(Integer num);

	int getTotalCount(Criteria cri);

	ArrayList<BoardVO> getBoardListAll(Criteria cri);

	int getTotalCountAll(Criteria cri);

	void updateValid(BoardVO bVo);

	void insertFile(@Param("file")String file, @Param("num")int num);

	ArrayList<FileVO> selectFileList(Integer num);

	int getMaxBoardNum();

}
