package org.grubhart.duplicateFileFinder.util;

public interface DuplicatedFileUtil {
    void add(String path, String fileName);

    int size(String fileName);
}
