package test3;

public class Shuixianhua {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		getShuixianhua();
	}
	public static void getShuixianhua() {
		for(int i=100;i<=999;i++) {
			int bai = i/100;
			int shi = i/10%10;
			int ge = i%10;
			if(Math.pow(bai, 3)+Math.pow(shi,3)+Math.pow(ge,3)==i) {
				System.out.println(i);
			}
			
		}
	}

}
