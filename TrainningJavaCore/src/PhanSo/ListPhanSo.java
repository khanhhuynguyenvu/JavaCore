package PhanSo;

import java.util.ArrayList;

public class ListPhanSo {
    ArrayList<phanso> phansos ;

    public ListPhanSo() {
        this.phansos = new ArrayList<>();
    }
    public void Themphanso(){
        phanso ps = new phanso();
        ps.Nhapphanso();
        phansos.add(ps);
    }
    public void XuatPhanso(){
        phanso xuat = phansos.get(phansos.size()-1);
        System.out.println("Phan so : "+xuat.tu+"/"+xuat.mau);
    }
}
