public class App3 {
    public static void main(String[] args) {
        Chat chat1 = new Chat("ramsès", 2, true);
        presentation(chat1);
        Chat chat2 = new Chat("garfield", 2, false);
        presentation(chat2);
        // Chien d = new Chien("bill", 5, false);
    }

    public static void presentation(Chat chat) {
        System.out.println("Bonjour, je m'appelle" + chat.getNom() + ", j'ai" + chat.getAge() + " ans et je "
                + (chat.getVaccin() ? "suis" : "ne suis pas") + " vacciné.");
        chat.demanderMiaulement();
    }
}

// Exercice 3 :
// 1. Créez deux classes, "Chien" et "Chat", avec les attributs suivants :
// ● nom (String)
// ● age (int)
// ● vacciné (boolean)
// 2. Assurez-vous de fournir des constructeurs, des getters et des setters
// appropriés
// pour chaque attribut.
// 3. Dans la classe "App", créez deux instances de la classe "Chat" avec des
// caractéristiques différentes. L'une des instances doit être vaccinée (vacciné
// =
// true) et l'autre ne doit pas l'être (vacciné = false).
// 4. Utilisez une condition ternaire pour afficher les informations appropriées
// pour
// chaque instance de chat. Si un chat est vacciné, affichez la phrase :
// "Bonjour, je
// m'appelle [nom du chat], j'ai [âge du chat] ans et je suis vacciné." Sinon,
// affichez
// la phrase : "Bonjour, je m'appelle [nom du chat], j'ai [âge du chat] ans et
// je ne suis
// pas vacciné."

// Exercice 4 :
// 1. Ajoutez un nouvel attribut "action" de type String à la classe "Chien" et
// à la classe
// "Chat".
// 2. Pour la classe "Chien", définissez la valeur de l'attribut "action" comme
// "woof-woof".
// 3. Pour la classe "Chat", définissez la valeur de l'attribut "action" comme
// "miaw-miaw".
// 4. Dans la classe "Chat", ajoutez une méthode appelée "demanderMiaulement"
// qui
// demande à l'utilisateur s'il souhaite entendre le chat miauler.
// ● Utilisez la classe "Scanner" pour lire l'entrée de l'utilisateur.
// ● Si l'utilisateur entre "y" (oui), affichez "miaw-miaw" sur la console.

// Dans la classe "Chat", nous ajoutons une méthode "demanderMiaulement" qui
// demande
// à l'utilisateur s'il souhaite entendre le chat miauler. Nous utilisons la
// classe "Scanner"
// pour lire l'entrée de l'utilisateur. Selon la réponse de l'utilisateur, nous
// affichons
// "miaw-miaw" si la réponse est "y" (oui), "OK, peut-être une prochaine fois !"
// si la réponse
// est "n" (non), et nous affichons un message d'erreur si la réponse n'est ni
// "y" ni "n", puis
// nous reposons la question à l'utilisateur.
// Dans la méthode "main" de la classe "App", nous créons une instance de la
// classe "Chat"
// et appelons la méthode "demanderMiaulement" sur cette instance.
// L'exécution du programme demande à l'utilisateur s'il souhaite entendre le
// chat miauler.
// Selon la réponse de l'utilisateur, le programme affiche le miaulement du chat
// ou un
// message approprié.
