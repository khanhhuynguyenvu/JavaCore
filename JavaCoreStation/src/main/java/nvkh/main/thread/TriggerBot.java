package nvkh.main.thread;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class TriggerBot {
    public static void main(String[] args) {
//        int cnt = 0;
//        while (cnt<5){
//            BotWrite b = new BotWrite();
//            b.start();
//            cnt+=1;
//        }
        try {
            String path = "/home/huy/Downloads/logg.txt";
//            File file = new File(path);
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
//            BufferedWriter bw = new BufferedWriter(fw);

            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
            for (int i = 0; i < (int)1e6 ; i++) {

                    int f = new Random().nextInt();
                    if (i % 2000 == 0) Thread.sleep(100);
//                    System.out.println(f);
                    bw.write(f + "balhasdusiafhdausiohfad sdfhbauidsfhnasdf !@!#@!$#jhfdsjkig __+_" + "\n");        // write to file
                    bw.flush();
            }
            bw.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
