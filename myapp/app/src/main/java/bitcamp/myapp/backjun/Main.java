package bitcamp.myapp.backjun;
// 10998번

//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
//        int B = in.nextInt();
//
//        System.out.println(A * B);
//
//        in.close();
//    }
//}

// 1008번
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        double A = in.nextInt();
//        double B = in.nextInt();
//
//        System.out.println(A / B);
//
//        in.close();
//
//    }
//
//}

// 10869번

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
//        int B = in.nextInt();
//
//        System.out.println(A + B);
//        System.out.println(A - B);
//        System.out.println(A * B);
//        System.out.println(A / B);
//        System.out.println(A % B);
//
//        in.close();
//    }
//}

// 10926번

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        String lastString = "??!";
//
//        String s = in.next();
//        System.out.println(s + lastString);
//
//
//    }
//}

// 18108번
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//
//        int kor = 543;
//
//        int thai = in.nextInt();
//        System.out.println(thai - kor);
//
//
//    }
//}

// 10430번

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        System.out.println( (A+B)%C );
        System.out.println( (A%C + B % C)%C);
        System.out.println( (A*B)%C );
        System.out.println( (A%C)*(B%C)%C );

        in.close();
    }
}
