import java.util.Scanner;
class Shapearea{

    public static void main(String [] args){
        System.out.println("type 1 for Circle, 2 Square, 3 Rectangle, 4 Triangle ");

    Scanner sc=new Scanner(System.in);

    int ch=sc.nextInt();

    switch(ch){

        case 1:
            System.out.println("r=");
            int r =sc.nextInt();
            System.out.println("Areaa="+(2.14*r*r));
            break;
        case 2:
            System.out.println("l=");
            int l=sc.nextInt();
            System.out.println("Areaa="+(l*l));
             break;

        case 3:
            System.out.println("w=");
            int w=sc.nextInt();
            System.out.println("h=");
            int h=sc.nextInt();
            System.out.println("Areaa="+(w*h));
             break;
        case 4:
            System.out.println("b=");
            int b=sc.nextInt();
            System.out.println("h=");
            int ht=sc.nextInt();
            System.out.println("Areaa="+(b*ht/2));
             break;


    }
    }

    

}