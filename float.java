/* input floating number and check   */
import java.util.Scanner;
class Float{
  public static void main(String args[])
{
System.out.print("Enter first number");
Scanner in=new Scanner(System.in);  
float num=in.nextFloat();

{
if(num==0)
{
System.out.println("zero");
}
else if(num<0)
{
System.out.println("negative");
}
else if(num>0)
{
System.out.println("positive");
}
}
}
