package com.itcast.client;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
/**
 * 第二种方式调用web service
 * 模拟SOAP协议
 *
 * @author Administrator
 * @date 22/11/2019
 */
public class UrlConnectionInvoke {
	public static void main(String[] args) throws Exception {
		//请求web service的访问路径
		URL url = new URL("http://localhost:8989/userDao");

		//打开连接
		HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

		//服务端接受的是post请求
		urlConnection.setRequestMethod("POST");
		//因为要向服务端发送xml格式的数据
		urlConnection.setDoOutput(true);
		//因为要接收服务端的数据
		urlConnection.setDoInput(true);

		//服务端接收的数据格式是xml的数据格式
		urlConnection.setRequestProperty("Content-type", "text/xml;charset=utf-8");
		//通过流来写数据到服务端
		OutputStream outputStream = urlConnection.getOutputStream();

		StringBuffer buffer = new StringBuffer();
		buffer.append("<soapenv:Envelope\n" +
				"        xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"\n" +
				"        xmlns:q0=\"http://dao.itcast.com/\"\n" +
				"        xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"\n" +
				"        xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
				"  <soapenv:Body>\n" +
				"    <q0:findUserByid>\n" +
				"      <arg0>1</arg0>\n" +
				"    </q0:findUserByid>\n" +
				"  </soapenv:Body>\n" +
				"</soapenv:Envelope>");

		outputStream.write(buffer.toString().getBytes());

		//接收服务端返回的数据
		InputStream inputStream = urlConnection.getInputStream();
		byte[] b = new byte[2048];

		StringBuilder sb = new StringBuilder();
        String res = "";
		while (inputStream.read(b) != -1) {
			String s = new String(b, StandardCharsets.UTF_8);
			System.out.println(s);
            res+=s;
		}
//		System.out.println();
//		System.out.println(sb.toString());
		System.out.println();
		System.out.println(res);
	}
}
