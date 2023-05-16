import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FindAPairTest {

    private final int[] array;
    private final int[] expected;

    public FindAPairTest(int[] array, int[] expected) {
        this.array = array;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static int[][][] getVariantsOfArray() {
        return new int [][][] {
                {new int[] {-3, 12, 4, 7, -5, -4, 11, 2, -1, 10}, new int[] {4, -4}},
                {new int[] {7, 1, 3, 8, -5, -4, -1, 2, 9}, new int[] {1, -1}},
                {new int[] {-9, 4, 3, 0}, new int[] {}}
        };
    }

    @Test
    public void shouldBeZero() {
        FindAPair findAPair = new FindAPair();
        int[] actual = findAPair.findAPair(array, 0);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}