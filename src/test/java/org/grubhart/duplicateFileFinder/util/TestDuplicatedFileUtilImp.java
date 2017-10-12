package org.grubhart.duplicateFileFinder.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestDuplicatedFileUtilImp {


    @Test
    public void testAddUniqueFile(){

        DuplicatedFileUtil duplicatedFileUtil = new DuplicatedFileUtilImp();

        duplicatedFileUtil.add("path","fileName");

        assertEquals(1, duplicatedFileUtil.size("fileName"));



    }

    @Test
    public void testAddduplicatedFile(){

        DuplicatedFileUtil duplicatedFileUtil = new DuplicatedFileUtilImp();

        duplicatedFileUtil.add("path","fileName");
        duplicatedFileUtil.add("path2","fileName");
        assertEquals(2, duplicatedFileUtil.size("fileName"));

    }
    

}
