package test101;

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
			System.out.println("->"+s.pop()[0]+"<-----"+s.pop()[1]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}

}
