import java.io.*;
import java.util.Scanner;
class sam
{

public static boolean contains(int[] set1, int[] set2) {
    boolean contains = false;
    for (int i = 0; i < set1.length; i++) {
        for (int a = 0; a < set2.length - 1; a++) {
            if (set1[i] == set2[a] && set1[i + 1] == set2[a + 1]) {
                contains = true;
            } else {
                contains = false;
            }
        }
    }
    return contains;
}
class sam1
{
public static void main(String str[])
{
Scanner sc=new Scanner(System.in);
sam o=new sam();
int a1[]=new int[10];
int a2[]=new int[10];
for(int i=0;i<10;i++)
{
a1[i]=sc.nextInt();
a2[i]=sc.nextInt();
}
boolean s;
s=o.contains(a1,a2);
System.out.print(s);
}
}

