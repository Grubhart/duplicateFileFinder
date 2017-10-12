package org.grubhart.duplicateFileFinder.util;

import java.util.HashSet;

public class NameUtilImp {



    private HashSet<String> nameList;

    public NameUtilImp() {
        nameList = new HashSet<>();
    }

    public boolean exist(String name) {

        return nameList.contains(name);
    }
    
    public boolean add(String name) {

        return nameList.add(name);

    }
}
