package pro.ctlok.com.jetty.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class UrlTest {

	@Test
	public void test() throws IOException {
		URL url = new URL("http://localhost:8080/jetty/index");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();

		assert conn.getResponseCode() == 200;
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		try{
			assert rd.readLine().equals("Hello World");
		} finally {
			rd.close();
		}
	}
}
