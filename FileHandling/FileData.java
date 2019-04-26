import java.io.IOException;

public class FileData {

    public static void main(String[] args) throws IOException {

        String file_name = args[0];

        ////////////// WRITING TO FILE
        try {
            WriteFile data = new WriteFile(file_name, Boolean.parseBoolean(args[1]));
            data.writeToFile("This is another line of text");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Text File Written To");

        ////////////////// READING FROM FILE
        try {
            ReadFile file = new ReadFile(file_name);
            String[] aryLines = file.OpenFile();

            int i;
            for (i = 0; i < aryLines.length; i++) {
                System.out.println(aryLines[i]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}