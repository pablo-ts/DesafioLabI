public class Vestuario extends Loja {
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data_de_fundacao, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, endereco, data_de_fundacao);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }


    public String toString(){
        return  "Loja: " + getNome() + "\n" +
                "Quantidade de Funcionários: " + getQuantidadeFuncionarios() + "\n" +
                "Salário Base do Fucionário: " + getSalarioBaseFuncionario() + "\n" +
                "Endereço: " + getEndereco() + "\n" +
                "Data de Fundação: " + getDataFundacao() + "\n" +
                "Produto é Importado: " + getProdutosImportados();
    }
}

