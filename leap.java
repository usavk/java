import java.util.*;
class leap
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the year:");
int y=s.nextInt();
int a=4-(y%4);
if(y%4==0)
System.out.println("its a leap year");
else
System.out.println(a+"years more for a leap year");
}
}