package org.grubhart.duplicateFileFinder.util;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class DuplicatedFileUtilImp implements DuplicatedFileUtil {

    private Hashtable<String,Set<String>> duplicatedFiles;


    public DuplicatedFileUtilImp() {
        duplicatedFiles= new Hashtable<>();
    }

    @Override
    public void add(String path, String fileName) {

        int numberDuplicatedFiles = size(fileName);

        if(0 == numberDuplicatedFiles ){
            Set<String> paths = new HashSet<>();
            paths.add(path);
            duplicatedFiles.put(fileName,paths);
        }else {
            Set<String> paths= duplicatedFiles.get(fileName);
            paths.add(path);
        }
    }

    @Override
    public int size(String fileName) {

        Set<String> paths= duplicatedFiles.get(fileName);

        if(null == paths){
            return 0;
        }

        return paths.size();
    }
}
