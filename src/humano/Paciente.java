package humano;
public class Paciente extends Pessoa {
    private Histórico históricoMédico;
    private Receita r;

    public Paciente(Histórico históricoMédico, String nome, String cpf, String endereço, String telefone, String idade, String sexo) {
        super(nome, cpf, endereço, telefone, idade, sexo);
        this.históricoMédico = históricoMédico;
    }

    public Histórico getHistóricoMédico() {
        return históricoMédico;
    }

    public void setHistóricoMédico(Histórico históricoMédico) {
        this.históricoMédico = históricoMédico;
    }

    public Receita getR() {
        return r;
    }

    public void setR(Receita r) {
        this.r = r;
    }
    

    @Override
    public String toString() {
        return "Paciente: \n" +  super.toString() +  "{" + "\n\n" + históricoMédico + "\n" + r  +'}';
    }
    
    

    
    
    
    
    
    
}
