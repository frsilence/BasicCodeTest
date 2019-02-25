package test2;

public class SuShu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("输出101-200之间所有的素数：");
		for(int i=0;i<=200;i++) {
			for(int j=2;j<i;j++) {
				if (i%j==0) break;
				if (j==i-1) System.out.println(i);
			}
		}
		
	}

}
