package test104;

public class Zijie {

	public static void main(String[] args) {
		// TODO 
		String m = "ABC我C";
		String ms = getbyte(m,4);
		System.out.print(ms);
		
	}
	public static String getbyte(String m,int len) {
		String result = new String();
		char[] bytestr = m.toCharArray();
		//char[] byteresult = new char[bytestr.length];
		if(m.getBytes().length<len) {
			result="输出字节数大于指定的字符串字节数";
		}else {
			int p =0;
			for(int i=0;i<bytestr.length;i++) {
				if(p<len) {
					String l= new String(bytestr,i,1);
					result+=l;
					p+=l.getBytes().length;
				}
				
			}
			
		}
		return result;
	}

}
