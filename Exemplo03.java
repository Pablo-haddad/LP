public class Exemplo03 {

    public static void main(String[] args) {

      String nome1 = "Pablo";
      String nome2 = new String( "Pablo");

      if(nome1.equals(nome2)){
          System.out.println("São iguais");
      }else {
          System.out.println("São diferentes");
      }
    }
}
