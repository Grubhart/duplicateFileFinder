package org.grubhart.duplicateFileFinder.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestDuplicatedFileRepository {


    @Test
    public void testAddUniqueFile(){

        DuplicatedFileRepository duplicatedFileUtil = new DuplicatedFileRepository();

        duplicatedFileUtil.add("absolutePath","/fileFolder/fileName");

        assertEquals(1, duplicatedFileUtil.size("absolutePath"));



    }

    @Test
    public void testAddduplicatedFile(){

        DuplicatedFileRepository duplicatedFileUtil = new DuplicatedFileRepository();

        duplicatedFileUtil.add("absolutePath","/fileFolder/fileName");
        duplicatedFileUtil.add("absolutePath", "/fileFolder2/fileName");
        assertEquals(2, duplicatedFileUtil.size( "absolutePath"));

    }


}
