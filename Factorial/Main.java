import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      System.out.printf("The factorial of %d is %d",n,fact(n));
    }
  static int fact(int a)
  {
    if (a==0||a==1)
      return 1;
    else 
      return a*fact(a-1);
  }
}