import java.util.*;
class avg
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the numbers:");
float a=s.nextFloat();
float b=s.nextFloat();
float c=s.nextFloat();
float d=s.nextFloat();
float e=s.nextFloat();
float sum=a+b+c+d+e;
float avg=sum/5;
System.out.println("sum is:"+sum);
System.out.println("avg is:"+avg);
}
}