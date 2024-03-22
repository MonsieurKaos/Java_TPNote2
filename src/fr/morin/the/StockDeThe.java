package fr.morin.the;

import java.util.HashMap;
import java.util.Map;

public class StockDeThe {
    private HashMap<The,Integer> stock;

    public StockDeThe() {
        stock = new HashMap<>();
    }

    public boolean contientThe(The the){
        return stock.containsKey(the);
    }
    public void ajouter(The the, int nbGrammes){
        if (contientThe(the)){
            stock.computeIfPresent(the,(k,v) -> v+nbGrammes);
        }
        else {
            stock.put(the, nbGrammes);
        }
    }
    public void sortir(The the, int nbGrammes){
        try{
            if (contientThe(the)){
                if (stock.get(the)>=nbGrammes){
                    stock.computeIfPresent(the,(k,v) -> v-nbGrammes);
                }
                else {
                    throw new IllegalArgumentException("La valeur de retrait est trop élevé. Stock actuel : "+stock.get(the)+"gr");
                }
            } else {
                throw new IllegalArgumentException("Le Thé demandé n'est pas contenut dans le stock");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public void afficherStock() {
        System.out.println("Les thés dans le stock sont :");
        for (Map.Entry<The, Integer> entry : stock.entrySet()) {
            The the = entry.getKey();
            int quantite = entry.getValue();
            System.out.println(the.getName() + " - Quantité : " + quantite);
        }
    }
    public void thesDeCategorie(Categorie cat){
        for (Map.Entry<The, Integer> entry : stock.entrySet()) {
            if (entry.getKey().getCat() == cat) {
                System.out.println("Le Thé " + entry.getKey().getName() + " est dans la catégorie :" + cat);
            }
        }
    }

    public int quantiteDeThesDontLaNoteEstSupOuEgaleA (float seuilNote){
        int quantTotal = 0;
        for (Map.Entry<The, Integer> entry : stock.entrySet()) {
            if (entry.getKey().getNote()>=seuilNote) {
                quantTotal = quantTotal+entry.getValue();
            }
        }
        return quantTotal;
    }
}
