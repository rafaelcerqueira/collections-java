import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExempleList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Maria");
        names.add("Joao");
        names.add("Pedro");
        names.add("Paulo");
        names.add("Marta");

        System.out.println(names);

        //ordenação da lista
        Collections.sort(names);

        System.out.println(names);

        //atualiza um ‘item’ na lista.
        names.set(2, "Roberta");

        //remove o item da lista pelo índice
        names.remove(4);

        //remove o item da lista pelo objeto (ou o próprio elemento)
        names.remove("Joao");

        String name = names.get(1);
        System.out.println(name);

        int length = names.size();
        System.out.println(length);

    }
}
