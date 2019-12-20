package FiguraPlana;
/**
* Esta clase define el objeto Triangulo que hereda de figura plana
* y calcula su area. 
* @author: Adrian Suaza
* @version: 20/12/2019/A
* @see <a href = "http://www.aprenderaprogramar.com" /> aprenderaprogramar.com – Didáctica en programación </a>
*/

class Triangulo extends FiguraPlana
{
	/**
	 * Constructor para Triangulo.
	 * @param base guarda la base del triangulo.
	 * @param altura guarda la altura del triangulo.
	 * */
	public Triangulo (double base, double altura)
	{
		super(base,altura);
	}
	/**
	 * Metodo que devuelve el area calculada con la base  la altura.
	 * @return la base del triangulo
	 * */
    public double area()
    {
    	return (getBase()*getAltura())/2;
    }
 
}