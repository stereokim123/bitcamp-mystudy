package study.lang.oop;

public class Score {
  public String name;
  private int kor;
  private int eng;
  private int math;
  private int sum;
  private float aver;

  public void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = (float) this.sum / 3;
  }
}

