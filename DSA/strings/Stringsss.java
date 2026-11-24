package strings;

public class Stringsss {
    //3
    public static void PrintCurrent(char h){
        System.out.println(h);
        System.out.println((char)(h+1));
        
    }
    //5
    public static void Tolower(char h)
    {
        System.out.println((char)(h+32));
    }
    //6
    public static void CheckNUll(char[] ch)
    {
        for(char chaa:ch){ //we can print without loop also
            System.out.println(chaa);//i will create space print nothing
        }

    }

    //create a array
    public static void PrintNumbers(){
        char[] one = {'A','B','C','D'};
        for(char to :one){
            System.out.println((int)to);
        }
    }
    //create a array print number
    public static void PrintUsecharNumbers(){
        char[] one = {65,66,67,68,69};
        for(char to :one){
            System.out.println(to);
        }
    }
    //create a array
    public static void PartialInit(){
        char [] one =new char[5];

        one[0]='A';
        one[1]='B';
        for(char to :one){
            System.out.println(to);
        }
    }

    //string length
    public static void StringLength(){
        String s = "masamanj";
        System.out.println(s.length());
    }

    //print even index valuse

    public static void EvenIndies(){
        System.out.println("-------even indies------");
        String s ="Java";
        System.out.println(s);
        for(int i =0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch%2==0){
                System.out.println(ch);
            }
        }

        char[] temp = {'J','A','V'};
        System.out.println(temp);
        for(int i =0;i<temp.length;i++)
        {
            
            if(i%2==0){
                System.out.println(temp[i]);
            }
        }
        
    }





    public static void main(String[] args) {
        char[] temo={'A','B','C','D'};
        char n = 'A';
        char ch =72;
        for(char one:temo)
        {
            System.out.println(one);

        }
        System.out.println((int)(n));
        System.out.println(ch);
        PrintCurrent(n);//increment
       Tolower(n);//decrement

        char [] cha = new char[5];
        CheckNUll(cha);// 
        PrintNumbers();
        PrintUsecharNumbers();
       PartialInit();
        StringLength();
        EvenIndies();

        
        
    }
    
}
