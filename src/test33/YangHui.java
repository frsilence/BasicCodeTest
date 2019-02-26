package test33;

import java.util.Scanner;

public class YangHui {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("输入三角形大小：");
		Scanner input1 = new Scanner(System.in);
		int n = input1.nextInt();
		input1.close();
		int[][] arr = new int[n][n];
		//赋第一列值
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = 1;
		}
		//生成其他值
		for(int i=1;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			}
		}
		//输出数字图形
		for(int i=0;i<arr.length;i++) {
			for(int j=arr.length-i-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<arr.length;k++) {
				if(arr[i][k]!=0) {
					System.out.print(arr[i][k]+" ");
				}
			}
			System.out.println();
		}
	}

}
