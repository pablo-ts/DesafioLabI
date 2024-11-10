public class Principal {
    public static void main(String[] args) {

        //MENU DE OPÇÕES
        int numero = 0;
        while (numero != 3) {
            System.out.println("********************");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar uma produto");
            System.out.println("(3) Sair");
            System.out.println("********************");

            Produto p = null;
            Loja l = null;

            //Executa a funcões do menu
            numero = Teclado.leInt("Digite um dos números acima: ");
            switch (numero) {
                case 1:
                    // CRIA INSTANCIA DE LOJA
                    l = new Loja (Teclado.leString("Digite o nome da Loja"),
                                  Teclado.leInt("Digite o n° de funcionários da loja"),
                                  Teclado.leDouble("Digite o salário base dos funcionários"),

                            // CRIA INSTANCIA DE ENDEREÇO DENTRO DE LOJA
                            new Endereco(Teclado.leString("Digite o nome da rua"),
                                         Teclado.leString("Digite a cidade"),
                                         Teclado.leString("Digite o Estado"),
                                         Teclado.leString("Digite o País"),
                                         Teclado.leString("Digite o CEP"),
                                         Teclado.leString("Digite o N°"),
                                         Teclado.leString("Digite um complemento")),

                            //CRIA INSTANCIA DE DATA DENTRO DA LOJA
                            new Data(Teclado.leInt("Digite o Dia: "),
                                     Teclado.leInt("Digite o mês"),
                                     Teclado.leInt("Digite o ano")));


                    break;



                case 2:
                        //CRIA INSTANCIA DE PRODUTO
                        p = new Produto(Teclado.leString("Digite o nome do produto: "),
                                Teclado.leDouble("Digite o preço do produto: "),

                                //CRIA INSTANCIA DE DATA DENTRO DE PRODUTO
                                new Data(Teclado.leInt("Digite o dia"),
                                        Teclado.leInt("Digite o mês"),
                                        Teclado.leInt("Digite o ano")));
                        break;

                case 3:
                    System.out.println("Saindo...");
                    break;

            }
            //IMPRIME MSG DE ERRO
            if(numero <1 || numero > 3){
                System.out.println("ERRO: número inválido");
            }

            //IMPRIME SE O PRODUTO ESTA VENCIDO OU NÃO
            if (p != null) {
                if (p.estaVencido(new Data(20, 10, 2023))) {
                    System.out.println("Não Está Vencido ");
                } else {
                    System.out.println("Está Vencido");
                }
            }




        }
    }
}



