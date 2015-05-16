package br.com.academiavit.test;

import org.junit.Test;

import br.com.academiavit.util.HibernateUtil;

public class GerarTabelasTest {
	@Test
	public void gerar() {
		HibernateUtil.getSessionFactory();
		HibernateUtil.getSessionFactory().close();
	}
}