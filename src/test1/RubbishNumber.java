package test1;

import java.util.Scanner;

public class RubbishNumber {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner monthScanner = new Scanner(System.in);
		System.out.println("�����������������Ϊ���ڵ���1������");
		int MyMonth = monthScanner.nextInt();
		int RubbishNumber = computeRubbish(MyMonth);
		System.out.println(MyMonth+"���º����Ӷ���Ϊ��"+RubbishNumber);
		monthScanner.close();
	}
	public static int computeRubbish(int month) {
		if(month==1 || month==2) return 1;
		return computeRubbish(month-1)+computeRubbish(month-2);
		
	}

}
