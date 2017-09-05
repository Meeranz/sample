import java.util.*;
class equ
{
public static void main(String[] args0)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] a= new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(a[i]==i)
{
System.out.println("the number"+a[i]+"equals its index"+i);
}
}

}
}
