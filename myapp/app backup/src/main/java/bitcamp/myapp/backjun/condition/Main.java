package bitcamp.myapp.backjun.condition;

//
///*
// 1330번
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int A = in.nextInt();
//        int B = in.nextInt();
//
//        if (A>B) System.out.println(">");
//        else if (A<B) System.out.println("<");
//        else System.out.println("==");{
//
//        }
//    }
//}
// 9498번
//*/
//
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) {
////        Scanner in = new Scanner(System.in);
////        int A = in.nextInt();
////
////        if (A >= 90) System.out.println("A");
////        else if (A >= 80) System.out.println("B");
////        else if (A >= 70) System.out.println("C");
////        else if (A >= 60) System.out.println("D");
////        else System.out.println("F");
////
////        }
////
////    }
//
//// 2753번
///*연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
//
//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
//
//예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다 */
///*
// import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int y = in.nextInt();
//        in.close();
//
//        if(y%4==0) {
//            if(y%400==0) System.out.println("1");
//            else if(y%100==0) System.out.println("0");
//            else System.out.println("1");
//        }
//        else System.out.println("0");
//    }
//}
//*/
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int x = in.nextInt();
//        int y = in.nextInt();
//
//        if (x )
//
//    }
//}

// 2525번

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int A = in.nextInt();  // 현재 시간 (0-23)
//        int B = in.nextInt();  // 현재 분 (0-59)
//        int C = in.nextInt();  // 더할 분 (0 이상)
//
//        // 총 분을 계산
//        int totalMinutes = B + C;
//
//        // 새로운 시간과 분 계산
//        int newHour = A + (totalMinutes / 60);
//        int newMin = totalMinutes % 60;
//
//        // 시간이 24 이상이면 24로 나눈 나머지로 변환
//        newHour = newHour % 24;
//
//        System.out.println(newHour + " " + newMin);
//    }
//}

// 2480번
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//
//        Scanner in = new Scanner(System.in);
//
//        int A = in.nextInt();
//        int B = in.nextInt();
//        int C = in.nextInt();
//
//        if (A != B && B != C && A != C) {
//            int max = Math.max(A, Math.max(B, C));
//            System.out.println(max * 100);
//
//        } else if (A == B && B == C && A == C) {
//            System.out.println(10000 + (A * 1000));
//        } else if (A == B || A != C) {
//            System.out.println(1000 + A * 100);
//        } else if (A == C || A != B)
//            System.out.println(1000 + C * 100);
//
//    }
//
//}

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        int a, b, c;
//        a = Integer.parseInt(st.nextToken());
//        b = Integer.parseInt(st.nextToken());
//        c = Integer.parseInt(st.nextToken());
//
//        // 만약 모든 변수가 다른 경우
//        if (a != b && b != c && a != c) {
//            int max = Math.max(a, Math.max(b, c));
//            System.out.println(max * 100);
//        }
//        // 3개의 변수가 모두 같은 경우
//        else if (a == b && a == c) {
//            System.out.println(10000 + a * 1000);
//        }
//        // a가 b혹은 c랑만 같은 경우
//        else if (a == b || a == c) {
//            System.out.println(1000 + a * 100);
//        }
//        // b가 c랑 같은 경우
//        else {
//            System.out.println(1000 + b * 100);
//        }
//    }
//}

// 2739번
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//
//        for (int i = 1; i < 10; i++) {
//            System.out.println(a + " * " + i + " = " + (i * a));
//        }
//    }
//}

// 10950번

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String args[]) {
//
//        Scanner in = new Scanner(System.in);
//
//        int c = in.nextInt();
//        int arr[] = new int[c];
//
//        for (int i = 0; i < c; i++) {
//            int a = in.nextInt();
//            int b = in.nextInt();
//            arr[i] = a + b;
//        }
//        in.close();
//
//        for (int k : arr) {
//            System.out.println(k);
//        }
//    }
//
//}

// 8393번
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int n = in.nextInt();
//        in.close();
//        int sum = 0;
//
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//            System.out.println(sum);
//
//        }
//    }
//}

// 25304번
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int X = in.nextInt();
//        int Y = in.nextInt();
//        int a = in.nextInt();
//        int b = in.nextInt();
//        in.close();
//
//        if ()
//    }
//}