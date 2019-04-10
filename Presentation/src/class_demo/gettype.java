package class_demo;

public class gettype {
	private String s="Sandesh";
	private int x=10;
	gettype(int y){
		s="Sandesh";
		this.x=y;
	}
	gettype(String s){
		
	}
	gettype(){
		
	}
	public void refelction_class() {
		System.out.println("This is creating the class\n");
	}
	protected void modifier() {
		System.out.println("Get the modifier access specifier using reflection\n"+s);
	}
}
