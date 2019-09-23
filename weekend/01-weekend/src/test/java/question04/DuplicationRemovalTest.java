package question04;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.*;

public class DuplicationRemovalTest {
    @Test
    public void should__return_empty_arraylist_of_string_when_empty_list_of_string_is_passed()
    {
        List<String> inputStringList=new ArrayList<String>();
        List<String> outputStringList = DuplicationRemoval.removeConsecutiveDuplicates(inputStringList);
        assertThat(outputStringList).hasSize(0);
        assertThat(outputStringList).isEqualTo(inputStringList);
    }
    @Test
    public void should_return_list_of_size_1_having_string_a_when_string_aaaaaaaaaa_is_passed()
    {
        List<String> inputStringList=new ArrayList<String>();
        inputStringList.add("a");
        inputStringList.add("a");
        inputStringList.add("a");
        inputStringList.add("a");
        inputStringList.add("a");
        inputStringList.add("a");
        inputStringList.add("a");
        inputStringList.add("a");
        inputStringList.add("a");
        inputStringList.add("a");
        List<String> expectedOutputList= new ArrayList<String>();
        expectedOutputList.add("a");
        List<String> outputStringList = DuplicationRemoval.removeConsecutiveDuplicates(inputStringList);
        assertThat(outputStringList).hasSize(expectedOutputList.size());
        assertThat(outputStringList).isEqualTo(expectedOutputList);
    }
    @Test
    public void should_return_arraylist_of_string_abcada_when_array_of_string_aabbbcccada_is_passed()
    {
        List<String> inputStringList=new ArrayList<String>();
        inputStringList.add("a");
        inputStringList.add("a");
        inputStringList.add("b");
        inputStringList.add("b");
        inputStringList.add("b");
        inputStringList.add("c");
        inputStringList.add("c");
        inputStringList.add("c");
        inputStringList.add("a");
        inputStringList.add("d");
        inputStringList.add("a");
        List<String> outputStringList= DuplicationRemoval.removeConsecutiveDuplicates(inputStringList);
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
    public void should_return_arraylist_of_string_abcada_when_arraylist_of_string_with_a_space_in_string_is_passed()
    {
        List<String> inputStringList= new ArrayList<String>();
        inputStringList.add("a");
        inputStringList.add("a");
        inputStringList.add("b");
        inputStringList.add("b");
        inputStringList.add("");
        inputStringList.add("b");
        inputStringList.add("c");
        inputStringList.add("c");
        inputStringList.add("");
        inputStringList.add("c");
        inputStringList.add("a");
        inputStringList.add("d");
        inputStringList.add("a");
        List<String> expectedOutputList= new ArrayList<String>();
        expectedOutputList.add("a");
        expectedOutputList.add("b");
        expectedOutputList.add("c");
        expectedOutputList.add("a");
        expectedOutputList.add("d");
        expectedOutputList.add("a");
        List<String> outputStringList= DuplicationRemoval.removeConsecutiveDuplicates(inputStringList);
        assertThat(outputStringList).hasSize(expectedOutputList.size());
        assertThat(outputStringList).isEqualTo(expectedOutputList);
    }

}