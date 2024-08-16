import java.util.concurrent.ThreadLocalRandom;

public class Exemplo07 {

    public static void main(String[] args) {

    Integer numeroAleatorio =ThreadLocalRandom.current().nextInt(0,10);

        System.out.println(numeroAleatorio);

    Double numeroQuebradoAleatorio = ThreadLocalRandom.current().nextDouble(0,20);

        System.out.println(String.format("%.2f", numeroQuebradoAleatorio));
    }
}
