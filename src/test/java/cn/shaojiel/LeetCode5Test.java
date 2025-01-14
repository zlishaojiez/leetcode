package cn.shaojiel;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class LeetCode5Test {

    @TestFactory
    Collection<DynamicTest> test() {
        return List.of(
                dynamicTest("Case 1", ()-> assertThat(LeetCode5.longestPalindrome("babad")).isIn("bab", "aba")),
                dynamicTest("Case 2", ()-> assertThat(LeetCode5.longestPalindrome("cbbd")).isEqualTo("bb"))
        );
    }

}