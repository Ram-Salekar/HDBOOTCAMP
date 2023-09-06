// Problem Statement : Geting Random Operators And Random number for equatiom
import java.util.Random;

public class RandomOperators {
    public static void main(String[] args) {
        Random r = new Random(0);
       
        for(int x=0; x<=10; x++){
             int operators=r.nextInt(0,4);
        int a =r.nextInt(0,11);
        int b =r.nextInt(0,11);
        switch(operators){
            case 0 :
                  {
                    System.out.println("The sum of two Random num : "+a+" and "+b+" is ");
                    System.out.println(a+b);
                    break;
                  }
            case 1 :
             {
                System.out.println("The substraction  of two Random num : "+a+" and "+b+" is ");
                    System.out.println(a-b);
                    break;
             }
             case 2 :
             {
                System.out.println("The multiplication of two Random num : "+a+" and "+b+" is ");
                    System.out.println(a*b);
                    break;
             }
             case 3 :
             {
                 System.out.println("The divide  of two Random num : "+a+" and "+b+" is ");
                    System.out.println(a/b);
             }
             

        }
        }

    }
}