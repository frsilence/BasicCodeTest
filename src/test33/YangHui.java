package test33;

import java.util.Scanner;

public class YangHui {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("���������δ�С��");
		Scanner input1 = new Scanner(System.in);
		int n = input1.nextInt();
		input1.close();
		int[][] arr = new int[n][n];
		//����һ��ֵ
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = 1;
		}
		//��������ֵ
		for(int i=1;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			}
		}
		//�������ͼ��
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
