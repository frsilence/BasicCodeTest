package test2;

public class SuShu {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("���101-200֮�����е�������");
		for(int i=0;i<=200;i++) {
			for(int j=2;j<i;j++) {
				if (i%j==0) break;
				if (j==i-1) System.out.println(i);
			}
		}
		
	}

}
