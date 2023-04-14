package rrdesenvolvedor.gof;

import rrdesenvolvedor.gof.singleton.SingletonEager;
import rrdesenvolvedor.gof.singleton.SingletonLazy;
import rrdesenvolvedor.gof.singleton.SingletonLazyHolder;
import rrdesenvolvedor.gof.strategy.Comportamento;
import rrdesenvolvedor.gof.strategy.ComportamentoAgressivo;
import rrdesenvolvedor.gof.strategy.ComportamentoDefensivo;
import rrdesenvolvedor.gof.strategy.ComportamentoNormal;
import rrdesenvolvedor.gof.strategy.Robo;
import rrdesenvolvedor.gof.facade.Facade;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();	
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();	
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();	
		System.out.println(eager);
		eager = SingletonEager.getInstancia();	
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();	
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();	
		System.out.println(lazyHolder);
		
		//Strategy		
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);		
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);		
		robo.mover();
		robo.mover();
		robo.mover();
		robo.setComportamento(agressivo);		
		robo.mover();
		robo.mover();
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		
		Facade facade = new Facade();
		facade.migrarCliente("Rodolfo", "13860000");
	}
}
