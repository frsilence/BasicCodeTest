package test103;

public class ClearBlack {

	public static void main(String[] args) {
		// ȥ�ַ����ո�
		String myStr = "hello  world";
		String temp = ""+myStr.charAt(0);
		for(int i=1;i<myStr.length();i++) {
			char c = myStr.charAt(i);
			if(c==' ') {
				if(myStr.charAt(i-1)!=' ') {
					temp+=c;
				}
			}else {
				temp+=c;
			}
		}
		System.out.println(temp);
		if(hasBlank(temp)) {
			System.out.println("包含空字符");
		}else {
			System.out.println("不包含空字符");
		}

	}
	public static boolean hasBlank(String str) {
		char[] m = str.toCharArray();
		for(int i=0;i<m.length;i++) {
			if(m[i]==' ') return true;
		}
		return false;
	}
}
