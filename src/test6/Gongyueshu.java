package test6;

import java.util.Scanner;

public class Gongyueshu {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input1 = new Scanner(System.in);
		System.out.println("�����һ��������");
		int number1 = input1.nextInt();
		System.out.println("����ڶ���������");
		int number2 = input1.nextInt();
		input1.close();
		int multiple = number1*number2;
		if(number1<number2) {
			int tmp = number1;
			number1 = number2;
			number2 = tmp;
		}
		//�������Լ��
		while(true) {
			int yu = number1%number2;
			number1 = number2;
			number2 = yu;
			if(yu==0) break;
		}
		int bigDivisor = number1;
		multiple = multiple/bigDivisor;
		System.out.println("���Լ����"+bigDivisor);
		System.out.println("��󹫱�����"+multiple);
	}

}
