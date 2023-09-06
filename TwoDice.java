import java.util.Random;
 public class TwoDice{
  public static void main (String [] args){
    Random r = new Random();
     int a = r.nextInt(6)+1;
     int b =r.nextInt(6)+1;
    System.out.println("1st Dice is "+a);
     System.out.println("2nd Dice is "+b);
      System.out.println("the sum of  Dice is "+(a+b));
}
}