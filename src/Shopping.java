public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int lojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[lojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco geteEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Loja[] getLojas(){
        return lojas;
    }

    public void setLojas(Loja[] lojas){
        this.lojas = lojas;
    }


    public String toString(){
        return  "Produto: " + getNome() + "\n" +
                "Endereço: " + geteEndereco()+ "\n" +
                "Lista da Lojas" + getLojas();
    }

    public boolean insereLoja(Loja loja){
        for(int i = 0; i<lojas.length; i++)
            if(lojas[i] == null){
                lojas[i] = loja;
                return true;
            }return false;
    }


    public boolean removeLoja(String loja){
        for(int i = 0; i<lojas.length; i++)
            if(lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(loja)){
                lojas[i] = null;
                return true;
            }return false;
    }

    public int quantidadeLojasPorTipo(String tipoDaLoja) {
        if(!tipoDaLoja.equalsIgnoreCase("Cosmeticos") &&
                !tipoDaLoja.equalsIgnoreCase("Vestuário") &&
                !tipoDaLoja.equalsIgnoreCase("Bijuteria") &&
                !tipoDaLoja.equalsIgnoreCase("Alimentação") &&
                !tipoDaLoja.equalsIgnoreCase("Informática"))
            return -1;

        int quantidade = 0;
        for(int i = 0; i<lojas.length; i++)
            if(lojas[i].getNome().equalsIgnoreCase(tipoDaLoja))
                quantidade++;
        return quantidade;
    }


    public Loja lojaSeguroMaisCaro(){
        Informatica informaticaAux = null;

        for(int i = 0; i<lojas.length; i++)

            //verifica se a posição atual é uma instancia de Informatica
            //e atribui ela a uma variável informatica (fazendo o casting)
            if(lojas[i] instanceof Informatica informatica)
                if(informaticaAux == null || informatica.getSeguroEletronicos() > informaticaAux.getSeguroEletronicos())
                    informaticaAux = informatica;
        return informaticaAux;

    }
}
