//package study;
//import java.util.Scanner;
//
//public class Algo1 {
//	static void triangleLB(int n){
//		for(int i = 0; i < n; ++i){
//			for(int j = 0; j < i+1; ++j){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//	
//	static void triangleLU(int n){
//		for(int i = 0; i < n; ++i){
//			for(int j = 0; j < n-i; ++j){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//	
//	static void triangleRU(int n){
//		int i, j;
//		for(int k = 0; k < n; ++k){
//			for(i = 0; i < k; ++i)
//				System.out.print(" ");
//			for(j = 0; j < n -k; ++j)
//				System.out.print("*");
//			System.out.println();
//		}
//	}
//	
//	static void triangleRB(int n){
//		int i,j;
//		for(int k = 1; k <= n; ++k){
//		for(i = 0; i < n-k; ++i){
//			System.out.print(" ");
//		}
//		for(j = 0; j < n-i; ++j){
//			System.out.print("*");
//		}
//		System.out.println();
//		}
//	}
//	
//	static void spira(int n){
//		for(int k = 1; k < n; ++k){
//			for(int i = 0; i < n - k; i ++)
//				System.out.print(" ");
//			for(int i = 0; i < (k-1)*2+1; i ++)
//				System.out.print("*");
//			for(int i = 0; i < n - k; i ++)
//				System.out.print(" ");
//			System.out.println();
//		}
//	}
//	
//	static void npira(int n){
//		for(int k = 1; k < n; ++k){
//			for(int i = 0; i < n - k; i ++)
//				System.out.print(" ");
//			for(int i = 0; i < (k-1)*2+1; i ++)
//				System.out.print(k % 10);
//			for(int i = 0; i < n - k; i ++)
//				System.out.print(" ");
//			System.out.println();
//		}
//	}
//	
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		triangleLB(n);
//		System.out.println();
//		triangleRB(n);
//		
//		System.out.println();
//		triangleLU(n);
//		
//		System.out.println();
//		triangleRU(n);
//		
//		System.out.println();
//		spira(n);
//
//		System.out.println();
//		npira(n);
//	}
//}

package study;
import java.util.Scanner;

public class Algo1{
	static int seqSearch(int[] x, int num, int key){
		int i = 0;
		while(true){
			if(i == num)
				return -1;
			if(x[i] == key)
				return i;
			i ++;
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; ++i){
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		int idx = seqSearch(x, num, key);
		if(idx == -1)
			System.out.println("찾는 값이 없습니다!");
		else
			System.out.println(idx+"번째 인데스에 찾는 값이 있습니다!!");
		
	}
}