package test102;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ClientScoket2{

	public static void main(String[] args) {
		InetAddress ip1;
		int port = 8081;
		Socket clientSocket1 = null;
		BufferedReader clientIn=null;
		BufferedWriter clientOut=null;
		try {
			ip1 = InetAddress.getByName("127.0.0.1");
			clientSocket1 = new Socket(ip1,port);
			System.out.println("创建客户端套接字");
			clientIn = new BufferedReader(new InputStreamReader(clientSocket1.getInputStream()));
			clientOut = new BufferedWriter(new OutputStreamWriter(clientSocket1.getOutputStream()));
			while(true) {
				
				for(int i=0;i<=9999;i++) {
					clientOut.write("来自客户端"+i+"\r\n");
					clientOut.flush();
					Thread.sleep(50);
				}
				//clientOut.write("来自客户端的信息\r\n");
				//Thread.sleep(2000);
				String in = clientIn.readLine();
				System.out.println(in+"--客户端显示");
				//Thread.sleep(2000);
				System.out.println("kehuduan");
			}
			
			
		} catch (Exception e) {
		
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
