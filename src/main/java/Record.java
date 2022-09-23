import java.util.ArrayList;
import java.util.List;

public class TxtParser {

    public class Record {
        private String desId;
        private String sourceId;


        public static void main(String[] args) {
            List<String> contents = new ArrayList<>();
            List<Record> records = new ArrayList<>();


            for(int i=0; i<contents.size(); i++) {
                if(i<5) continue;
                int j = i;

                String line = contents.get(i);
                if(line.trim().startsWith("Destination Identifier")) {
                    String desId = line.substring(27, 68).trim();
                    String desCurCode = line.substring(93).trim();
                    String line2 = contents.get(i+1);
                    String line3 =contents.get(i+2);




                    Record record = new Record(desId, decu);
                    records.add(record);
                    i += 8;
                }


            }
        }
    }
}
