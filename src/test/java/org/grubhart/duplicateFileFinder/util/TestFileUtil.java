package org.grubhart.duplicateFileFinder.util;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import static junit.framework.TestCase.*;

public class TestFileUtil {

    @Test
    public void testScanFolder(){
        String path = new File("").getAbsolutePath()+"\\src\\test\\resources\\mockFolder\\folderA";

        path=path.replace("\\",File.separator);
        FileUtilImp fileUtil = new FileUtilImp();

        List<String> expectedNames = new ArrayList<>();
        expectedNames.add("duplicatedName");
        expectedNames.add("uniqueName");

        List<String> obtainedNames = fileUtil.getNames(path);

        assertTrue(obtainedNames.contains("duplicatedName"));
        assertTrue(obtainedNames.contains("uniqueName"));
        assertEquals(2,obtainedNames.size());

    }


    @Test
    public void testScanFolder1levelDeep(){
        String path = new File("").getAbsolutePath()+"\\src\\test\\resources\\mockFolder";

        path=path.replace("\\",File.separator);
        FileUtilImp fileUtil = new FileUtilImp();

        List<String> expectedPaths = new ArrayList<>();
        expectedPaths.add(path.concat(File.separator+"folderA"+File.separator+"duplicatedName"));
        expectedPaths.add(path.concat(File.separator+"folderB"+File.separator+"duplicatedName"));

        List<String> resultPaths = fileUtil.getPaths("duplicatedName");

        assertTrue(resultPaths.contains(expectedPaths.get(0)));
        assertTrue(resultPaths.contains(expectedPaths.get(1)));


    }
}
