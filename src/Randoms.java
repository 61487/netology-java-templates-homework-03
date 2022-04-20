import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random = new Random();
    private int value;
    private int max;
    private int min;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;

    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                value = random.nextInt((max - min) + 1) + min;
                return true;
            }

            @Override
            public Integer next() {
                return value;
            }
        };
    }


}
