package models.data;

public interface DataSaver<T> {

    void save(T a);
    T load();
}
