public  class Hogwards {

  private  String name;
  private int powerOfMagic;
  private int transgressionRange;



  public Hogwards(String name, int powerOfMagic, int transgressionRange) {
    this.name = name;
    this.powerOfMagic = powerOfMagic;
    this.transgressionRange = transgressionRange;
  }

  public String getName() {
    return name;
  }

  public int getPowerOfMagic() {
    return powerOfMagic;
  }

  public int getTransgressionRange() {
    return transgressionRange;
  }

  public String printStudent() {
    return "Имя " + name + ",сила магии " + powerOfMagic + ", дальность трансгрессии "
        + transgressionRange;
  }

  public void compare(Hogwards other) {
    if (powerOfMagic > other.powerOfMagic) {
      System.out.println(name + " обладает большей магической силой чем "+other.name);
    } else {
      System.out.println(other.name + " обладает большей магической силой чем "+name);
    }
    if (transgressionRange > other.getTransgressionRange()) {
      System.out.println(name + " обладает большей дистанцией трансгресси чем "+other.name);
    } else {
      System.out.println(other.name+" обладает большей дистанцией трансгресси чем "+name);
    }
  }
  }






