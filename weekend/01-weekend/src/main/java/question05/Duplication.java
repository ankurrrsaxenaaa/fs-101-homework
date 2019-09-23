package question05;

public class Duplication {
    public static char[] duplicateElements(char[] input,int n)
    {
        char[] result= new char[input.length*n];
        int k=0;
        for (int i = 0; i <input.length ; i++) {
            for (int j = 0; j <n ; j++) {
                result[k]=input[i];
                k++;
            }
        }
        return result;
    }
}
