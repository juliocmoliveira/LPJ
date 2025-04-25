public class ServicoPedido {
    //Liskov Substitution Principle (LSP) = Princípio da substituição de Liskov — Uma classe derivada deve ser substituível por sua classe base.

    private RegraDesconto regraDesconto;
    private RepositorPedido repositorioPedido;
    private Notificador notificador;

    public ServicoPedido(RegraDesconto regraDesconto, RepositorPedido repositorioPedido, Notificador notificador) {
        this.regraDesconto = regraDesconto;
        this.repositorioPedido = repositorioPedido;
        this.notificador = notificador;
    }

    public void realizarPedido(Pedido pedido){
        double desconto = regraDesconto.calcularDesconto(pedido);
        double valorFinal = pedido.getValorTotal() - desconto;
        System.out.println("Valor final: " + valorFinal);
        repositorioPedido.salvar(pedido);
        notificador.enviar(pedido);
    }
}

