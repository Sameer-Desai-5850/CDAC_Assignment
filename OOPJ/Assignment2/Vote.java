import java.util.*;
class Vote{
    public static void main(String []ar){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        if(age>18){
            System.out.println("can vote");
        }
        else{
            System.out.println("cant vote");

        }
    }
}