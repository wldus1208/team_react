package kr.happyjob.study.service.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.repository.board.BoardDAO;


@Service
public class BoardServiceImpl implements BoardService{
	
	private BoardDAO boardDAO;
	
	@Autowired
	public BoardServiceImpl(BoardDAO boardDAO) {
		this.boardDAO = boardDAO;
	}

}
