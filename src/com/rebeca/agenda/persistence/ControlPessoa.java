package com.rebeca.agenda.persistence;

import java.util.ArrayList;
import java.util.List;

import com.rebeca.agenda.domain.Pessoa;

public class ControlPessoa {

	private static int ultimoCodigo = 0;
	private static List<Pessoa> pessoas = new ArrayList<>();

	public static void adiciona(Pessoa pessoa) {

		ultimoCodigo++;
		pessoa.setCodigo(ultimoCodigo);
		pessoas.add(pessoa);
	}

	public static Pessoa get(int posicao) {

		return pessoas.get(posicao);
	}

	public static int getUltimaPosicao() {

		return pessoas.size() - 1;
	}

	public static int getUltimoContato() {

		return ultimoCodigo - 1;
	}

	public static void apaga(Pessoa pessoa) {
		
		pessoas.remove(pessoa);
	}

}
