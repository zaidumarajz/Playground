import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      String rev="";
      int len=str.length();
      for(int i=len-1;i>=0;i--)
      {
        rev=rev+str.charAt(i);
      }
      System.out.println(rev);
	}
}