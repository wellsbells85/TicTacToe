package com.weller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/one-player")
public class OnePlayerGame extends Game {

	@Override
	protected void setup(int numberOfPlayers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected int takeTurn() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected boolean threeInRow() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void finishGame() {
		// TODO Auto-generated method stub
		
	}



}
