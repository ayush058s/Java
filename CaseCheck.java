
import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch = input.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }


    }

}


    //          Fibbonaci Number

//public static void main(String[] args) {
//    System.out.println();
//    Scanner in = new Scanner(System.in);
//    int n = in.nextInt();
//
//    int a = 0;
//    int b = 1;
//    int count =  2;
//    while (count <= n){
//        int temp = b;
//        b = b + a;
//        a = temp;
//        count++;
//    }
//    System.out.println(b);
//
//}
//}
