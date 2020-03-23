public class TicTacToe {
	 private boolean boardVisible = false;
	 private boolean startScreen = true;
	 private boolean gameOver = false;
	
	 
	 public int getPlayer1Score() {
		return player1Score;
	}

	public void setPlayer1Score(int player1Score) {
		this.player1Score = player1Score;
	}

	public int getPlayer2Score() {
		return player2Score;
	}

	public void setPlayer2Score(int player2Score) {
		this.player2Score = player2Score;
	}
	
	 private String player1 = "";
	 private String player2 = "";
	 private String currentPlayer = "N/A";
	 private String symbol = "O";
	 private int player1Score = 0;
	 private int player2Score = 0;
	 private int turnCounter = -1;

	 private String button1 = "  ";
	 private String button2 = "  ";
	 private String button3 = "  ";
	 private String button4 = "  ";
	 private String button5 = "  ";
	 private String button6 = "  ";
	 private String button7 = "  ";
	 private String button8 = "  ";
	 private String button9 = "  ";
	 
	 private String button1Color = "Black";
	 private String button2Color = "Black";
	 private String button3Color = "Black";
	 private String button4Color = "Black";
	 private String button5Color = "Black";
	 private String button6Color = "Black";
	 private String button7Color = "Black";
	 private String button8Color = "Black";
	 private String button9Color = "Black";
	 
	 public String getButton1Color() {
			return button1Color;
		}

		public String getButton2Color() {
			return button2Color;
		}

		public String getButton3Color() {
			return button3Color;
		}

		public String getButton4Color() {
			return button4Color;
		}

		public String getButton5Color() {
			return button5Color;
		}

		public String getButton6Color() {
			return button6Color;
		}

		public String getButton7Color() {
			return button7Color;
		}

		public String getButton8Color() {
			return button8Color;
		}

		public String getButton9Color() {
			return button9Color;
		}
	 
	 private String errorMessage = "";
	 private String gameOverMessage = "";
	 
	 public void rematch() {
		 clearBoard();
		 turnCounter = -1;
		 setboardVisible(true);
	 }
	 
	 public void newGame() {
		 clearBoard();
		 turnCounter = -1;
		 player1Score = 0;
		 player2Score = 0;
		 player1 = "";
		 player2 = "";
		 setStartScreen(true);
	 }
	 
	 public void clearBoard() {
		 button1 = "  ";
		 button2 = "  ";
		 button3 = "  ";
		 button4 = "  ";
		 button5 = "  ";
		 button6 = "  ";
		 button7 = "  ";
		 button8 = "  ";
		 button9 = "  ";
		 button1Color = "Black";
		 button2Color = "Black";
		 button3Color = "Black";
		 button4Color = "Black";
		 button5Color = "Black";
		 button6Color = "Black";
		 button7Color = "Black";
		 button8Color = "Black";
		 button9Color = "Black";
	 }
	 
	 public String getGameOverMessage() {
		return gameOverMessage;
	}

	public boolean isStartScreen() {
		return startScreen;
	}

	public void setStartScreen(boolean startScreen) {
		this.startScreen = startScreen;
		boardVisible = !startScreen;
		gameOver = !startScreen;
	}

	public boolean isGameOver() {
		return gameOver;
	}

	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
		boardVisible = !gameOver;
		startScreen = !gameOver;
	}

	public boolean isBoardVisible() {
		return boardVisible;
	}

	public void setboardVisible(boolean boardVisible) {
		this.boardVisible = boardVisible;
		startScreen = !boardVisible;
		gameOver = !boardVisible;
		endTurn(0);
	}
	 

	public String getButton1() {
		return button1;
	}

	public void setButton1(String button1) {
		this.button1 = button1;
	}

	public String getButton2() {
		return button2;
	}

	public void setButton2(String button2) {
		this.button2 = button2;
	}

	public String getButton3() {
		return button3;
	}

	public void setButton3(String button3) {
		this.button3 = button3;
	}

	public String getButton4() {
		return button4;
	}

	public void setButton4(String button4) {
		this.button4 = button4;
	}

	public String getButton5() {
		return button5;
	}

	public void setButton5(String button5) {
		this.button5 = button5;
	}

	public String getButton6() {
		return button6;
	}

	public void setButton6(String button6) {
		this.button6 = button6;
	}

	public String getButton7() {
		return button7;
	}

	public void setButton7(String button7) {
		this.button7 = button7;
	}

	public String getButton8() {
		return button8;
	}

	public void setButton8(String button8) {
		this.button8 = button8;
	}

	public String getButton9() {
		return button9;
	}

	public void setButton9(String button9) {
		this.button9 = button9;
	}

	public String getCurrentPlayer() {
		return currentPlayer;
	}
	
	public boolean occupiedSpotCheck(int buttonNumber) {
		switch(buttonNumber) {
		case 0:
			break;
		case 1:
			if(button1.equals("O") || button1.equals("X")) {
				return true;
			}
			break;
		case 2:
			if(button2.equals("O") || button2.equals("X")) {
				return true;
			}
			break;
		case 3:
			if(button3.equals("O") || button3.equals("X")) {
				return true;
			}
			break;
		case 4:
			if(button4.equals("O") || button4.equals("X")) {
				return true;
			}
			break;
		case 5:
			if(button5.equals("O") || button5.equals("X")) {
				return true;
			}
			break;
		case 6:
			if(button6.equals("O") || button6.equals("X")) {
				return true;
			}
			break;
		case 7:
			if(button7.equals("O") || button7.equals("X")) {
				return true;
			}
			break;
		case 8:
			if(button8.equals("O") || button8.equals("X")) {
				return true;
			}
			break;
		case 9:
			if(button9.equals("O") || button9.equals("X")) {
				return true;
			}
			break;
			
		}
		return false;
	}
	
	public boolean checkForWins(String symbol) {
		if(button1 == symbol && button2 == symbol && button3 == symbol) {
			button1Color = "Red";
			button2Color = "Red";
			button3Color = "Red";
			return true;
		}
		if(button4 == symbol && button5 == symbol && button6 == symbol) {
			button4Color = "Red";
			button5Color = "Red";
			button6Color = "Red";
			return true;
		}
		if(button7 == symbol && button8 == symbol && button9 == symbol) {
			button7Color = "Red";
			button8Color = "Red";
			button9Color = "Red";
			return true;
		}
		if(button1 == symbol && button4 == symbol && button7 == symbol) {
			button1Color = "Red";
			button4Color = "Red";
			button7Color = "Red";
			return true;
		}
		if(button2 == symbol && button5 == symbol && button8 == symbol) {
			button2Color = "Red";
			button5Color = "Red";
			button8Color = "Red";
			return true;
		}
		if(button3 == symbol && button6 == symbol && button9 == symbol) {
			button3Color = "Red";
			button6Color = "Red";
			button9Color = "Red";
			return true;
		}
		
		if(button1 == symbol && button5 == symbol && button9 == symbol) {
			button1Color = "Red";
			button5Color = "Red";
			button9Color = "Red";
			return true;
		}
		if(button3 == symbol && button5 == symbol && button7 == symbol) {
			button3Color = "Red";
			button5Color = "Red";
			button7Color = "Red";
			return true;
		}
		
		return false;
	}

	public void endTurn(int buttonNumber) {
		
		
		errorMessage = "";
		
		if(occupiedSpotCheck(buttonNumber)) {
			errorMessage = "This square is already taken!";
			return;
		}
		
		
		switch(buttonNumber) {
		case 0:
			break;
		case 1:
			button1 = symbol;
			break;
		case 2:
			button2 = symbol;
			break;
		case 3:
			button3 = symbol;
			break;
		case 4:
			button4 = symbol;
			break;
		case 5:
			button5 = symbol;
			break;
		case 6:
			button6 = symbol;
			break;
		case 7:
			button7 = symbol;
			break;
		case 8:
			button8 = symbol;
			break;
		case 9:
			button9 = symbol;
			break;
		default:
			break;
		}
		if(turnCounter>3 && checkForWins(symbol)) {
			gameOverMessage = currentPlayer+" "+"("+symbol+") WINS!!!";
			if(currentPlayer==player1) {
				player1Score++;
			}else {
				player2Score++;
			}
			setGameOver(true);
		}
		
		turnCounter++;
		
		if(!checkForWins(symbol) && turnCounter>=9) {
			gameOverMessage = "It's a tie!";
			setGameOver(true);
		}
		
		if(currentPlayer.equals("N/A")) {
			currentPlayer = player1;
		}else {
			if(currentPlayer.equals(player1)) {
				currentPlayer = player2.toString();
			}else {
				currentPlayer = player1.toString();
			}
		}
		
		if(symbol.equals("O")) {
			symbol = "X";
		}else {
			symbol = "O";
		}
		
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public String getPlayer2() {
		return player2;
	}

	public void setPlayer2(String player2) {
		this.player2 = player2;
	}

}
