package test102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerSocket2{

	public static void main(String[] args) {
		int port =8081;
		BufferedReader serverIn = null;
		PrintStream serverOut = null;
		java.net.ServerSocket serverSocket=null;
		
				try {
					serverSocket=new java.net.ServerSocket(port,9);
					System.out.println("创建服务端套接字！");
					Socket clientSocket = serverSocket.accept();
					System.out.println("服务端开始接受");
					serverIn = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
					serverOut = new PrintStream(clientSocket.getOutputStream());
					//Thread.sleep(1000);
					int n=0;
					while(true) {
						String in = serverIn.readLine();
						if(in!=null) {
							System.out.println(in+"--服务端显示");
							//Thread.sleep(2000);
							serverOut.println("这里是服务端"+n);
							serverOut.flush();
							n++;
						}
						
						//Thread.sleep(2000);
						System.out.println("fuwuduan");
						
						
					}
				} catch (Exception e) {
					
					e.printStackTrace();
				}finally {
					try {
						serverIn.close();
						serverOut.close();
						serverSocket.close();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					
				}
		
	}
}
