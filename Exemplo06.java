public class Exemplo06 {

    public static void main(String[] args) {

        String nome = "Pablo Hadddad";
        Integer idade = 23;
        Double altura = 3 / 2.0;
        Boolean bloqueado = false;

        //Interpolação
        //%s para string %d para numero inteiro %f para numero quebrado %.2f para formatar para duas casas decimais %b boolean "sim ou nao"
        //System.out.println(String.format("nome: %s\nidade: %d  \naltura: %.2f \nBloqueado: %b", nome,idade,altura,bloqueado));

        System.out.println(String.format("""
                nome: %s
                idade: %d  
                altura: %.2f 
                Bloqueado: %b 10%%""",nome,idade,altura,bloqueado));

    }
}
