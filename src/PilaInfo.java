public class PilaInfo<T> {
    PilaBase<T> pila = null;

    public PilaInfo(PilaBase<T> pila){
        this.pila = pila;
    }

    public T top(){
        return pila.lista.get(0);
    }

    public int len(){
        return pila.lista.size();
    }

    public boolean isEmpty(){
        return len() == 0;
    }
}
