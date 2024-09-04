import java.util.*;
import java.lang.Math;

class BMI{
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter weight");
         int w=sc.nextInt();
          System.out.println("Enter Height");
         int h=sc.nextInt();

        int bmi= w/(h*h);
        System.out.println(bmi);

        if(bmi<18.5){
            System.out.println("underweight");
        }
        else if(bmi>18.5 && bmi<24.9){
             System.out.println(" normal weight");
           
        }
        else if (bmi>25){
            System.out.println(" overweight.");
        }




    }
}