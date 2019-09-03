import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] a,b;
    a=new int[15];
    b=new int[15];
    int i,f=0;
    for(i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    for(i=0;i<n;i++)
    {
      b[i]=s.nextInt();
    }
    for(i=0;i<n;i++)
    {
      if(a[i]!=b[i])
        f=1;
    }
    if(f==0)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}