import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExempleQueue {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Maria");
        filaBanco.add("Joao");
        filaBanco.add("Roberta");
        filaBanco.add("Pedro");
        filaBanco.add("Ana");

        System.out.println(filaBanco);

        //remove e retorna o primeiro elemento da lista
        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);

        //retorna o primeiro elemento da lista sem removê-lo
        String primeiroCliente = filaBanco.peek();
        System.out.println(filaBanco);
        System.out.println(primeiroCliente);

       // filaBanco.clear();

        String primeiroClienteOuErro = filaBanco.element();

        for (String client: filaBanco) {
            System.out.println(client);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()) {
            System.out.println("---> " + iteratorFilaBanco.next());
        }
        System.out.println(filaBanco.size());
        System.out.println(filaBanco.isEmpty());
    }
}
