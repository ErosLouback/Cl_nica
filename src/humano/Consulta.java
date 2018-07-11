package humano;
public class Consulta {
    private String data,horário,duração;
    private Paciente paciente;

    public Consulta(String data, String horário, String duração, Paciente paciente) {
        this.data = data;
        this.horário = horário;
        this.duração = duração;
        this.paciente = paciente;
    }

    public String getData() {
        return data;
    }

    public String getHorário() {
        return horário;
    }

    public String getDuração() {
        return duração;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    @Override
    public String toString() {
        return "Consulta{" + "data: " + data + ", horário: " + horário + ", duração: " + duração + ", paciente: \n\n" + paciente.toString() + '}';
    }
    
    
    
    
    
    
}
