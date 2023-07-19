import java.util.*;
class sign
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number:");
int a=s.nextInt();
if(a<0)
System.out.println("its a negative number");
else if(a==0)
System.out.println("its a  zero");
else
System.out.println("its a positive number");
}
}
