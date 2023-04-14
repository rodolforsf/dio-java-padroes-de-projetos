package rrdesenvolvedor.gof.singleton;
/**
 * Singleton "apressado".
 * @author rodolforsf
 *
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;	
	}
}
