package InterfaceExample;

public class HinhChuNhat extends Hinh{
    private Double dai;
    private Double rong;
    public HinhChuNhat() {
        super("Hinh Chu Nhat");
    }
    public HinhChuNhat(String ten, Double dai, Double rong) {
        super(ten);
        this.dai = dai;
        this.rong = rong;
    }

    public Double getDai() {
        return dai;
    }

    public void setDai(Double dai) {
        this.dai = dai;
    }

    public Double getRong() {
        return rong;
    }

    public void setRong(Double rong) {
        this.rong = rong;
    }
}
