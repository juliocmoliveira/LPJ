public class DescontoClienteVip implements RegraDesconto{

    @Override
    public double calcularDesconto(Pedido pedido) {
            return pedido.getValorTotal() * 0.50;

    }
}
