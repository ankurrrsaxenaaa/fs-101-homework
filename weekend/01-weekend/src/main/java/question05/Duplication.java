package question05;

import java.util.ArrayList;
import java.util.List;

public class Duplication {
    public static List<String> duplicateElements(List<String> list, int n)
    {
        if(n==0)
        {
            return list;
        }
        List<String> result= new ArrayList<String>();
        for (int i = 0; i <list.size() ; i++) {
            for (int j = 1; j <=n ; j++)
            {
                if(list.get(i).equals(" "))
                {
                    break;
                }
                result.add(list.get(i));
            }
        }
        return result;
    }

}
