package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExam_resources {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            File file = new File("./tmp.txt");
            byte[] buffer = new byte[512];
            inputStream = new FileInputStream(file);
            inputStream.read(buffer, 0, 512);
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
