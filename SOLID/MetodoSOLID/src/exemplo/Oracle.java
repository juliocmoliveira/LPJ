package exemplo;

public class Oracle implements BancoDeDados {
    @Override
    public void salvar(String dados) {
        System.out.println("Salvando no Oracle");
    }
}
