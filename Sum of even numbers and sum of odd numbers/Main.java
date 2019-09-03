import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] a=new int[15];
    int sum1=0,sum2=0;
    for (int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      if(a[i]%2==0)
        sum1=sum1+a[i];
      else
        sum2=sum2+a[i];
    }
    System.out.println("The sum of the even numbers in the array is "+sum1);
    System.out.println("The sum of the odd numbers in the array is "+sum2);
  }
}