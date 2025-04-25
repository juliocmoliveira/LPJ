package exemplo;

public class MySQL implements BancoDeDados {

    @Override
    public void salvar(String dados) {
        System.out.println("Salvando no MySQL " + dados);
    }
}
