import java.util.Scanner;

public class Chat {
    public Chat(String nom, int age, boolean vaccin) {
        this.nom = nom;
        this.age = age;
        this.vaccin = vaccin;
        this.action = "miaw-miaw";
    }

    public void demanderMiaulement() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voulez-vous entendre le chat miauler ? (y/n) ");
        String reponse = scanner.nextLine();

        if (reponse.equals("y")) {
            System.out.println(action);
        } else if (reponse.equals("n")) {
            System.out.println("OK, peut-être une prochaine fois !");
        } else {
            System.out.println("Je n'ai pas compris votre réponse");
            demanderMiaulement();
        }
        scanner.close();
    }

    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean vaccin;

    public boolean getVaccin() {
        return vaccin;
    }

    public void setVaccin(boolean vaccin) {
        this.vaccin = vaccin;
    }

    private String action;

    public String getAction() {
        return action;
    }
}