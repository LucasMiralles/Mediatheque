package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();

        mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem( new CD(12, "Sergeant Peppers"));
        System.out.println("Le catalogue propose :");
        mediatheque.printCatalog();
        System.out.println("Voici les livres disponibles :");
        mediatheque.printOnlyBooks();
        System.out.println("Voici les CD disponibles :");
        mediatheque.printOnlyCDs();
    }
}
