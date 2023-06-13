**COURS JAVA INTRODUCTION ET EXERCICES**

**Exercice 1 :**
Écrivez un programme Java qui affiche tous les chiffres pairs jusqu'à 10 sur la console.
Voici les étapes pour résoudre cet exercice :
1. Déclarez une variable entière nommée "nombre" et initialisez-la à 0.
2. Utilisez une boucle while pour itérer tant que "nombre" est inférieur ou égal à 10.
3. À l'intérieur de la boucle, utilisez une structure de contrôle if pour vérifier si
"nombre" est pair.
4. Si "nombre" est pair, affichez sa valeur sur la console à l'aide de
"System.out.println()".
5. Incrémentez la valeur de "nombre" de 1 à chaque itération pour passer au
prochain nombre.

**Exercice 2 :**
Écrivez un programme Java qui demande à l'utilisateur d'entrer deux valeurs entières :
une valeur de début et une valeur de fin. Ensuite, le programme vérifie si la valeur de
début est inférieure à la valeur de fin. Si c'est le cas, le programme affiche tous les
nombres pairs compris entre la valeur de début et la valeur de fin. Sinon, le programme
affiche un message d'erreur indiquant que la valeur de début doit être plus petite que la
valeur de fin.
Voici les étapes pour résoudre cet exercice :
1. Demandez à l'utilisateur d'entrer la valeur de début et stockez-la dans une
variable entière nommée "debut".
2. Demandez à l'utilisateur d'entrer la valeur de fin et stockez-la dans une variable
entière nommée "fin".
3. Utilisez une structure de contrôle if pour vérifier si la valeur de début est
inférieure à la valeur de fin.
4. Si la condition est vérifiée, utilisez une boucle while pour itérer de la valeur de
début à la valeur de fin.
5. À chaque itération, vérifiez si le nombre est pair en utilisant l'opérateur modulo
(%) pour vérifier si le reste de la division par 2 est égal à 0.
6. Si le nombre est pair, affichez sa valeur sur la console à l'aide de
"System.out.println()".

**Exercice 3 :**
1. Créez deux classes, "Chien" et "Chat", avec les attributs suivants :
● nom (String)
● age (int)
● vacciné (boolean)
2. Assurez-vous de fournir des constructeurs, des getters et des setters appropriés
pour chaque attribut.
3. Dans la classe "App", créez deux instances de la classe "Chat" avec des
caractéristiques différentes. L'une des instances doit être vaccinée (vacciné =
true) et l'autre ne doit pas l'être (vacciné = false).
4. Utilisez une condition ternaire pour afficher les informations appropriées pour
chaque instance de chat. Si un chat est vacciné, affichez la phrase : "Bonjour, je
m'appelle [nom du chat], j'ai [âge du chat] ans et je suis vacciné." Sinon, affichez
la phrase : "Bonjour, je m'appelle [nom du chat], j'ai [âge du chat] ans et je ne suis
pas vacciné."

**Exercice 4 :**
1. Ajoutez un nouvel attribut "action" de type String à la classe "Chien" et à la classe
"Chat".
2. Pour la classe "Chien", définissez la valeur de l'attribut "action" comme
"woof-woof".
3. Pour la classe "Chat", définissez la valeur de l'attribut "action" comme
"miaw-miaw".
4. Dans la classe "Chat", ajoutez une méthode appelée "demanderMiaulement" qui
demande à l'utilisateur s'il souhaite entendre le chat miauler.
● Utilisez la classe "Scanner" pour lire l'entrée de l'utilisateur.
● Si l'utilisateur entre "y" (oui), affichez "miaw-miaw" sur la console.
Sinon, si l'utilisateur entre "n" (non) affichez "OK, peut-être une prochaine
fois !".
● Dans tous les autres cas, affichez “Je n’ai pas compris votre réponse” et
reposez la question à l’utilisateur.
5. Dans la méthode "main" de la classe "App", créez une instance de la classe "Chat"
et appelez la méthode "demanderMiaulement" sur cette instance.

**Exercice 5 :**
Utilisez un HashSet pour stocker une liste de noms d'étudiants. Demandez à l'utilisateur
d'entrer les noms jusqu'à ce qu'il entre "q" pour quitter. Ensuite, affichez tous les noms
d'étudiants enregistrés dans l'ensemble. Assurez-vous de gérer les doublons et
d'afficher les noms dans l'ordre d'ajout.

**Exercice 6:**
Créez une méthode qui prend en entrée un tableau d'entiers et renvoie la somme de
tous les éléments du tableau.

**Exercice 7:**
Créez une méthode qui prend en entrée une ArrayList de chaînes de caractères et
renvoie la chaîne la plus longue de la liste.

**Exercice 8:**
Créez une méthode qui prend en entrée une LinkedList d'objets et renvoie la taille de la
liste.

**Exercice 9:**
Créez une méthode qui prend en entrée un tableau d'entiers et un entier cible. La
méthode doit renvoyer true si l'entier cible est présent dans le tableau, sinon elle doit
renvoyer false.

**Exercice 10:**
Créez une méthode qui prend en entrée une ArrayList d'objets et un objet cible. La
méthode doit renvoyer l'indice de la première occurrence de l'objet cible dans la liste, ou
-1 s'il n'est pas présent.

**Exercice 11:**
Créez une méthode qui prend en entrée un tableau d'entiers trié par ordre croissant et
un entier cible. La méthode doit renvoyer true si l'entier cible est présent dans le tableau
en utilisant une recherche binaire, sinon elle doit renvoyer false.

**Exercice 12:**
Créez une méthode qui prend en entrée une LinkedList d'entiers et supprime tous les
éléments pairs de la liste.

**Exercice 13:**
Créez une méthode qui prend en entrée un tableau d'entiers et renvoie un nouveau
tableau qui contient uniquement les nombres premiers présents dans le tableau
d'origine.

