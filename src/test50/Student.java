package test50;
public class Student{
	private String name;
    private String studentNumber;
    private int[] score = new int[3];
    public Student(String name,String studentNumber) {
    	 this.name=name;
    	 this.studentNumber=studentNumber;
    }
    public void setScore(int[] score) {
    	this.score=score;
    }
    @Override
    public String toString() {
    	return "����"+this.name+"ѧ��"+this.studentNumber+"���Ʒ�����"+this.score[0]+","+this.score[1]+","+this.score[2];
    }
    public double averageScore() {
    	return (this.score[0]+this.score[1]+this.score[2])/3;
    }
}