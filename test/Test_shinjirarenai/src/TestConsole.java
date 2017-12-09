import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestConsole {
	public static void main(String[] args) {

		 Console console = System.console();
		 String str = console.readLine("please input :");
		 console.format(str);

		/*
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			System.out.println(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
