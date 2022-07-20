package testesbr.com.dio.model;

public class Gato {
    private String nome;
    private String cor;
    private String idade;

    public Gato() {}

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getIdade() {
        return idade;
    }

    public Gato(String nome, String cor, String idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;



    }
}
