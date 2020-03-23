<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tic Tac Toe</title>
</head>
<body>
<f:view>
	<h1>Tic Tac Toe</h1>
	
	<h:form>
	<h2>
	<b>	
	<h:outputLabel value="#{ticTacToe.player1}"></h:outputLabel>&nbsp;
	<h:outputLabel value="#{ticTacToe.player1Score}"></h:outputLabel>&nbsp;
	<h:outputLabel value=":"></h:outputLabel>&nbsp;
	<h:outputLabel value="#{ticTacToe.player2Score}"></h:outputLabel>&nbsp;
	<h:outputLabel value="#{ticTacToe.player2}"></h:outputLabel>&nbsp;
	
	</b>
	</h2>
	</h:form>
	
    <h:form rendered="#{ticTacToe.startScreen}">
    
            <h:outputLabel value="Player 1 name:"></h:outputLabel> &nbsp; 
            <h:inputText id = "name1" value="#{ticTacToe.player1}"></h:inputText>
            <br/>         
            <br/>
            <h:outputLabel value="Player 2 name:"></h:outputLabel> &nbsp;
            <h:inputText id = "name2" value="#{ticTacToe.player2}"></h:inputText>
            <br/>
            <br/>
            <br/>
            <h:commandButton action="#{ticTacToe.setboardVisible(true)}" value="Start Game"></h:commandButton>  &nbsp;
            <h:commandButton onclick="self.close()" value="Quit"></h:commandButton>&nbsp;
            
    </h:form>
    
    <h:form rendered="#{ticTacToe.boardVisible}">
    	
    	<b>	<h:outputLabel value="#{ticTacToe.currentPlayer}'s turn..."></h:outputLabel> </b>
    	<h:outputText value="asd"></h:outputText>
    	
    	<br/>
        <br/>
            <h:commandButton action="#{ticTacToe.endTurn(1)}" value="#{ticTacToe.button1}"></h:commandButton>&nbsp;
            <h:commandButton action="#{ticTacToe.endTurn(2)}" value="#{ticTacToe.button2}"></h:commandButton>&nbsp;
            <h:commandButton action="#{ticTacToe.endTurn(3)}" value="#{ticTacToe.button3}"></h:commandButton>&nbsp;
            
        <br/>
        <br/>
            <h:commandButton action="#{ticTacToe.endTurn(4)}" value="#{ticTacToe.button4}"></h:commandButton>&nbsp;
            <h:commandButton action="#{ticTacToe.endTurn(5)}" value="#{ticTacToe.button5}"></h:commandButton>&nbsp;
            <h:commandButton action="#{ticTacToe.endTurn(6)}" value="#{ticTacToe.button6}"></h:commandButton>&nbsp;
            
        <br/>
        <br/>
            <h:commandButton action="#{ticTacToe.endTurn(7)}" value="#{ticTacToe.button7}"></h:commandButton>&nbsp;
            <h:commandButton action="#{ticTacToe.endTurn(8)}" value="#{ticTacToe.button8}"></h:commandButton>&nbsp;
            <h:commandButton action="#{ticTacToe.endTurn(9)}" value="#{ticTacToe.button9}"></h:commandButton>&nbsp;
        <br/>
        <br/>
        
        <i><h:outputLabel style="color:red" value="#{ticTacToe.errorMessage}"></h:outputLabel></i>
        <br/>
        <br/>
        <h:commandButton action="#{ticTacToe.newGame}" value="New Game"></h:commandButton> &nbsp;
        <h:commandButton onclick="self.close()" value="Quit"></h:commandButton>&nbsp;
               
    </h:form>  
    
    <h:form rendered="#{ticTacToe.gameOver}">
    <br/>
        <br/>
            <h:commandButton style="Color:#{ticTacToe.button1Color}" 
            value="#{ticTacToe.button1}"></h:commandButton>&nbsp;
           
            <h:commandButton style="Color:#{ticTacToe.button2Color}" 
            value="#{ticTacToe.button2}"></h:commandButton>&nbsp;
            
            <h:commandButton style="Color:#{ticTacToe.button3Color}" 
            value="#{ticTacToe.button3}"></h:commandButton>&nbsp;
            
        <br/>
        <br/>
            <h:commandButton style="Color:#{ticTacToe.button4Color}" 
            value="#{ticTacToe.button4}"></h:commandButton>&nbsp;
            
            <h:commandButton style="Color:#{ticTacToe.button5Color}"
            value="#{ticTacToe.button5}"></h:commandButton>&nbsp;
            
            <h:commandButton style="Color:#{ticTacToe.button6Color}" 
            value="#{ticTacToe.button6}"></h:commandButton>&nbsp;
            
        <br/>
        <br/>
            <h:commandButton style="Color:#{ticTacToe.button7Color}" 
            value="#{ticTacToe.button7}"></h:commandButton>&nbsp;
            
            <h:commandButton style="Color:#{ticTacToe.button8Color}"
             value="#{ticTacToe.button8}"></h:commandButton>&nbsp;
            
            <h:commandButton style="Color:#{ticTacToe.button9Color}" 
            value="#{ticTacToe.button9}"></h:commandButton>&nbsp;
        <br/>
        <br/>
    
    	<b><h2>	<h:outputLabel style="color:blue" value="#{ticTacToe.gameOverMessage}"></h:outputLabel> </h2></b>
    	
    	<h:commandButton action="#{ticTacToe.rematch}" value="Rematch"></h:commandButton> &nbsp;
    	<h:commandButton action="#{ticTacToe.newGame}" value="New Game"></h:commandButton> &nbsp;
    	<h:commandButton onclick="self.close()" value="Quit"></h:commandButton>&nbsp;
    
    </h:form> 
   
</f:view>
</body>
</html>