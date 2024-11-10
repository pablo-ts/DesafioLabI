import java.sql.SQLOutput;

public class Data {
    private int dia, mes, ano;

    //CONSTRUTOR QUE INICIALIZA TODOS OS ATRIBUTOS E TESTA A DATA
    public Data(int dia, int mes, int ano){
        if (dia < 1 || dia > 31){
            setDataIncorreta();
        }

        else if (mes <1 || mes >12){
            setDataIncorreta();
        }

        else if (dia == 31 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)){
            setDataIncorreta();
        }

        else if ((dia > 29 && mes == 2) || dia == 29 && !verificaAnoBissexto(ano)){
            setDataIncorreta();
        }

        else{
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;

        }
    }



    //GETTERS E SETTERS
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }



    //APLICA A DATA INCORRETA
    public  void setDataIncorreta(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;
        System.out.println("ERRO: Data Inválida");
    }



    //TO STRING
    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }



    //METODO VERIFICA ANO BISSEXTO COM PARÂMETRO
    public boolean verificaAnoBissexto(int ano){
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        }else{
            return false;
        }
    }



    //METODO VERIFICA ANO BISSEXTO SEM PARÂMETRO
    public boolean verificaAnoBissexto(){
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        }else{
            return false;
        }
    }
}


