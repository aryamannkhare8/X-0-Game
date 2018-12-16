public class decider
{
  public boolean result(char h[] ,int pop)
  {
      String zn="",xy="";
    if (pop==1){zn="Computer Wins!!!!";xy="You Won!!!!";}else if(pop==2){zn="Player2 Wins!!!!";xy="Player1 Wins!!!!";}
      if((h[1]=='X'&&h[2]=='X'&&h[3]=='X')||(h[1]=='X'&&h[5]=='X'&&h[9]=='X')||(h[1]=='X'&&h[4]=='X'&&h[7]=='X'))
    {
    System.out.println(xy);return true;
    }
    if((h[2]=='X'&&h[5]=='X'&&h[8]=='X')||(h[3]=='X'&&h[6]=='X'&&h[9]=='X')||(h[4]=='X'&&h[5]=='X'&&h[6]=='X'))
    {
    System.out.println(xy);return true;
    }
    if((h[7]=='X'&&h[8]=='X'&&h[9]=='X')||(h[3]=='X'&&h[5]=='X'&&h[7]=='X'))
    {
    System.out.println(xy);return true;
    }
    if((h[1]=='0'&&h[2]=='0'&&h[3]=='0')||(h[1]=='0'&&h[5]=='0'&&h[9]=='0')||(h[1]=='0'&&h[4]=='0'&&h[7]=='0'))
    {
    System.out.println(zn);return true;
    }
    if((h[2]=='0'&&h[5]=='0'&&h[8]=='0')||(h[3]=='0'&&h[6]=='0'&&h[9]=='0')||(h[4]=='0'&&h[5]=='0'&&h[6]=='0'))
    {
    System.out.println(zn);return true;
    }
    if((h[7]=='0'&&h[8]=='0'&&h[9]=='0')||(h[3]=='0'&&h[5]=='0'&&h[7]=='0'))
    {
    System.out.println(zn);return true;
    }
    
    
    /*for checking tie */
    
    
    return false;
  }
}