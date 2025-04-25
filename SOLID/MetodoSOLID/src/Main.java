import exemplo.MySQL;
import exemplo.Oracle;
import exemplo.Servico;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(1,"", "Pedro");
        RepositorioMySQL bancoDeDados = new RepositorioMySQL();
        ServicoBanco servico = new ServicoBanco(bancoDeDados);
        servico.processar();
    }
}