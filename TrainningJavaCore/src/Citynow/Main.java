package Citynow;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Thu[] a = new Thu[5];
        a[0] = new Cop();
//        a[1] = new Ngua();
        a[1] = new NguaVang();
        a[2] = new NguaO();
        for (int i = 0; i < 3; i++) {
            a[i].keu();
        }
    }
}
