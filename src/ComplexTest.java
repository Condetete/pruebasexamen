
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
;

/**
 *
 * @author Alumno Mañana
 */
public class ComplexTest {

	public ComplexTest() {
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	/**
 * Test of getImag method, of class Complex.
 */
 @Test
 public void testGetImag() {
 System.out.println("getImagsssss");
 Complex instance = new Complex();
 double expResult = 2.2;
 double result = instance.getImag();
 assertEquals(expResult, result, 2.2);
 // TODO review the generated test code and remove the default callto fail.
 //fail("The test case is a prototype.");
 }

	/**
 * Test of setImag method, of class Complex.
 */
 @Test
 public void testSetImag() {
 System.out.println("setImag");
 double imag = 0.0;
 Complex instance = new Complex();
 instance.setImag(imag);
 // TODO review the generated test code and remove the default call

 //fail("The test case is a prototype.");
 }

	/**
 * Test of getReal method, of class Complex.
 */
 @Test
 public void testGetReal() {
 System.out.println("getReal");
 Complex instance = new Complex();
 double expResult = 2.1;
 double result = instance.getReal();
 assertEquals(expResult, result, 2.1);
 // TODO review the generated test code and remove the default call

//fail("The test case is a prototype.");
}

/**
* Test of setReal method, of class Complex.
*/
@Test
public void testSetReal() {
System.out.println("setReal");
double real = 1.1;
Complex instance = new Complex();
instance.setReal(real);
// TODO review the generated test code and remove the default callto fail.
//fail("The test case is a prototype.");
}

/**
* Test of sumar method, of class Complex.
*/
@Test
public void testSumar() {
System.out.println("sumar");
Complex c = new Complex(5.5,2.1);
Complex instance = new Complex(5.5,2.1);
Complex expResult = new Complex(11,4.2);
Complex result = instance.sumar(c);
assertEquals(expResult, result);
// TODO review the generated test code and remove the default callto fail.
//fail("The test case is a prototype.");
}

/**
* Test of restar method, of class Complex.
*/
@Test
public void testRestar() {
System.out.println("restar");
Complex c = new Complex(10.5,2.1);
Complex instance = new Complex(5.5,1.1);
Complex expResult = new Complex(-5.0,-1.0);
Complex result = instance.restar(c);
assertEquals(expResult, result);
// TODO review the generated test code and remove the default callto fail.
// fail("The test case is a prototype.");
}

/**
* Test of multiplicar method, of class Complex.
*/
@Test
public void testMultiplicar_Complex() {
System.out.println("multiplicar");
Complex c = new Complex(5.0,3.0);
Complex instance = new Complex(2.0,6.0);
Complex expResult = new Complex(-8.0,36.0);
Complex result = instance.multiplicar(c);
assertEquals(expResult, result);
// TODO review the generated test code and remove the default callto fail.
//fail("The test case is a prototype.");
}

/**
* Test of multiplicar method, of class Complex.
*/
@Test
public void testMultiplicar_double() {
System.out.println("multiplicar");
double n = 8.2;
Complex instance = new Complex(4.0,2.0);
Complex expResult = new Complex(32.8,16.4);;
Complex result = instance.multiplicar(n);
assertEquals(expResult, result);
// TODO review the generated test code and remove the default callto fail.
//fail("The test case is a prototype.");
}

/**
* Test of dividir method, of class Complex.
 */
 @Test
 public void testDividir() {
 System.out.println("dividir");
 Complex c = new Complex(10.0,10.0);
 Complex instance = new Complex(100.0,100.0);
 Complex expResult = new Complex(10.0,0.0);
 Complex result = instance.dividir(c);
 assertEquals(expResult, result);
 // TODO review the generated test code and remove the default callto fail.
 //fail("The test case is a prototype.");
 }

	/**
 * Test of toString method, of class Complex.
 */
 @Test
 public void testToString() {
 System.out.println("toString");
 Complex instance = new Complex(20.3,2.1);
 String expResult = "(20.3, 2.1)";
 String result = instance.toString();
 assertEquals(expResult, result);
 // TODO review the generated test code and remove the default callto fail.
 //fail("The test case is a prototype.");
 }

	/**
 * Test of equals method, of class Complex.
 */
 @Test
 public void testEquals() {
 System.out.println("equals");
 Object obj = new Complex(10.1,3.1);
 Complex instance = new Complex(4.1,2.1);
 boolean expResult = false;
 boolean result = instance.equals(obj);
 assertEquals(expResult, result);
 // TODO review the generated test code and remove the default callto fail.
 //fail("The test case is a prototype.");
 }

}