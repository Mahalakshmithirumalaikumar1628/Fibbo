package JAVA;
import java.util.Scanner;
public class Fibbo {
	static void Fibo(int count) {
		int n1=0,n2=1,n3=0;
		 System.out.print(n1+" "+n2);
		 for(int i=2;i<count;i++) {
		 n3=n1+n2;
		 n1=n2;
		 n2=n3;
		 System.out.print(" "+n3);
		 }	
	}
	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		int count=sr.nextInt();
        Fibo(count);
	 
 }
 }


