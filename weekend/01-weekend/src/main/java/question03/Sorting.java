package question03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
   public static List<String> sort(List<String> inputStringList)
   {
       List<String> outputStringList= new ArrayList<String>();
       for (String s:inputStringList
       ) {
           if(s.equals(" "))
           {
               continue;
           }
           s=s.substring(0,1).toUpperCase()+s.substring(1);
           outputStringList.add(s);
       }
       Collections.sort(outputStringList);
       return outputStringList;
   }
}
