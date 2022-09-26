package models.data;

public class MemoryDataSaver<T> implements DataSaver<T>{
    T data;
    @Override
    public void save(T a) {
        T data = a;
    }

    @Override
    public T load() {
        return data;
    }
}
