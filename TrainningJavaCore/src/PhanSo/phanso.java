package PhanSo;

import java.util.Scanner;

public class phanso {
    Integer tu;
    Integer mau;

    public phanso() {
        this.tu = 0;
        this.mau = 1;
    }
    public phanso(Integer tu, Integer mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public void Inphanso(){
        System.out.println(tu+"/"+mau);
    }
    public void Nhapphanso(){
        Scanner sc = new Scanner(System.in);
        Integer a,b;
        System.out.println("--------- Nhap phan so --------");
        System.out.printf("Nhap Tu:");
        this.tu = sc.nextInt();
        System.out.printf("Nhap Mau:");
        this.mau = sc.nextInt();
    }
}
