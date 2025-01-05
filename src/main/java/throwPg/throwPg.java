package throwPg;

import java.io.IOException;

public class throwPg {
	public void method() throws IOException {
		throw new IOException("Hi");
	}
	public static void main(String[] args) {
		throwPg pg=new throwPg();
		try {
			pg.method();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
