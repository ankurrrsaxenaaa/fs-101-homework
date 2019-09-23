package question04;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.*;

public class DuplicationRemovalTest {
    @Test
    public void should__return_empty_list_of_string_when_empty_list_of_string_is_passed()
    {
        List<String> inputList=new ArrayList<String>();
        List<String> outputStringList = DuplicationRemoval.removeConsecutiveDuplicates(inputList);
        assertThat(outputStringList).hasSize(0);
        assertThat(outputStringList).isEqualTo(inputList);
    }
    @Test
    public void should_return_list_of_size_one_when_a_string_is_passed()
    {
        List<String> inputList=new ArrayList<String>();
        inputList.add("a");
        inputList.add("a");
        inputList.add("a");
        inputList.add("a");
        inputList.add("a");
        inputList.add("a");
        inputList.add("a");
        inputList.add("a");
        inputList.add("a");
        inputList.add("a");
        List<String> expectedOutputList= new ArrayList<String>();
        expectedOutputList.add("a");
        List<String> outputStringList = DuplicationRemoval.removeConsecutiveDuplicates(inputList);
        assertThat(outputStringList).hasSize(expectedOutputList.size());
        assertThat(outputStringList).isEqualTo(expectedOutputList);
    }
    @Test
    public void should_return_list_of_string_when_list_of_letters_is_passed()
    {
        List<String> inputList=new ArrayList<String>();
        inputList.add("a");
        inputList.add("a");
        inputList.add("b");
        inputList.add("b");
        inputList.add("b");
        inputList.add("c");
        inputList.add("c");
        inputList.add("c");
        inputList.add("a");
        inputList.add("d");
        inputList.add("a");
        List<String> outputStringList= DuplicationRemoval.removeConsecutiveDuplicates(inputList);
        List<String> expectedOutputList= new ArrayList<String>();
        expectedOutputList.add("a");
        expectedOutputList.add("b");
        expectedOutputList.add("c");
        expectedOutputList.add("a");
        expectedOutputList.add("d");
        expectedOutputList.add("a");
        assertThat(outputStringList).hasSize(expectedOutputList.size());
        assertThat(outputStringList).isEqualTo(expectedOutputList);
    }
    @Test
    public void should_return_list_of_string_when_list_of_string_with_a_space_in_string_is_passed()
    {
        List<String> inputList= new ArrayList<String>();
        inputList.add("a");
        inputList.add("a");
        inputList.add("b");
        inputList.add("b");
        inputList.add("");
        inputList.add("b");
        inputList.add("c");
        inputList.add("c");
        inputList.add("");
        inputList.add("c");
        inputList.add("a");
        inputList.add("d");
        inputList.add("a");
        List<String> expectedOutputList= new ArrayList<String>();
        expectedOutputList.add("a");
        expectedOutputList.add("b");
        expectedOutputList.add("c");
        expectedOutputList.add("a");
        expectedOutputList.add("d");
        expectedOutputList.add("a");
        List<String> outputStringList= DuplicationRemoval.removeConsecutiveDuplicates(inputList);
        assertThat(outputStringList).hasSize(expectedOutputList.size());
        assertThat(outputStringList).isEqualTo(expectedOutputList);
    }

}