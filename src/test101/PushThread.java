package test101;

public class PushThread implements Runnable {

	private StackInterface s;
	public PushThread(StackInterface s) {
		// TODO �Զ����ɵĹ��캯�����
		this.s=s;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
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
