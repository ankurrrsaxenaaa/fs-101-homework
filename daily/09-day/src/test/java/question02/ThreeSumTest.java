package question02;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ThreeSumTest {
    @Test
    public void test1(){
        List<List<Integer>> lists=ThreeSum.threeSum(new int[]{ -1, 0, 1, 2, -1, -4});
        List<Integer> triplet1= new ArrayList<Integer>(Arrays.asList(-1,-1,2));
        List<Integer> triplet2= new ArrayList<Integer>(Arrays.asList(-1,0,1));
        Assertions.assertThat(lists.get(0)).isEqualTo(triplet1);
        Assertions.assertThat(lists.get(1)).isEqualTo(triplet2);
    }
}