
package com.game.service.impl;

import com.game.model.Player;
import com.game.util.GameConstant;

/**
 * @author 2020-DEV-045
 *
 */
public class TennisGame {
	
	private Player firstPlayer;
	private Player secondPlayer;
	
	/*
	 * Method to valid player score input parameter.
	 */
	public boolean isValidScore(int playerOneScore, int playerTwoScore) {
		boolean validScore = true;
		if(playerOneScore < 0 || playerTwoScore < 0) {
			validScore=false;
		}
		return validScore;
	}
	
	/*
	 * Method to check player with highest score
	 */
	public String getLeadingScorer(Player firstPlayer, Player secondPlayer) {
		if (firstPlayer.getPlayerScore() > secondPlayer.getPlayerScore()) {
			return firstPlayer.getPlayerName();
		} else {
			return secondPlayer.getPlayerName();
		}
	}
	
	/*
	 *  Method to return score in words
	 */
	
	public String getScore(int score) {
		switch (score) {
		case 3:
			return GameConstant.SCORE_FORTY;
		case 2:
			return GameConstant.SCORE_THIRTY;
		case 1:
			return GameConstant.SCORE_FIFTEEN;
		default:
			return GameConstant.SCORE_LOVE;
		}
	}

	/**
	 * @return the firstPlayer
	 */
	public Player getFirstPlayer() {
		return firstPlayer;
	}

	/**
	 * @param firstPlayer the firstPlayer to set
	 */
	public void setFirstPlayer(Player firstPlayer) {
		this.firstPlayer = firstPlayer;
	}

	/**
	 * @return the secondPlayer
	 */
	public Player getSecondPlayer() {
		return secondPlayer;
	}

	/**
	 * @param secondPlayer the secondPlayer to set
	 */
	public void setSecondPlayer(Player secondPlayer) {
		this.secondPlayer = secondPlayer;
	}
}
