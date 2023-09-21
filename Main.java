// Interface 1 : InterfaceJoueur
interface InterfaceJoueur {
    void attaquer();
    void subirDegats();

}

//Interface 2 : InterfaceMonstre
interface InterfaceMonstre {
    void attaquer();
    void subirDegts();

    void subirDegats();
}

// Interface 3 : InterfaceObjet
interface InterfaceObjet {
    void utiliser();
    void ramasser();
}

// Classe principale : Main
public class Main {
    public static void main(String[] args) {

        // Classe 1 : Joueur
        class Joueur implements InterfaceJoueur {
            private String nom;
            private int pointsVie;
            private int pointsAttaque;
            private int pointsDefense;

            public Joueur(String nom, int pointsVie, int pointsAttaque, int pointsDefense) {
                this.nom = nom;
                this.pointsVie = pointsVie;
                this.pointsAttaque = pointsAttaque;
                this.pointsDefense = pointsDefense;
            }

            @Override
            public void attaquer() {
            }

            @Override
            public void subirDegats() {
            }
        }

        // Classe 2 : Monstre
        class Monstre implements InterfaceMonstre {
            private String nom;
            private int pointsVie;
            private int pointsAttaque;
            private int pointsDefense;

            public Monstre(String nom, int pointsVie, int pointsAttaque, int pointsDefense) {
                this.nom = nom;
                this.pointsVie = pointsVie;
                this.pointsAttaque = pointsAttaque;
                this.pointsDefense = pointsDefense;
            }

            @Override
            public void attaquer() {

            }

            @Override
            public void subirDegts() {

            }

            @Override
            public void subirDegats() {
            }
        }
        class Objet implements InterfaceObjet {
            private String nom;
            private int pointsUtilite;

            public Objet(String nom, int pointsUtilite) {
                this.nom = nom;
                this.pointsUtilite = pointsUtilite;
            }

            @Override
            public void utiliser() {
                // Implémentation de l'utilisation de l'objet
            }

            @Override
            public void ramasser() {
                // Implémentation du ramassage de l'objet
            }
        }

        //Création d'instances des différentes classes
        Joueur joueur = new Joueur("Joueur 1", 100, 20, 10);
        Monstre monstre = new Monstre("Monstre 1", 50, 15, 5);
        Objet objet = new Objet("Objet 1", 10);

        
        joueur.attaquer();
        joueur.subirDegats();
        monstre.attaquer();
        monstre.subirDegats();
        objet.utiliser();
        objet.ramasser();
    }
}




