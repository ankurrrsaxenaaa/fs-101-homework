package question02;

public class DeleteElements {
    public  static int[] dropRight(int[] inputArray,int n)
    {
        if((inputArray.length==0)||(n<0)||(n>inputArray.length))
        {
            int[] emptyArray= new int[]{};
            return emptyArray;
        }
        int[] outputArray =new int[inputArray.length-n];
        int k=0;
        for(int i=0;i<inputArray.length-n;i++)
        {
            outputArray[k]=inputArray[i];
            k++;
        }
        return outputArray;
    }
}
