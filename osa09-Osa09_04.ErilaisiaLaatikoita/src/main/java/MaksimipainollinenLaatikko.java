import java.util.ArrayList;

public class MaksimipainollinenLaatikko extends Laatikko {
    private int maxPaino;
    private ArrayList<Tavara> laatikko;
    
    public MaksimipainollinenLaatikko(int maksimipaino) {
        this.maxPaino = maksimipaino;
        this.laatikko = new ArrayList<>();
        
    }
    
    public int sisallonPaino() {
        int paino = 0;
        
        for (int i = 0; i < laatikko.size(); i++) {
            paino += laatikko.get(i).getPaino();
        }
        return paino;
    }

    @Override
    public void lisaa(Tavara tavara) {
        
        if (!(sisallonPaino() + tavara.getPaino() > this.maxPaino)) {
            laatikko.add(tavara);
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        if (laatikko.contains(tavara)) {
            return true;
        }
        
        return false;
    }
    

}