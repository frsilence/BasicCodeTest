package test37;

import java.util.Scanner;
/*
 * 有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
 */
public class BaoShu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int MarkNum = 0;
		int PlayNum = 0;
		System.out.println("参与人数：");
		Scanner input1 = new Scanner(System.in);
		PlayNum = input1.nextInt();
		input1.close();
		int[] arr = new int[PlayNum];
		int index = 0;
		while(true) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=1) {
					index++;
					if(index==3) {
						index = 0;
						arr[i]=1;
						MarkNum++;
					}
				}
				if(MarkNum==PlayNum-1) break;
				
			}
			if(MarkNum==PlayNum-1) break;
		}
		int LastIndex = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				LastIndex = i+1;
				break;
			}
		}
		System.out.println("最后位置："+LastIndex);
	}

}
