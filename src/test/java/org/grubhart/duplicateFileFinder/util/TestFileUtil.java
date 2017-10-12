package org.grubhart.duplicateFileFinder.util;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.*;

public class TestFileUtil {

    @Test
    public void testScanFolder(){
        String path = "C:\\Users\\Edson\\IdeaProjects\\duplicateFileFinderBE\\src\\test\\resources\\mockFolder\\folderA";
        FileUtilImp fileUtil = new FileUtilImp();

        List<String> expectedNames = new ArrayList<>();
        expectedNames.add("duplicatedName");
        expectedNames.add("uniqueName");

        List<String> obtainedNames = fileUtil.getNames(path);

        assertTrue(obtainedNames.contains("duplicatedName"));
        assertTrue(obtainedNames.contains("uniqueName"));
        assertEquals(2,obtainedNames.size());





    }

}
