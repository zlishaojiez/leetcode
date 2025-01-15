package cn.shaojiel;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class LeetCode169Test {

    @TestFactory
    Collection<DynamicTest> test() {
        return List.of(
                dynamicTest("Case 1", ()-> {
                    int[] nums = new int[] {3, 2, 3};
                    assertThat(LeetCode169.majorityElement(nums)).isEqualTo(3);
                }),
                dynamicTest("Case 2", ()-> {
                    int[] nums = new int[] {2, 2, 1, 1, 1, 2, 2};
                    assertThat(LeetCode169.majorityElement(nums)).isEqualTo(2);
                })
        );
    }
}