package test24;

import java.util.Scanner;

public class IntTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("������5λ����������");
		Scanner MyInt = new Scanner(System.in);
		int NumberT = MyInt.nextInt();
		int[] ArrNumber =new int[5];
		int i=0;
		int tmp =NumberT;
		while(true) {
			ArrNumber[i]=tmp%10;
			tmp = tmp/10;
			if(i>5||tmp==0) break;
			i++;
		}
		System.out.println("������λ��Ϊ��"+(i+1));
		System.out.println("�������");
		for(int j=0;j<i+1;j++) {
			System.out.print(ArrNumber[j]);
		}
		
	}

}
