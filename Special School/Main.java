import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner s=new Scanner(System.in);
      String str1=s.next();
      String str2=s.next();
      String rev="";
      for(int i=str2.length()-1;i>=0;i--)
        rev=rev+str2.charAt(i);
      if(str1.equals(rev))
         System.out.println("It is same");
      else
        System.out.println("It is not same");
	}
}