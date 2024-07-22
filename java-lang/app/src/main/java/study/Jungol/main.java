package study.Jungol;

import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int num = 1; // num 변수 초기화

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.printf("%d ", num++);
      }
      System.out.printf("\n");
    }

    sc.close(); // Scanner 닫기
  }
}
