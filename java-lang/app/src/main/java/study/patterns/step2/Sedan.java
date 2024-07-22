package study.patterns.step2;

public class Sedan extends Car {

  public boolean sunroof;
  public boolean auto;

  @Override
  public String toString() {
    return "Sedan [sunroof=" + sunroof + ", auto=" + auto + ", maker=" + maker + ", model=" + model
        + ", cc=" + cc + "]";
  }


  public Sedan() {}


  public static Sedan create(String model) {
    Sedan s = new Sedan();

    switch (model) {
      case "소나타":
        s.maker = "현대자동차";
        s.model = "소나타";
        s.cc = 1998;
        s.auto = true;
        s.sunroof = false;
      case "K7":

        Sedan s2 = new Sedan();
        s.maker = "기아자동차";
        s.model = "K7";
        s.cc = 2500;
        s.auto = true;
        s.sunroof = true;
        break;
    }
    return s;
  }
}


