//java program to find factorial of given numbers
//28-08-23
//Hema
import java.io.*;
import java.util.*;
public class FactorialDemo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter an integer in between 1 to 9");
int n=sc.nextInt ();
int fact=1;
for(int i=2;i<=n;i++)
{
fact=fact*i;
}
System.out.println(" Factorial of "+n+" is "+ fact);
}
}