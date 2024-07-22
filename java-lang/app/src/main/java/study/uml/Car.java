package study.uml;

public class Car {
  Engine engine;
  Insurance insurance;
  Navigation navigation;

  public Engine getEngine() {
    return engine;
  }

  public Car(Engine engine) {
    this.engine = engine;
  }

  public Navigation getNavigation() {
    return navigation;
  }

  public void setNavigation(Navigation navigation) {
    this.navigation = navigation;
  }

  public Insurance getInsurance() {
    return insurance;
  }

  public void setInsurance(Insurance insurance) {
    this.insurance = insurance;
  }

  public void fuelUp(GasStation gasStation) {
    gasStation.inject();

  }


}
