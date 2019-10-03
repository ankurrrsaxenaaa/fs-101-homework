package question03;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class SearchRotatedTest {
    @Test
    public void should_search_element_from_already_sorted_array()
    {
        int inputArray[]={6,7,8,9,10};
        int target =8;
        int output = SearchRotated.search(inputArray,target);
        assertThat(output==5).isTrue();
    }
    @Test
    public void should_search_element_from_rotated_sorted_array()
    {
        int inputArray[]={6,7,8,9,10,3,4,5};
        int target =3;
        int output = SearchRotated.search(inputArray,target);
        assertThat(output==5).isTrue();
    }

}