package cn.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	//客户端传您好给服务器     服务器传您也好给客户端
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);//设置端口号
		Socket socket = ss.accept();//调用accept方法获取Socket对象
		
		BufferedReader br =new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String val = br.readLine();
		System.out.println(val);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bw.write("您也好");
		bw.newLine();
		bw.flush();
	
		bw.close();
		br.close();
		socket.close();
		ss.close();
	}
}
