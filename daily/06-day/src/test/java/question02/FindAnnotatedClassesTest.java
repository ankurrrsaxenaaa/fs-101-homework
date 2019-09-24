package question02;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class FindAnnotatedClassesTest {

   @Test
   public void should_return_an_empty_list_when_package_name_is_not_found(){
      List<String> outputList=new ArrayList<String>();
      List<String> classList = FindAnnotatedClasses.findDocumentAnnotationClasses("question01");
      assertThat(classList).hasSize(0);
      assertThat(classList).isEqualTo(outputList);
   }

   @Test
    public void should_return_a_list_of_all_the_classes_that_has_document_annotation_when_package_name_is_found(){
       List<String> outputList=new ArrayList<String>();
       outputList.add("Findable");
       outputList.add("User");
      Collections.sort(outputList);
       List<String> classList = FindAnnotatedClasses.findDocumentAnnotationClasses("question02");
       assertThat(classList).hasSize(2);
       assertThat(classList).isEqualTo(outputList);
   }

}