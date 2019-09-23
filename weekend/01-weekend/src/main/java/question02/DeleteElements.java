package question02;

public class DeleteElements {
    public static int[] dropRight(int[] input,int n)
    {
        int[] result =new int[input.length-n];
        for(int i=0;i<input.length-n;i++)
        {
            result[i]=input[i];
        }
        return result;
    }
}
