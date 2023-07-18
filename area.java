import java.util.*;
class area
{
public static void main(String args[])
{
Scanner v=new Scanner(System.in);
double a,b,c;
System.out.println("enter the a value:");
a=v.nextDouble();
System.out.println("enter the b value:");
b=v.nextDouble();
System.out.println("enter the c value:");
c=v.nextDouble();
double s=(a+b+c)/2;
double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("area is:"+area);
}
}