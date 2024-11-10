public class Cosmetico extends Loja{
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data_de_fundacao, int qntMaxProdutos,double taxaComercializacao ) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data_de_fundacao, qntMaxProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    public String toString(){
        return  "Loja: " + getNome() + "\n" +
                "Quantidade de Funcionários: " + getQuantidadeFuncionarios() + "\n" +
                "Salário Base do Fucionário: " + getSalarioBaseFuncionario() + "\n" +
                "Endereço: " + getEndereco() + "\n" +
                "Data de Fundação: " + getDataFundacao() + "\n" +
                "Taxa de Comercialização: " + getTaxaComercializacao();
    }
}
