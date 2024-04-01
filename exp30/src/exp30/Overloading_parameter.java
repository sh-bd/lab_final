package exp30; //data type of parameters

public class Overloading_parameter {

    public void disp(int num1, int num2) {
        System.out.println(num1+", "+num2);
    }
    public void disp(double num1, double num2) {
        System.out.println(num1+", "+num2);
    }

    public static void main(String[] args) {
    	Overloading_parameter obj = new Overloading_parameter();
    	System.out.println("Data type of parameters.");
        obj.disp(5, 10);
        obj.disp(3.5, 2.7);
    }
}
