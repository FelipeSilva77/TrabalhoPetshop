package calculoDeAtendimentos;

import interfaces.CalculoAtendimento;

public class CalculoAtendimentoCachorro implements CalculoAtendimento {

	@Override
	public double calculoTosa(double tamanho) {
		return tamanho * 1.0;
	}

	@Override
	public double calculoBanho(double tamanho) {
		return tamanho * 1.2;
	}

}
