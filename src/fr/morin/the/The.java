package fr.morin.the;

public class The {
    private String Name = "British";
    private Categorie Cat;
    private String Origine = "Inde";
    private float TempIn = 50;
    private float Note = 5;

    public The(String name ,Categorie cat, String origine, float tempin, float note) {
        this.setName(name);
        this.setCat(cat);
        this.setOrigine(origine);
        this.setTempIn(tempin);
        this.setNote(note);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        try {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("La chaine entrée ne peux pas être vide ou null");
            } else {
                Name = name;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public Categorie getCat() {
        return Cat;
    }

    public void setCat(Categorie cat) {
        Cat = cat;
    }

    public String getOrigine() {
        return Origine;
    }

    public void setOrigine(String origine) {
        Origine = origine;
    }

    public float getTempIn() {
        return TempIn;
    }

    public void setTempIn(float tempIn) {
        try {
            if (tempIn < 15) {
                throw new IllegalArgumentException("La température indiquée est inférieure à 15°C");
            } else {
                TempIn = tempIn;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public float getNote() {
        return Note;
    }

    public void setNote(float note) {
        try {
            if (note < 0 || note > 10) {
                throw new IllegalArgumentException("La note indiquée n'est pas entre 0 et 10");
            } else {
                Note = note;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return getName()+" est un Thé "+getCat()+" provenant de "+getOrigine()+" avec une température d'infusion de "+getTempIn()+"°C. Sa note est de : "+getNote()+"/10";
    }
}
