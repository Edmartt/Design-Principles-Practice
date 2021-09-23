
public class App {
    public static void main(String[] args) {

        PilaBase<String> pila = new Pila<String>();
        pila.push("elemento1");
        pila.push("elemento2");
        pila.push("elemento3");
        pila.push("elemento4");
        pila.push("elemento5");
        pila.push("elemento6");


        PilaInfo<String> info = new PilaInfo<>(pila);

        System.out.println(info.isEmpty()); // Returns false
        System.out.println(pila.pop()); // returns elemento6

        int n=0;
        while(n <5){
            System.out.println(pila.pop());
            ++n;
        }

       System.out.println(info.isEmpty()); // returns true
       System.out.println(pila.pop()); // Exception raised
    }
}