package cn.shaojiel;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class LeetCode27Test {

    @TestFactory
    Collection<DynamicTest> test() {
        return List.of(
                dynamicTest("Case 1", ()-> {
                    int[] nums = new int[] {3, 2, 2, 3};
                    int val = 3;
                    assertThat(LeetCode27.removeElement(nums, val)).isEqualTo(2);
                }),
                dynamicTest("Case 2", ()-> {
                    int[] nums = new int[] {0, 1, 2, 2, 3, 0, 4, 2};
                    int val = 2;
                    assertThat(LeetCode27.removeElement(nums, val)).isEqualTo(5);
                })
        );
    }
}