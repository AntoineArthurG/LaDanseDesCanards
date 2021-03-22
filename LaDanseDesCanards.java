import java.util.ArrayList;
import java.util.List;

public class LaDanseDesCanards {
    public static void main(String [] args) {

      List<Canard> canards = new ArrayList<>();

      // TODO ajouter à la liste des canards un canard de chaque espèce.
      canards.add(new Canard("colvert"));
      canards.add(new Canard("fuligule"));
      canards.add(new Canard("plastique"));
     
      for (Canard canard : canards) {
        System.out.println("Je suis un canard " + canard.getEspece() + " :");
        canard.cancaner();
        canard.nager();
        canard.voler();
        System.out.println("-------");
      }
    }
  }