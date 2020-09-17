import java.util.ArrayList;

public class YhdenTavaranLaatikko extends Laatikko{
    private ArrayList laatikko;
    
    public YhdenTavaranLaatikko() {
        laatikko = new ArrayList();
    }

    @Override
    public void lisaa(Tavara tavara) {
        if (laatikko.isEmpty()) {
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
