package test22;

public class Jiecheng5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int n = 5;
		System.out.println(Jiecheng(n));
	}
	public static int Jiecheng(int n) {
			if(n==1) {
				return 1;
			}else {
				return n*Jiecheng(n-1);
			}
	}


}
