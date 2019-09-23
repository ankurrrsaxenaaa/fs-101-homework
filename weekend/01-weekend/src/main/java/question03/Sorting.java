package question03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
   public static List<String> sort(List<String> input)
    {
        List<String> result= new ArrayList<String>();
        for (String s:input){
            s=s.substring(0,1).toUpperCase()+s.substring(1);
            result.add(s);
        }
        Collections.sort(result);
        return result;
    }
}
