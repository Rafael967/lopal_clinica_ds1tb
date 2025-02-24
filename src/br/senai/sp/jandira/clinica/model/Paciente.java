package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {

	public String nome;
	public String cpf;
	private double altura;
	public double peso;
	public String telefone;
	public LocalDate dataNascimento;
	
	public void setAltura(double altura) {
		
		if (altura > 0) {
			//TRUE
			this.altura = altura;
		} else {
			//FALSE
			System.out.println("Aaltura deve ser maior que zero!");
		
		}
		
		
	}
	
	public void mostrarDados() {
		System.out.println("-----------------------");
		System.out.println("DADOS DO PACIENTE");
		System.out.println("Nome: " + nome);
		System.out.println("Peso: " + peso + "kgs");
		System.out.println("Altura: " + altura + "m");
		System.out.println("CPF: " + cpf);
		System.out.println("-----------------------");
		System.out.println();
				
	}
	
}
