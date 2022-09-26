package models;
//Generická třída
public class Box<T> {
    private T data;
    public Box(T item){
        data = item;
    }

    public T getData(){
        return data;
    }
}
