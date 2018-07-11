package humano;
public class Pessoa {
    private String nome,cpf,endereço,telefone;
    private String idade;
    private String sexo;

    public Pessoa(String nome, String cpf, String endereço, String telefone, String idade, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereço = endereço;
        this.telefone = telefone;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

   

   

    @Override
    public String toString() {
        return   "NOME: " + nome + ", CPF: " + cpf + ", ENDEREÇO: " + endereço + ", TELEFONE: " + telefone + ", IDADE: " + idade + ", SEXO: \n" + sexo + '}';
    }
    
    
    
    
}
