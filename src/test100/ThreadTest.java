package test100;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		SafeStack runnable = new SafeStack();
		PushThread myPush = new PushThread(runnable);
		Thread myPushs = new Thread(myPush);
		PopThread myPop = new PopThread(runnable);
		Thread myPops = new Thread(myPop);
		myPushs.start();
		myPops.start();
	}

}
