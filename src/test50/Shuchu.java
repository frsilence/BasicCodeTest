package test50;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

class Shuchu {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input1 = new Scanner(System.in);
		String name="";
		String studentNumber="";
		int[] score=new int[3];
		Student[] student=new Student[2];
		for(int i=0;i<2;i++) {
			System.out.printf("��ʼ�����%d��ѧ������Ϣ��\n",i+1);
			System.out.println("����ѧ��������");
			name=input1.nextLine();
			System.out.println("����ѧ��ѧ�ţ�");
			studentNumber=input1.nextLine();
			for(int j=0;j<3;j++) {
				System.out.printf("�����ѧ���ĵ�%d��ѧ�Ʒ�����\n",j+1);
				score[j]=input1.nextInt();
			}
			input1.nextLine();
			student[i]=new Student(name, studentNumber);
			student[i].setScore(score);
		}
		input1.close();
		//д���ļ�
		//writeFile(student,"F:\\Users\\Desktop\\java\\workspace\\BasicCodeTest\\bin\\test50\\student.txt");
		System.out.println(student[0].averageScore()+":"+student[1].averageScore());
		System.out.println(student[0].equals(student[1]));
	}
	public static void writeFile(Student[] student,String fileName) {
		FileWriter fw=null;
		try {
			fw=new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw); 
			bw.write("��ʼһ�μ�¼\r\n");
			for(int i=0;i<student.length;i++) {
				System.out.println(student[i].toString()+"\r\n"+"��ѧ��ƽ����Ϊ��"+student[i].averageScore()+"\r\n");
				bw.write(student[i].toString()+"\r\n"+"��ѧ��ƽ����Ϊ��"+student[i].averageScore()+"\r\n");
			}
			bw.write("һ�μ�¼����\r\n");
			bw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
