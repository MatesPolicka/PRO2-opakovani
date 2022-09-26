package models.data;

public class FileDataSaver<T> implements DataSaver<T>{
    T data;
    @Override
    public void save(T a) {
        data = a;
    }

    @Override
    public T load() {
        return data;
    }
}
