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
		double[] score=new double[3];
		Student[] student=new Student[5];
		for(int i=0;i<student.length;i++) {
			System.out.printf("��ʼ�����%d��ѧ������Ϣ��\n",i+1);
			System.out.println("����ѧ��������");
			name=input1.nextLine();
			System.out.println("����ѧ��ѧ�ţ�");
			studentNumber=input1.nextLine();
			for(int j=0;j<3;j++) {
				System.out.printf("�����ѧ���ĵ�%d��ѧ�Ʒ�����\n",j+1);
				score[j]=input1.nextDouble();
			}
			input1.nextLine();
			student[i]=new Student(name, studentNumber);
			student[i].setScore(score);
		}
		input1.close();
		//д���ļ�
		writeFile(student,"C:\\Users\\yfzhao\\eclipse-workspace\\student.txt");
	}
	public static void writeFile(Student[] student,String fileName) {
		FileWriter fw=null;
		try {
			fw=new FileWriter(fileName,true);
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