import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random = new Random();
    private List<Integer> list = new ArrayList<>();

    public Randoms(int min, int max) {
        int x = 0;
        while (x < 100) {
            list.add(random.nextInt((max - min) + 1) + min);
            x++;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            int nextIndex = 0;

            @Override
            public boolean hasNext() {
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