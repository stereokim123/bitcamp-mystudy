package study.patterns;

import study.patterns.step6.Car;
import study.patterns.step6.CarFactory;
import study.patterns.step6.K7Factory;
import study.patterns.step6.SonataFactory;

public class Test6 {
  public static void main(String[] args) {

    SonataFactory sonataFactory = SonataFactory.getInstance();
    K7Factory k7Factory = K7Factory.getInstance();


    play(k7Factory);
    play(sonataFactory);

  }

  static void play(CarFactory carFactory) {
    Car car = carFactory.createCar();
    car.play();
  }
}
