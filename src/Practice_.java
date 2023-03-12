import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Practice_ {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);





//        int count =0;
//        System.out.print("Enter the high number :-");
//        int hn = sc.nextInt();
//        System.out.print("Enter the low number");
//        int ln = sc.nextInt();
//        int i = ln;
//
//        while(i<=hn){
//            if (i%2!=0){
//                count++;
//                System.out.print(i+" ");
//            }
//            i++;
//        }
//        System.out.println();
//        System.out.println("The total numbers are "+ count);


        // pratice set one by cwh :-

        // 1):- Finding the sum of three numbers :-
//        int a = 10;
//        int b = 20;
//        int c = 30;
//        int sum = a + b + c;
//        System.out.println("The sum is "+sum);


        // 2) Calculating the CGPA : -
//        System.out.print("Enter the marks in sub1:-");
//        int sub1 = sc.nextInt();
//        System.out.print("Enter the marks in sub2:-");
//        int sub2 = sc.nextInt();
//        System.out.print("Enter the marks in sub3:-");
//        int sub3 = sc.nextInt();
//        int sum = sub1 + sub2 + sub3 ;
//        System.out.println("The percentage of a student is "+(sum/3)+"%");


        // 3) Taking name as input and greeting
//        System.out.print("Enter your name :-");
//        String name = sc.nextLine();
//        System.out.println("Assalamuwalekum "+name);


        // 4) Converting kilometers to miles :-
//        System.out.print("Enter the distance in kilometers :-");
//        float dis_in_km = sc.nextInt();
//        float dis_in_mil = dis_in_km * 0.621371f;
//        System.out.println("The distance in miles is "+dis_in_mil);


        // 5):-detecting the entered number is integer or not

//        System.out.println("Enter the number:-");
//        System.out.println(sc.hasNextInt());


        // practice set 4:-

        //
//
//        System.out.print("Enter your percentage :-");
//        float percentage = sc.nextFloat();
//       if (percentage > 85){
//           System.out.println("Distinction");
//       }else if (percentage > 60){
//           System.out.println("First class");
//       }else if (percentage > 40){
//           System.out.println("second class");
//       }else if (percentage > 33){
//           System.out.println("pass");
//       }else {
//           System.out.println("Fail");
//       }


//        System.out.print("Enter your income in lakh :- ");

//        float income = sc.nextFloat();
//        if (income >= 2.5 && income <=5.0){
//            System.out.println("You have to pay 5% tax");
//            tax = income * 5;
//        }else if (income > 5.0 && income <=10){
//            System.out.println("You have to pay 20% ");
//            tax = income * 20;
//        }else if (income > 10){
//            System.out.println("You have to pay 30% ");
//            tax = income * 30;
//        }else{
//            System.out.println("You don't have to pay tax");
//        }


        /*Input: low = 3, high = 7
          Output: 3
          x_ plantation : The odd numbers between 3 and 7 are [3,5,7].*/

//        System.out.print("Enter number 1:- ");
//        int a = sc.nextInt();
//        System.out.print("Enter the number :- ");
//        int b = sc.nextInt();
//        int i = a;
//        while (i<=b){
//            if (i%2!=0){
//                System.out.print(i+" ");
//            }
//            i++;
//        }




        // Practice on loops :-

        // 1):---Write a program to print numbers from 1 to 10.

//        for (int i = 1; i <11 ; i++) {
//            System.out.println(i);
//
//        }


        // 2) :- Write a program to calculate the sum of first 10 natural number.
//        int sum = 0;
//
//        for (int i = 1; i <11 ; i++) {
//             sum = sum + i;
//        }
//        System.out.println(sum);


        // 3):-Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.

//        System.out.print("Enter the number to print the table of it :- ");
//        int num = sc.nextInt();
//        for (int i = 1; i <11 ; i++) {
//            System.out.println(num +" * " +i+" = "+(num *i) );
//
//        }


        // 4) :- Write a program to find the factorial value of any number entered through the keyboard.

//        System.out.print("Enter the number :-");
//        int num = sc.nextInt();
//        int fact = 1;
//        for (int i = num; i >0 ; i--) {
//            fact = fact * i;
//        }
//        System.out.println("The factorial is "+fact);


        //  5):-Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.


//        System.out.print("Enter the number :-");
//        int num = sc.nextInt();
//       while (num > 0){
//           int rev = num % 10;
//           System.out.print(rev);
//           num = num / 10;
//
//       }

        // 6):- Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
//
//        int even_sum = 0;
//        int odd_sum = 0;
//        int num;
//        char choice;
//        do {
//            System.out.println("Enter num :-");
//            num = sc.nextInt();
//            if (num % 2 == 0) {
//                even_sum = even_sum + num;
//            } else if (num % 2 != 0) {
//                odd_sum = odd_sum + num;
//            }
//            System.out.println("Enter 'y' if you want to contineu or 'n' to end ");
//             choice  = sc.next().trim().charAt(0);
//        }while (choice =='y'|| choice =='Y');
//
//
//        System.out.println("Even sum of numbers is "+even_sum);
//        System.out.println("Even sum of numbers is "+odd_sum);


        // 7):-Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.


//        System.out.print("Enter the number to check the number is prime or not : -");
//        int num = sc.nextInt();
//        boolean prime = true;
//        for (int i = 2; i <num ; i++) {
//            if (num %i==0){
//                prime = false;
//                break;
//            }
//        }
//        if (prime && num >1){
//            System.out.println("It is a prime number ");
//        }else {
//            System.out.println("It is not a prime number");
//        }









        //                   Java practice set 5 code with harry :-

        /*  1):-    ****
                    ***
                    **
                    *
         */

//        for (int i = 0; i <5 ; i++) {
//            for (int j = 0; j <5 ; j++) {
//                 if (i==0||j==0||(i==1 && j==1)||(i==1 && j==2)||(i==2 && j==1)){
//                System.out.print("*");
//                 }
//            }
//            System.out.println(" ");
//        }


        // 2):- writing the sum of first n integer numbers
//        System.out.print("Enter the number :-");
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i = 0; i <=n ; i++) {
//            sum = sum + i;
//        }
//        System.out.println("The sum is "+sum);


        // sum of even numbers
//        System.out.print("Enter the number:-");
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i = 0; i <=n ; i++) {
//            if (i %2 ==0){
//                sum = sum + i;
//            }
//        }
//        System.out.println("The sum is "+sum);



        // 3):- Finding the multiplication of a table :-

//        System.out.print("Enter the number to print its table : -");
//        int num = sc.nextInt();
//        for (int i = 1; i <11 ; i++) {
//            System.out.println(num +" * "+i+" = "+(num * i));
//
//        }


        // 4):- factorial of a number
//        System.out.print("Enter the number : -");
//        int n = sc.nextInt();
//        int factorial = 1;
//        for (int i = 1; i <=n ; i++) {
//            factorial = factorial * i;
//
//        }
//        System.out.println("Factorial is "+ factorial);


        // 9)calculating the sum of numbers which are occuring in the 8th table ;-

//        int sum = 0;
//        for (int i = 8; i <=80 ; i++) {
//            if (i %8==0){
//              sum = sum + i;
//            }
//        }
//        System.out.println(sum);












    }
}
