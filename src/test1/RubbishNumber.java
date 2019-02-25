package test1;

import java.util.Scanner;

public class RubbishNumber {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner monthScanner = new Scanner(System.in);
		System.out.println("输入月数，输入必须为大于等于1的整数");
		int MyMonth = monthScanner.nextInt();
		int RubbishNumber = computeRubbish(MyMonth);
		System.out.println(MyMonth+"个月后，兔子对数为："+RubbishNumber);
		monthScanner.close();
	}
	public static int computeRubbish(int month) {
		if(month==1 || month==2) return 1;
		return computeRubbish(month-1)+computeRubbish(month-2);
		
	}

}
