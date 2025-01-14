package cn.shaojiel;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;

import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class LeetCode3Test {

    @TestFactory
    Collection<DynamicNode> test() {
        return List.of(
                dynamicContainer("Case 1", List.of(
                        dynamicTest("lengthOfLongestSubstring1",
                                () -> assertThat(LeetCode3.lengthOfLongestSubstring1("abcabcbb"))
                                        .isEqualTo(3)),
                        dynamicTest("lengthOfLongestSubstring2",
                                () -> assertThat(LeetCode3.lengthOfLongestSubstring2("abcabcbb"))
                                        .isEqualTo(3))
                )),
                dynamicContainer("Case 2", List.of(
                        dynamicTest("lengthOfLongestSubstring1",
                                () -> assertThat(LeetCode3.lengthOfLongestSubstring1("bbbbb"))
                                        .isEqualTo(1)),
                        dynamicTest("lengthOfLongestSubstring2",
                                () -> assertThat(LeetCode3.lengthOfLongestSubstring2("bbbbb"))
                                        .isEqualTo(1))
                )),
                dynamicContainer("Case 3", List.of(
                        dynamicTest("lengthOfLongestSubstring1",
                                () -> assertThat(LeetCode3.lengthOfLongestSubstring1("pwwkew"))
                                        .isEqualTo(3)),
                        dynamicTest("lengthOfLongestSubstring2",
                                () -> assertThat(LeetCode3.lengthOfLongestSubstring2("pwwkew"))
                                        .isEqualTo(3))
                ))
        );
    }

}