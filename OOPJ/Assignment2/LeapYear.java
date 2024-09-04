import java.util.*;

class LeapYear{
    public static void main(String []a){
        Scanner sc=new Scanner(System.in);

        int year=sc.nextInt();
        int ch;
        if((year%4==0) &&((year % 400==0)||( year % 100 !=0 ))){
             ch=1;
             System.out.println("leap year");
        }
        else{
            ch=2;
            System.out.println("not leap year");
        }
        System.out.println(ch);     

        switch(ch){
        case 1:
            System.out.println("leap year");
            break;
        case 2:
            System.out.println("not leap year");
            break;

        }
        

        
    }
}