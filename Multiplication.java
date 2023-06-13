import java.util.*;

class Multiplication {
    public static void main(String args[]){
        int a;
        int b;
        int c;
        Scanner o=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a=o.nextInt();
        b=o.nextInt();
        c=o.nextInt();
        System.out.println("The multiplication of "+a+" and "+b+" and "+c+" is : "+(a*b*c));
    }
}
