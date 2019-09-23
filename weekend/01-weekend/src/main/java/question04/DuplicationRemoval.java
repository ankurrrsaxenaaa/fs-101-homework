package question04;

import java.util.ArrayList;
import java.util.List;

public class DuplicationRemoval {
    public static List<String> removeConsecutiveDuplicates(List<String> inputStringList) {
        List<String> outputStringList = new ArrayList<String>();
        String s="";
        for (int i = 0; i < inputStringList.size(); i++) {
            if (i == 0) {
                outputStringList.add(inputStringList.get(i));
                s=inputStringList.get(i);
            }
            if (i > 0) {
                if ((inputStringList.get(i).equals(s))||(inputStringList.get(i).equals(""))) {
                    continue;
                } else {
                    outputStringList.add(inputStringList.get(i));
                    s=inputStringList.get(i);
                }
            }
        }
        return outputStringList;
    }
}
