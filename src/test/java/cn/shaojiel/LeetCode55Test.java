package cn.shaojiel;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;

import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class LeetCode55Test {
    @TestFactory
    Collection<DynamicNode> test() {
        return List.of(
                dynamicContainer("Case 1", List.of(
                        dynamicTest("canJump1",
                                () -> assertThat(LeetCode55.canJump1(new int[] {2, 3, 1, 1, 4})).isTrue()),
                        dynamicTest("canJump2",
                                () -> assertThat(LeetCode55.canJump2(new int[] {2, 3, 1, 1, 4})).isTrue())
                )),
                dynamicContainer("Case 2", List.of(
                        dynamicTest("canJump1",
                                () -> assertThat(LeetCode55.canJump1(new int[] {3, 2, 1, 0, 4})).isFalse()),
                        dynamicTest("canJump2",
                                () -> assertThat(LeetCode55.canJump2(new int[] {3, 2, 1, 0, 4})).isFalse())
                ))
        );
    }
}