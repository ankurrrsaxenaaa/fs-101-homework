package question04;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;
public class JumpGameTest {
    @Test
    public void test1() {
        boolean canReach = JumpGame.canJump(new int[]{3, 2, 1, 0, 4});
        assertThat(canReach).isFalse();
    }
    @Test
    public void test2() {
        boolean canReach = JumpGame.canJump(new int[]{2,3,1,1,1,4});
        assertThat(canReach).isTrue();
    }
    @Test
    public void test3() {
        boolean canReach = JumpGame.canJump(new int[]{1,1,1,1,1,1});
        assertThat(canReach).isTrue();
    }
    @Test
    public void test4() {
        boolean canReach = JumpGame.canJump(new int[]{3,2,1,0});
        assertThat(canReach).isTrue();
    }
    @Test
    public void test5() {
        boolean canReach = JumpGame.canJump(new int[]{3,1,2,0,2});
        assertThat(canReach).isTrue();
    }
    @Test
    public void test6() {
        boolean canReach = JumpGame.canJump(new int[]{3,4,0,0,2,0,5});
        assertThat(canReach).isTrue();
    }
}