import java.util.*;
class detail
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the name:");
String name=s.nextLine();
System.out.println("enter the father name:");
String fname=s.nextLine();
System.out.println("enter the city:");
String city=s.nextLine();
System.out.println("enter the door no:");
int dno=s.nextInt();
System.out.println("enter the pincode:");
int pincode=s.nextInt();

System.out.println("name:"+name);
System.out.println("father name:"+fname);
System.out.println("door no:"+dno);
System.out.println("city:"+city);
System.out.println("pincode:"+pincode);
}
}