package test28;

import java.util.Arrays;

public class PaiXu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] MyNumber = new int[] {1,22,13,04,50,60,37,28,19,0};
		int[] LastNumber = new int[10];
		//冒泡法排序
		LastNumber = maoPaoFun(MyNumber);
		for(int i=0;i<LastNumber.length;i++) {
			System.out.print(LastNumber[i]+";");
		}
	};
	//自带排序
	public static int[] ziDaiFun(int[] MyNumber) {
		Arrays.parallelSort(MyNumber);
		return MyNumber;
	}
	//冒泡排序
	public static int[] maoPaoFun(int[] MyNumber) {
		int tmp = 0;
		for(int i=0;i<MyNumber.length-1;i++) {
			for(int j=0;j<MyNumber.length-i-1;j++) {
				if(MyNumber[j]>MyNumber[j+1]) {
					tmp = MyNumber[j+1];
					MyNumber[j+1] = MyNumber[j];
					MyNumber[j] = tmp;
				}
			}
		}
		return MyNumber;
	}
	

}
