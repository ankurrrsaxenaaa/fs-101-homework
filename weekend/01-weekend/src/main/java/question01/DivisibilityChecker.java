package question01;

import java.util.ArrayList;
import java.util.List;

public class DivisibilityChecker {

    public static List<Integer> generateSequence(int x, int y)
    {
        List<Integer> result= new ArrayList<Integer>();
        if(x<=y) {
            int f = x % 7 == 0 ? x : x + (7 - x % 7);
            while (true) {
                if (f > y) {
                    break;
                } else if (f <= y && f % 5 != 0) {
                    result.add(f);
                }
                f += 7;
            }
        }
            return result;
    }
}
