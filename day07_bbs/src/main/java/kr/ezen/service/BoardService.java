package kr.ezen.service;

import java.util.List;

import kr.ezen.bbs2.domain.BoardDTO;
import kr.ezen.bbs2.domain.PageDTO;

public interface BoardService {
	// 게시글 등록
	void register(BoardDTO dto);
	
	// 게시글 리스트
//	List<BoardDTO> getList();
	List<BoardDTO> getList(PageDTO pDto);
	
	// 글 상세보기
	BoardDTO view(int bid, String mode);
	
	// 글 수정하기 
	int modify(BoardDTO dto);
	
	// 글 삭제하기
	int remove(int bid);
	
	// 조회수 증가
//	void hitAdd(int bid);
	
	// 전체 게시글 수
	int totalCnt();
}
