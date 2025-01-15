package cn.shaojiel;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class LeetCode88Test {

    @TestFactory
    Collection<DynamicTest> test() {
        return List.of(
                dynamicTest("Case 1", ()-> {
                    int[] nums1 = new int[] {1, 2, 3, 0, 0, 0};
                    int m = 3;
                    int[] nums2 = new int[] {2, 5, 6};
                    int n = 3;
                    LeetCode88.merge(nums1, m, nums2, n);
                    assertThat(nums1).containsSequence(1, 2, 2, 3, 5, 6);
                }),
                dynamicTest("Case 2", ()-> {
                    int[] nums1 = new int[] {1};
                    int m = 1;
                    int[] nums2 = new int[] {};
                    int n = 0;
                    LeetCode88.merge(nums1, m, nums2, n);
                    assertThat(nums1).containsSequence(1);
                }),
                dynamicTest("Case 3", ()-> {
                    int[] nums1 = new int[] {0};
                    int m = 0;
                    int[] nums2 = new int[] {1};
                    int n = 1;
                    LeetCode88.merge(nums1, m, nums2, n);
                    assertThat(nums1).containsSequence(1);
                })
        );
    }
}
