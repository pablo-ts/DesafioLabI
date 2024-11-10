public class Endereco {
    private String nomeDaRua, cidade, estado, pais, cep, numero, complemento;


 // CONSTRUTOR QUE INICIALIZA TODOS OS ATRIBUSTOString nomeDaRua, String cidade, String estado, String pais, String cep, String numero, String complemento
    public Endereco (String nomeDaRua, String cidade, String estado, String pais, String cep, String numero, String complemento){
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }



    // GETTERS E SETTERS
    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }


    //TO STRING
    public String toString(){
        return "nomeDaRua: "  + getNomeDaRua() + "\n" + "cidade: " + getCidade() + "\n"
        + "estado: " + getEstado() + "\n" + "pais: " + getPais() + "\n" + "cep: " + getCep()
        + "numero: " + getNumero() + "complemento: " + getComplemento();
    }



}
