import java.util.ArrayList;
import java.util.Random;
import java.util.ArrayList;


class Voiture {
    private String marque;
    private String modele;
    private int anneeFabrication;
    private double prix;
    private int nombreVoituresCreer;
  private static ArrayList<String> marquesDisponibles = new ArrayList<>();

    public Voiture() {
        this.marque = "Inconnue";
        this.modele = "Inconnu";
        this.anneeFabrication = 0;
        this.prix = 0.0;
        this.nombreVoituresCreer++;
    }

    public Voiture(String marque, String modele, int anneeFabrication, double prix) {
        this.marque = marque;
        this.modele = modele;
        this.anneeFabrication = anneeFabrication;
        this.prix = prix;
        nombreVoituresCreer++;
    }

    public Voiture(String modele, int anneeFabrication) {
        this.modele = modele;
        this.anneeFabrication = anneeFabrication;
        this.marque = marquesDisponibles.get(new Random().nextInt(marquesDisponibles.size()));
        this.prix = Math.random() * 50000 + 10000;
        nombreVoituresCreer++;
    }

    class Moteur {
        private String type;
        private int puissance;

        public Moteur(String type, int puissance) {
            this.type = type;
            this.puissance = puissance;
        }

    }

    static class Concession {
        private String nom;
        private String adresse;
       }

    }
