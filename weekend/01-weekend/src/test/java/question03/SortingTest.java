package question03;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import static org.assertj.core.api.Assertions.assertThat;

public class SortingTest {
    @Test
    public void should_return_empty_list_of_string_when_empty_string_is_passed()
    {
        List<String> inputStringList=new ArrayList<String>();
        List<String> outputStringList= Sorting.sort(inputStringList);
        List<String> expectedOutputList= new ArrayList<String>();
        assertThat(outputStringList).hasSize(0);
        assertThat(outputStringList).isEqualTo(expectedOutputList);
    }
    @Test
    public void should_return_a_sorted_list_of_string()
    {
        List<String> inputStringList=new ArrayList<String>();
        inputStringList.add("I");
        inputStringList.add("am");
        inputStringList.add("a");
        inputStringList.add("java");
        inputStringList.add("developer");
        List<String> outputStringList= Sorting.sort(inputStringList);
        List<String> expectedOutputList= new ArrayList<String>();
        expectedOutputList.add("A");
        expectedOutputList.add("Am");
        expectedOutputList.add("Developer");
        expectedOutputList.add("I");
        expectedOutputList.add("Java");
        assertThat(outputStringList).hasSize(expectedOutputList.size());
        assertThat(outputStringList).isEqualTo(expectedOutputList);
    }
    @Test
    public void should_return_a_sorted_list_with_upper_case_alphabetically()
    {
        List<String> inputList=new ArrayList<String>();
        inputList.add("I");
        inputList.add("am");
        inputList.add("a");
        inputList.add("java");
        inputList.add("developer");
        List<String> outputStringList= Sorting.sort(inputList);
        List<String> expectedOutputList= new ArrayList<String>();
        expectedOutputList.add("A");
        expectedOutputList.add("Am");
        expectedOutputList.add("Developer");
        expectedOutputList.add("I");
        expectedOutputList.add("Java");
        assertThat(outputStringList).hasSize(expectedOutputList.size());
        assertThat(outputStringList).isEqualTo(expectedOutputList);
    }
    @Test
    public void should_return_a_sorted_list_with_upper_case_alphabetically_ignoring_string_white_spaces()
    {
        List<String> inputList=new ArrayList<String>();
        inputList.add("I");
        inputList.add("am");
        inputList.add(" ");
        inputList.add("a");
        inputList.add("java");
        inputList.add("developer");
        List<String> outputStringList= Sorting.sort(inputList);
        List<String> expectedOutputList= new ArrayList<String>();
        expectedOutputList.add("A");
        expectedOutputList.add("Am");
        expectedOutputList.add("Developer");
        expectedOutputList.add("I");
        expectedOutputList.add("Java");
        assertThat(outputStringList).hasSize(expectedOutputList.size());
        assertThat(outputStringList).isEqualTo(expectedOutputList);
    }

}