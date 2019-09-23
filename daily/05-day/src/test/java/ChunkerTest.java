import org.assertj.core.api.Assertions;
import org.assertj.core.api.EnumerableAssert;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class ChunkerTest {
    @Test
    public void should_return_one_chunk_with_size_one() {
        int[][] chunks = Chunker.chunks(new int[]{1}, 1);
        assertThat(chunks).hasSize(1);
        assertThat(chunks).isEqualTo(new int[][]{
                new int[]{1}
        });
    }
    @Test
    public void should_return_two_chunks_with_size_one() {
        int[][] chunks = Chunker.chunks(new int[]{1, 2}, 1);
        assertThat(chunks).hasSize(2);
        assertThat(chunks).isEqualTo(new int[][]{
                new int[]{1},
                new int[]{2}
        });
    }
    @Test
    public void should_return_two_chunks_with_size_two() {
        int[][] chunks = Chunker.chunks(new int[]{1, 2, 3}, 2);
        assertThat(chunks).hasSize(2);
        assertThat(chunks).isEqualTo(new int[][]{
                new int[]{1,2},
                new int[]{3}
        });
    }
}