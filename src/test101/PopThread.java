package test101;

public class PopThread implements Runnable {

	private StackInterface s;
	public  PopThread(StackInterface s) {
		// TODO 自动生成的构造函数存根
		this.s=s;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(true) {
			System.out.println("->"+s.pop()[0]+"<-----"+s.pop()[1]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}

}
