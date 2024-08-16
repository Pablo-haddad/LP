public class Exercicio01 {

    public static void main(String[] args) {

        //filhos 0 a 3
        Integer filho = 2;
        //filhos 4 a 16
        Integer filho2 = 3;
        //filhos 17 a 18
        Integer filhos3 = 4;

        Double valor = filho * 25.15;
        Double valor2 = filho2 * 15.88;
        Double valor3 = filhos3 * 12.44;

        Integer totalFilhos = filho + filho2 + filhos3;

        Double totalBolsa = valor + valor2 + valor3;

        System.out.println("Você tem um total de " + totalFilhos + " filhos e vai receber R$" + totalBolsa + " de bolsa");
    }
}
