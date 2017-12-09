package test56bufferinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream("/Users/mitsuru/Desktop/TestConsole.java"));
//		FileInputStream in = new FileInputStream("t.txt");
		foo(bi);
//		foo(in);
	}
	
	public static void foo(InputStream stream) throws IOException{
		//3回読み込む
		for(int i = 0; i < 1; i++)stream.read();
		stream.mark(10);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 5; i++) sb.append((char)stream.read());
		stream.reset();
		stream.skip(1);
		sb.append((char)stream.read());
		System.out.println(sb.toString());
	}
}
