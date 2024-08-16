import java.security.spec.RSAOtherPrimeInfo;

public class Exempo02 {
    public static void main(String[] args) {

        Integer idade = 20;
        String nome = "bob";

        if(idade > 18 || nome == "bob"){
            System.out.println("Maior de idade");
        }else if(idade > 60){
            System.out.println("Idoso");
        }else {
            System.out.println("Menor de idade");
        }

        //Operador ternário
        String mensagemTernario = idade >= 18 ? "Maior de idade" : "Menor de idade";
        System.out.println(mensagemTernario);

    }
}
