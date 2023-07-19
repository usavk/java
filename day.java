import java.util.*;
class day
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the day(0 for sunday 1 for monday 2 for tuesday 3 for wednesday 4 thursday 5 friday 6 saturday");
int day=s.nextInt();
System.out.println("enter the nth day u want:");
int n=s.nextInt();
int b=n%7;
int a=day+b;
if(a<7)
a=a;
else
a=a%7;
switch (a)
{
case 0:
System.out.println("sunday");
break;
case 1:
System.out.println("monday");
break;
case 2:
System.out.println("tuesday");
break;
case 3:
System.out.println("wednesday");
break;
case 4:
System.out.println("thursday");
break;
case 5:
System.out.println("friday");
break;
case 6:
System.out.println("saturday");
break;
}
}
}