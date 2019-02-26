package test24;

import java.util.Scanner;

public class IntTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("不多于5位的正整数：");
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
		System.out.println("该整数位数为："+(i+1));
		System.out.println("倒叙输出");
		for(int j=0;j<i+1;j++) {
			System.out.print(ArrNumber[j]);
		}
		
	}

}
