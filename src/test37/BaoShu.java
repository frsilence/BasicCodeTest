package test37;

import java.util.Scanner;
/*
 * ��n����Χ��һȦ��˳���źš��ӵ�һ���˿�ʼ��������1��3��������������3�����˳�Ȧ�ӣ���������µ���ԭ���ڼ��ŵ���λ��
 */
public class BaoShu {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int MarkNum = 0;
		int PlayNum = 0;
		System.out.println("����������");
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
		System.out.println("���λ�ã�"+LastIndex);
	}

}
