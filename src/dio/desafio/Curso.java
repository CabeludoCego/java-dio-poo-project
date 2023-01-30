package dio.desafio;

public class Curso extends Mentoria {

	private int cargaHoraria;

	public int getCargaHoraria() {
		return this.cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}

	@Override
	public String toString() {
		return "{" +
			" titulo='" + getTitulo() + "'" +
			", descricao='" + getDescricao() + "'" +
			", cargaHoraria='" + getCargaHoraria() + "'" +
			"}";
	}

}
