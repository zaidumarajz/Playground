import java.util.Scanner;
import java.lang.Math;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int k=s.nextInt();
      int c=0,sq=k*k;
      int n=sq;
      while (n>0)
      {
        c++;
        n=n/10;
      }
      int p=(int)(sq/Math.pow(10,c-1));
      int q=(int)(sq%Math.pow(10,c-1));
      if(p+q==k)
        System.out.println("Kaprekar Number");
      else
        System.out.println("Not A Kaprekar Number");
      
    }
}