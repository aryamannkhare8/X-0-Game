import java.util.Scanner;

public class user1
{
  public int recieve() 
  {
      int x;
    do
    {
     Scanner s=new Scanner(System.in);
     System.out.println("Player 1 Enter the no. where you want to Place X");
     x=s.nextInt();
     if(x<10){
        break;
     }
   }while(true);
    return x;
  }
}

