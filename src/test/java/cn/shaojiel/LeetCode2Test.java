package cn.shaojiel;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class LeetCode2Test {

    @TestFactory
    Collection<DynamicTest> test() {
        return List.of(
                dynamicTest("Case 1", () -> {
                    LeetCode2.ListNode l1 = new LeetCode2.ListNode(2, new LeetCode2.ListNode(4, new LeetCode2.ListNode(3)));
                    LeetCode2.ListNode l2 = new LeetCode2.ListNode(5, new LeetCode2.ListNode(6, new LeetCode2.ListNode(4)));

                    LeetCode2.ListNode expected = new LeetCode2.ListNode(7, new LeetCode2.ListNode(0, new LeetCode2.ListNode(8)));
                    assertThat(LeetCode2.addTwoNumbers(l1, l2)).isEqualTo(expected);
                }),
                dynamicTest("Case 2", () -> {
                    LeetCode2.ListNode l1 = new LeetCode2.ListNode(0);
                    LeetCode2.ListNode l2 = new LeetCode2.ListNode(0);

                    LeetCode2.ListNode expected = new LeetCode2.ListNode(0);
                    assertThat(LeetCode2.addTwoNumbers(l1, l2)).isEqualTo(expected);
                }),
                dynamicTest("Case 3", () -> {
                    LeetCode2.ListNode l1 = new LeetCode2.ListNode(9,
                            new LeetCode2.ListNode(9,
                                    new LeetCode2.ListNode(9,
                                            new LeetCode2.ListNode(9,
                                                    new LeetCode2.ListNode(9,
                                                            new LeetCode2.ListNode(9,
                                                                    new LeetCode2.ListNode(9)))))));

                    LeetCode2.ListNode l2 = new LeetCode2.ListNode(9,
                            new LeetCode2.ListNode(9,
                                    new LeetCode2.ListNode(9,
                                            new LeetCode2.ListNode(9))));

                    LeetCode2.ListNode expected = new LeetCode2.ListNode(8,
                            new LeetCode2.ListNode(9,
                                    new LeetCode2.ListNode(9,
                                            new LeetCode2.ListNode(9,
                                                    new LeetCode2.ListNode(0,
                                                            new LeetCode2.ListNode(0,
                                                                    new LeetCode2.ListNode(0,
                                                                            new LeetCode2.ListNode(1))))))));
                    assertThat(LeetCode2.addTwoNumbers(l1, l2)).isEqualTo(expected);
                })
        );
    }
}