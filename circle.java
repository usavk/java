import java.util.*;
class circle
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the radius:");
int r=s.nextInt();
double pi=3.14;
double area=pi*r*r;
double parameter=2*pi*r;
System.out.println("area is:"+area);
System.out.println("parameter is:"+parameter);
}
}