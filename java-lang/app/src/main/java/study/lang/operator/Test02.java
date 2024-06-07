package study.lang.operator;

// 실습
// - 산술 연산자를 사용하여 연산을 수행한 후 결과를 확인하라.

// 학습내용
// - byte, char, short는 int로 변환된 후 실행된다.
// - 자바는 byte, char, short를 산술연산할 때 int로 변환한 후 수행한다.
// - 같은 타입끼리만 연산 할 수 있다.
// - int와 int의 연산 결과는 int이다
// - 다른 타입으로 변환하는 것을 '형변환(type casting)' 이라 한다.


public class Test02 {
  public static void main(String[] args) {
    byte b1 = 100;
    byte b2 = 20;
    byte b3 = (byte) (b1 + b2);
    // b3 변수에 b1 + b2 값을 넣고 출력해보라
    System.out.println(b3);

    int r = b1 + b2;

    char c = 20;
    short s = 30;
    // short r2 = c + s;

    long i1 = 22__0000__0000L; // L을 안붙이면 4byte int literal이다.
    int i2 = 21__0000__0000;
    int i3 = i1 + i2;
    System.out.println(i3); // -xxx

    long r3 = i1 + i2;
    System.out.println(r3); // -xxx

  }
}
