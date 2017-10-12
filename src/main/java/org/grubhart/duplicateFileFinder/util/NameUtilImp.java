package org.grubhart.duplicateFileFinder.util;

import java.util.HashSet;

public class NameUtilImp implements NameUtil {



    private HashSet<String> nameList;

    public NameUtilImp() {
        nameList = new HashSet<>();
    }

    @Override
    public boolean exist(String name) {

        return nameList.contains(name);
    }

    @Override
    public boolean add(String name) {

        return nameList.add(name);

    }
}
