public class RepositorioMySQL implements RepositorioPedido {
    @Override
    public void salvar(Pedido pedido) {
        System.out.println("Banco MySQL ta bala");
    }
}
