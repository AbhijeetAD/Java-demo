import java.util.*;

class Robert{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter subject mark1:");
int m1=sc.nextInt();

System.out.println("Enter subject mark2:");
int m2=sc.nextInt();

System.out.println("Enter subject mark3:");
int m3=sc.nextInt();

int Total=m1+m2+m3;
System.out.println("Total is:"+Total);

int per=Total/3;
System.out.println("Percentage is:"+per);
}
}