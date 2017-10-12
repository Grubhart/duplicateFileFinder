package org.grubhart.duplicateFileFinder.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestDuplicatedFileUtilImp {


    @Test
    public void testAddUniqueFile(){

        DuplicatedFileUtilImp duplicatedFileUtil = new DuplicatedFileUtilImp();

        duplicatedFileUtil.add("absolutePath","/fileFolder/fileName");

        assertEquals(1, duplicatedFileUtil.size("/fileFolder/fileName"));



    }

    @Test
    public void testAddduplicatedFile(){

        DuplicatedFileUtilImp duplicatedFileUtil = new DuplicatedFileUtilImp();

        duplicatedFileUtil.add("absolutePath","/fileFolder/fileName");
        duplicatedFileUtil.add("absolutePath2", "/fileFolder/fileName");
        assertEquals(2, duplicatedFileUtil.size( "/fileFolder/fileName"));

    }


}
