import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


    public class Record {
        private String desId;
        private String sourceId;

        public Record(String desId, String desCurCode) {
        }


        public static List<String> main(String[] args) throws IOException {
            List<String> contents = new ArrayList<>();
            List<Record> records = new ArrayList<>();


            for (int i = 0; i < contents.size(); i++) {
                if (i < 5) continue;
                int j = i;

                String line = contents.get(i);
                if (line.trim().startsWith("Destination Identifier")) {
                    String desId = line.substring(27, 68).trim();
                    String desCurCode = line.substring(93).trim();
                    String line2 = contents.get(i + 1);
                    String line3 = contents.get(i + 2);
                    String line4 = contents.get(i + 3);
                    String line5 = contents.get(i + 4);
                    String line6 = contents.get(i + 5);
                    String line7 = contents.get(i + 6);
                    String line8 = contents.get(i + 7);

                    Record record = new Record(desId, desCurCode);
                    records.add(record);
                    i += 8;
                }
            }
            return contents;
        }

        private File file;

        public Record(File file) throws IOException {
            this.file = file;

            List<String> contents = Files.readAllLines(file.toPath(), StandardCharsets.ISO_8859_1);

        }

        private List<String[]> read(File file) throws IOException {
//        Stream<String> stream = Files.lines(Paths.get(file.toURI()), StandardCharsets.ISO_8859_1);

            List<String[]> list = new LinkedList<>();

            return list;
        }

    }

