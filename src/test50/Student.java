package test50;


public class Student{
	private String name;
    private String studentNumber;
    private double[] score = new double[3];
    public Student(String name,String studentNumber) {
    	 this.name=name;
    	 this.studentNumber=studentNumber;
    }
    public void setScore(double[] score) {
    	for(int i=0;i<score.length;i++) {
    		this.score[i]=score[i];
    	}
    	
    }
    @Override
    public String toString() {
    	return "姓名"+this.name+"学号"+this.studentNumber+"三科分数："+this.score[0]+","+this.score[1]+","+this.score[2];
    }
    public double averageScore() {
    	return (this.score[0]+this.score[1]+this.score[2])/3;
    }
}