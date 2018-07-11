package humano;
public class Receita {
    private String medicamento, dosagem, tempo;

    public Receita(String medicamento, String dosagem, String tempo) {
        this.medicamento = medicamento;
        this.dosagem = dosagem;
        this.tempo = tempo;
    }
    
    

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Receita{" + "medicamento=" + medicamento + ", dosagem=" + dosagem + ", tempo=" + tempo + '}';
    }
    
    
}
