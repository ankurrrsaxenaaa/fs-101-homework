package question04;

public class DuplicationRemoval {
    static char[] removeConsecutiveDuplicates(char[] input)
    {
        char[] result=new char[input.length];
        int k=0;
        for (int i = 0; i <input.length; i++)
        {
            if(i==0) {
                result[k] = input[i];
            }
            if(i>0)
            {
                if(input[i]!=result[k])
                {
                    k++;
                    result[k]=input[i];
                }
            }
        }
        return result;
    }
}
