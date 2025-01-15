package cn.shaojiel;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class LeetCode121Test {
    @TestFactory
    Collection<DynamicTest> test() {
        return List.of(
                dynamicTest("Case 1", () -> {
                    int[] prices = new int[] {7, 1, 5, 3, 6, 4};
                    assertThat(LeetCode121.maxProfit(prices)).isEqualTo(5);
                }),
                dynamicTest("Case 2", () -> {
                    int[] prices = new int[] {7, 6, 4, 3, 1};
                    assertThat(LeetCode121.maxProfit(prices)).isEqualTo(0);
                })
        );
    }
}