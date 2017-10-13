package org.grubhart.duplicateFileFinder.util;

import java.io.File;
import java.util.Hashtable;
import java.util.Set;

public class FileDuplicateFinder {

    private DuplicatedFileRepository DFRepository = new DuplicatedFileRepository();

    public Hashtable<String,Set<String>> scan(String path) {

        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        for(File file:listOfFiles){
            if (file.isFile()) {
                DFRepository.add(file.getName(), file.getAbsolutePath());
            }else{
                scan(file.getAbsolutePath());
            }
        }

        return DFRepository.getDuplicatedFiles();
    }

}
