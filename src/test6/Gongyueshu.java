package test6;

import java.util.Scanner;

public class Gongyueshu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input1 = new Scanner(System.in);
		System.out.println("输入第一个整数：");
		int number1 = input1.nextInt();
		System.out.println("输入第二个整数：");
		int number2 = input1.nextInt();
		input1.close();
		int multiple = number1*number2;
		if(number1<number2) {
			int tmp = number1;
			number1 = number2;
			number2 = tmp;
		}
		//计算最大公约数
		while(true) {
			int yu = number1%number2;
			number1 = number2;
			number2 = yu;
			if(yu==0) break;
		}
		int bigDivisor = number1;
		multiple = multiple/bigDivisor;
		System.out.println("最大公约数："+bigDivisor);
		System.out.println("最大公倍数："+multiple);
	}

}
