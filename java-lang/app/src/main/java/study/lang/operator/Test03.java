package study.lang.operator;

// 실습
// - 산술 연산자를 사용하여 연산을 수행한 후 결과를 확인하라.

// 학습내용
// - 같은 타입끼리만 연산 할 수 있다.
// - 타입이 다르면 컴파일러는 같은 타입으로 자동 변환한다. (implicit type conversion)
// - (byte, char, short) --> int --> long --> float --> double
// - 개발자가 명시적으로 타입을 변환할 수 있다. (explicit type conversion)


public class Test03 {
  public static void main(String[] args) {

    byte b = 1;
    char c = 2;
    short s = 3;
    int i = 4;
    long l = 5;
    float f = 6.0f;
    double d = 7.0;


    int r = b + c + s;

    long r2 = i + l;

    long r3 = f; // 정수 값을 부동소수점 메모리에 저장할 수 있어도 부동소수점은 안됨

    float r4 = l; // float은 4byte, long은 8byte인데? 값이 짤릴 수 있다는 것을 명심
                  // error가 안뜨기 때문에 치명적임

    System.out.println(r3); // -xxx



  }
}
