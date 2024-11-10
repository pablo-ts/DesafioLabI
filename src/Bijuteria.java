public class Bijuteria extends Loja{
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data_de_fundacao, int qntMaxProdutos,double metaVendas ){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data_de_fundacao, qntMaxProdutos);
        this.metaVendas = metaVendas;

    }

    public double getMetaVendas(){
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }
}
