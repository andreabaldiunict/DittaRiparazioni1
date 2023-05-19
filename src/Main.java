import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n=1;
        Scanner sc= new Scanner(System.in);
        Tecnico[] tecnico= new Tecnico[0];

        /*System.out.println("+------DITTA DI RIPARAZIONE-------+");
        System.out.println("|1)--INSERISCI UN NUOVO TECNICO:  |");
        System.out.println("|2)---INSERISCI UN NUOVO ORDINE:  |");
        System.out.println("+---------------------------------+");
        System.out.println("+-----------INSERISCI UN NUMERO:  ");
        n = sc.nextInt();*/

        if(n==1) {
            System.out.println("Inserisci codice fiscale: ");
            String CF = sc.nextLine();
            System.out.println("Inserisci Nome: ");
            String nome = sc.nextLine();
            System.out.println("Inserisci Cognome: ");
            String cognome = sc.nextLine();

            tecnico[0] = new Tecnico(CF, nome, cognome);

            System.out.println(tecnico[0].toString());
        }

    }
}


/*public class Main
{
    /*static String nome;
    static int num,i;

    public class prova(String nome,int num){
        this.nome=nome;
        this.num=num;
    }

    public static void main(String[] args){
        Prova[] p=new Prova[3];

        for(int i=0;i<3;i++)
        {
            p[i] = new Prova("Ciao", 1);

        }

    }
}*/
