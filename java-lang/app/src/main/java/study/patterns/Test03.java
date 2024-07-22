package study.patterns;

import study.patterns.step3.Car;
import study.patterns.step3.CarFactory;
import study.patterns.step3.K7Factory;
import study.patterns.step3.SonataFactory;
import study.patterns.step3.TicoFactory;

public class Test03 {
  public static void main(String[] args) {
    SonataFactory sonataFactory = new SonataFactory();
    K7Factory k7Factory = new K7Factory();
    TicoFactory ticoFactory = new TicoFactory();

    printCar(sonataFactory);
    printCar(k7Factory);
    printCar(ticoFactory);

  }

  static void printCar(CarFactory carFactory) {
    Car car = carFactory.createCar();
    System.out.println(car);
  }
}
