import java.util.ArrayList;

public class HukkaavaLaatikko extends Laatikko{
    private ArrayList laatikko;
    
    public HukkaavaLaatikko() {
        this.laatikko = new ArrayList();
    }
    
    
    @Override
    public void lisaa(Tavara tavara) {
        
        this.laatikko.add(tavara);
        
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return false;
    }
    
}
