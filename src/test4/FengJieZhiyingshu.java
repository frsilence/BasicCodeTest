package test4;

import java.util.Scanner;

public class FengJieZhiyingshu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("输入一个要分解质因数的正整数:");
		Scanner myinput = new Scanner(System.in);
		int mynumber = myinput.nextInt();
		myinput.close();
		for(int i=2;i<mynumber+1;i++) {
			while(mynumber%i==0&&mynumber!=i) {
				mynumber=mynumber/i;
				System.out.print(i+"*");
			}
			if(mynumber==i) {
				System.out.print(i);
				break;
			}
		}
	}

}
