import java.util.Random;

public class Lampada {
    
    private boolean estadoLampada;
    private boolean lampadaQueimada;
    
      public Lampada () {
            desligarLampada();
            this.lampadaQueimada = false;
            
      }
      
      public boolean getLampadaQueimada() {
          return lampadaQueimada;
      }
  
      public void ligarLampada() {
        if(this.lampadaQueimada) 
            return;
      
        Random rnd = new Random();
        double numSorteado = rnd.nextDouble();
    
        if(numSorteado < 0.3) {
            this.lampadaQueimada = true;
            desligarLampada();
        } else {
          this.estadoLampada = true;
        }   
  
      }
  
      public void desligarLampada() {
        this.estadoLampada = false;
      }
  
      public boolean verificarEstadoLampada() {
        return this.estadoLampada;
      }

}
    