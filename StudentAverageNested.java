//java program to demonstrate nested if
//26-08-23
//StudentAverageNested
import java.io.*;
import java.util.*;
public class StudentAverageNested{
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
  if(avg>=95)
{
System.out.println("You are in top 5 percent");
}
else if(AVG>=90)
{
System.out.println("You are in top 10 percent");
}
else
{
System.out.println("Student passed in distinction");
}
}
else if(AVG>=40&&AVG<75)
{
System.out.println("Student is passed");
}
else
{
System.out.println("You are failed");
}
}
}