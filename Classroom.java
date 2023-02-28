public class Classroom {
    public static void main(String[] args) {
        // Création d'instances de la classe Wilder
        Wilder wilder1 = new Wilder("Jean-Claude", true);
        Wilder wilder2 = new Wilder("Henri", false);

        // Appel de la méthode whoAmI sur chaque instance
        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
    }
}
