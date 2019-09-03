import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      int c=0;
      for(int i=0;i<str.length();i++)
      {
        if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
          c=c+1;
      }
      System.out.println(c);
	}
}