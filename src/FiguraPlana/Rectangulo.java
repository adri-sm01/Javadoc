package FiguraPlana;
/**
* Esta clase define el objeto Rectangulo que hereda de figura plana
* y calcula su area. 
* @author: Adrian Suaza
* @version: 20/12/2019/A
* @see <a href = "https://aulavirtual33.educa.madrid.org/ies.goya.madrid/pluginfile.php/10924/mod_resource/content/0/JavaDoc.pdf" /> Documentacion de Javadoc </a>
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