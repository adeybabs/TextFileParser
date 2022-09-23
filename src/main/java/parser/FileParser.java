package parser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileParser {

    private static final String[] HEADER = { "desId", "desCurCode", "sourceId", "sourceAmt", "reasonCode", "sourceCurCode", "countryCode", "settlementFlag", "eventDate", "transactionId", "acctNoAndExt", "centralProcDt", "desAmt", "reimbursementAttr", "msgTxt"
    };

    private File file;

    public FileParser(File file){
        this.file = file;
    }

    public static List<FileRecord> main(String[] args) throws IOException {
        List<String> contents = new ArrayList<>();
        List<Record> records = new ArrayList<>();


        File file = new File("/Users/mac/Desktop/EP720N.TXT");
        if (file.exists()) {
            System.out.println("file exist");

    }


//            FileParser parser = new FileParser(file);
//            List<FileRecord> records = parser.parse();
//            records.forEach(System.out::println);


    }
}
