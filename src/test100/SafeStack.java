package test100;

public class SafeStack implements StackInterface {

	private int top=0;
	private int[] values =new int[10];
	private boolean dataAvailable = false;//���ݿɶ���false=������pop����Ϊû���ݣ�������push��true=������push��������pop
	
	@Override
	public void push(int n) {
		// TODO �Զ����ɵķ������
		synchronized(this) {
			while(dataAvailable) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					//e.printStackTrace();
				}
			}
			values[top]=n;
			System.out.printf("push������%d\r\n",n);
			top++;
			dataAvailable=true;
			notifyAll();
			System.out.println("push���������");
			
		}
	}

	@Override
	public int[] pop() {
		// TODO �Զ����ɵķ������
		synchronized (this) {
			while(!dataAvailable) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO: handle exception
				}				
			}
			System.out.println("pop������");
			top--;
			int[] test = {values[top],top};
			dataAvailable=false;
			//�������ڵȴ�ѹ��push���ݵ��߳�
			notifyAll();
			return test;
		}
	}

}
