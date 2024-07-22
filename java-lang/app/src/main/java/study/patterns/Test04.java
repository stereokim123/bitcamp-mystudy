package study.patterns;

import study.patterns.step3.Car;
import study.patterns.step3.CarFactory;
import study.patterns.step3.K7Factory;
import study.patterns.step3.SonataFactory;

public class Test04 {
  public static void main(String[] args) {
    SonataFactory sonataFactory = new SonataFactory();
    K7Factory k7Factory = new K7Factory();

    printCar(sonataFactory);
    printCar(k7Factory);

  }

  static void printCar(CarFactory carFactory) {
    Car car = carFactory.createCar();
    System.out.println(car);
  }
}
