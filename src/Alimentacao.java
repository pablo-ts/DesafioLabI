public class Alimentacao extends Loja {
    public Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data_de_fundacao, int qntMaxProdutos ,Data dataAlvara) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data_de_fundacao, qntMaxProdutos);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    public String toString(){
        return  "Loja: " + getNome() + "\n" +
                "Quantidade de Funcionários: " + getQuantidadeFuncionarios() + "\n" +
                "Salário Base do Fucionário: " + getSalarioBaseFuncionario() + "\n" +
                "Endereço: " + getEndereco() + "\n" +
                "Data de Fundação: " + getDataFundacao() + "\n" +
                "Data Do Recebimento do Alvará: " + getDataAlvara();
    }
}
