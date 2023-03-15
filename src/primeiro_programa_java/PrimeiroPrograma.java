package primeiro_programa_java;

import java.util.Objects;

public class PrimeiroPrograma {

	private String nome;
	private String cor;
	private Integer idadde;
	
	public PrimeiroPrograma() {}
	
	public PrimeiroPrograma(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idadde = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdadde() {
		return idadde;
	}

	public void setIdadde(Integer idadde) {
		this.idadde = idadde;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idadde, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrimeiroPrograma other = (PrimeiroPrograma) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idadde, other.idadde)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "PrimeiroPrograma [nome=" + nome + ", cor=" + cor + ", idadde=" + idadde + "]";
	}
	
}
