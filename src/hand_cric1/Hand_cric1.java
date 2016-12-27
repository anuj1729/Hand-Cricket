
package hand_cric1;
import java.io.*;
import java.util.*;
import java.math.*;
class game
{
    Scanner s=new Scanner(System.in);
    Random x = new Random();
    void commentary(int bat,int ball)
    {
        int i=x.nextInt(7);
        if(bat!=ball)
        {
            switch(bat)
            {
                case 1:
                {
                    i=i%7+1;
                    switch(i)
                    {
                        case 1: 
                        {
                            System.out.print("\nPushes it to deep square-leg for a single\n");
                            break;
                        }
                        case 2:
                        {
                            System.out.print("\nSlogs it to midwicket for a single\n");
                            break;
                        }
                        case 3:
                        {
                            System.out.print("\nDrives it to long-off for a single\n");
                             break;
                        }
                        case 4:
                        {
                            System.out.print("\nSteers it to short third-man for a single\n");
                            break;
                        }
                        case 5:
                        {  
                            System.out.print("\nPlays the lofted drive to sweeper cover for a single\n");
                            break;
                        }
                        case 6:
                        {
                            System.out.print("\nPushes it to point and sets off for a quick single\n");
                        }
                        break; 
                        case 7:
                        {
                            System.out.print("\nComes down the track and pushes it to long-on for a single\n");
                        break;
                        }
                    }
                }
                break;
                case 2:
                {
                    i=i%6+1;
                    switch(i)
                    {
                        case 1 :
                        {
                            System.out.print(" \nDrives it to sweeper cover and gets a couple\n");
                            break;
                        }
                        case 2 :
                        {
                            System.out.print("\nSlogs it to long-off for a couple\n");
                            break; 
                        }
                        case 3 : 
                        {
                            System.out.print("\nOutside edge to third-man for a couple\n");
                            break;
                        }
                        case 4 :
                            {
                                System.out.print("\nSlower ball outside the off stump.\nBatsmen lofts it inside out to sweeper cover for a couple\n");
                                break;
                            }
                        case 5: 
                        {
                            System.out.print("\nSlices it over point for a couple\n");
                            break;
                        }
                        case 6: 
                            System.out.print("\nNudges it to fine-leg for a couple\n");
                            break;
                    }
                }
                break;
                case 3:
                {
                    i=i%5+1;
                    switch(i)
                    {
                        case 1 : 
                        {
                            System.out.print("\nShort ball outside the off stump., cuts it to deep point where a fielder dives and saves a single for his team\n");
                        }
                            break; 
                        case 2 : 
                        {
                            System.out.print("\n Outside edge, Batsmen poking at one in the channel outside \noff stump with a slightly open face and gets 3 runs\n"); 
                        }
                            break; 
                        case 3 : 
                        {
                            System.out.print("\nVery well placed between 2 fielders and the batsmen run fast and complete 3 runs\n" );
                            break;
                        }
                        
                        case 4 : 
                        {  
                            System.out.print("\nDrives the ball through cover not well timed but good enough to get 3 runs\n" );
                            break;
                        }
                        case 5 :
                        {   
                            System.out.print("\n Pulls it hard to mid-wicket an wonderful diving effort keeps it to 3 runs\n"); 
                            break;   
                        }        
                    }
                }
                break;
                case 4:
                {
                    i=i%6+1;
                    switch(i)
                    {
                        case 1: 
                        {
                            System.out.print("\nFOUR, Cuts it past point for a boundary\n");
                            break;
                        }
                        case 2 : 
                        {
                            System.out.print("\nFOUR, Good length ball outside the off stump. Batsmen looks to defend it on the off side and \ngets an outside edge to third-man for a boundary\n");
                            break;
                        }
                        case 3 :
                        {    
                            System.out.print("\nFOUR, Slower bouncer outside the off stump. Batsmen pulls it to deep midwicket for a boundary\n");
                            break;
                        }
                        

                        case 4 : 
                        { 
                            System.out.print("\nFOUR, Full-toss outside the off stump. Batsmen comes down the track and drives it \nback past the bowler to long-on for a boundary\n"); 
                            break;
                        }
                        case 5 :
                        {
                            System.out.print("\nFOUR, Flicks it easily past the mid-on fielder for a boundary\n");
                            break;
                        }
                        case 6 : 
                        { 
                            System.out.print("\nFOUR, Fuller ball on the leg stump. Batsmen is looking to go across the line.\n He gets an inside edge to fine-leg for a boundary\n");
                            break;
                        }
                    }
                }
                break;
                case 5:
                {
                    i=i%3+1;
                    switch(i)
                    {
                        case 1:
                        {
                            System.out.print("\nSharp single taken , over throw and goes for a boundary\n"); 
                            break; 
                        }
                        case 2:
                        {
                            System.out.print("\n5 WIDES , Bowlers sprays it down leg side ,keeper dives but could not stop it\n");
                            break;
                        }
                        case 3:
                        {
                            System.out.print("\nNO BALL, FOUR,  Fullish outside off, driven through gully brilliantly\n");
                            break;
                        }
                    }
                    
                }
                break;
                case 6:
                {
                    i=i%4+1;
                    switch(i)
                    {
                        case 1:
                        {
                            System.out.print("\nSIX, Clubs it to deep midwicket for a six\n");
                            break;
                        }
                        case 2:
                        {
                            System.out.print("\nSIX, Half-volley on the middle stump. Batsmen lofts it to long-on for another six\n");
                            break;
                        }
                        case 3:
                        {
                            System.out.print("\nSIX, Comes down the track and lofts it inside out over extra cover for a six\n");
                            break;
                        }
                        case 4:
                        {
                            System.out.print("\nSIX, Fuller ball outside the off stump. Batsmen slices it over sweeper cover for a six\n");
                            break;
                        }
                    }
                }
                break;
            }
        }
        else
        {
            i=i%10+1;
            switch(i)
            {
                case 1:
                {
                    System.out.print("\nOUT, Slower and wider outside the off stump. Batsmen cuts it straight into the hands of fielder at point\n");
                    break;
                }
                case 2:
                {
                    System.out.print("\nOUT, Fuller ball outside the off stump. batsmen lofts it to long-on. fielder runs across and takes the catch\n");
                    break;
                }
                case 3:
                {
                    System.out.print("\nOUT, Short ball on the leg stump. batsmen pulls, but gets a top edge to midwicket \nwhere fielder runs back and takes an easy catch\n");
                    break;
                }
                case 4:
                {
                    System.out.print("\nOUT, Just feathered an arm ball through to the keeper as he tried to guide to third man\n");
                    break;
                }
                case 5:
                {
                    System.out.print("\nOUT, Bowler bowls a perfect yorker and the batsmen is bowled\n");
                    break;
                }
                case 6:
                {
                    System.out.print("\n OUT, Batsmen tries to run on a misfield and is run out\n");
                    break;
                }
                case 7:
                {
                    System.out.print("\nOUT, Batsmen tries to come down the track but beaten in flight and stumped out by the keeper\n");
                    break;
                }
                case 8:
                {
                    System.out.print("\nOUT, Batsmen tries to reverse sweep ball hits his pads and he is given LBW\n");
                    break;
                }
                case 9:
                {
                    System.out.print("\nOUT, Batsmen tries to defend ball pops up to the bowler for an easy catch\n");
                    break;
                }
                case 10:
                {
                    System.out.print("\nOUT, Turning off a length and a thick edge is taken sharply by Fielder at slip.\n");
                    break;
                }
            }
        }
        
    }
    int mode()
    {
        System.out.println("\nPRESS 1 :To play  TEST 1 INNINGS (Unlimited overs with 2 wickets) ");
        System.out.println("\nPRESS 2 :To play  ODI  i.e  (you get 3 overs to play and 1 wicket) ");
        System.out.println("\nPRESS 3 :To play SUPER OVER i.e (6 Balls if u r nt out till it) ");
        int format=s.nextInt();
        return format;
    }
    int toss()
    {
        int coin,i,choice;
        System.out.println("Enter 1 for HEADS and 2 for TAILS");
        coin=s.nextInt();
        i = x.nextInt(3);
        if(coin==i)
        {
            System.out.println("-----------------------------------------------------");
            System.out.println("\tYou won the toss");
            System.out.println("Enter 1 to BAT and 2 to BOWL");
             choice=s.nextInt();
            return choice;
        }
       else  
        { 
            System.out.println("-----------------------------------------------------");
            System.out.println("\tYou lost the toss "); 
            int w = x.nextInt(3);
            if(w==1) 
            {
                System.out.println("\tComputer is batting");
                //System.out.println("-----------------------------------------------------");
                choice=2;
            }
            else 
            {
                System.out.println("\tComputer is bowling");  
                //System.out.println("-----------------------------------------------------");
                choice=1;
            }
             return choice; 
        }
    }
     int bat(int balls,int wicket,int target,int mode)
        {
            int score=0;
            do
            {
                System.out.println("Enter a number between 1 and 6");
                int run=s.nextInt();
                int c_run=x.nextInt(7);
                System.out.println("Computer entered : " + c_run + "\tYou entered : " + run);
                commentary(run,c_run);
                if(c_run==run)
                {
                    wicket--;
                }
                else
                {
                    score+=run;
                }
                balls--;
                
                if(balls%6==0)
                {
                    System.out.print("\n-----------------------------------------------------\n");
                    System.out.println("\t\tSCORECARD:\t\t");
                    if(mode!=1)
                        System.out.println("Balls : "+ balls + " Wickets Remaining : " +wicket + " Total Runs : "+score);
                    else
                        System.out.println("Wickets Remaining : " +wicket + " Total Runs : "+score);
                    System.out.print("\n-----------------------------------------------------\n");
                }
                if(target>=0&&target<score)
                        {
                            System.out.println("\t\tGame OVER \n\t\tTarget chased");
                            break;
                        }
            }while(balls>0 && wicket>0); 
            return score;
        }
     
         int bowl(int balls,int wicket,int target,int mode)
        {
            int score=0;
            do
            {
                System.out.println("Enter a number between 1 and 6");
                int run=s.nextInt();
                int c_run=x.nextInt(7);
                System.out.println("Computer entered : " + c_run + "\tYou entered : " + run);
                commentary(c_run,run);
                if(c_run==run)
                {
                    wicket--;
                }
                else
                {
                    score+=c_run;
                }
                balls--;
                
                if(balls%6==0)
                {
                    System.out.print("\n-----------------------------------------------------\n");
                    System.out.println("\t\tSCORECARD:\t\t");
                    if(mode!=1)
                        System.out.println("Balls : "+ balls + " Wickets Remaining : " +wicket + " Total Runs : "+score);
                    else
                        System.out.println("Wickets Remaining : " +wicket + " Total Runs : "+score);
                    System.out.print("\n-----------------------------------------------------\n");
                }
                if(target>=0&&target<score)
                        {
                            System.out.println("\t\tGame OVER \n\t\tTarget chased");
                            break;
                        }
            }while(balls>0 && wicket>0); 
            return score;
        }

}
public class Hand_cric1 {
    public static void main(String[] args) {
        game g=new game();
        int format=g.mode();
        int choice=g.toss();
        int balls,wicket,runs=-1,c_runs=-1;
        System.out.print("-----------------------------------------------------\n");
        if(format==1)
        {
            System.out.println("\tYou are playing TEST mode : ");
            System.out.print("-----------------------------------------------------\n");
            wicket=2;
            balls=6666;
        }
        else if(format==2)
        {
            System.out.println("\tYou are playing ODI format");
            System.out.print("-----------------------------------------------------\n");
            balls=24;
            wicket=1;
        }
        else
        {
            System.out.println("\tYou are playing SUPER OVER format");
            System.out.print("-----------------------------------------------------\n");
            balls=6;
            wicket=1;
        }
        if(choice==1)
        {
           runs=g.bat(balls,wicket,c_runs,format);
           System.out.print("\n-----------------------------------------------------\n");
           System.out.println("\tYour total is : "+runs);
           System.out.println("\tNow computer is batting : ");
           c_runs=g.bowl(balls, wicket,runs,format);
           System.out.println("\tComputer's Total is : "+ c_runs);
           System.out.print("\n-----------------------------------------------------\n");
           
        }
        else 
        {
           c_runs=g.bowl(balls,wicket,runs,format);
           System.out.print("\n-----------------------------------------------------\n");
           System.out.println("Computer's total is : "+c_runs);
           System.out.println("Now you are batting : ");
           runs=g.bat(balls, wicket,c_runs,format);
           System.out.println("Your total is : "+runs);
           System.out.print("\n-----------------------------------------------------\n");
        }
        if(c_runs>runs)
            System.out.println("\tCOMPUTER WINS......HARDLUCK!!!");
        else if(c_runs==runs)
            System.out.println("\t\tGAME TIED  ");
        else 
            System.out.println("\tYOU WIN......CONGRATULATIONS!!!");
                   
    }
    
}
