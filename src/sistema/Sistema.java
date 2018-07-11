package sistema;

import humano.*;
import java.util.*;

public class Sistema {

    private Médico m1;
    private Recepcionista f1;
    private ArrayList<Paciente> cadastro;
    private ArrayList<Consulta> listaConsultas;

    public Sistema() {
        this.cadastro = new ArrayList();
        this.listaConsultas = new ArrayList();
        this.m1 = new Médico("11", "Carmolina", "123", "Rua 7", "38964", "86", "F");
        this.f1 = new Recepcionista("22", "Carlota Joaquina", "345", "Rua 10", "91567062", "19", "F");
    }

    public void CadastrarPacientes(Paciente p1) {
        cadastro.add(p1);
    }

    public boolean VerificarSeExistePaciente(String cpf) {
        int i;
        for (i = 0; i < cadastro.size(); i++) {
            if (cadastro.get(i).getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public void AdicionarConsultas(Consulta c1) {
        listaConsultas.add(c1);
    }

    public void DesmarcarConsulta(String cpf) {
        int i;
        for (i = 0; i < listaConsultas.size(); i++) {
            if (listaConsultas.get(i).getPaciente().getCpf().equals(cpf)) {
                listaConsultas.remove(listaConsultas.get(i));
            }
        }
    }
    
    public void PrescreverMedicamento(String cpf, Receita r){
        int i;
        for (i = 0; i < listaConsultas.size(); i++) {
            if (listaConsultas.get(i).getPaciente().getCpf().equals(cpf)) {
                listaConsultas.get(i).getPaciente().setR(r);
            }
        }
    }

    public boolean VerificarDisponibilidadeConsulta(Consulta c1, String horário) {
        int i, hora, duração, horaNova, aux = 0;
        for (i = 0; i < listaConsultas.size(); i++) {
            hora = Integer.parseInt(listaConsultas.get(i).getHorário());
            duração = Integer.parseInt(listaConsultas.get(i).getDuração());
            horaNova = Integer.parseInt(horário);
            if (hora + duração <= horaNova) {
                aux = 1;
            } else {
                aux = 0;
            }
        }
        if (aux == 1) {
            return true;
        } else {
            return false;
        }

    }

    public ArrayList<Consulta> getListaConsultas() {
        return listaConsultas;
    }

    public ArrayList<Paciente> getCadastro() {
        return cadastro;
    }

    public void setCadastro(ArrayList<Paciente> cadastro) {
        this.cadastro = cadastro;
    }

    public Médico getM1() {
        return m1;
    }

    public Recepcionista getF1() {
        return f1;
    }

}
