package test100;

public class SafeStack implements StackInterface {

	private int top=0;
	private int[] values =new int[10];
	private boolean dataAvailable = false;//数据可读性false=不可以pop，因为没数据，但可以push，true=不可以push，但可以pop
	
	@Override
	public void push(int n) {
		// TODO 自动生成的方法存根
		synchronized(this) {
			while(dataAvailable) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					//e.printStackTrace();
				}
			}
			values[top]=n;
			System.out.printf("push入数字%d\r\n",n);
			top++;
			dataAvailable=true;
			notifyAll();
			System.out.println("push入数字完成");
			
		}
	}

	@Override
	public int[] pop() {
		// TODO 自动生成的方法存根
		synchronized (this) {
			while(!dataAvailable) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO: handle exception
				}				
			}
			System.out.println("pop出数字");
			top--;
			int[] test = {values[top],top};
			dataAvailable=false;
			//唤醒正在等待压入push数据的线程
			notifyAll();
			return test;
		}
	}

}
