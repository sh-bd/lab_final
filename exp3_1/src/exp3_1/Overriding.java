package exp3_1;
public class Overriding {
	public void disp()
	   {
		System.out.println("disp() method of parent class");
	   }	   
	}
	class Demo extends Overriding{
	   public void disp(){
		System.out.println("disp() method of Child class");
	   }
	   public void newMethod(){
		System.out.println("new method of child class");
	   }
	public static void main(String[] args) {
		Overriding obj = new Overriding();
		obj.disp();
		Overriding obj2 = new Demo();
		obj2.disp();
	}
}
