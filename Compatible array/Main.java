import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int i,f=0;
    int[] a=new int[15];
    int[] b=new int[15];
    for (i=0;i<n;i++)
      a[i]=s.nextInt();
    for (i=0;i<n;i++)
      b[i]=s.nextInt();
    for(i=0;i<n;i++)
    {
      if(a[i]<b[i])
      {
        f=1;
        break;
      }
    }
    if(f==0)
      System.out.println("Compatible");
    else
      System.out.println("Incompatible");
  }
}