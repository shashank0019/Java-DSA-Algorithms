package Basicjavaandsomearrayconcept;
public class Debuging {

    public static int  addition(int n1, int n2)
    {
        int sum=n1+n2;
        return sum;

    }
    

    public static void main(String[] args) {
        int num1=10;
        int num2=20;

        int sum=addition(num1, num2);
        System.out.println("sum="+sum);
    }
}
