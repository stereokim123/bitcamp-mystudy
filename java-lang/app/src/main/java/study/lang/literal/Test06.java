package study.lang.literal;

//# 부동소수점 리터럴 - 최소값과 최대값

public class Test06 {
    public static void main(String[] args) {
      
      //## 4바이트 부동소수점의 최대값과 최소값
      System.out.println(Float.MAX_VALUE);
      System.out.println(Float.MIN_VALUE);
      
      //## 8바이트 부동소수점의 최대값과 최소값
      System.out.println(Double.MAX_VALUE);
      System.out.println(Double.MIN_VALUE);

      long a = 60000000;
      long b = 100000;

      System.out.println(a * b);
    }
  }

