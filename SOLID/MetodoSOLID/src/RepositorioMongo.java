public class RepositorioMongo implements RepositorioPedido{
    @Override
    public void salvar(Pedido pedido) {
        System.out.println("Banco MongoDB ta bala");
    }
}
