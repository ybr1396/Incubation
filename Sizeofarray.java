package assignments;
import java.util.*;
public class Sizeofarray {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = in.nextInt();
		int A[] = new int[n];
		for(int i=0;i<n;i++) {
			A[i]=in.nextInt();}
		int flag=0;
		for(int k=0;k<n;k++) {
			if(!(A[k]==0 || A[k]==1 || A[k]==2)) {
				System.out.println("Invaild Number");
			}else {for(int i=0;i<n-1;i++) {
					for(int j=i+1;j<n;j++) {
						if(A[i]>A[j]) {						
							int temp=A[i];
							A[i]=A[j];
							A[j]=temp;}
			}}}}
		System.out.println(Arrays.toString(A));
		}}
