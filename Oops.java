// Problem Statement : oops Concept (Acess Modifier )
import java.util.Scanner;
public class Oops {
 private int age;
 private String name;

 public void setAge(int a){
 this.age =a;
}
public void setName (String a){
this.name=a;
}
public int getAge (){
return this.age;
}
public String getName(){
return this.name;
}
public static void main (String [] args){

Scanner sc = new Scanner(System.in);

Oops s1 = new Oops();
System.out.println("Enter the name and age : ");
int x = sc.nextInt();
String name =sc.next();
s1.setAge(x);
s1.setName(name);
System.out.println(s1.getName());
System.out.println(s1.getAge());

}
}

 

 

  