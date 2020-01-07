package nvkh.main.thread;

import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RealTimeReadFile {

    public static void main(String[] args) throws IOException, InterruptedException {
//        String path="/home/huy/Downloads/server_36298080_2019_07_01_03.log";
        String path="/home/huy/Downloads/logg.txt";
        BufferedInputStream reader = new BufferedInputStream(new FileInputStream( path ) );
        while( true ) {
            if( reader.available() > 0 ) {
                System.out.print( (char)reader.read() );
            }
        }
    }
}
