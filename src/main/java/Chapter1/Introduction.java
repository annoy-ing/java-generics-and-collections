package Chapter1;

import java.util.Arrays;
import java.util.List;

public class Introduction {

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,2,3);
        int s = 0;
        for (int n : ints) {
            s += n;
        }
        System.out.println(s);

        assert s == 6;
        System.out.println(s);


    }

}
