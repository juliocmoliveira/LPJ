import java.util.List;

public class Pedido {

    private double valorTotal;
    private String[] ListaProdutos;
    private String Cliente;

    public Pedido(double valorTotal, String[] listaProdutos, String cliente) {
        this.valorTotal = valorTotal;
        this.ListaProdutos = listaProdutos;
        this.Cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String[] getListaProdutos() {
        return ListaProdutos;
    }

    public void setListaProdutos(String[] listaProdutos) {
        ListaProdutos = listaProdutos;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }
}