public class Griffindor extends Hogwards {

  private int nobility;
  private int honor;
  private int bravery;


  public Griffindor(String name, int powerOfMagic, int transgressionRange,
      int nobility, int honor, int bravery) {
    super(name, powerOfMagic, transgressionRange);

    this.nobility = nobility;
    this.honor = honor;
    this.bravery = bravery;


  }

  public int getNobility() {
    return nobility;
  }

  public int getHonor() {
    return honor;
  }

  public int getBravery() {
    return bravery;
  }

  public int sum() {
    return nobility + honor + bravery;
  }

  public void comparer(Griffindor other) {
    if (this.sum() > other.sum()) {
      System.out.println(this.getName() + " лучший гриффиндорец чем "+other.getName());
    } else {
      System.out.println(other.getName() + " лучший гриффиндорец чем "+this.getName());
    }
  }



  @Override
  public String toString() {
    return super.toString()+"Griffindor{" +
        "nobility=" + nobility +
        ", honor=" + honor +
        ", bravery=" + bravery +
        '}';
  }
}




