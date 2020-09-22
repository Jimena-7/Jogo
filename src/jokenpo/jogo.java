package jokenpo;

public class jogo {

	private int numerousuario;
	private int numerocomputador;
	private String resultado;
	
	

	
	public String status() {
		if (this.numerousuario == 2 && this.numerocomputador == 1) {
			this.resultado = "JOGADOR GANHOU"; 
		}else if (this.numerousuario == 1 && this.numerocomputador == 0) {
			resultado = "JOGADOR GANHOU";
		}else if (this.numerousuario == 0 && this.numerocomputador == 2) {
			resultado = "JOGADOR GANHOU";
		}else if (this.numerousuario == this.numerocomputador) {
			resultado = "EMPATE";
		}else {
			resultado = "COMPUTADOR GANHOU";
		}
		return resultado;
		
	}
	
	
	public int getNumerousuario() {
		return numerousuario;
	}

	public void setNumerousuario(int numerousuario) {
		this.numerousuario = numerousuario;
	}

	public int getNumerocomputador() {
		return numerocomputador;
	}

	public void setNumerocomputador(int numerocomputador) {
		this.numerocomputador = numerocomputador;
	}


	public String getResultado() {
		return resultado;
	}


	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	
	
}
