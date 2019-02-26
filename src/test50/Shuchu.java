package test50;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

class Shuchu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input1 = new Scanner(System.in);
		String name="";
		String studentNumber="";
		int[] score=new int[3];
		Student[] student=new Student[2];
		for(int i=0;i<2;i++) {
			System.out.printf("开始输入第%d个学生的信息：\n",i+1);
			System.out.println("输入学生姓名：");
			name=input1.nextLine();
			System.out.println("输入学生学号：");
			studentNumber=input1.nextLine();
			for(int j=0;j<3;j++) {
				System.out.printf("输入该学生的第%d门学科分数：\n",j+1);
				score[j]=input1.nextInt();
			}
			input1.nextLine();
			student[i]=new Student(name, studentNumber);
			student[i].setScore(score);
		}
		input1.close();
		//写入文件
		//writeFile(student,"F:\\Users\\Desktop\\java\\workspace\\BasicCodeTest\\bin\\test50\\student.txt");
		System.out.println(student[0].averageScore()+":"+student[1].averageScore());
		System.out.println(student[0].equals(student[1]));
	}
	public static void writeFile(Student[] student,String fileName) {
		FileWriter fw=null;
		try {
			fw=new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw); 
			bw.write("开始一次记录\r\n");
			for(int i=0;i<student.length;i++) {
				System.out.println(student[i].toString()+"\r\n"+"该学生平均分为："+student[i].averageScore()+"\r\n");
				bw.write(student[i].toString()+"\r\n"+"该学生平均分为："+student[i].averageScore()+"\r\n");
			}
			bw.write("一次记录结束\r\n");
			bw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
