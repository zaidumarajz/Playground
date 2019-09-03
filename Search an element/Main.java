import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int[] arr=new int[20];
      int i,f=0;
      for(i=0;i<n;i++)
      {
        arr[i]=s.nextInt();
      }
      int a=s.nextInt();
      for(i=0;i<n;i++)
      {
        if(arr[i]==a)
          f=1;
      }
      if(f==1)
        System.out.println(a+" is present in the array");
      else
        System.out.println(a+" is not present in the array");
    }
}