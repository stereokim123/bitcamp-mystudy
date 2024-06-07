package study.lang.operator;

// 실습
// - 산술 연산자를 사용하여 연산을 수행한 후 결과를 확인하라.

// 학습내용
// - 정수와 정수의 연산 결과는 정수이다.
// - 부동소수점과 부동소수점의 연산 결과는 부동소수점이다.
// - 정수와 부동소수점의 연산 결과는 부동소수점이다.
// => 연산은 반드시 같은 타입만 가능
// => 타입이 다르면 타입을 맞춘 후 연산을 수행
// 정수 --> 부동소수점
// 작은 크지의 값은 --> 큰 크기의 값
// byte, short, char, int, long --> float, double

public class Test01 {
  public static void main(String[] args) {
    // 정수 연산
    System.out.println(100 + 24); // 덧셈
    System.out.println(100 - 24); // 뺄셈
    System.out.println(100 * 24); // 곱셈
    System.out.println(100 / 24); // 나눗셈
    System.out.println(100 % 24); // 나머지
    System.out.println("");
    // 부동소수점 연산 (소수점 최소 한 자리)
    System.out.println(100.0 + 24.0); // 덧셈
    System.out.println(100.0 - 24.0); // 뺄셈
    System.out.println(100.0 * 24.0); // 곱셈
    System.out.println(100.0 / 24.0); // 나눗셈
    System.out.println(100.0 % 24.0); // 나머지
    // 정수와 부동소수점의 연산 결과
    System.out.println("");
    System.out.println(100.0 + 24); // 덧셈
    System.out.println(100.0 - 24); // 뺄셈
    System.out.println(100.0 * 24); // 곱셈
    System.out.println(100.0 / 24); // 나눗셈
    System.out.println(100.0 % 24); // 나머지
  }
}
