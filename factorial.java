//10.  Write a program to find the factorial of a non-negative number.


import java.util.Scanner;
class factorial{
public static void main(String args[])
{
int n,fact=1;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}
