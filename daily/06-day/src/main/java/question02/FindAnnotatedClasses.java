package question02;


import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;


public class FindAnnotatedClasses {
    static List<String> findDocumentAnnotationClasses (String packageName) {
        List<String> result=new ArrayList<String>();
        Reflections reflections = new Reflections(packageName);
        for (Class<?> cl : reflections.getTypesAnnotatedWith(Document.class)) {
            Document find = cl.getAnnotation(Document.class);
            result.add(cl.getSimpleName());
        }
        return result;
    }
}
