public interface RegraDesconto {
    //Open/Closed Principle (OCP) = Princípio Aberto-Fechado — Objetos ou entidades devem estar abertos para extensão, mas fechados para modificação

    double calcularDesconto(Pedido pedido);
}

