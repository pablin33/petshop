package entidades;

public class servicos {


    private int id_servico;

    private String nome_servico;

    private Double preco;

    private String descricao;


    public servicos() {
    }

    public servicos(int id_servico, String nome_servico, Double preco, String descricao) {
        this.id_servico = id_servico;
        this.nome_servico = nome_servico;
        this.preco = preco;
        this.descricao = descricao;
    }

    public int getId_servico() {
        return id_servico;
    }

    public void setId_servico(int id_servico) {
        this.id_servico = id_servico;
    }

    public String getNome_servico() {
        return nome_servico;
    }

    public void setNome_servico(String nome_servico) {
        this.nome_servico = nome_servico;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}





