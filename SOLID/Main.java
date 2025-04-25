import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> produtos = new ArrayList<>();
        System.out.println("Digite o primeiro produto");
        produtos.add(sc.nextLine());
        System.out.println("Digite o segundo produto");
        produtos.add(sc.nextLine());
        System.out.println("Digite o terceiro produto");
        produtos.add(sc.nextLine());


        Pedido pedido = new Pedido(350.0, produtos,"Jonas", false);

        RegraDesconto regraDesconto;
        if(pedido.isVip()){
            regraDesconto = new DescontoClienteVip();
        }else{
            regraDesconto = new DescontoNatal();
        }

        RepositorPedido repositorPedido = new RepositorioMongo();
        Notificador notificador = new NotificadorSMS();

        ServicoPedido servicoPedido = new ServicoPedido(regraDesconto,repositorPedido,notificador);
        servicoPedido.realizarPedido(pedido);
    }
}