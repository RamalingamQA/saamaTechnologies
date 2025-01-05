package constructor;


public class cons extends constructorBase{
	int a;
	public void junk(int a) {
		super.a=a;
		this.a=super.a;
		System.out.println(super.a+" "+a);
	}
	

	public static void main(String[] args) {
		cons cs=new cons();
		cs.junk(50);
		cs.method();
		

		
		
	}
	

}
