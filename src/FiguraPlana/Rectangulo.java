package FiguraPlana;
/**
* Esta clase define el objeto Rectangulo que hereda de figura plana
* y calcula su area. 
* @author: Adrian Suaza
* @version: 20/12/2019/A
* @see <a href = "https://github.com/adri-sm01/Javadoc" /> Enlace al repositiorio Git </a>
*/
class Rectangulo extends FiguraPlana
{
	/**
	 * Constructor para Rectangulo.
	 * @param base guarda la base del Rectangulo.
	 * @param altura guarda la altura del Rectangulo.
	 * */
	public Rectangulo (double base, double altura)
	{
		super(base,altura);
	}
	/**
	 * Metodo que devuelve el area calculada con la base  la altura.
	 * @return la base del Rectangulo
	 * */
    public double area()
    {
    	return getBase()*getAltura();
    }
}