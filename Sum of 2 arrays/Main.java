import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int[] a,b,sum;
      int i;
      a=new int[20];
      b=new int[20];
      sum=new int[20];
      for(i=0;i<n;i++)
        a[i]=s.nextInt();
      for(i=0;i<n;i++)
        b[i]=s.nextInt();
      for(i=0;i<n;i++)
      {
        sum[i]=a[i]+b[i];
      }
      for(i=0;i<n;i++)
        System.out.println(sum[i]);
    }
}