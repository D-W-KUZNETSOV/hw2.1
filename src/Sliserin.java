public class Sliserin extends Hogwards {


  private int trick;
  private int determination;
  private int ambition;


  public Sliserin(String name,  int powerOfMagic, int transgressionRange, int trick,
      int determination, int ambition) {

    super(name,powerOfMagic,transgressionRange);


    this.trick = trick;
    this.determination = determination;
    this.ambition = ambition;


  }

  public int getTrick() {
    return trick;
  }

  public int getDetermination() {
    return determination;
  }

  public int getAmbition() {
    return ambition;
  }

  public int sum() {
    return trick + determination + ambition;
  }

  public void comparer(Sliserin other) {
    if (this.sum() > other.sum()) {
      System.out.println(this.getName() + " лучший гриффиндорец чем "+other.getName());
    } else {
      System.out.println(other.getName() + " лучший гриффиндорец чем "+this.getName());
    }
  }

  @Override
  public String toString() {
    return super.toString()+"Sliserin{" +
        "trick=" + trick +
        ", determination=" + determination +
        ", ambition=" + ambition +
        '}';
  }
}

