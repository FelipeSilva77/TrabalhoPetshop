package calculoDeAtendimentos;

import interfaces.CalculoAtendimento;

public class CalculoAtendimentoGato implements CalculoAtendimento{

	@Override
	public double calculoTosa(double tamanho) {
		return tamanho * 2.0;
	}

	@Override
	public double calculoBanho(double tamanho) {
		return tamanho * 1.5;
	}

}
