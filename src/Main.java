import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	List<Integer> integers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Collections.sort(integers);
        for (int d:integers) {
            if (d > 0 && d % 2 == 0){
                System.out.println(d);
            }
        }
    }
}
