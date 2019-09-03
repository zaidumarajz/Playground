import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] a=new int[20];
    int i,count=0;
    for(i=0;i<n;i++)
      a[i]=s.nextInt();
    int l=s.nextInt();
    for(i=0;i<n-1;i++)
    {
      if(i == l-1)
           {
               for(int j=i; j<(n-1); j++)
               {
                   a[j] = a[j+1];
               }
               count++;
               break;
      }
    }
      if(count==0)
        System.out.println("Invalid Input");
      else {
    System.out.println("Array after deletion is");
    for(i=0;i<n-1;i++)
      System.out.println(a[i]);
      }
  }
}