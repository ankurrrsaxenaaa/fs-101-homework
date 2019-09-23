package question02;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

public class DeleteElementsTest {
    @Test
    public void should_return_array_of_integers_of_size_zero_when_input_array_of_size_0_is_passed_and_n_is_two()
    {
        int[] emptyArray= new int[]{};
        int[] outputArray= DeleteElements.dropRight(emptyArray,2);
        assertThat(outputArray).hasSize(0);
        assertThat(outputArray).isEqualTo(emptyArray);
    }
    @Test
    public void should_return_same_array_when_n_is_passed_zero()
    {
        int[] inputArray= new int[]{1,2,3,4,5};
        int[] outputArray= DeleteElements.dropRight(inputArray,0);
        assertThat(outputArray).hasSize(inputArray.length);
        assertThat(outputArray).isEqualTo(inputArray);
    }
    @Test
    public void should_return_array_of_integers_of_size_zero_when_array_of_size_zero_is_passed_and_n_is_less_than_zero()
    {
        int[] emptyArray= new int[]{};
        int[] outputArray= DeleteElements.dropRight(emptyArray,-2);
        assertThat(outputArray).hasSize(0);
        assertThat(outputArray).isEqualTo(emptyArray);
    }
    @Test
    public void should_return_array_of_integers_after_removing_two_elements_from_right_when_n_is_two()
    {
        int[] inputArray= new int[]{1,2,2,4,5,6,7};
        int[] outputArray= DeleteElements.dropRight(inputArray,2);
        int[] expectedOutputArray=new int[]{1,2,2,4,5};
        assertThat(outputArray).hasSize((inputArray.length)-2);
        assertThat(outputArray).isEqualTo(expectedOutputArray);
    }
    @Test
    public void should_return_array_of_integers_of_size_zero_when_array_of_size_three_and_n_is_4()
    {
        int[] inputArray= new int[]{1,2,3};
        int[] emptyArray= new int[]{};
        int[] outputArray= DeleteElements.dropRight(inputArray,4);
        assertThat(outputArray).hasSize(0);
        assertThat(outputArray).isEqualTo(emptyArray);
    }

}