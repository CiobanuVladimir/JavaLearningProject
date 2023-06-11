package com.CiobanuVladimir.filemanagementservice;

import java.io.File;

public class FileExecutionService {
    public static void main(String[] args) {

        File demoFile = new File("src/main/java/com/CiobanuVladimir/filemanagementservice/test.txt");


        FileManager.informIfTheFileExists(demoFile);
        FileManager.createTheFileIfItDoesNotExist(demoFile);
        FileManager.printIfTheFileIsADirectory(demoFile);
        FileManager.printTheTheFileName(demoFile);
        FileManager.printTheFileAbsolutePath(demoFile);

        InputFileReaderManager.readDataFromTextFile(demoFile);
        InputFileReaderManager.readDataFroATextFileUsingFileReader(demoFile);
        InputFileReaderManager.readDataFromATextFileUsingBufferedReader(demoFile);


        OutputFileWritterManager.writeDataIntoFileWithFileWriter(demoFile, "content");
        OutputFileWritterManager.writeDataIntoFileWithBufferedWriter(demoFile, "Empty");

    }
}
