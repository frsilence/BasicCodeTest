package test100;

public class PopThread implements Runnable {

	private StackInterface s;
	public  PopThread(StackInterface s) {
		// TODO �Զ����ɵĹ��캯�����
		this.s=s;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(true) {
			System.out.println("->"+s.pop()[0]+"<-");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}

}