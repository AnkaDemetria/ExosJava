// import java.util.Scanner;

// public class App2 {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.println("Entrez un chiffre entier de début:");
// int debut = scanner.nextInt();

// System.out.println("Entrez un chiffre entier de fin:");
// int fin = scanner.nextInt();

// if (debut > fin) {
// int nombre = debut;

// while (nombre <= fin) {
// if (nombre % 2 == 0) {
// System.out.println(nombre);
// }
// nombre++;
// }

// scanner.close();
// } else {
// System.out.println("La valeur de début doit être plus petite que la valeur de
// fin.");
// }
// }
// }

// 1/importer scanner depuis la biblio util
// 2/utiliser objet scanner et lui entrer une nvelle instance
// Exercice 2 :
// Écrivez un programme Java qui demande à l'utilisateur d'entrer deux valeurs
// entières :
// une valeur de début et une valeur de fin. Ensuite, le programme vérifie si la
// valeur de
// début est inférieure à la valeur de fin. Si c'est le cas, le programme
// affiche tous les
// nombres pairs compris entre la valeur de début et la valeur de fin. Sinon, le
// programme
// affiche un message d'erreur indiquant que la valeur de début doit être plus
// petite que la
// valeur de fin.
// Voici les étapes pour résoudre cet exercice :
// 1. Demandez à l'utilisateur d'entrer la valeur de début et stockez-la dans
// une
// variable entière nommée "debut".
// 2. Demandez à l'utilisateur d'entrer la valeur de fin et stockez-la dans une
// variable
// entière nommée "fin".
// 3. Utilisez une structure de contrôle if pour vérifier si la valeur de début
// est
// inférieure à la valeur de fin.
// 4. Si la condition est vérifiée, utilisez une boucle while pour itérer de la
// valeur de
// début à la valeur de fin.
// 5. À chaque itération, vérifiez si le nombre est pair en utilisant
// l'opérateur modulo
// (%) pour vérifier si le reste de la division par 2 est égal à 0.
// 6. Si le nombre est pair, affichez sa valeur sur la console à l'aide de
// "System.out.println()".
