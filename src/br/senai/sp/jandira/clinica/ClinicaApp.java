package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class ClinicaApp {

	public static void main(String[] args) {
		
		// Criar um objeto do tipo Paciente
		Paciente p1 = new Paciente();
		p1.nome = "Ana Maria";
		p1.cpf = "999.888.666-77";
		p1.setAltura(1.63);
		p1.peso = 75.490;
		p1.telefone = "(11) 96523-8888";
		p1.dataNascimento = LocalDate.of(2003,8,16);
		
		
		Paciente p2 = new Paciente();
		p2.nome = "Rafael Gonçalves";
		p2.cpf = "676.878.999.45";
		p2.setAltura(1.75);
		p2.peso = 98;
		p2.telefone = "(11) 97787-8877";
		p2.dataNascimento = LocalDate.of(1983, 8,17);
		
		p1.mostrarDados();
		p2.mostrarDados();
	}

}
