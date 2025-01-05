package classExtension;

import org.testng.annotations.Test;

public class childClass extends parentclass{
	public void child() {
		System.out.println(parent());
	}
	@Test()
	public void main(String[] args) {
		childClass cl=new childClass();
		cl.child();
	}

}
