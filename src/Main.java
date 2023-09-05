import shopping.Cart;
import tarefa.ListaTarefas;

public class Main {
    public static void main(String[] args) {

        ListaTarefas tarefas = new ListaTarefas();
        System.out.println("=========TESTANDO LISTA DE TAREFAS=========");
        System.out.println("Exitem " + tarefas.obterTotalDeTarefas());

        tarefas.adicionarTarefa("Fazer higiêne pessoal");
        tarefas.adicionarTarefa("Tomar café da manhã");
        tarefas.adicionarTarefa("Estudar");
        tarefas.adicionarTarefa("Assistir Netflix");
        tarefas.removerTarefa("assistir netflix");

        tarefas.obterDescricaoDeTarefas();
        System.out.println("Existem " + tarefas.obterTotalDeTarefas());

        System.out.println("=========FIM DO TESTE DE LISTA DE TAREFAS=========");

        System.out.println("=========INICIANDO TESTE DO CARRINHO DE COMPRAS=========");

        Cart cart = new Cart();
        cart.addItem("Iphone 14 Pro 256GB", 7599d, 2);
        cart.addItem("Camiseta Nike", 119d, 1);
        cart.addItem("Bermuda Jeans Nike", 159d, 1);

        cart.removeNamedItemRevamped("bermuda jeans nike");

        cart.showShoppingCartDetails();
        System.out.println("Total: " + cart.evaluate(cart));

        System.out.println("=========FIM DO TESTE DO CARRINHO DE COMPRAS=========");

    }
}