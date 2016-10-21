package GenericTest;

/**
 *
 */
public class GenClass<T> {

    T obj;

    public GenClass(T obj) {
        this.obj = obj;
    }

    String showClass(){
        return obj.getClass().toString();
    }
}
