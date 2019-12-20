package FiguraPlana;
import java.io.*;
/**
*  Esta Clase testea el objeto FiguraPlana y los objetos Rectangulo y Triangulo
*  
* @author: Adrian Suaza
* @version: 20/12/2019/A
* @see <a href = "https://github.com/adri-sm01/Javadoc" /> Enlace al repositiorio Git </a>
*/
@SuppressWarnings("unused")
class TestFiguraPlana
{
	/**
	 * Metodo main(principal) crea cada objeto y se le asignan unos datos
	 * el metodo devuelve en pantalla el area de cada figura.
	 * */
	public static void main(String args[])
	{
		Rectangulo r =new Rectangulo(8,5);
		System.out.println("El area del rectangulo "+r.area());
		Triangulo tri =new Triangulo(4,8);
		System.out.println("El area del triangulo "+tri.area());
	}
}