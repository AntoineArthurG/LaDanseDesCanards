

public class Canard {
    private String nomEspece;

    public Canard(String nomEspece) { this.nomEspece = nomEspece; }
    public void setEspece(String espece) {
        this.nomEspece = espece;
    }

    public String getEspece() {
        return nomEspece;
    }

    public void cancaner() {
        if (nomEspece=="plastique" ) System.out.println("pouik-pouik");
        else System.out.println("coin-coin");
    }

    public void nager() {
        if (nomEspece == "plastique") System.out.println("je flotte");
        else System.out.println("je palme");
    }

    public void voler() {
        if (nomEspece == "plastique") return;
        else System.out.println("je bat des ailes");
    }

}
