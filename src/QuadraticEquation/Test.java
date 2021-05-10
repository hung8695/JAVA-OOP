package QuadraticEquation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập a: ");
        int  a= sc.nextInt();
         System.out.println("Nhập b: ");
        int  b= sc.nextInt();
         System.out.println("Nhập c: ");
        int  c= sc.nextInt();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()<0){
            System.out.println("Phương trình vô nghiệm: ");
        }
        else if (quadraticEquation.getDiscriminant()==0){
            System.out.println("Phương trình có nghiệm là: x = "+quadraticEquation.getRoot1());
        } else {
            System.out.println("Phương trình có 2 nghiệm là: ");
            System.out.prinln("x1 = "+ quadraticEquation.getRoot1());
            System.out.print("x2 = "+ quadraticEquation.getRoot2());
        }
    }
}
