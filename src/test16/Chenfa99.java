package test16;

public class Chenfa99 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.printf("%d*%d=%2d  ",j,i,j*i);
				if(j==i) System.out.print("\n");
			}
		}
	}

}
