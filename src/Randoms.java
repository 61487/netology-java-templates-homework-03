import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random = new Random();
    private List<Integer> list = new ArrayList<>();
    private int max;
    private int min;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
        
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            int nextIndex = 0;

            @Override
            public boolean hasNext() {
                list.add(random.nextInt((max - min) + 1) + min);
                return true;
            }

            @Override
            public Integer next() {
                int curIndex = nextIndex;
                nextIndex++;
                return list.get(curIndex);
            }
        };
    }


}
