package cn.shaojiel;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;

import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class LeetCode1Test {

    @TestFactory
    Collection<DynamicNode> test() {
        return List.of(
                dynamicContainer("Case 1", List.of(
                        dynamicTest("twoSum_1",
                                () -> assertThat(LeetCode1.twoSum_1(new int[] {2, 7, 11, 15}, 9))
                                        .hasSize(2)
                                        .containsSequence(0, 1)),
                        dynamicTest("twoSum_2",
                                () -> assertThat(LeetCode1.twoSum_2(new int[] {2, 7, 11, 15}, 9))
                                        .hasSize(2)
                                        .containsSequence(0, 1))
                )),
                dynamicContainer("Case 2", List.of(
                        dynamicTest("twoSum_1",
                                () -> assertThat(LeetCode1.twoSum_1(new int[] {3, 2, 4}, 6))
                                        .hasSize(2)
                                        .containsSequence(1, 2)),
                        dynamicTest("twoSum_2",
                                () -> assertThat(LeetCode1.twoSum_2(new int[] {3, 2, 4}, 6))
                                        .hasSize(2)
                                        .containsSequence(1, 2))
                )),
                dynamicContainer("Case 3", List.of(
                        dynamicTest("twoSum_1",
                                () -> assertThat(LeetCode1.twoSum_1(new int[] {3, 3}, 6))
                                        .hasSize(2)
                                        .containsSequence(0, 1)),
                        dynamicTest("twoSum_2",
                                () -> assertThat(LeetCode1.twoSum_2(new int[] {3, 3}, 6))
                                        .hasSize(2)
                                        .containsSequence(0, 1))
                ))
        );
    }
}
