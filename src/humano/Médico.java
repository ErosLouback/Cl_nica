package humano;
public class Médico extends Funcionário {

    public Médico(String codIdentificação, String nome, String cpf, String endereço, String telefone, String idade, String sexo) {
        super(codIdentificação, nome, cpf, endereço, telefone, idade, sexo);
    }

    @Override
    public String toString() {
        return "Médico{"+  super.toString() + "\n" +  '}';
    }

    
    
    
    
}
