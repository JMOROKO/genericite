import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        boolean continuer = true;
        int response;
        MetierProduitImpl service = new MetierProduitImpl();

        Scanner sc = new Scanner(System.in);
        while(continuer){
            System.out.println("""
                    1. Afficher la liste des produits.
                    2. Rechercher un produit par son id.
                    3. Ajouter un nouveau produit dans la liste.
                    4. Supprimer un produit par id.
                    5. Quitter ce programme.
                    """);
            response = sc.nextInt();
            switch(response){
                case 1:
                    service.getAll().forEach(e -> {
                        System.out.println(e);
                    });
                    break;
                case 2:
                    System.out.println("Veuillez saisir l'identifiant du produit recherché");
                    response = sc.nextInt();
                    System.out.println(service.findById(response));
                    break;
                case 3:
                    Produit produit = new Produit();
                    System.out.println("Veuillez saisir l'id");
                    produit.setId(sc.nextLong());
                    System.out.println("Veuillez saisir le nom");
                    produit.setNom(sc.next());
                    System.out.println("Veuillez saisir la marque");
                    produit.setMarque(sc.next());
                    System.out.println("Veuillez saisir le prix");
                    produit.setPrix(sc.nextDouble());
                    System.out.println("Veuillez saisir la description");
                    produit.setDescription(sc.next());
                    System.out.println("Veuillez saisir le nombre en stock");
                    produit.setNombreEnStock(sc.nextInt());
                    service.add(produit);
                    System.out.println("Enregistrement effectué avec succès");
                    break;
                case 4:
                    System.out.println("Veuillez saisir le produit à supprimer le produit");
                    service.delete(sc.nextLong());
                    System.out.println("Suppression effectué avec succès.");
                    break;
                case 5:
                    continuer = false;
                    break;
            }
        }
    }
}
