import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int[] a=new int[20];
      int i,max=0;
      for(i=0;i<n;i++)
        a[i]=s.nextInt();
      for(i=0;i<n;i++)
      {
        if(a[i]>max)
          max=a[i];
      }
      System.out.println(max+" is the maximum element in the array");
    }
}