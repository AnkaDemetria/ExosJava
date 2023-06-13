import java.util.HashSet;
import java.util.Scanner;

public class App5Exercices {
    public static void main(String[] args) {
        HashSet<String> studentsSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Entrez les noms des étudiants (entrez 'q' pour quitter): ");

        do {
            input = scanner.nextLine();
            if (!input.equalsIgnoreCase("q")) {
                studentsSet.add(input);
            }
        } while (!input.equalsIgnoreCase("q"));

        scanner.close();
        System.out.println("Noms des étudiants enregistrés: ");
        for (String student : studentsSet) {
            System.out.println(student);
        }
    }
}

// Exercice 5 :
// Utilisez un HashSet pour stocker une liste de noms d'étudiants. Demandez à
// l'utilisateur
// d'entrer les noms jusqu'à ce qu'il entre "q" pour quitter. Ensuite, affichez
// tous les noms
// d'étudiants enregistrés dans l'ensemble. Assurez-vous de gérer les doublons
// et
// d'afficher les noms dans l'ordre d'ajout.

// HashSet: gère automatiquement les doublons dc pas de code à rajouter
// nextLine relance la saisie de la console à chaque itération (nextLine car de
// type String , sinon on aurait mis nextIn si de type int)
// La boucle do-while
// permet à l'utilisateur de saisir les noms jusqu'à ce qu'il entre "q" pour
// quitter. À chaque
// itération, si l'entrée n'est pas "q", le nom est ajouté à l'ensemble
// studentsSet à l'aide de la
// méthode add().
// Une fois que l'utilisateur a terminé la saisie, nous parcourons l'ensemble
// studentsSet à
// l'aide d'une boucle for-each et affichons les noms des étudiants enregistrés.
// // méthode add: pour ajouter un nom à l'ensemble = la collection
// equalsIgnoreCase: méthode native de java pour ne fait pas attention à la
// casse