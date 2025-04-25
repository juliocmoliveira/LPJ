import java.util.List;
//Single responsibility = Princípio da Responsabilidade Única — Uma classe deve ter um, e somente um, motivo para mudar.

public class Pedido {
    private double valorTotal;
    private List<String> produtos;
    private String cliente;
    private boolean vip;

    public Pedido(double valorTotal, List<String> produtos, String cliente, boolean vip ) {
        this.valorTotal = valorTotal;
        this.produtos = produtos;
        this.cliente = cliente;
        this.vip = vip;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public String getCliente() {
        return cliente;
    }

    public boolean isVip() {
        return vip;
    }
}
