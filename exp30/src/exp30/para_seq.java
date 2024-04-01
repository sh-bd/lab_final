package exp30; //sequence of parameters

public class para_seq {

    public void display(int num, double decimal) {
        System.out.println(num + ", " + decimal);
    }

    public void display(double decimal, int num) {
        System.out.println(decimal + ", " + num);
    }

    public static void main(String[] args) {
        para_seq obj = new para_seq();

    	System.out.println("Sequence of Data type of parameters.");
        obj.display(5, 3.5);
        obj.display(2.7, 10);
    }
}
