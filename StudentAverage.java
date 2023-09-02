import java.io.*;
import java.util.*;
public class StudentAverage{
public static void main(String [] args)
{
System.out.println("Enter marks of three subjects : ");
Scanner sc=new Scanner(System.in);
int m1 = sc.nextInt();
int m2 = sc.nextInt();
int m3 = sc.nextInt();
int total = m1+m2+m3;
float AVG=(float)total/3;
if(AVG>=75){
System.out.println("Student passed in  distinction ");
} else if(AVG>=60&&AVG<74.9)
{
System.out.println("Student passed in first class");
}
else if(AVG>=50&&AVG<60)
{
System.out.println("Student passed in second class");
}
else if(AVG>=40&&AVG<50)
{
System.out.println("Stucent passed in third class");
}
else
{
System.out.println("Student failed");
}
}
}