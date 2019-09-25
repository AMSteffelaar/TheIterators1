package mijnPackage;

import java.util.Iterator;

public class Datastructure {

    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    //maak een datastructure met een array met getallen 0 tot size
    public Datastructure() {
        for (int index = 0; index <= SIZE - 1; index++) {
            arrayOfInts[index] = index;
        }
    }

    public void printEvenGetallen() {
        Iterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(iterator.next());
    }

    public void printEvenGetallenBackwards() {
        Iterator iterator = this.new EvenIteratorBackwards();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(iterator.next());
    }

    //hier volgt een inner class, iterotor voor de even getallen - voor naar achter
    public class EvenIterator implements DataStructureIterator {
        private int nextIndex = 0;

        public boolean hasNext() {
            return (nextIndex <= SIZE -2 ); //niet -1 want dan lijkt er bij positie 14 een next te zijn
        }

        public Integer next() {
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            nextIndex +=2;
            return retValue;
        }
    }

    public class EvenIteratorBackwards implements DataStructureIterator {
        private int nextIndex = SIZE-1;

        public boolean hasNext() {
            return (nextIndex >= 2 ); // niet 0 want dan is er geen next.
        }

        public Integer next() {
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            nextIndex -=2;
            return retValue;
        }
    }

    //voeg hier een methode in voor steeds de oneven getallen

    //hier een methode van achter naar voren


    public static void main(String[] args) {
        Datastructure ds = new Datastructure();
        ds.printEvenGetallen();
        ds.printEvenGetallenBackwards();
    }

}
