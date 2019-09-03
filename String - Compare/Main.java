import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner s=new Scanner(System.in);
      String str1=s.nextLine();
      String str2=s.nextLine();
      char[] c1=str1.toCharArray();
      char[] c2=str2.toCharArray();
      int len1=c1.length;
      int len2=c2.length;
      if(len1==len2)
      {
        for(int i=0;i<len1;i++)
        {
          if(c1[i]!=c2[i])
          {
            System.out.println("Strings are not same");
            System.exit(0);
          }
          else
          {
            System.out.println("Strings are same");
            System.exit(0);
          }
        }
      }
      else
        System.out.println("Strings are not same");
	}
}