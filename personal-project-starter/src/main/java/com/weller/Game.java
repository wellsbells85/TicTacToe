package com.weller;

public abstract class Game {

	protected abstract void setup(int numberOfPlayers);

	protected abstract int takeTurn();
	
	protected abstract boolean threeInRow();

	protected boolean isGameOver() {
		if(takeTurn() == 9 || threeInRow()) {
			return true;
		} else {
			return false;
		}	
	}

	protected abstract void finishGame();
		
}
