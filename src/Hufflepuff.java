public class Hufflepuff extends Hogwards {

  private int hardWork;
  private int loyalty;
  private int honesty;


  public Hufflepuff(String name, int powerOfMagic, int transgressionRange, int hardWork, int loyalty,
      int honesty) {
    super(name,powerOfMagic,transgressionRange);


    this.loyalty = loyalty;
    this.honesty = honesty;
    this.hardWork=hardWork;
  }

  public int getHardWork() {
    return hardWork;
  }

  public int getLoyalty() {
    return loyalty;
  }

  public int getHonesty() {
    return honesty;
  }


  public int sum() {
    return loyalty + honesty + hardWork;
  }

  public void comparer( Hufflepuff other) {
    if (this.sum() > other.sum()) {
      System.out.println(this.getName() + " лучший пуффендуец чем "+other.getName());
    } else {
      System.out.println(other.getName() + " лучший пуффендуец чем "+this.getName());
    }
  }

  @Override
  public String toString() {
    return super.toString()+"Hufflepuff{" +
        "hardWork=" + hardWork +
        ", loyalty=" + loyalty +
        ", honesty=" + honesty +
        '}';
  }
}
