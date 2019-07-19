package com.soccermatching.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soccermatching.dao.MatchBoardDAO;
import com.soccermatching.dto.MatchBoardDTO;

@Controller
@RequestMapping("/match-register")
public class MatchBoardRegisterController {
	
	@Autowired
	private MatchBoardDAO matchBoardDAO;
	
	@GetMapping
	public String get() {
		return "match_board";
	}
	
	@PostMapping
	public void register(MatchBoardDTO matchBoardDTO) {
		matchBoardDAO.create(matchBoardDTO);
	}

}
