public class ServicoBanco {

    private RepositorioPedido repositorioPedido;

    public ServicoBanco(RepositorioPedido repositorioPedido) {
        this.repositorioPedido = repositorioPedido;
    }

    public void processar(Pedido pedido){
        repositorioPedido.salvar(pedido);
    }
}
