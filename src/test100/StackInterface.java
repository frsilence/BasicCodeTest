package test100;
/**
 * 线程A向队列Q中不停写入数据，线程B从队列Q中不停读取数据（只要Q中有数据）
 * @author yfzhao
 *
 */
public interface StackInterface {
	public void push(int n);
	public int[] pop();
}
