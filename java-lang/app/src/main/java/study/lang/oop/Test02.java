package study.lang.oop;

public class Test02 {
  public static void main(String[] args) {
    Score s1 = new Score("홍길동", 100, 90, 85, );


    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 85;
    s1.sum = s1.kor + s1.eng + s1.math;
    s1.compute();
    printScore(s1);

    Score s2 = new Score();

    s2.name = "임꺽정";
    s2.kor = 90;
    s2.eng = 80;
    s2.math = 75;
    s2.sum = s2.kor + s2.eng + s2.math;
    s2.compute();
    printScore(s2);

    Score s3 = new Score();

    s3.name = "유관순";
    s3.kor = 80;
    s3.eng = 70;
    s3.math = 65;
    s3.sum = s3.kor + s3.eng + s3.math;
    s3.compute();
    printScore(s3);
  }


  static void printScore(Score s) {

    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver);

  }


}


