package Basicjavaandsomearrayconcept;
class Jvmarchitecture{  //method area
    public static void main(String[] args)
    {
        int x = 15;  // in stack
        int y = 25;  // in stack

        int z = x + y;  // in stack

        String str = new String("sum"+z); // heap
        System.out.println(str+z);
    }

}