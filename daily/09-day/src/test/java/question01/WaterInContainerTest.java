package question01;

import org.assertj.core.api.Assertions;
import org.junit.Test;
public class WaterInContainerTest {
    @Test
    public void should_return_min_of_two_if_only_two_poles_are_there() {
        int area=WaterInContainer.maxArea(new int[]{3,4});
        Assertions.assertThat(area).isEqualTo(3);
    }
    @Test
    public void should_return_4__when_we_pass_1_2_3_4() {
        int area=WaterInContainer.maxArea(new int[]{1,2,3,4});
        Assertions.assertThat(area).isEqualTo(4);
    }
    @Test
    public void should_return_49_for_input_given_in_question() {
        int area=WaterInContainer.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        Assertions.assertThat(area).isEqualTo(49);
    }
}