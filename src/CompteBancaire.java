public class CompteBancaire {
    int numcompte;
    String nom;
    double solde;
    int decouvertMaximal = -800;
    int debitMaximal = 1000;

    public boolean crediter(int montantAcrediter) {
        this.solde = solde;
        this.solde += montantAcrediter;
        return true;
    }

    public boolean debiter(int montantAdebiter) {
        this.solde = solde;
        if (solde - montantAdebiter >decouvertMaximal) {
            return false;
        }
        this.solde -= montantAdebiter;
        return true;
    }

    public boolean effectuerRetrait(int montantRetrait) {
        if (montantRetrait > debitMaximal) {
            return false;
        }
        this.solde -= montantRetrait;
        return true;
    }

    public boolean effectuerVirement(CompteBancaire compteBancaire, int montantVirement) {
        if (debiter(montantVirement)) {
            compteBancaire.crediter(montantVirement);
            return true;
        }
        return false;

    }

    public CompteBancaire(String nomTitulaire) {
        this.nom = nomTitulaire;
        this.numcompte = 0;
        this.solde = 0;
    }

    public CompteBancaire(int solde) {
        this.solde = 0;
        this.nom = "";
        this.numcompte = 0;
        this.solde = solde;
    }

    public CompteBancaire(int decouvertMaximal, int debitMaximal, String nomTitulaire, double solde) {
        this.decouvertMaximal = (decouvertMaximal > 0) ? decouvertMaximal : 800;
        this.debitMaximal = (debitMaximal > 0) ? debitMaximal : 1000;
        this.nom = nomTitulaire;
        this.solde = solde;
    }

    public int getNumcompte() {
        return numcompte;
    }

    public String getNom() {
        return nom;
    }

    public double getSolde() {
        return solde;
    }

    public int getDecouvertMaximal() {
        return decouvertMaximal;
    }

    public int getDebitMaximal() {
        return debitMaximal;
    }

    public boolean situationCompte() {
        if (solde < 0) {
            return true;
        }
        return false;
    }

    public double debitAutorise() {
        return Math.min(this.solde, this.debitMaximal);
    }
public String toString() {
        return " Compte n°: "+numcompte+ "/ Titulaire : "+ nom+" / solde : " +solde+ " /debit maximal: "+debitMaximal+" /decouvert maximal: "+decouvertMaximal+"/ debit autorisé: "+debitAutorise()+"/situation: "+situationCompte();
}
}