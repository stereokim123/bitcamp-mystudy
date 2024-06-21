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

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x값 입력: ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y 값 입력: ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y: " + result);
        System.out.println();

        while (true) {
            System.out.print("입력 문자열");
            String data = scanner.nextLine();
            if (data.equals("q")) {
                break;
            }
            System.out.println("출력 문자열: " + data);
            System.out.println();
        }
        System.out.println("종료");
    }
}

