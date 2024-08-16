public class Exemplo04 {

    public static void main(String[] args) {

        System.out.println("for: ");
        for(Integer i = 0;i < 10 ;i++){
            System.out.println(i);
        }

        System.out.println("while: ");
        int i = 0;
        while(i < 10){
            System.out.println(i);
            i++;
        }

        System.out.println("Do...while:");

        i = 0;
        do{
            System.out.println(i);
            i++;
        }while (i < 10);


    }
}
