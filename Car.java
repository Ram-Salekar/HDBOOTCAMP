// Problem Statement : inhertance Eg
public class Car{
int noOfTyers;
int noOfdoors;
char logo;
String engine;

public void drive(){
  System.out.println(" The car dvive ");
}

public void safety(){
 System.out.println(" The car have 2 star rating at safety ");
}
}
class Tata extends Car {

public void drive(){
  System.out.println(" The tata car drive Very Fast ");
}
public void safety(){
 System.out.println(" The tata  have 5 star rating at safety ");
}

}

public class Main  {
 public static void main(String [] args) {
  Car c1 = new Car();
   c1.drive();
   c1.safety();
  Tata t1 = new Tata();
  t1.drive();
 t1.safety();
}
}
  
 
