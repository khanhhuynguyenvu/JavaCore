package nvkh.main.thread;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class Test {
    static int cnt = 0;

    public static void main(String args[]) throws Exception {

        String path = "/home/huy/Downloads/logg.txt";
        File file = new File(path);
        System.out.println(file.getAbsolutePath());
        if (file.exists() && file.canRead()) {
            long fileLength = file.length();
            readFile(file, 0L);
            while (true) {

                if (fileLength < file.length()) {
                    fileLength = readFile(file, fileLength);
                }

                Thread.sleep(2000);

                System.out.println("total lines: " + cnt);
            }
        }
    }

    public static Long readFile(File file, Long fileLength) throws IOException {
        String line = null;

        BufferedReader in = new BufferedReader(new java.io.FileReader(file));
        in.skip(fileLength);

        Long readLength = 0L;
        Integer nLength = (System.lineSeparator().getBytes()).length;


        while ((line = in.readLine()) != null) {
//            System.out.println(line);
            readLength += (line.getBytes().length + nLength);
            cnt += 1;
        }
        in.close();

        return fileLength + readLength;
    }
}
