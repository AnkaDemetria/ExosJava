// **Exercice 6**
// Créez une méthode qui prend en entrée un tableau d'entiers et renvoie la
// somme de
// tous les éléments du tableau.

// / public class AppExo {
// public static int sommeTab(int[] tab) {
// int somme = 0;
// for (int t : tab) {
// somme += t;
// }
// return somme;
// }
// }

// **Exercice 7**
// Créez une méthode qui prend en entrée une ArrayList de chaînes de caractères
// et
// renvoie la chaîne la plus longue de la liste.

// import java.util.ArrayList

// public class AppExo {
// public static void main(String[] args) {
// ArrayList<String> strings = new ArrayList<>();
// strings.add('Bonjour');
// strings.add('Hello');
// strings.add('Hola');
// strings.add('Ciao');
// strings.add("C'est moi le plus long");

// String longestString = findLongestString(strings);
// System.out.println("La chaine la plus longue est : " + longestString);
// }

// public static String findlongestString(ArrayList<String> strings) {
// String longestString = "";
// for (String str : strings) {
// if (str.length() > longestString.length()) {
// longestString = str;
// }
// }
// return longestString;
// }
// }

// **Exercice 8**
// Créez une méthode qui prend en entrée une LinkedList d'objets et renvoie la
// taille de la
// liste.

// public class AppExo {

// public static int getSize(LinkedList<Objet> LinkedList) {
// return LinkedList.size();
// Cette méthode prend en paramètre une linkedListe d objets et renvoie un
// entier representant la taille de la liste
// }

// public static void main(String[] args) {
// LinkedList<Objet> maListe = new LinkedList<>();
// une instance d elinkedlist est appelée maListe en utilisant le constructeur
// par defaut, cela créer une liste chainée vide
// maListe.add("objet1");
// maListe.add("objet2");
// maListe.add("objet3");
// maListe.add("objet4");
// maListe.add("objet5");

// int size = getSize(maListe);
// la valeur renvoyée par la méthode est stockée dans la variable size
// System.out.println("Taille de la liste : " + size);
// }}

// **Exercice 9**
// tableau d entiers qui comprend 3 entiers,on print la méthode et la cible pr
// les comparer,la méthode qui renvoie boolean et avec boucle forEach, on met
// nos variables dans la méthode main et on crée une méthode à l'extérieur de la
// méthode amin qui va comparer les valeurs dans le tableau et on affiche dans
// la méthode main le résultat
// public class AppExo {
// public static void main(String[] args) {
// int[] tableauEssai = { 0, 1, 3 };
// int cible = 2;

// System.out.println(compareValeurTableau(tableauEssai, cible));
// }

// public static boolean compareValeurTableau(int[] tableauTest2, int number) {
// for (int element : tableauTest2) {
// if (element == number) {
// return true;
// }
// }
// return false;
// }
// }

// **Exercice 10:**
// Créez une méthode qui prend en entrée une ArrayList d'objets et un objet
// cible. La
// méthode doit renvoyer l'indice de la première occurrence de l'objet cible
// dans la liste, ou
// -1 s'il n'est pas présent.

// import java.util.ArrayList;
// ou
// import java.util.*;

// public class AppExo {
// public static void main(String[] args) {
// ArrayList<String> liste = new ArrayList<>();

// liste.add("sophie");
// liste.add("bernard");
// liste.add("inna");
// String test = "paul";
// String test1 = "anne";
// System.out.println(compareCible(liste, test));
// System.out.println(compareCible(liste, test1));
// }

// public static int compareCible(ArrayList<String> array, String element) {
// for (int i = 0; i < array.size(); i++) {
// String item = array.get(i);
// // à chaque tour de boucle on recupère l élément i (qui est de type string)
// // grace à l'index grace à méthode get et on les stocke dans item
// if (element.equals(item)) {
// // si l'élément du paramètre = item alors retourne index
// // la comparaison d'objets se fait grace à la méthode equals, on ne peut pas
// // utiliser l'opérateur == seulement pour comparer des références
// return i;
// }
// }
// return -1;
// //la méthode s'attend à ce qu'on retourne un int
// }
// }

// 2EME CORRECTION
// import java.util.ArrayList;

// public class AppExo {
// public static void main(String[] args) {
// ArrayList<String> liste = new ArrayList<>();

// liste.add("sophie");
// liste.add("bernard");
// liste.add("inna");
// System.out.println(present(liste, "sophie") == -1 ? "-1, il n'y est pas"
// : (" il se trouve à la position " + present(liste, "sophie")));
// }

// public static int present(ArrayList<String> list, String cible) {
// if (list.contains(cible)) {
// return list.indexOf(cible);

// }
// return -1;
// }
// }

// **Exercice 11:**
// Créez une méthode qui prend en entrée un tableau d'entiers triés par ordre
// croissant et un entier cible. La méthode doit renvoyer true si l'entier cible
// est présent dans le tableau en utilisant une recherche binaire, sinon elle
// doit renvoyer false. (binary search)

// Recherche binaire en JAVA:
// La recherche linéaire est une technique de base. Dans cette technique, le
// tableau est parcouru séquentiellement et chaque élément est comparé à la clé
// jusqu'à ce que la clé soit trouvée ou que la fin du tableau soit atteinte.
// La recherche linéaire est rarement utilisée dans les applications pratiques.
// La recherche binaire est la technique la plus fréquemment utilisée car elle
// est beaucoup plus rapide qu'une recherche linéaire.

// import java.util.Arrays;

// public class AppExo {

// static int[] tab = { 2, 4, 6, 8, 10 };

// public static boolean bool(int[] tableau, int entierCible) {
// if ((Arrays.binarySearch(tableau, entierCible)) >= 0) {
// return true;
// } else {
// return false;
// }
// }

// public static void main(String[] args) {
// System.out.println(bool(tab, 6));
// }
// }

// AUTRE CORRECTION
// import java.util.Arrays;

// public class AppExo {
// int[] tableau;
// tableau = new int[] {69, 25, 65, 263, 2};

// System.out.println(hey(tableau1,69));

// public static boolean hey(int[] tab, int cible){
// Arrays.sort(tab);
// return Arrays.binarySearch(tab, cible)>=0;
// }}

// **Exercice 12:**
// Créez une méthode qui prend en entrée une LinkedList d'entiers et supprime
// tous les éléments pairs de la liste.

// import java.util.LinkedList;
// import java.util.Iterator;

// public class Main {
// public static void supprimerElementsPairs(LinkedList<Integer> liste) {
// Iterator<Integer> it = liste.iterator();
// while (it.hasNext()) {
// int nombre = it.next();
// if (nombre % 2 == 0) {
// it.remove();
// }
// }
// }

// public static void main(String[] args) {
// LinkedList<Integer> liste = new LinkedList<>();
// liste.add(1);
// liste.add(2);
// liste.add(3);
// liste.add(4);
// liste.add(5);

// System.out.println("Liste avant la suppression des éléments pairs : " +
// liste);

// supprimerElementsPairs(liste);

// System.out.println("Liste après la suppression des éléments pairs : " +
// liste);
// }
// }

// AUTRE METHODE
// import java.util.LinkedList;

// public class AppExo {
// public static void main(String[] args) {
// LinkedList<Integer> numbers = new LinkedList<>();
// numbers.add(1);
// numbers.add(2);
// numbers.add(3);
// numbers.add(4);
// numbers.add(5);
// System.out.println("Liste avant la suppression des éléments pairs : " +
// numbers);
// removeEvenNumbers(numbers);
// System.out.println("Liste après la suppression des éléments pairs : " +
// numbers);
// }

// public static void removeEvenNumbers(LinkedList<Integer> list) {
// for (int i = 0; i < list.size(); i++) {
// if (list.get(i) % 2 == 0) {
// list.remove(i);
// i--; // Décrémente l'index pour compenser la suppression de l'élément
// (compensation)
// // 0 1 2 3 4 => 0 1 3 4 => 0 1 2 3 mais le programme ne sait plus où il est,
// il
// // faut compenser avec i--
// }
// }
// }
// }

// **Exercice 13:**
// Créez une méthode qui prend en entrée un tableau d'entiers et renvoie un
// nouveau tableau qui contient uniquement les nombres premiers présents dans le
// tableau d'origine.

import java.util.*;

public static LinkedList<Integer> pair(LinkedList<Integer> tableau){
        Iterator<Integer> iterator = tableau.iterator();

        while (iterator.hasNext()) {
             Integer element = iterator.next();
             if (element % 2 == 0) {
                iterator.remove();
             }
        }
        return tableau;
    }

    public static boolean heyooh(int[] tab, int cible){
        Arrays.sort(tab);
        return Arrays.binarySearch(tab, cible) >= 0;
    }

    public static int present(ArrayList<String> list, String cible){
        // boolean existe = list.contains(cible);
        if (list.contains(cible)) {
            // for (int i = 0; i < list.size(); i++) {
            //     if (list.get(i)==cible) {
            //         return i;
            //     }
            // }
                return list.indexOf(cible);
        }
        return -1;
    }


    public static void somme(int[] tab){
        int somme = 0;

        for (int i : tab){
            somme = somme + i;
        }
        System.out.println(somme);
    }

    public static void listeLongue(ArrayList<String> list){
        String taille= "";
        for (String test : list) {
            if (test.length() > taille.length()) {
                taille = test;
            }
        }
        System.out.println(taille);
    }

    public static int getSize(LinkedList<Object> linkedList){
        return linkedList.size();
    }

    public static boolean compareValeurTableau(int[] tableauTest2, int number){
        for(int element : tableauTest2){
            if(element == number){
                return true;
            }
        }
        return false;
    }