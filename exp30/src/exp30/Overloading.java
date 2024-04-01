package exp30; //number of paramaters

public class Overloading {
    public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}
class Num_Para
{
   public static void main(String args[])
   {
	   Overloading obj = new Overloading();
	   System.out.println("Number of parameters.");
       obj.disp('a');
       obj.disp('a',10);
   }
}