package question02;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class FindAnnotatedClassesTest {

   @Test
   public void should_return_an_empty_list_when_package_name_is_not_found(){
      List<String> inputList=new ArrayList<String>();
      List<String> classList = FindAnnotatedClasses.findDocumentAnnotationClasses("question01");
      assertThat(classList).hasSize(0);
      assertThat(classList).isEqualTo(inputList);
   }

   @Test
    public void should_return_a_list_of_all_the_classes_when_package_name_is_found(){
       List<String> inputList=new ArrayList<String>();
       inputList.add("Findable");
       inputList.add("User");
       List<String> classList = FindAnnotatedClasses.findDocumentAnnotationClasses("question02");
       assertThat(classList).hasSize(2);
       assertThat(classList).isEqualTo(inputList);
   }

}