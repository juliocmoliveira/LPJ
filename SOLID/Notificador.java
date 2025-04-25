public interface Notificador {
    //Interface Segregation Principle (ISP) = Princípio da Segregação da Interface — Uma classe não deve ser forçada a implementar interfaces e métodos que não irão utilizar.

    void enviar(Pedido pedido);
}
