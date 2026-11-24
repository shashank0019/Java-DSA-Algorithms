package strings;
import java.util.*;

public class stringChar {


    //take input char array check vowels is present or not
    public static void CheckVowels()
    {
        int count =0;
        char [] temp ={'S','H','A','S','H','I'};

        for(int i =0;i<temp.length;i++){
            if(temp[i]=='A'||temp[i]=='o'||temp[i]=='E'||temp[i]=='I'||temp[i]=='U'
            ||temp[i]=='a'||temp[i]=='e'||temp[i]=='i'||temp[i]=='o'||temp[i]=='u')
            {
                count++;
            }
        }
        System.out.println("vowelcount in char:" +count);

        String s ="Shashank";

        for(int i =0;i<s.length();i++){
            char tem = s.charAt(i);
            if(tem=='A'||tem=='o'||tem=='E'||tem=='I'||tem=='U'
            ||tem=='a'||tem=='e'||tem=='i'||tem=='o'||tem=='u')
            {
                count++;
            }
        }
        System.out.println("vowelcount in string:" +count);
    }


    //COount uppercase letters

    public static void CountUpper()
    {
        int count =0;
        char [] temp ={'S','H','A','S','H','I'};

        for(int i =0;i<temp.length;i++){
            if(temp[i]>='A'&& temp[i]<='Z')
            {
                count++;
            }

        }
        System.out.println("count upper case in char:" +count);

    }
  //string
    public static void CountUpperString()
    {
        int count =0;
        String s ="ShaSHHhank";

        for(int i =0;i<s.length();i++){
            char tem = s.charAt(i);
        if(tem>='A' && tem<='Z')
        {
            count++;
        }

    }
    System.out.println("count upper case in string:" +count);
}
//COUNT DIGIT IN GIVEN STRING

public static void CountDigitsString()
    {
        int count =0;
        String s ="S1h2a3s4h5";

        for(int i =0;i<s.length();i++){
            char tem = s.charAt(i);
        if(tem>=48 && tem<=57)

        
        {
            count++;
        }

    }
    System.out.println("count digits in string:" +count);
}

public static void CountDigitachar()
    {
        int count =0;
        char [] temp ={'S','1','A','S','7','I'};

        for(int i =0;i<temp.length;i++){
            if(temp[i]>=48 &&temp[i]<=57)//or we can take temp[i]>='0' && temp[i]<='9'
            {
                count++;
            }

        }
        System.out.println("count digits in char:" +count);

    }

    //count specia charcters

    public static void CountSpecialString()
    {
        int count =0;
        String s ="S@HA5#%";

        for(int i =0;i<s.length();i++){
            char tem = s.charAt(i);
        if(!((tem>=48 &&tem<=57) || (tem>='A' && tem<='Z')||(tem>='a' && tem<='z'))){
            count++;
        }

        
        

    }
    System.out.println("count Special in string:" +count);
}



public static void CountSpecialachar()
    {
        int count =0;
        char [] temp ={'S','1','A','S','7','I'};

        for(int i =0;i<temp.length;i++){
            if(temp[i]>=48 &&temp[i]<=57)//or we can take temp[i]>='0' && temp[i]<='9'
            {
                count++;
            }

        }
        System.out.println("count digits in char:" +count);

    }
    //searcha a key in the char

public static boolean CheckLetter(){
     char [] temp ={'S','H','A','S','H','I'};
     int key ='I';
     boolean found = false;

     for(int i =0;i<temp.length;i++){
        if(temp[i]==key){
            found = true;
            break;
        }
     }
     return found;

}


public static boolean CheckStringLetter(){
     String t="Shashank";
     int key ='a';
     boolean found = false;

     for(int i =0;i<t.length();i++){
        char ch =t.charAt(i);
        if(ch==key){
            found = true;
            break;
        }
     }
     return found;

}
//count occurance of key
public static void CountkeyhowmanyString(){
     String t="Shashank";
     int key ='a';
     int count=0;

     for(int i =0;i<t.length();i++){
        char ch =t.charAt(i);
        if(ch==key){
            count++;
        }
     }
     System.out.println("how many key present in string:" +count);
     
}
public static void CountkeyhowmanyChar(){
      char [] temp ={'S','a','A','a','7','a'};
     int key ='a';
     int count=0;

     for(int i =0;i<temp.length;i++){
        
        if(temp[i]==key){
            count++;
        }
     }
     System.out.println("how many key present in char:" +count);
     
}
//palindrome

public static void Plaindrome(){
    String s ="madam";
    String original =s;
    String rev ="";
    for(int i =s.length()-1;i>=0;i--){
        char ch = s.charAt(i);

        rev+=ch;
    }
    if(original.equals(rev)){
        System.out.println("palindrome");
    }else{
        System.out.println("nott a palindrome");
    }
}
//while loop
public static void PalindromeWhile() {
    String s = "madan";

    int left = 0;
    int right = s.length()-1;

    boolean flag = true;

    while(left < right) {
        if(s.charAt(left) != s.charAt(right)) {
            flag = false;
            break;
        }
        left++;
        right--;
    }

    if(flag) {
        System.out.println("Palindrome");
    } else {
        System.out.println("Not a palindrome");
    }
}

//find largest
 public static void Lrgestt()
 {
    char[] ch ={'A','B','C','D'};
    char largest = ch[0];
    for(int i =1;i<ch.length;i++){
        if(ch[i]>largest){
            largest = ch[i];
        }
    }
    System.out.println(largest);
 }

 //string largest 
 public static void LargestString(){
    String s = "shashantk";
    char largest = s.charAt(0);
    for(int i =1;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch>largest){
            largest = ch;
        }
    }
    System.out.println(largest);
 }
 //replace vowels with star

 public static void VowelsStar(){
    char [] ch ={'J','a','v','a'};
    for(int i =0;i<ch.length;i++){
        if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
            ch[i] = '#';
            System.out.println(ch[i]);

        }else{
            System.out.println(ch[i]);
        }
    }
 }
 //leetcode 2114

 public static void Leetcode2114(){
    String[] s ={"I Love java","java is very easy","I love dsa the king"};
    int max =0;
    for(int i =0;i<s.length;i++){
        int word =1;
        for(int j =0;j<s[i].length();j++){
            if(s[i].charAt(j) == ' '){
                word++;
            }

        }
        if(word>max){
            max= word;
        }
        


    }
    System.out.println(max);
 }


 //group anagrama
 public static void AnagramCheck(){
  String s1 = "listen";
String s2 = "silenk";

if(s1.length()!=s2.length()){
    System.out.println("not a anagram");
    return;

}

char [] ch1 = s1.toCharArray();
char [] ch2 = s2.toCharArray();
Arrays.sort(ch1);
Arrays.sort(ch2);
String s = new String(ch1);
String k = new String(ch2);
if(s.equals(k)){
    System.out.println("anagram");
}else{
    System.out.println("not an anagram");
}


 }






    public static void main(String[] args) {
        CheckVowels();
        CountUpper();
        CountUpperString();
        CountDigitsString();
        CountDigitachar();
        CountSpecialString();
        boolean l =CheckLetter();
        System.out.println("found at char:"+l);
        boolean s =CheckStringLetter();
        System.out.println("found at String:"+s);
        CountkeyhowmanyString();
        CountkeyhowmanyChar();
        Plaindrome();
        PalindromeWhile();
        Lrgestt();
        LargestString();
        VowelsStar();
        Leetcode2114();
        AnagramCheck();


        
    }
    
}
