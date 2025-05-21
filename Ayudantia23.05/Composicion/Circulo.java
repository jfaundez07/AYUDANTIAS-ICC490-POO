package Composicion;

public class Circulo {

	private Punto centro;
	private int radio;

	/**
	 * 
	 * @param x
	 * @param y
	 * @param radio
	 */
	public Circulo(int x, int y, int radio) {
		this.centro = new Punto(x, y);
		this.radio = radio;
	}

	public Circulo() {
		// TODO - implement Circulo.Circulo
		throw new UnsupportedOperationException();
	}

	public void imprimir() {
		// TODO - implement Circulo.imprimir
		throw new UnsupportedOperationException();
	}

	public int getRadio() {
		return this.radio;
	}

	/**
	 * 
	 * @param radio
	 */
	public void setRadio(int radio) {
		this.radio = radio;
	}

}