
public class Pila<T> extends PilaBase<T> {

    @Override
    public void push(T element) {
        lista.add(0, element);

    }

    @Override
    public T pop() {
        try {
            return lista.remove(0);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return null;
    }
}
