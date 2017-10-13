package org.grubhart.duplicateFileFinder.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtilImp {

    private DuplicatedFileUtilImp duplicatedFileUtilImp = new DuplicatedFileUtilImp();

    public List<String> getNames(String path) {

        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        List<String> namesInFolder= new ArrayList<>();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                namesInFolder.add(listOfFiles[i].getName());
            }
        }

        return namesInFolder;
    }

    public List<String> getPaths(String path,String duplicatedName) {

        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        List<String> namesInFolder= new ArrayList<>();
        for(File file:listOfFiles){
            if (file.isFile() && file.getName().equals(duplicatedName)) {
                duplicatedFileUtilImp.add(duplicatedName,file.getAbsolutePath());
            }
        }
        
        return duplicatedFileUtilImp.;
    }
}
