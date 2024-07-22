package study.patterns.step6;

public abstract class Car {

  String maker;
  String model;
  int cc;

  @Override
  public String toString() {
    return "Car [maker=" + maker + ", model=" + model + ", cc=" + cc + "]";
  }

  // 자동차가 어떻게 동작할 지 그 흐름을 정의한다
  // Teplate Method
  public void play() {
    start();
    run();
    stop();
  }

  //
  protected abstract void start();

  protected abstract void run();

  protected abstract void stop();

}


