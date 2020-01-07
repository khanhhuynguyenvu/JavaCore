package nvkh.main.thread;

import java.io.*;
import java.util.Random;

public class BotWrite extends Thread{
    @Override
    public void run()
    {
        try
        {
            String path="/home/huy/Downloads/logg.txt";
            File file = new File(path);
            if (!file.exists())
            {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
            BufferedWriter bw = new BufferedWriter(fw);
            synchronized(this){
                int f = new Random().nextInt();
                bw.write(f + "\n");        // write to file
                bw.close();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
