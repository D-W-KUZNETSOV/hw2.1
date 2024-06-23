public class Ravenclaw extends Hogwards {

  private int mind;
  private int wisdom;
  private int wit;
  private int creativity;


  public Ravenclaw(String name, int powerOfMagic, int transgressionRange, int mind,
      int wisdom,
      int wit, int creativity) {
    super(name, powerOfMagic, transgressionRange);

    this.mind = mind;
    this.wisdom = wisdom;
    this.wit = wit;
    this.creativity = creativity;
  }

  public int getMind() {
    return mind;
  }

  public int getWisdom() {
    return wisdom;
  }

  public int getWit() {
    return wit;
  }

  public int getCreativity() {
    return creativity;
  }

  public int sum() {
    return mind + wisdom + wit + creativity;
  }

  public void comparer(Ravenclaw other) {
    if (this.sum() > other.sum()) {
      System.out.println(this.getName() + " лучший когтевранец  чем "+other.getName());
    } else {
      System.out.println(other.getName() + " лучший когтевранец чем "+this.getName());
    }
  }

  @Override
  public String toString() {
    return super.toString()+"Ravenclaw{" +
        "mind=" + mind +
        ", wisdom=" + wisdom +
        ", wit=" + wit +
        ", creativity=" + creativity +
        '}';
  }
}





