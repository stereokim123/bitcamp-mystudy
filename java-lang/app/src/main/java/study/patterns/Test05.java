package study.patterns;

import study.patterns.step5.Car;
import study.patterns.step5.CarFactory;
import study.patterns.step5.K7Factory;
import study.patterns.step5.SonataFactory;

public class Test05 {
  public static void main(String[] args) {

    SonataFactory sonataFactory = SonataFactory.getInstance();
    K7Factory k7Factory = K7Factory.getInstance();
    K7Factory k7Factory2 = K7Factory.getInstance();
    K7Factory k7Factory3 = K7Factory.getInstance();
    K7Factory k7Factory4 = K7Factory.getInstance();



    System.out.println(k7Factory == k7Factory2);
    System.out.println(k7Factory3 == k7Factory4);
    System.out.println(k7Factory == k7Factory4);

    printCar(k7Factory4);
    printCar(sonataFactory);
    printCar(k7Factory);

  }

  static void printCar(CarFactory carFactory) {
    Car car = carFactory.createCar();
    System.out.println(car);
  }
}
