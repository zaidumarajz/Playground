import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      String rev="";
      for(int i=str.length()-1;i>=0;i--)
        rev=rev+str.charAt(i);
      if(str.equals(rev))
        System.out.println("Palindrome");
      else
        System.out.println("Not a Palindrome");
	}
}