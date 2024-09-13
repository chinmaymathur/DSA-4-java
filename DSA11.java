import java.util.Scanner;
public class DSA11{
public static void main(String[] args){
Scanner sc =  new Scanner(System.in);
System.out.println("Enter a number");
int n = sc.nextInt();
int num = 1 ;
while(true){
if((num%5==0)&&(num%7==0)){
System.out.println("Found ans"+num);
break;
}
num++;
}
}
}
