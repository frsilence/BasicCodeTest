package test7;

import java.util.Scanner;

public class TongJi {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("输入字符串");
		int ENumber=0;//英文字符数量
		int NNumber=0;//数字字符数量
		int BNumber=0;//空格数量
		int ONumber=0;//其他字符数量
		Scanner MyString = new Scanner(System.in);
		char[] n = MyString.nextLine().toCharArray();
		MyString.close();
		for(int i=0;i<n.length;i++) {
			if(n[i]==32) {
				BNumber++;
			}else if (n[i]>=48&&n[i]<=57) {
				NNumber++;
			}else if ((n[i]>=65&&n[i]<=90)||(n[i]>=97&&n[i]<=122)) {
				ENumber++;
			}else {
				ONumber++;
			}
		}
		System.out.println("英文数量："+ENumber);
		System.out.println("数字数量："+NNumber);
		System.out.println("空格数量："+BNumber);
		System.out.println("其他数量："+ONumber);
	}

}
