package Practice;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row size of A matrix");
		int ra = sc.nextInt();
		System.out.println("enter columns size of A matrix");
		int ca = sc.nextInt();
		System.out.println("enter matrix A");
		int [][] A = new int[ra][ca];
		for(int i=0; i<ra; i++) {
			for(int j=0; j<ca; j++) {
				A[i][j]= sc.nextInt();
			
			}
		}
		System.out.println("enter row size of B matrix");
		int rb = sc.nextInt();
		System.out.println("enter columns size of B matrix");
		int cb = sc.nextInt();
		System.out.println("enter matrix B");
		int [][] B = new int[rb][cb];
		for(int i=0; i<rb; i++) {
			for(int j=0; j<cb; j++) {
				B[i][j]= sc.nextInt();
			}
		}
		int [][] result = multiply(A,B,ra,ca,rb,cb);
		System.out.println("matrix");
		for(int i=0; i<ra; i++) {
			for(int j=0; j<cb; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
	public static int[][]  multiply(int[][] A, int [][] B,int ra,int rb, int ca, int cb) {
		int[][] result = new int[ra][cb];
		if(ca != rb) {
			System.out.println("false");
		}
		else {
		for(int i=0; i<ra; i++) {
			for(int j=0; j<cb; j++) {
				for(int k=0; k<ca; k++) {
					result [i][j] += A[i][k]*B[k][j];
				}
			}
		}
		
	}
		return result;
	
	}
}

			
		



