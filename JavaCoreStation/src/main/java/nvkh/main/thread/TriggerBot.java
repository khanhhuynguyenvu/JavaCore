package nvkh.main.thread;

public class TriggerBot {
    public static void main(String[] args) {
        int cnt = 0;
        while (cnt<5){
            BotWrite b = new BotWrite();
            b.start();
            cnt+=1;
        }
    }
}
