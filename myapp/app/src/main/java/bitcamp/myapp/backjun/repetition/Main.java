package bitcamp.myapp.backjun.repetition;

//import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int X = sc.nextInt();
//        int N = sc.nextInt();
//        int total = 0;
//
//        for (int i = 0; i < N; i++) {
//            int a = sc.nextInt(); // 각 물건의 가격
//            int b = sc.nextInt(); // 각 물건의 개수
//            total += a * b;
//        }
//
//        if (total == X) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }
//}

// 25314번

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            if (i % 4 == 0) {
//                System.out.print("long ");
//            }
//        }
//
//        System.out.println("int");
//    }
//}
//

// 15552번

//import java.io.*;
//import java.util.StringTokenizer;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//
//        int N = Integer.parseInt(br.readLine());
//
//        StringTokenizer st;
//
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
//        }
//        br.close();
//
//        bw.flush();
//        bw.close();
//
//    }
//}

//11021 번

//import java.io.*;
//import java.util.StringTokenizer;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//
//        int N = Integer.parseInt(br.readLine());
//
//        StringTokenizer st;
//
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
//        }
//        br.close();
//
//        bw.flush();
//        bw.close();
//
//    }
//}

// 11021번

//import java.io.*;
//import java.util.StringTokenizer;
//
//public class Main {
//    public static void main(String args[]) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int a = Integer.parseInt(br.readLine());
//
//        StringTokenizer st;
//        for (int i = 1; i <= a; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            bw.write("Case #" + i + ": ");
//            bw.write(Integer.parseInt(st.nextToken())
//                    + Integer.parseInt(st.nextToken()) + "\n");
//        }
//        br.close();
//        bw.flush();
//        bw.close();
//    }
//
//}

// 11022번
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//
//        for (int i = 1; i <= N; i++) {
//
//            int A = sc.nextInt();
//            int B = sc.nextInt();
//
//            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A + B));
//
//        }
//        sc.close();
//    }
//}

// 2483번
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        String str = "*";
//        StringBuilder sb = new StringBuilder();
//        for (int i = 1; i <= N; i++) {
//            sb.append(str);
//            System.out.println(sb);
//        }
//    }
//}
// 2439번

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = "*";
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(str);
            System.out.printf("%5s\n", sb);
        }
    }
}

