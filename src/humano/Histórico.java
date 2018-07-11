package humano;
import java.util.*;
public class Histórico {
    private ArrayList<String> doenças;
    private ArrayList<String> alergias;
    private ArrayList<String> cirurgias;

    public Histórico() {
        this.doenças = new ArrayList();
        this.alergias = new ArrayList();
        this.cirurgias = new ArrayList();
    }

    
    public void AdicionarDoenças(String doença){
        doenças.add(doença);
    }
    public void AdcionarAlergias(String alergia){
        alergias.add(alergia);
    }
    public void AdicionarCirurgias(String cirurgia){
        cirurgias.add(cirurgia);
    }

    public ArrayList<String> getDoenças() {
        return doenças;
    }

    public void setDoenças(ArrayList<String> doenças) {
        this.doenças = doenças;
    }

    public ArrayList<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(ArrayList<String> alergias) {
        this.alergias = alergias;
    }

    public ArrayList<String> getCirurgias() {
        return cirurgias;
    }

    public void setCirurgias(ArrayList<String> cirurgias) {
        this.cirurgias = cirurgias;
    }

    @Override
    public String toString() {
        return "Histórico:\n" + "Doenças: " + doenças + "\nAlergias: " + alergias + "\nCirurgias: " + cirurgias;
    }
    
    
    
    
}
