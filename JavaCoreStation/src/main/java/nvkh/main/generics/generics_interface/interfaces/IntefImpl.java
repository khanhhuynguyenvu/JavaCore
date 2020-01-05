package nvkh.main.generics.generics_interface.interfaces;

public class IntefImpl<T> implements Interf<T> {

	@Override
	public String getClassInfo(T t) {
		// TODO Auto-generated method stub
		System.out.println("Class Name : " + t.getClass().getSimpleName());
		System.out.println("Class To String: " + t.toString());
		return t.toString();
	}

}
