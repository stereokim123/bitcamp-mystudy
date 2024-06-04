package study.lang.variable;

public class Test01 {
  public static void main(String[] args) {
    // byte 타입 변수 선언 및 최소값, 최대값 할당
    byte b1 = -128;
    byte b2 = 127;
    // byte b3 = -129; // 오류: 값이 byte의 최소값보다 작음
    // byte b4 = 128; // 오류: 값이 byte의 최대값보다 큼

    // short 타입 변수 선언 및 최소값, 최대값 할당
    short s1 = -32768;
    short s2 = 32767;
    // short s3 = -32769; // 오류: 값이 short의 최소값보다 작음
    // short s4 = 32768; // 오류: 값이 short의 최대값보다 큼

    // int 타입 변수 선언 및 최소값, 최대값 할당
    int i1 = -21_4748_3648;
    int i2 = 21_4748_3647;
    // int i3 = -2147483649; // 오류: 값이 int의 최소값보다 작음
    // int i4 = 2147483648; // 오류: 값이 int의 최대값보다 큼

    // long 타입 변수 선언 및 최소값, 최대값 할당
    long l1 = -922_3372_0368_5477_5808L;
    long l2 = 922_3372_0368_5477_5807L;
    // long l3 = -9223372036854775809L; // 오류: 값이 long의 최소값보다 작음
    // long l4 = 9223372036854775808L; // 오류: 값이 long의 최대값보다 큼

    // float 타입 변수 선언 및 최소값, 최대값 할당
    float f1 = -3.4028235E38f;
    float f2 = 3.4028235E38f;
    // float f3 = -3.4028236E38f; // 오류: 값이 float의 최소값보다 작음
    // float f4 = 3.4028236E38f; // 오류: 값이 float의 최대값보다 큼

    // double 타입 변수 선언 및 최소값, 최대값 할당
    double d1 = -1.7976931348623157E308;
    double d2 = 1.7976931348623157E308;
    // double d3 = -1.7976931348623158E308; // 오류: 값이 double의 최소값보다 작음
    // double d4 = 1.7976931348623158E308; // 오류: 값이 double의 최대값보다 큼

    // char 타입 변수 선언 및 최소값, 최대값 할당
    char c1 = 0;
    char c2 = 65535;
    // char c3 = -1; // 오류: 음수는 char 타입에 할당할 수 없음
    // char c4 = 65536; // 오류: 값이 char의 최대값보다 큼

    // boolean 타입 변수는 true와 false만 할당 가능
    boolean bool1 = true;
    boolean bool2 = false;
    // boolean bool3 = 1; // 오류: boolean 타입은 true와 false만 가질 수 있음

    // 출력
    System.out.println("byte 변수 b1의 값: " + b1);
    System.out.println("byte 변수 b2의 값: " + b2);
    System.out.println("short 변수 s1의 값: " + s1);
    System.out.println("short 변수 s2의 값: " + s2);
    System.out.println("int 변수 i1의 값: " + i1);
    System.out.println("int 변수 i2의 값: " + i2);
    System.out.println("long 변수 l1의 값: " + l1);
    System.out.println("long 변수 l2의 값: " + l2);
    System.out.println("float 변수 f1의 값: " + f1);
    System.out.println("float 변수 f2의 값: " + f2);
    System.out.println("double 변수 d1의 값: " + d1);
    System.out.println("double 변수 d2의 값: " + d2);
    System.out.println("char 변수 c1의 값: " + c1);
    System.out.println("char 변수 c2의 값: " + c2);
    System.out.println("boolean 변수 bool1의 값: " + bool1);
    System.out.println("boolean 변수 bool2의 값: " + bool2);
  }
}
