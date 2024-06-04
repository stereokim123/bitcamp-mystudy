package study.lang.variable;

public class Test02 {
  public static void main(String[] args) {
    // '가' 문자의 코드를 정수 값으로 저장
    char c1 = '가';

    // '가' 문자의 코드를 \u0000 형태의 유니코드 표현법으로 저장
    char c2 = '\uac00';

    // '가' 문자의 코드를 가장 쉬운 방법으로 저장
    char c3 = 44032;

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);

  }
}

