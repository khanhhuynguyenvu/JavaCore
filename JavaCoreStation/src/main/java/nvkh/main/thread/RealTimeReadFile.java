package nvkh.main.thread;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class RealTimeReadFile {

    public static void main(String[] args) throws IOException, InterruptedException {
//        String path="/home/huy/Downloads/server_36298080_2019_07_01_03.log";
        String path="/home/huy/Downloads/logg.txt";
        System.out.println("hahah");
        BufferedInputStream reader = new BufferedInputStream(new FileInputStream( path ) );
        while( true ) {
            if( reader.available() > 0 ) {
                System.out.print( (char)reader.read() );
            }

            Thread.sleep(1000);
//            else{
//                try{
//                    Thread.sleep(100);
//                }catch (InterruptedException e){
//                    e.printStackTrace();
//                }
//            }
        }
    }
}
