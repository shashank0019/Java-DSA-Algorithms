package strings;

public class StringQuantifeiers {

    // 1] \d -- matches one digit
    public static void checkDigit(){
        String str ="4";
        System.out.println(str.matches("\\d"));//used extra variable -->true
        System.out.println("A".matches("\\d"));//directly --false
        System.out.println("---------------------------------------");
    }
  
    

    // 2] \w -->matches one word charcter
    //equal to a-z,A-Z,0-9, underscoore also
    public static void checkWord(){
        
        System.out.println("9".matches("\\w"));//true
        System.out.println("A".matches("\\w"));//treu
        System.out.println("@".matches("\\w"));//false
        System.out.println("_".matches("\\w"));//true
        System.out.println("---------------------------------------");
    }
    public static void checkNonDigit(){
        String str ="4";
        System.out.println("S".matches("\\D"));
        System.out.println("A".matches("\\D"));
        System.out.println(" ".matches("\\D"));
        System.out.println("---------------------------------------");
    }

    public static void checkNonWord(){
        
        System.out.println(" ".matches("\\W"));
        System.out.println("A".matches("\\W"));
        System.out.println("@".matches("\\W"));
        System.out.println("_".matches("\\W"));
        System.out.println("---------------------------------------");
    }


    public static void checkspace(){
        
        System.out.println(" ".matches("\\s"));
        System.out.println("A".matches("\\s"));
        System.out.println("@".matches("\\s"));
        System.out.println("_".matches("\\s"));
        System.out.println("---------------------------------------");
    }

    public static void checkNonspace(){
        
        System.out.println(" ".matches("\\S"));
        System.out.println("A".matches("\\S"));
        System.out.println("@".matches("\\S"));
        System.out.println("_".matches("\\S"));
        System.out.println("---------------------------------------");
         System.out.println("------------------------quantifiers---------------");
    }


    //Quantifiers methods
    public static void starQuant(){
        String s1 ="abcbbaac";
        String s2 = " ";
        String s3 = "abc77";
        System.out.println(s1.matches("[abc]*"));
        System.out.println(s2.matches("[abc]*"));
        System.out.println(s3.matches("[abc]*"));
    }

    public static void PlusQuant(){
        String s1 ="abcbbaac";
        String s2 = " ";
        String s3 = "abc77";
        System.out.println(s1.matches("[abc]+"));
        System.out.println(s2.matches("[abc]+"));
        System.out.println(s3.matches("[abc]+"));
    }

//exact count-{count}
    public static void exactCountQuant(){
        String s1 ="abc";
        String s2 = "ab ";
        String s3 = "abcd";
        System.out.println(s1.matches("[abc]{3}"));
        System.out.println(s2.matches("[abc]{3}"));
        System.out.println(s3.matches("[abcd]{1}"));
    }

    //min, max 
    public static void minMaxQuant(){
        String s1 ="abccba";
        String s2 = "ab ";
        String s3 = "abccbaaa";
        System.out.println(s1.matches("[abc]{3,7}"));//true
        System.out.println(s2.matches("[abc]{3,7}"));//false
        System.out.println(s3.matches("[abc]{3,7}"));//false
    }

    //0 or 1
    public static void qstnMarkQuant(){
        String s1 ="ac";
        String s2 = "abc ";
        String s3 = "abbc";
        System.out.println(s1.matches("ab?c"));//true
        System.out.println(s2.matches("ab?c"));//true
        
        System.out.println(s3.matches("ab?c"));//false
    }




    
    


    public static void main(String[] args) {
        checkDigit();
        checkWord();
        checkNonDigit();
        checkNonWord();
        checkspace();
        checkNonspace();
        starQuant();
        PlusQuant();
        exactCountQuant();
        minMaxQuant();
        
    }
    
}
