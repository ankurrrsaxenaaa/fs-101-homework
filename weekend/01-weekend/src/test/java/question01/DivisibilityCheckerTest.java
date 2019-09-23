package question01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

import static org.assertj.core.api.Assertions.assertThat;

public class DivisibilityCheckerTest {

    @Test
        public void should_return_list_of_size_zero_when_x_and_y_are_equal_and_not_divisible_by_seven_and_are_not_a_multiple_of_five(){
        List<Integer> sequence=DivisibilityChecker.generateSequence(1,1);
        assertThat(sequence).hasSize(0);
        assertThat(sequence).isEqualTo(new ArrayList<Integer>() {
        });
    }

    @Test
    public void should_return_list_of_size_one_when_x_and_y_are_equal_and_the_list_is_divisible_by_seven_and_are_not_a_multiple_of_five(){
        List<Integer> sequence=DivisibilityChecker.generateSequence(7,7);
        assertThat(sequence).hasSize(1);
        List<Integer> testSequence=asList(7);
        assertThat(sequence).isEqualTo(testSequence);
    }

    @Test
    public void should_return_list_of_size_zero_when_x_is_greater_than_y(){
        List<Integer> sequence=DivisibilityChecker.generateSequence(2,1);
        assertThat(sequence).hasSize(0);
        assertThat(sequence).isEqualTo(new ArrayList<Integer>() {
        });
    }

    @Test
    public void should_return_list_of_size_zero_when_x_and_y_are_equal_and_the_list_is_divisible_by_seven_and_are_a_multiple_of_five(){
        List<Integer> sequence=DivisibilityChecker.generateSequence(35,35);
        assertThat(sequence).hasSize(0);
        assertThat(sequence).isEqualTo(new ArrayList<Integer>() {
        });
    }

    @Test
    public void should_return_list_of_integers_when_x_is_smaller_than_y_and_the_list_is_divisible_by_seven_and_are_not_a_multiple_of_five(){
        List<Integer> sequence=DivisibilityChecker.generateSequence(1,40);
        assertThat(sequence).hasSize(4);
        List<Integer> testSequence=asList(7,14,21,28);
        assertThat(sequence).isEqualTo(testSequence);
    }


}