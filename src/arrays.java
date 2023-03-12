import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);

        // arrays is collection of similar kind of data:-
//        int [] marks = new int[5];
//        marks[0]=100;
//        marks[1]=45;
//        marks[2]=70;
//        marks[3]=90;
//        marks[4]=86;
//        System.out.println(marks[2]);
//        String[] students = {"a","b","c","d","e"};
//        int[] ma={23,43,45,466,44};
//        System.out.println(ma[1]);
//        System.out.println(ma.length);


        int[] ma={23,43,45,466,44};


//        for (int i=0;i<=ma.length;i++){
//            System.out.println(ma[i]);
//        }


        // reverse order
//        for (int i =ma.length -1 ; i>=0;i--){
//            System.out.println(ma[i]);
//        }


        for (int element : ma){
            System.out.println(element);
        }



    }
}
