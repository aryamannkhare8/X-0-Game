import java.util.Scanner;
public class main
{
  public static void main()
    {
        intro op=new intro();
        op.jandi();
     Scanner s=new Scanner(System.in);
     player pan= new player();
     int ga=pan.choice();
        do{
           int a1=0;char[] a={0,'1','2','3','4','5','6','7','8','9'};
           myScreen hh=new myScreen();
           hh.disp(a);
           int q=0,gj=0,m;
           do {
               System.out.print('\u000C');
               user1 jj= new user1();
               computer ii=new computer();
               user2 nn=new user2();
               decider kk=new decider();
               System.out.println("            "+a[1]+"  "+"|"+"  "+a[2]+"  "+"|"+"  "+a[3]);
               System.out.println("            "+"--------------");
               System.out.println("            "+a[4]+"  "+"|"+"  "+a[5]+"  "+"|"+"  "+a[6]);
               System.out.println("            "+"--------------");
               System.out.println("            "+a[7]+"  "+"|"+"  "+a[8]+"  "+"|"+"  "+a[9]);
               boolean ans=false,ans1=false,ans2=false; 
               do{
                  int n=jj.recieve();
                  if(a[n]!='X'&& a[n]!='0')
                  {
                      ans = true;a[n]='X';break;
                    }
                  else
                  {
                      System.out.println("enter the number again");ans = false;
                    }
            }while(ans==false);
             ans2=kk.result(a ,ga); gj+=1;
            if (gj>8)
            {
              System.out.println("It's a DRAW!!!!"); break;
            }
            if (ans2==true) 
            {
            hh.disp(a);break;
            }
            System.out.print('\u000C');
            hh.disp(a);
            do{                                  
            if(ga==1)
              {
                  m=ii.recieve();
                }
              else
              {
                  m=nn.recieve1();
                }
               if(a[m]!='X'&& a[m]!='0')
               {
                ans1 = true;a[m]='0';break;
            }
               else
            {
                ans1 = false;
            }
            }while(ans1== false);
            ans2=kk.result(a ,ga);gj+=1;
            if (ans2==true){
               hh.disp(a);break;
            }
            System.out.print('\u000C');
            hh.disp(a);
        }while(a1!=1);
        System.out.println("press 1 to quit and any character to continue");
        char df=s.next().charAt(0);
        if(df=='1')
        {
            System.exit(0);
        }
    }while(true);
   }
 }

