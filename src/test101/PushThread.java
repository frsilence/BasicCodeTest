package test101;

public class PushThread implements Runnable {

	private StackInterface s;
	public PushThread(StackInterface s) {
		// TODO 自动生成的构造函数存根
		this.s=s;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		int i=0;
		while(true) {
			java.util.Random random = new java.util.Random();
			i=random.nextInt(10);
			s.push(i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
	}

}
