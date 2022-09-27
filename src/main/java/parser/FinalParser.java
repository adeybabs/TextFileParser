package parser;

import record.FileRecord;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FinalParser {

    private File file;

    public FinalParser(File file) {
        this.file = file;
    }

    public FileRecord parse(String content) throws IOException {
        FileRecord fileRecord = new FileRecord();

        List<String> contents = new ArrayList<>();
        List<FileRecord> records = new ArrayList<>();

        for (int i = 0; i < contents.size(); i++) {
            if (i < 5) continue;
            int j = i;

            String line = contents.get(i);
            if (line.trim().startsWith("Destination Identifier")) {
                String desId = line.substring(27, 68).trim();
                String desCurCode = line.substring(93).trim();
            } else {
                if (line.contains("TRANSACTION TOTAL RECORD COUNT"))
                    break;
            }

        }
        return fileRecord;
    }



    public static void main(String... args) throws Exception {

        File file = new File("/Users/mac/Desktop/EP720N.TXT");

        if (file.exists()) {
            System.out.println("file exist");

            FinalParser parser = new FinalParser(file);
            List<FileRecord> records = records.parse();
            records.forEach(System.out::println);
        } else {
            System.out.println("file doesn't exist");
        }
    }
}