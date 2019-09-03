import java.util.*;
 class Main
 {
   public static void main(String args[])
   {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int[] a=new int[20];
     double avg,sum=0;
     int i;
     for(i=0;i<n;i++)
     {
       a[i]=s.nextInt();
       sum=sum+a[i];
     }
     avg=sum/n;
     System.out.printf("The mean of the array is %.2f",avg);
   }
 }