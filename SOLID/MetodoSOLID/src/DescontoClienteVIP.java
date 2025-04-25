public class DescontoClienteVIP implements RegraDesconto{
    @Override
    public double calcularDesconto(Pedido pedido) {
        return pedido.getValorTotal() * 0.8;
    }
}
