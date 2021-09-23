import java.util.ArrayList;

public abstract class PilaBase<T> {

    public ArrayList<T> lista = new ArrayList<>();
    abstract void push(T element);
    abstract T pop();
}
