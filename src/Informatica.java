public class Informatica extends Loja{
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data_de_fundacao, int qntMaxProdutos,double seguroEletronicos ) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data_de_fundacao, qntMaxProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }


    public String toString() {
        return "Loja: " + getNome() + "\n" +
                "Quantidade de Funcionários: " + getQuantidadeFuncionarios() + "\n" +
                "Salário Base do Fucionário: " + getSalarioBaseFuncionario() + "\n" +
                "Endereço: " + getEndereco() + "\n" +
                "Data de Fundação: " + getDataFundacao() + "\n" +
                "Seguro Eletrônicos: " + getSeguroEletronicos();
    }
}
