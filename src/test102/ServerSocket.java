package test102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerSocket{

	public static void main(String[] args) {
		int port =8081;
		BufferedReader serverIn = null;
		PrintStream serverOut = null;
		java.net.ServerSocket serverSocket=null;
		//����������׽���
				try {
					serverSocket=new java.net.ServerSocket(port,9);
					System.out.println("����������׽��֣�");
					Socket clientSocket = serverSocket.accept();
					System.out.println("����˿�ʼ����");
					serverIn = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
					serverOut = new PrintStream(clientSocket.getOutputStream());
					//Thread.sleep(1000);
					while(true) {
						
						String in = serverIn.readLine();
						System.out.println(in+"--�������ʾ");
						//Thread.sleep(2000);
						serverOut.println("�����Ƿ����");
						//Thread.sleep(2000);
						
					}
				} catch (Exception e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}finally {
					try {
						serverIn.close();
						serverOut.close();
						serverSocket.close();
					} catch (IOException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
					
				}
		
	}
}
