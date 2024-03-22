import fr.morin.the.*;

public class Main {
    public static void main(String[] args) {

        StockDeThe ST1 = new StockDeThe();
        The T1 = new The("Thé 1", Categorie.Vert,"Chine",80,8);
        //System.out.println(T1.toString());
        The T2 = new The("Thé 2", Categorie.Noir,"Inde",95,6.5F);
        //System.out.println(T2.toString());
        ST1.ajouter(T1,50);
        ST1.ajouter(T2,60);
        ST1.afficherStock();
        ST1.sortir(T1,40);
        ST1.sortir(T2,60);
        ST1.afficherStock();
        ST1.sortir(T1,20);
        ST1.afficherStock();
    }
}