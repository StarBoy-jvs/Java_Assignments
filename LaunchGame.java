package com.coreJava.assignments;

import java.util.*;


class Player
{
	int pguessNum;
	
	public int guessNumber()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player kindly guess the number between 0 - 10");
		pguessNum=scan.nextInt();
		return pguessNum;
	}
}

class Umpire
{
	
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int pointsOfPlayer1;
	int pointsOfPlayer2;
	int pointsOfPlayer3;
	
	public void collectNumFromGuesser()
	{

		Random rd = new Random();
		numFromGuesser = rd.nextInt(10);
		
	}
	
	
	public void collectNumFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		
		numFromPlayer1=p1.guessNumber();
		numFromPlayer2=p2.guessNumber();
		numFromPlayer3=p3.guessNumber();
	}
	
	void compare()
	{
		Random rd = new Random();
		int guessNum = rd.nextInt(10);
		
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("Round tied all three players guessed correctly");
				pointsOfPlayer1+=1;
				pointsOfPlayer2+=1;
				pointsOfPlayer3+=1;
			}
			else if(numFromGuesser==numFromPlayer2)
			{

				System.out.println("Player 1 and Player2 round the game");
				pointsOfPlayer1+=1;
				pointsOfPlayer2+=1;
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 and Player3 won the Round");
				pointsOfPlayer1+=1;
				pointsOfPlayer3+=1;
			}
			else
			{
			
			System.out.println("Player 1 won the Round");
			pointsOfPlayer1+=1;
			}
		}
		
		
		else if(numFromGuesser==numFromPlayer2)
		{
			
			if(numFromGuesser==numFromPlayer3)
			{
			System.out.println("Player 2 and Player3 won the Round");
			pointsOfPlayer2+=1;
			pointsOfPlayer3+=1;
			}
			else
			{
				System.out.println("Player 2 won the Round");
				pointsOfPlayer2+=1;
			}
		}
		
		
		
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the Round");
			pointsOfPlayer3+=1;
		}
		else
		{
			System.out.println("Round lost! All Loosers Here....!");
		}
	}
	
}

class Max{
	int max;
	int winner;
	public int findMax(int one, int two, int three) {
		
		
		if(one > two) 
			max = one;
		else
			max=two;
		
		if(max > three)
			winner=max;
		else
			winner=three;
		
		return winner;
	}
}



class Winner{
	
	String chooseWinner(int winner,int one,int two,int three, int max) {
		
		String nameOfWinner;
		if(winner==one && winner==two && winner==three)
			nameOfWinner="All Won..!";
		else if (one==0 && two == 0 && three==0)
			nameOfWinner = "Everyone is Looser..!";
		else if (winner==one && winner==two)
			nameOfWinner="Player 1 and Player2";
		else if (winner==one && winner==three)
			nameOfWinner="Player 1 and Player2";
		else if (winner==three && winner==two)
			nameOfWinner="Player 1 and Player2";
		else if (winner==three)
			nameOfWinner = "Player 3";
		else if (max==two)
			nameOfWinner= "Player 2";
		else
			nameOfWinner = "Player 1";
		
		return nameOfWinner;
		
	}
}

public class LaunchGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Umpire u=new Umpire();
//		Round1
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
//		Round2
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
//		Round1
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();	
		
		int one = u.pointsOfPlayer1;
		int two = u.pointsOfPlayer2;
		int three = u.pointsOfPlayer3;

		Max m = new Max();
		int winner = m.findMax(one, two, three);

		Winner w = new Winner();
		String nameOfWinner = w.chooseWinner(winner, one, two, three, m.max);
		
		System.out.println("########## Final Score Card ############## ");
		System.out.println("Player 1 :" +one + " "+"Player 2 : " +two+ " "+"Player 3 : " + three + " ");
		System.out.println("Congrats.."+nameOfWinner+" Winner Winner Chicken Dinner.....! ");
	}

}







