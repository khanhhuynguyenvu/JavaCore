package nvkh.main.lamda.lamda_search;

public interface Filter<T> {
    boolean compute(T t);
}
