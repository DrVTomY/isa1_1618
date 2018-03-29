package isa_1618;
import java.util.Scanner;  

public class match {
	 private static Scanner sc;
	 
	 

	public static void main(String args[]){  
	
		 sc = new Scanner(System.in);
		 
		 String team1,team2;
		 int ball_t1,tovers_t1,c,d;
		 int ball_t2,tovers_t2;
		 int total_score_t1 = 0,wickets_t1 = 0;
		 int total_score_t2 = 0,wickets_t2 = 0;
		 
		 System.out.println("Enter name of team 1");  
		  team1 = sc.next();
		 
		 System.out.println("Enter name of team 2");  
		 team2 = sc.next();
		 
		 System.out.printf("score innings by "+team1);  
		  for( tovers_t1=1;tovers_t1<=2;tovers_t1++)
		  {  
			  for( ball_t1=1;ball_t1<=6;ball_t1++)
			  {  
				  System.out.println("\nEnter runs scored on"+ball_t1+"ball"+tovers_t1+"over");  
				   int a=sc.nextInt(); 
				   total_score_t1 = total_score_t1 + a;
			  }
			  System.out.println("hw many wickets were obtained by other team");
			  int b=sc.nextInt();
			  wickets_t1 = wickets_t1 + b;
			  System.out.println("\n the current runs scored are "+total_score_t1+"for"+wickets_t1+"in"+tovers_t1+"overs");
			  if(wickets_t1>10){  
			        System.out.print("team is all out");  
			        break;
			    }  
			  
		  }
		  
		  System.out.println("\n "+team2+"needs"+total_score_t1+" in 2 over \n\n");
		  
		  System.out.printf("score  innings by "+team2);  
		  for( tovers_t2=1;tovers_t2<=2;tovers_t2++)
		  {  
			  for( ball_t2=1;ball_t2<=6;ball_t2++)
			  {  
				  System.out.println("\nEnter runs scored on"+ball_t2+"ball"+tovers_t2+"over");  
				   int a=sc.nextInt(); 
				   total_score_t2 = total_score_t2 + a;
				   if(total_score_t2>total_score_t1){  
					  	 c = 3 - wickets_t2;
				        System.out.print("\n\nyippe"+team2+" won the match by"+c+" wickets\n\n ");  
				        break;
				    }  
			  }
			  System.out.println("hw many wickets were obtained by other team");
			  int b=sc.nextInt();
			  wickets_t2 = wickets_t2 + b;
			  System.out.println("\n the current runs scored are "+total_score_t2+"for"+wickets_t2+"in"+tovers_t2+"overs");
			  if(wickets_t1>3){  
			        System.out.print("team is all out");  
			        break;
			    }  
			  
		  }
		  
		  if(total_score_t1>total_score_t2){  
			  	 d = total_score_t1 - total_score_t2 ;
		        System.out.print("\n\nyippe"+team1+" won the match by"+d+" wickets\n\n ");  
		        
		    }  
				  
		 
	
}
}
