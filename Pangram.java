package assignments;

import java.util.Scanner;

public class Pangram {
	public static void main(String[] args) {
		char[] a= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int alLen=a.length,flag=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the text");
		String input = scan.nextLine();
		char[] b=input.toLowerCase().toCharArray();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length&&flag==i;j++) {
				
				if(a[i]==b[j]) {
					flag++;
					System.out.println(a[i]+" "+b[j]);
				}
			}
			}
		if(flag==alLen)
			System.out.println("1");
		else
			System.out.println("0");}
}
