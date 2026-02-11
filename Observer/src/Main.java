package Observer.src;

public class Main {

    public static void main(String[] args) {

        PropertyListing apartment = new PropertyListing("Appartement centre-ville", 250000);

        Client client1 = new Client("Camille");
        Client client2 = new Client("Nadia");

        apartment.attach(client1);
        apartment.attach(client2);

        System.out.println("Changement de prix...");
        apartment.setPrice(240000);
    }
}
