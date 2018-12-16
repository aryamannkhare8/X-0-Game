import java.util.Scanner;
class player{
public int choice(){
Scanner s = new Scanner(System.in);
System.out.println("Dear user please choose whether you want to play against the COMPUTER or you want to play a MULTIPLAYER game:)");
System.out.println("To play agaist computer press 1. To play a multiplayer match press 2. Press any other character to Quit");
int x=s.nextInt();
if(x!=1 && x!=2){System.exit(0);}
return(x);
}
}