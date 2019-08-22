package com.talfinder.assessment;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SortStringTest {
    String input;
    String expected;

    public SortStringTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {"iam", "aim"},
                {"hello123", null},
                {"a", "a"},
                {"", null},
                {"TalFinderisaplatformforeducatingthetalententeringthemarketprovidingstateoftheartrecruitmenttoolsworkflowsandanecosystemwherepeoplefromtheindustrycanmentorandnurturetalent", "FTaaaaaaaaaaaaaccccddddddeeeeeeeeeeeeeeeeeeeeeefffffggghhhhhiiiiiiiikklllllllmmmmmmnnnnnnnnnnnnnnnoooooooooooopppprrrrrrrrrrrrrrrrsssssssttttttttttttttttttttttuuuuuvwwwyy"},
                {"aaaa", "aaaa"},
                {"abcdef", "abcdef"},
                {"fedcba", "abcdef"},
                {"hello world", null},
                {"ey&&", null},
                {"abccba", "aabbcc"},
                {"cbaabc", "aabbcc"}
        });
    }

    @Test
    public void checkSortString() {
        Assert.assertEquals("input:" + input, expected, SortString.sortString(input));
    }
}
