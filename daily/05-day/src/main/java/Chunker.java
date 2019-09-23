
public class Chunker {

    public static int[][] chunks(int[] input, int chunkSize) {
        int resultSize = input.length%chunkSize==0 ?input.length / chunkSize: input.length/chunkSize +1;
        int[][] result = new int[resultSize][];
        int counter = 0;
        for (int i = 0; i < resultSize; i++) {
            int[] chunk = new int[chunkSize];
            if (i == resultSize - 1) {
            chunk=new int[input.length-counter];
            }

            for (int j = 0; j < chunk.length; j++) {
                chunk[j] = input[counter++];
            }
            result[i] = chunk;
        }
        return result;
    }
}

