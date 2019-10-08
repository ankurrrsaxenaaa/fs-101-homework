package chunker;

import java.lang.reflect.Array;
public class Chunker<T> {
    private final  Class<? extends T> cls;
    public Chunker(Class<? extends T> cls) {
        this.cls = cls;
    }
    public   <T> T[][] genericChunker(T[] input, int chunkSize)
    {
        int resultSize=input.length/chunkSize;
        if(input.length%chunkSize!=0)
        {
            resultSize++;
        }
        T[][]  result = (T[][])Array.newInstance(cls, resultSize,chunkSize);
        int counter=0;
        for(int i=0;i<resultSize;i++)
        {
            T chunk[] = (T[])Array.newInstance(cls, chunkSize);
            if(i==resultSize-1)
            {
                chunk= (T[])Array.newInstance(cls, (input.length)-counter);
            }
            for(int j=0;j<chunk.length;j++)
            {
                chunk[j]=  input[counter++];
            }
            result[i]=chunk;
        }
        return result;
    }
}