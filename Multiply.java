// Problem Statement : Multiply Array Element 
public class Multiply {

public static void main (String [] args){

int [] arr = {1,2,3,4,5};
double [] arr1 = new double [arr.length];

for(int a=0; a<arr.length;a++){

arr1[a]=2.5*arr[a];
}
for(int a =0; a<arr1.length;a++){
System.out.print(arr1[a]+" ");
}
}
}