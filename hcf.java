# hcf
import java.io.*;
import java.util.*;
public class hcf{
public static void main(String args[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the 1st number");
int k =Integer.parseInt(br.readLine());
System.out.println("Enter the 2nd number");
int m=Integer.parseInt(br.readLine());
int a;
while(m!=0){
a=k%m;
k=m;
m=a;
}
System.out.println("The gcd of"+k);
}
}
