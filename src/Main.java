public class Main {


  public static void main(String[] args) {

    Griffindor harry = new Griffindor("Harry Potter", 45, 33, 27, 15, 43);
    Griffindor germiona = new Griffindor("Germiona Granger", 22, 43, 65, 12, 45);
    harry.comparer(germiona);

    Ravenclaw zhou = new Ravenclaw("Zhou Chang", 12, 32, 11, 76, 33, 31);
    Ravenclaw padma = new Ravenclaw("Padma Patil", 76, 45, 32, 12, 33, 23);
    zhou.comparer(padma);

    Sliserin draco = new Sliserin("Draco Malfoy", 17, 36, 32, 45, 11);
    Sliserin gregory = new Sliserin("Gregory Goyl", 22, 23, 43, 55, 13);
    draco.comparer(gregory);

    Hufflepuff sedrick = new Hufflepuff("Sedrick Diggory", 22, 43, 33, 18, 11);
    Hufflepuff zahariya = new Hufflepuff("Zahariya Smitt", 18, 34, 22, 43, 12);
    sedrick.comparer(zahariya);

    harry.compare(draco);

  }
}
