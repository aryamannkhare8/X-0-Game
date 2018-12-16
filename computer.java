import java.util.Random;
class computer
{
    public int recieve()
    {
         Random rnd= new Random();
         int x=1 + rnd.nextInt(10-1);
         return x;
    }
}