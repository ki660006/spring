package com.jeong.org.board;

import java.util.List;

public interface boardDAO {

	public List<boardDTO> boardall(PageDAO PageDAO);//게시판 리스트 호출
	public boardDTO boardselect(boardDTO board);//게시판 조회
	public void insertboard(boardDTO boardDTO);//게시판 글쓰기
	public void updateboard(boardDTO board);//게시판 글수정
	public void deleteboard(boardDTO board);//게시판 글삭제
	public void boardread_cnt(boardDTO board);//게시판 조회수
	public int pagecount();//게시판 페이징처리
	
}
