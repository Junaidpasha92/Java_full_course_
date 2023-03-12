import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class problem_solving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        // kun_a_l:
        // 1)
       // Define two methods to print the maximum and the minimum
        // number respectively among three numbers entered by the user.
                int a,b,c;
                System.out.println("Enter three numbers:-");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                System.out.println("The max is "+max(a,b,c));
                System.out.println("The min is "+min(a,b,c));
        */

        /*
 //2)Define a program to find out whether a given number is even or odd.
        System.out.print("Enter the number :-");
        int num1 = sc.nextInt();
        even_odd(num1);
        */

        /*
        // 3):- A person is eligible to vote if his/her age is greater
         //than or equal to 18. Define a method to find out if he/she is
         //eligible to vote.

        System.out.print("Enter your age : -");
        int age = sc.nextInt();
        eligible(age);
*/

//         4):- Write a program to print the sum of two numbers entered by user by
//         defining your own method.
        System.out.println("The sum is "+sum());

//        5)Define a method that returns the product of two numbers entered by user.
//        System.out.println("The product is "+product());

    }


    /*
5):-
    static int product(){
        Scanner sc = new Scanner(System.in);
        int a , b;
        a = sc.nextInt();
        b = sc.nextInt();
        int product = a * b;
        return  product;
    }
*/



   /*
 4) : -
    static int sum(){
        Scanner sc = new Scanner(System.in);
        int a , b;
        a = sc.nextInt();
        b = sc.nextInt();
        int sum = a + b;
        return  sum;
    }
*/


/*
 3:-
    static void eligible(int age ){
        if (age >= 18){
            System.out.println("Eligible to vote.");
        }else {
            System.out.println("Not Eligible to vote.");
        }
    }



 2: -
    static void even_odd(int num){
        if (num %2==0){
            System.out.println("Even");
        }else System.out.println("Odd");

    }
*/


    // 1)
    //     static int max(int a,int b,int c){
    //         int max;
    //         if (a >b && a>c){
    //          max = a;
    //         }else if (b >a && b > c){
    //             max = b;
    //         }else {
    //             max = c;
    //         }
    //         return max;
    //     }
    //     static int min(int a,int b,int c){
    //         int min;
    //         if (a < b && a < c){
    //             min = a;
    //         }else if (b < a && b < c){
    //             min = b;
    //         }else {
    //             min = c;
    //         }
    //         return min;
    //     }


}
