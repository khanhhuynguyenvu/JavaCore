package main.generics;

public class GenericType<T>{
	private T t;
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public static void main(String[] args) {
		GenericType<String> type = new GenericType<>();
		type.setT("aba");
	}
}
