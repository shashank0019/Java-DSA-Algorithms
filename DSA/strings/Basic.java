package strings;

class Basic{
    public static void main(String[] args){

        String str = "Java programming";
        String s = new String("the king is bck");

        String s1 = "Maker";
        String s2 = "MAker";
        String s3="";
       

        System.out.println(str.length());  //length pf the string
       // System.out.println(str.concat("the")); //add of new string to prevoius one
        System.out.println("-----------------------------------");

       //toCharArray()-->convert string into array because string is immutable dp need to convert
       //synatx : char[] arr =string.toCharArray()
       String name = "algo";
       char [] arr = name.toCharArray();
       System.out.println("For to char array");
       for(char num:arr){
        System.out.print(num+" ");
       }
       System.out.println();
    System.out.println("-----------------------------------");


       System.out.println("Give the letter in that index:"+str.charAt(0)); //get character at index position
       System.out.println("-----------------------------------");

       System.out.println("Convert the str into lowwer:"+str.toLowerCase()); //convert to upper 
       System.out.println("Convert the str into upper:"+str.toUpperCase());  //convert to lower
       System.out.println("-----------------------------------");
       System.out.println("Equals case:"+s1.equals(s2));    //comapre each string content not the refernce
       System.out.println("Equals ignorecase:"+s1.equalsIgnoreCase(s2)); //comapre skip lower or uppper is okay
       System.out.println("-----------------------------------");
       System.out.println("Check contains:"+str.contains("JAva")); //check the substring is present in original string return true or false
       System.out.println("-----------------------------------");
       System.out.println("Sting start with:"+s1.startsWith("Ma")); //check the sting stsrt letters return true or false
       System.out.println("Sting ends with:"+s1.endsWith("er")); //check the string ends with leters return true or false

       System.out.println("-----------------------------------");
       //substring Begin--> return charcter from begin to end with BI 
       //Substring begin and end --> return charcter from BI TO EI
       System.out.println("Give the substring from start:"+str.substring(7)); //give from index starts
        System.out.println("Give the substring start to end:"+str.substring(7,11)); //portion of string


        System.out.println("-----------------------------------");
        //indexOf()--> returns the first occurance if found if not return -1
        //used for searching, validation
        System.out.println(s1.indexOf('k')); //return the index  of character
        System.out.println(str.lastIndexOf('g')); //return the index 1 of character from last
        System.out.println("-----------------------------------");
        System.out.println(str.replace("Java","python")); //repkcae the sepecific part of string

        System.out.println("-----------------------------------");
        String t =" the king is back  ";
        String s4 = "the man   ";
        System.out.println("trim leading and traling:"+t.trim());
        System.out.println(s4.trim());  //remove leading and trailing spaces

        System.out.println("-----------------------------------");
        System.out.println(s3.isEmpty()); //check it empty or not string


        System.out.println("-----------------------------------");
        //split ()--break the string into pices(separator is removed)
        //return type : String[]
        //used in cv files, names , tiokenization
        String[] king = str.split(","); //split the string into wordsss
        for(String one:king)//we need loop to print the results beacuse that is array
        {
            System.out.println(one);
        }

        //compareTo -- compares string lexicograpically
        //return 0 -- if string is equal
        //<0 --if first string comes befor second
        //>0-- if first sstring comes after second
        //comparison is based on unicode valuess
        //syntax:Str.compareTo(str2);

        System.out.println("-----------------------------------");
        System.out.println("string comparison");
        String str11 ="Apple";
        String str12 ="Banana";
        String str13 ="Apple";
        String str14 ="App";
        System.out.println(str11.compareTo(str14));
         System.out.println(str11.compareTo(str12));
          System.out.println(str11.compareTo(str13));
           System.out.println(str12.compareTo(str11));
           
        System.out.println("commpare ignore case");
        String str21 ="Apple";
        String str22 ="Banana";
        String str23 ="apple";
        String str24 ="app";
        System.out.println(str21.compareToIgnoreCase(str24));
         System.out.println(str21.compareToIgnoreCase(str22));
          System.out.println(str21.compareToIgnoreCase(str23));
           System.out.println(str22.compareToIgnoreCase(str21));

System.out.println("-----------------------------------");

    //concat-->
    String k1 ="Hello";
    String k2 = "World";
    String k3 = "return";

    System.out.println("using concat method:"+k1.concat(" ").concat(k2));

    System.out.println("-----------------------------------");

    //join() --> used to combine mutliple string we canuse join for two string to combine we use concat

    String result = String.join(" ",k1,k2,k3);
    System.out.println(result);

 System.out.println("-----------------------------------");
    //valueOf()-->any primitive data into string
    //overloaded method 
    //int , double, float, long,char boolean etc
    //used in concatination, diplay, fire writing
    int number =100;
    String st = String.valueOf(number);
    System.out.println(st);
           



      
        



    }
}