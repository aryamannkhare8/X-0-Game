import java.util.Scanner;

 public class user2
{
  public int recieve1() 
  {
      int x;
    do
    {
     Scanner s=new Scanner(System.in);
     System.out.println("Player 2 please Enter the no. where you want to Place X");
     x=s.nextInt();
     if(x<10){
        break;
     }
   }while(true);
    return x;
  }
}

