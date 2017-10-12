package org.grubhart.duplicateFileFinder.util;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class DuplicatedFileUtilImp{

    private Hashtable<String,Set<String>> duplicatedFiles;


    public DuplicatedFileUtilImp() {
        duplicatedFiles= new Hashtable<>();
    }

    public void add(String absolutePath, String fileName) {

        int numberDuplicatedFiles = size(fileName);

        if(0 == numberDuplicatedFiles ){
            Set<String> absolutePaths = new HashSet<>();
            absolutePaths.add(absolutePath);
            duplicatedFiles.put(fileName,absolutePaths);
        }else {
            Set<String> paths= duplicatedFiles.get(fileName);
            paths.add(absolutePath);
        }
    }

    public int size(String fileName) {

        Set<String> paths= duplicatedFiles.get(fileName);

        if(null == paths){
            return 0;
        }

        return paths.size();
    }
}
