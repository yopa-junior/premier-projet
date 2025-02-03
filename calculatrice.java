import java.util.Scanner;

public class calculatrice{

    public static void somme(int a, int b){
        int s=a+b;
        System.out.println("la somme de " +a+ " et " +b+ " est " +s);
    }

    public static void soustraction(int a, int b){
        int d=a-b;
        System.out.println("la difference de " +a+ " et " +b+ " est " +d);
    }

    public static void multiplication(int a, int b){
        int m=a*b;
        System.out.println("la difference de " +a+ " et " +b+ " est " +m);
    }

    public static void division(int a, int b){
        if(b==0){
            System.out.println("erreur!!! division impossible");
        }
        else{ 
        float d=(float)(a/b);
        System.out.println("la division  de " +a+ " par " +b+ " est " +d);
        }
    }

    public static void racine(int a){
        if(a<0){
            System.out.println("erreur!!!");
        }
        else{
            float r=(float)Math.sqrt(a);
            System.out.println("la racine  de " +a+ " est " +r);
        }
    }
    
    public static void main(String[] args){

        while (true) {
            System.out.println("\n");
            System.out.println("1.additionner deux nombre");
            System.out.println("2.soustraire deux nombre");
            System.out.println("3.multilication de deux nombre");
            System.out.println("4.racine carree d'un nombre");
            System.out.println("5.quitter");
            System.out.print("entrez votre choix: ");
            Scanner scanner= new Scanner(System.in);
            int choix= scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("\n");
                    System.out.print("entrez le premier entier: ");
                    int a= scanner.nextInt();
                    System.out.print("entrez le deuxieme entier: ");
                    int b= scanner.nextInt();
                    somme(a, b);
                    break;

                case 2:
                    System.out.println("\n");
                    System.out.print("entrez le premier entier: ");
                    a= scanner.nextInt();
                    System.out.print("entrez le deuxieme entier: ");
                    b= scanner.nextInt();
                    soustraction(a, b);
                    break;

                case 3:
                    System.out.println("\n");
                    System.out.print("entrez le premier entier: ");
                    a= scanner.nextInt();
                    System.out.print("entrez le deuxieme entier: ");
                    b= scanner.nextInt();
                    multiplication(a, b);
                    break;

                case 4:
                    System.out.println("\n");
                    System.out.print("entrez le premier entier: ");
                    a= scanner.nextInt();
                    racine(a);
                    break;
            
                case 5:
                    System.out.println("Aurevoir!!!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("option invalide!!! veuillez reessayer");
                    break;
            }
        }
    }
}
