package nvkh.main.lamda;

public class LamdaClass {
    public static void main(String[] args) {
        NumericClass isEven = (n)->(n%2)==0;
        System.out.println(isEven.compute(12));//Even number
        System.out.println(isEven.compute(3));//Odd number
        //Block lamda
        StringClass reverseString = (str)->{
            StringBuilder res= new StringBuilder();
            //Reverse string
            for(int i=str.length()-1;i>=0;i--){
                res.append(str.charAt(i));
            }
            return res.toString();
        };
        System.out.println(reverseString.compute("654321"));
        //Generic class
        GenericClass<Obj> numFunction = (c)->{
            return c.add(13);
        };
        Obj object = new Obj(12);
        System.out.println(numFunction.compute(object).getNum());
    }
}
interface NumericClass{
    boolean compute(int n);
}
interface StringClass{
    String compute(String s);
}
interface GenericClass<T>{
    T compute(T t);
}
class Obj{
    private int num;

    public Obj(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Obj add(int num2){
        return new Obj(num+num2);
    }
}
