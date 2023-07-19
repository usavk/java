import java.util.*;
class vote
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the age:");
int a=s.nextInt();
int b=18-a;
if(a>=18)
System.out.println("eligible for vote");
else
System.out.println(b+"years more to eligiblele");
}
}

