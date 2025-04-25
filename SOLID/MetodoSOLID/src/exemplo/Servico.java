package exemplo;

public class Servico {

    private BancoDeDados bancoDeDados;

    public Servico(BancoDeDados bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }

    public void processar() {
        this.bancoDeDados.salvar("dados importantes");
    }
}
