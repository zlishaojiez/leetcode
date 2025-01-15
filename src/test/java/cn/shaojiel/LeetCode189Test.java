package cn.shaojiel;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class LeetCode189Test {
    @TestFactory
    Collection<DynamicTest> test() {
        return List.of(
                dynamicTest("Case 1", () -> {
                    int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
                    int k = 3;
                    LeetCode189.rotate(nums, k);
                    assertThat(nums).containsSequence(5, 6, 7, 1, 2, 3, 4);
                }),
                dynamicTest("Case 2", () -> {
                    int[] nums = new int[] {-1, -100, 3, 99};
                    int k = 2;
                    LeetCode189.rotate(nums, k);
                    assertThat(nums).containsSequence(3, 99, -1, -100);
                })
        );
    }
}