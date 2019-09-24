package question02;


import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FindAnnotatedClasses {
    public static List<String> findDocumentAnnotationClasses (String packageName) {
        List<String> result=new ArrayList<String>();
        Reflections reflections = new Reflections(packageName);
        for (Class<?> cl : reflections.getTypesAnnotatedWith(Document.class)) {
            result.add(cl.getSimpleName());
        }
        Collections.sort(result);
        return result;
    }
}
