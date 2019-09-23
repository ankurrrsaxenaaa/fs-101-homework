package question05;

import org.junit.Test;
import question04.DuplicationRemoval;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.*;

public class DuplicationTest {
    @Test
    public void should_return_empty_list_of_string_when_empty_list_is_passed()
    {
        List<String> inputList= new ArrayList<String>();
        List<String> outputStringList= Duplication.duplicateElements(inputList,3);
        assertThat(outputStringList).hasSize(0);
        assertThat(outputStringList).isEqualTo(inputList);
    }
    @Test
    public void should_return_same_string_of_list_when_n_is_passed_zero()
    {
        List<String> inputList= new ArrayList<String>();
        inputList.add("a");
        inputList.add("b");
        inputList.add("d");
        List<String> result= Duplication.duplicateElements(inputList,0);
        assertThat(result).hasSize(inputList.size());
        assertThat(result).isEqualTo(inputList);
    }
    @Test
    public void should_return_an_empty_list_when_n_less_than_0_is_passed()
    {
        List<String> inputlist= new ArrayList<String>();
        inputlist.add("a");
        inputlist.add("b");
        inputlist.add("d");
        List<String> expectedOutputList= new ArrayList<String>();
        List<String> outputStringList= Duplication.duplicateElements(inputlist,-2);
        assertThat(outputStringList).hasSize(expectedOutputList.size());
        assertThat(outputStringList).isEqualTo(expectedOutputList);
    }
    @Test
    public void should_return_list_of_string_where_each_value_is_duplicated_4_times_when_n_is_passed_4()
    {
        List<String> inputList= new ArrayList<String>();
        inputList.add("a");
        inputList.add("b");
        inputList.add("d");
        List<String> expectedOutputList= new ArrayList<String>();
        expectedOutputList.add("a");
        expectedOutputList.add("a");
        expectedOutputList.add("a");
        expectedOutputList.add("a");
        expectedOutputList.add("b");
        expectedOutputList.add("b");
        expectedOutputList.add("b");
        expectedOutputList.add("b");
        expectedOutputList.add("d");
        expectedOutputList.add("d");
        expectedOutputList.add("d");
        expectedOutputList.add("d");
        List<String> outputStringList= Duplication.duplicateElements(inputList,4);
        assertThat(outputStringList).hasSize(expectedOutputList.size());
        assertThat(outputStringList).isEqualTo(expectedOutputList);
    }
    @Test
    public void should_return_list_of_string_where_each_element_is_duplicated_2_times_except_blank_spaces_in_the_list_when_n_is_passed_2()
    {
        List<String> inputList= new ArrayList<String>();
        inputList.add("a");
        inputList.add("b");
        inputList.add(" ");
        inputList.add("a");
        List<String> expectedOutputList=new ArrayList<String>();
        expectedOutputList.add("a");
        expectedOutputList.add("a");
        expectedOutputList.add("b");
        expectedOutputList.add("b");
        expectedOutputList.add("a");
        expectedOutputList.add("a");
        List<String> outputStringList= Duplication.duplicateElements(inputList,2);
        assertThat(outputStringList).hasSize(expectedOutputList.size());
        assertThat(outputStringList).isEqualTo(expectedOutputList);
    }
}