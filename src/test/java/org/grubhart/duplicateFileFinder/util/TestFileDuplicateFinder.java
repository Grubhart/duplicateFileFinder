package org.grubhart.duplicateFileFinder.util;


import org.junit.Test;

import java.io.File;
import java.util.Hashtable;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;

public class TestFileDuplicateFinder {

    @Test
    public void testScanFolder(){
        String path = new File("").getAbsolutePath()+"\\src\\test\\resources\\mockFolder\\folderA";

        path=path.replace("\\",File.separator);
        FileDuplicateFinder fileDuplicateFinder = new FileDuplicateFinder();

        Hashtable<String,Set<String>> obtainedFiles = fileDuplicateFinder.scan(path);

        assertEquals(1, obtainedFiles.get("duplicatedName").size());
        assertEquals(1, obtainedFiles.get("uniqueName").size());
        assertEquals(2, obtainedFiles.size());

    }


    @Test
    public void testScanFolder1levelDeep(){
        String path = new File("").getAbsolutePath()+"\\src\\test\\resources\\mockFolder";

        path=path.replace("\\",File.separator);
        FileDuplicateFinder fileDuplicateFinder = new FileDuplicateFinder();

        Hashtable<String,Set<String>> obtainedFiles = fileDuplicateFinder.scan(path);

        assertEquals(2,obtainedFiles.get("duplicatedName").size());
        assertEquals(1, obtainedFiles.get("uniqueName").size());
        assertEquals(2, obtainedFiles.size());


    }
}
