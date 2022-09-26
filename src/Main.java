import models.*;
import models.data.DataSaver;
import models.data.FileDataSaver;
import models.data.MemoryDataSaver;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        final int x = 10;
        final double pi = 3.14;

        ExampleClass exCls = new ExampleClass();
        System.out.println(exCls.x);
        exCls.publicMethod();

        System.out.println(MClass.pi);
        System.out.println(MClass.sum(5, 3));

        System.out.println(ExampleClass.InnerClass.i);

        //MClass m = new MClass(); //private konstruktor

        Box<ExampleClass> box = new Box<>(exCls);

        Box<String> boxString = new Box<>("Ahoj");

        Box<Integer> boxInteger = new Box<>(789);

        Pair<Integer, String> myPair = new Pair<>(1, "Praha");
        Pair<Integer, String> myPair2 = new Pair<>(2, "Hradec Králové");

        Auto car1 = new Auto("Škoda", "Fabia");

        boolean conToFile = false;

        DataSaver<Integer> mySaver;
        if(conToFile) {
            mySaver = new FileDataSaver<>();
        }
        else {
            mySaver = new MemoryDataSaver<>();
        }

        mySaver.save(20);
        System.out.println(mySaver.load());

        mySaver = new FileDataSaver<>();
        mySaver.save(21);

        printStar(5);

        try{
            System.out.println("Saving");
            throw new Exception("File is locked");
        }catch (NullPointerException e){

        }
        catch (Exception e){
            System.out.println("Soubor je uzamčen, opakujte.");
        }
    }

    /*
    * Vlákno
    * XML
    * VCS
    * HTTP
    * Soket
    * */

    private static void printStar(int x){
        if(x<1)
            return;
        System.out.println("*");
        x = x-1;
        printStar(x);
    }
}