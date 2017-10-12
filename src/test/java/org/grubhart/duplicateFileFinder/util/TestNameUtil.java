package org.grubhart.duplicateFileFinder.util;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class TestNameUtil {

    @Test
    public void testNoDuplicateName(){

        NameUtilImp namesService = new NameUtilImp();

        assertFalse(namesService.exist("file.txt"));
    }

    @Test
    public void testDuplicatedName(){

        NameUtilImp namesService = new NameUtilImp();
        assertFalse(namesService.exist("file.txt"));
        namesService.add("file.txt");

        assertFalse(namesService.add("file.txt"));
    }
}
