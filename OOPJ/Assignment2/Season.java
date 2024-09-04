import java.util.*;
class Season{
    public static void main(String [] a){
        Scanner sc =new Scanner(System.in);
        int month=sc.nextInt();

        switch(month){
            case 1:
            case 2:
            case 3:
                System.out.println("winter");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Spring");
                break;

            case 7:
            case 8:
            case 9:
                System.out.println("Summer");
                break;

            case 10:
            case 11:
            case 12:
                System.out.println("Autumn");
                break;

            
            
        }
    }
}