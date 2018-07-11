package humano;
public class Funcionário extends Pessoa {
    private String codIdentificação;

    public Funcionário(String codIdentificação, String nome, String cpf, String endereço, String telefone, String idade, String sexo) {
        super(nome, cpf, endereço, telefone, idade, sexo);
        this.codIdentificação = codIdentificação;
    }

    public String getCodIdentificação() {
        return codIdentificação;
    }

    public void setCodIdentificação(String codIdentificação) {
        this.codIdentificação = codIdentificação;
    }

    @Override
    public String toString() {
        return "Funcionário{" + "codIdentificação: " + codIdentificação + '}' +"\n" +  super.toString();
    }
    
    
    
    
}
