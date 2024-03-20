package kr.happyjob.study.controller.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.happyjob.study.service.board.BoardService;

@Controller
public class BoardController {

	private BoardService boardService;
	
	@Autowired
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
		
		
	}
}
