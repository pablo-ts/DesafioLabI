public class Produto {
    private String nome;
    private double preco;
    private Data data_de_validade;


    // CONSTRUTOR QUE INICIALIZA TODOS OS ATRIBUTOS
    public Produto(String nome, double preco, Data data_de_validade){
        this.nome = nome;
        this.preco = preco;
        this.data_de_validade = data_de_validade;
    }


    // GETTERS E SETTERS
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public Data getDataValidade() {
        return data_de_validade;
    }
    public void setDataValidade(Data data_de_validade) {
        this.data_de_validade = data_de_validade;
    }


    //TO STRING
    public String toString(){
        return  "Produto: " + getNome() + "\n" +
                "Preço: " + getPreco()+ "\n" +
                "Data de Validade" + getDataValidade();
    }


    //METODO QUE RETORNA SE O PRODUTO ESTA VENCIDO
    public boolean estaVencido(Data data){
        if(data.getAno() > getDataValidade().getAno()){
            return true;
        }
        if((data.getAno() == getDataValidade().getAno()) && (data.getMes() > getDataValidade().getMes())){
            return true;
        }
        if((data.getAno() == getDataValidade().getAno()) && (data.getMes() == getDataValidade().getMes()) && (data.getDia() > getDataValidade().getDia())){
            return true;
        }
        return false;
    }




}
