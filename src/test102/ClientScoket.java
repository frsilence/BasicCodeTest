package test102;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ClientScoket{

	public static void main(String[] args) {
		InetAddress ip1;
		int port = 8081;
		Socket clientSocket1 = null;
		BufferedReader clientIn=null;
		PrintWriter clientOut=null;
		try {
			ip1 = InetAddress.getByName("127.0.0.1");
			clientSocket1 = new Socket(ip1,port);
			System.out.println("�ͻ����׽��ִ���");
			clientIn = new BufferedReader(new InputStreamReader(clientSocket1.getInputStream()));
			clientOut = new PrintWriter(clientSocket1.getOutputStream(),true);
			while(true) {
				clientOut.println("�����ǿͻ���");
				//Thread.sleep(2000);
				String in = clientIn.readLine();
				System.out.println(in+"--�ͻ�����ʾ");
				Thread.sleep(2000);
				
				
			}
			
			
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			try {
				clientIn.close();
				clientOut.close();
				clientSocket1.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	

}
