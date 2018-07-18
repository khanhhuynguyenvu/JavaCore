package InterfaceExample;

public class HinhImpl implements HinhInterface{
    @Override
    public Double Tinhchuvi(Hinh hinh){
        Double cv = 0.0;
        if (hinh instanceof  HinhChuNhat){
            cv = ((HinhChuNhat) hinh).getDai()+((HinhChuNhat) hinh).getRong();
        }
        return cv;
    }

    @Override
    public Double Tinhdientich(Hinh hinh) {
        Double dt = 0.0;
        if (hinh instanceof HinhChuNhat){
            dt = ((HinhChuNhat) hinh).getDai()*((HinhChuNhat) hinh).getRong();
        }
        return dt;
    }
}
