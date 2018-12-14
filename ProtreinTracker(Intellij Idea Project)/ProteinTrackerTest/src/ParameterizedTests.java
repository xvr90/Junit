import com.simpleprogrammer.protreintracker.TrackingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Javier.Ramirez on 14/12/2018.
 */


@RunWith(Parameterized.class)
public class ParameterizedTests {

    private static TrackingService service = new TrackingService();
    private int input;
    private int expected;

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5, 5},
                {5, 10},
                {-12, 1},
                {50, 50},
                {1, 51}
        });
    }

    public ParameterizedTests(int input, int expected) {
        this.input = input;
        this.expected = expected;

    }

    @Test
    public void test() {
        if(input >= 0)
            service.addProtein(input);
        else
            service.removeProtein(-input);

        assertEquals(expected, service.getTotal());

    }

}
