import br.com.projetoMVC.model.ConnectionFactory;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionFactory.getConnection();

        if (connection != null) {
            System.out.println("A conexão foi estabelecida!");
        } else {
            System.out.println("Ocorreu um erro!");
        }

        connection.close();
    }
}