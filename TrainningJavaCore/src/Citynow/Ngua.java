package Citynow;

public abstract class Ngua extends Thu{
    public Ngua(String name) {
        super(name);
    }
    public Ngua() {
        super("Ngua");
    }
    @Override
    public void keu(){
        System.out.println("Ngua keu");
    }
}
