/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
			System.out.println("Enter the Player1's name: ");
		Scanner sc = new Scanner(System.in);
		String player1 = sc.nextLine();
		System.out.println("Enter the Player2's name: ");
		String player2 = sc.nextLine();
		int score1 = 0;
		int score2 = 0;
		int n1 = 0;
		int n2 = 0;
		while(score1 < 100 && score2 < 100)
		{
		    System.out.println(player1 + " enter a number between 1-6 ");
		   	int value = sc.nextInt(); 
		   	if(value <=6)
		   	{
		   	if((score1 + value) <= 100)
		   	{
		   	    n1 = score1 + value;
		   	    if(n1 == 98 || n1 == 82 || n1 == 90)
		   	    {
		   	        n1 -= 80;
		   	         System.out.println("OUCHH in a snake!! " + player1 + " is now on: " + n1  );
		   	    }
		   	    else if(n1 == 95 || n1 == 85 || n1 == 36 || n1 == 44 || n1 == 30  || n1 == 36)
		   	    {
		   	        n1 -= 20;
		   	        System.out.println("OUCHH in a snake!! " + player1 + " is now on: " + n1  );
		   	    }
		   	   else if(n1 == 6 || n1 == 31 || n1 == 3  || n1 == 12 || n1 == 13 || n1 == 26 )
		   	    {
		   	        n1 -= 2;
		   	         System.out.println("OUCHH in a snake!! " + player1 + " is now on: " + n1  );
		   	    }
		   	   else if(n1 == 46 || n1 == 72 || n1 == 28 || n1 == 66 || n1 == 83 )
		   	    {
		   	        n1 -= 4;
		   	         System.out.println("OUCHH in a snake!! " + player1 + " is now on: " + n1  );
		   	    }
		   	   else  if(n1 == 2 || n1 == 62 || n1 == 27 || n1 == 69 || n1 == 81 )
		   	    {
		   	        n1 += 10;
    		   	         System.out.println("WOW Your are in a ladder!! " + player1 + " is now on: " + n1  );
		   	    }
		   	   else  if(n1 == 50 || n1 == 10 || n1 == 27  )
		   	    {
		   	        n1 += 41;
    		   	         System.out.println("WOW Your are in a ladder!! " + player1 + " is now on: " + n1 );
		   	    }
		   	    else
		   	    {
		   	         System.out.println( player1 + " is now on: " + n1 );
		   	    }
		   	   
		   	    score1 = n1; 
		   	}
		   	else{
		   	    System.out.println(  player1 + " is on: " + n1 + " You have no move!!");
		   	}
		   	}
		   	else{
		   	    System.out.println("Inlegal Move!! " +  player1 + " is on: " + n1 );
		   	}
		   	
		   	
		   	//player2
		   	
		   	System.out.println(player2 + " enter a number between 1-6 ");
		   	int value2 = sc.nextInt(); 
		   	if(value2 <=6)
		   	{
		   	if((score2 + value2) <= 100)
		   	{
		   	    n2 = score2 + value2;
		   	    if(n2 == 98 || n2 == 82 || n2 == 90)
		   	    {
		   	        n2 -= 80;
		   	         System.out.println("OUCHH in a snake!! " + player2 + " is now on: " + n2  );
		   	    }
		   	    else if(n2 == 95 || n2 == 85 || n2 == 36 || n2 == 44 || n2 == 30  || n2 == 36)
		   	    {
		   	        n2 -= 20;
		   	        System.out.println("OUCHH in a snake!! " + player2 + " is now on: " + n2  );
		   	    }
		   	   else if(n2 == 6 || n2 == 31 || n2 == 3  || n2 == 12 || n2 == 13 || n2 == 26 )
		   	    {
		   	        n2 -= 2;
		   	         System.out.println("OUCHH in a snake!! " + player2 + " is now on: " + n2  );
		   	    }
		   	   else if(n2 == 46 || n2 == 72 || n2 == 28 || n2 == 66 || n2 == 83 )
		   	    {
		   	        n2 -= 4;
		   	         System.out.println("OUCHH in a snake!! " + player2 + " is now on: " + n2  );
		   	    }
		   	   else  if(n2 == 2 || n2 == 62 || n2 == 27 || n2 == 69 || n2 == 81 )
		   	    {
		   	        n2 += 10;
    		   	         System.out.println("WOW Your are in a ladder!! " + player2 + " is now on: " + n2  );
		   	    }
		   	   else  if(n2 == 50 || n2 == 10 || n2 == 27  )
		   	    {
		   	        n2 += 41;
    		   	         System.out.println("WOW Your are in a ladder!! " + player2 + " is now on: " + n2 );
		   	    }
		   	    else
		   	    {
		   	         System.out.println( player2 + " is now on: " + n2 );
		   	    }
		   	   
		   	   score2 = n2;  
		   	}
		   	else{
		   	    System.out.println(  player2 + " is on: " + n2 + " You have no move!!");
		   	}
		   	}
		   	else{
		   	    System.out.println("Inlegal Move!! " +  player2 + " is on: " + n2 );
		   	}
		   	
		}
		//RESULT
		
	if(score1 > score2)
		{
		
		System.out.println("The winner is " + player1 + " with points: " + score1);
		System.out.println(player2 + " is on: " + score2);
		}
		else{
		    	System.out.println("The winner is " + player2 + " with points: " + score2);
		    	System.out.println(player1 + " is on: " + score1);
		    
		}
	}
}
