package cn.shaojiel;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class LeetCode80Test {
    @TestFactory
    Collection<DynamicTest> test() {
        return List.of(
                dynamicTest("Case 1", ()-> {
                    int[] nums = new int[] {1, 1, 1, 2, 2, 3};
                    assertThat(LeetCode80.removeDuplicates(nums)).isEqualTo(5);
                }),
                dynamicTest("Case 2", ()-> {
                    int[] nums = new int[] {0,0,1,1,1,1,2,3,3};
                    assertThat(LeetCode80.removeDuplicates(nums)).isEqualTo(7);
                })
        );
    }
}