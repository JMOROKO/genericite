import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit>{
    private List<Produit> produits;

    public MetierProduitImpl() {
        produits = new ArrayList<>();
    }

    @Override
    public void add(Produit o) {
        produits.add(o);
    }

    @Override
    public List getAll() {
        return List.of(produits);
    }

    @Override
    public Produit findById(long id) {
        for (Produit p : produits) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void delete(long id) {
        produits.removeIf(p -> p.getId() == id);
    }
}
