/*
 * Retome a implementação do exercício sobre a modelagem de uma lâmpada e implemente a
 * abstração de um lustre que contêm diversas lâmpadas e que pode ser ligado e desligado.
 * Assuma que o número de lâmpadas do lustre deve ser definido através do construtor
 * e que não pode ser alterado posteriormente.

 */


public class Lustre {

    private Lampada[] lampadas;
    private boolean estadoLustre;

    public Lustre(Lampada lampadas) {
        this.lampadas = new Lampada[3];
    }

    public boolean getEstadoLustre() {
        return estadoLustre;
    }

    public boolean ligarLustre(Lampada lampada) {
        int numLampadasQueimadas = 0;
        for(int i = 0; i < lampadas.length; i++){
            lampada.ligarLampada();
            if(lampada.getLampadaQueimada() == true){
                numLampadasQueimadas++;
            }
        }

        if(numLampadasQueimadas == lampadas.length){
            return false;
        }
        return estadoLampada;
    }

    // a) Inclua um método que retorne verdadeiro caso tenha alguma lâmpada queimada no lustre, e falso caso contrário.
    public boolean verificarLampadasQueimadas(Lampada lampada) {
        for(int i = 0; i < lampadas.length; i++){
            if(lampada.getLampadaQueimada() == true) {
                return true;
            }

        }

        return false;
    }


    // b) Inclua um método que retorne uma coleção indicando a posição das lâmpadas queimadas.
    //  Você pode assumir que as posições do lustre são numeradas através de índices 0, 1, 2, etc.
    public int[] mostrarLampadasQueimadas(Lampada lampada) {

        int[] lampadasQueimadas = new int[lampadas.length];
        for(int i = 0; i < lampadas.length; i++){
            if(lampada.getLampadaQueimada() == true) {
                lampadasQueimadas[i] = 1;
            }
        }

        return lampadasQueimadas;
    }

}
