package test4;

import java.util.Scanner;

public class FengJieZhiyingshu {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("����һ��Ҫ�ֽ���������������:");
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
