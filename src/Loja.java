public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data data_de_fundacao;
    private Produto[] estoqueProduto;


    //CONTRUTOR QUE INICIALIZA TODOS OS ATRIBUTOS
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data_de_fundacao, int qntMaxProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.data_de_fundacao = data_de_fundacao;
        this.estoqueProduto = new Produto[qntMaxProdutos];
    }

    // CONTRUTOR QUE INICIALIZA NOME E FUNCIONÁRIO E ATRIBUI -1 PARA O SALÁRIO BASE
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data data_de_fundacao){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.data_de_fundacao = data_de_fundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data_de_fundacao){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.data_de_fundacao = data_de_fundacao;
    }


    // GETTERS E SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Data getDataFundacao() {
        return data_de_fundacao;
    }
    public void setDataFundacao(Data data_de_fundacao) {
        this.data_de_fundacao = data_de_fundacao;
    }
    public Produto[] getEstoqueProduto(){
        return estoqueProduto;
    }
    public void setEstoqueProduto(Produto[] estoqueProduto){
        this.estoqueProduto = estoqueProduto;
    }


    // TO STRING
    public String toString(){
        return  "Loja: " + getNome() + "\n" +
                "Quantidade de Funcionários: " + getQuantidadeFuncionarios() + "\n" +
                "Salário Base do Fucionário: " + getSalarioBaseFuncionario() + "\n" +
                "Endereço: " + getEndereco() + "\n" +
                "Data de Fundação: " + getDataFundacao() + "\n" +
                "Produtos: " + getEstoqueProduto();
    }


// METODO QUE RETORNA O QUANTO A LOJA GASTA COM O SLÁRIO DOS FUNCIONÁRIOS
    public double gastosComSalario(){
        if (getSalarioBaseFuncionario() == -1){
            return -1;
        } else
            return getSalarioBaseFuncionario()*getQuantidadeFuncionarios();
    }

// MÉTODO QUE RETORNA O TAMANHO DA LOJA
    public char tamanhoDaLoja(){
        if (getQuantidadeFuncionarios() < 10) {
            return 'P';
        } else if (getQuantidadeFuncionarios() >= 10 && getQuantidadeFuncionarios() >= 30){
            return 'M';
        } else {
            return 'G';
        }
    }

    //Imprime todos os produtos de Loja
    public void imprimeProdutos(){
        for(int i = 0; i<estoqueProduto.length; i++)
            System.out.println(estoqueProduto[i]);
    }

    public boolean insereProduto(Produto p){
        for(int i = 0; i<estoqueProduto.length; i++)
            if(estoqueProduto[i] ==  null) {
                estoqueProduto[i] = p;
                return true;
            }return false;

    }

    public boolean removeProduto(String nomeProduto){
        for(int i = 0; i<estoqueProduto.length; i++) {
            if (estoqueProduto[i].getNome().equalsIgnoreCase(nomeProduto))
                estoqueProduto[i] = null;
            return true;
        }return false;
    }
}
