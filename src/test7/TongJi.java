package test7;

import java.util.Scanner;

public class TongJi {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("�����ַ���");
		int ENumber=0;//Ӣ���ַ�����
		int NNumber=0;//�����ַ�����
		int BNumber=0;//�ո�����
		int ONumber=0;//�����ַ�����
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
		System.out.println("Ӣ��������"+ENumber);
		System.out.println("����������"+NNumber);
		System.out.println("�ո�������"+BNumber);
		System.out.println("����������"+ONumber);
	}

}
