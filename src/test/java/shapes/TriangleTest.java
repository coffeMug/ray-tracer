package shapes;

import domain.IntersectInfo;
import domain.Vector;
import exceptions.InvalidPixelException;
import junit.framework.TestCase;
import domain.Ray;
import org.junit.Test;


import materials.SolidMaterial;

public class TriangleTest extends TestCase  {

	private transient Vector pVect;
	//private transient Vector nVect;
	private transient Vector rlVect;
	private transient Vector llVect;
	private transient Vector wllVect;
	private transient Vector wrlVect;
	private transient Vector roVect;
//	private transient Vector rdVect;



	//	private transient Triangle wrongTriangle;
//	private transient Plane testPlane;
	private transient SolidMaterial  solid;

	public void setUp() throws Exception {

		pVect  = new Vector(4,4,0);
		//	nVect  = new Vector(0,0,2);
		rlVect = new Vector(4,0,4);
		llVect = new Vector(0,4,4);
		roVect = new Vector(0,0,0);
//		rdVect = new Vector(-2,2,-2);
		wllVect = new Vector(5,5,0);
		wrlVect = new Vector(3,3,0);

	}

	@Test
	public void testIntersect() throws InvalidPixelException {

		Ray testRay;
		Triangle testTriangle;
		testTriangle = new Triangle(pVect,llVect,rlVect,solid);
		testRay = new Ray(roVect,rlVect.crossProduct(llVect));

		//IntersectionPoint planeTestInfo = testPlane.Intersect(testRay);
		final IntersectInfo triangleTestInfo = testTriangle.intersect(testRay);

		//assertTrue(planeTestInfo.position.equals(triangleTestInfo.position));
		assertTrue(triangleTestInfo.getIsHit() != null);

	}

/*	@Test
	public void testTriangleTest(){
		assertFalse(Triangle.triangleTest(pVect,wllVect,wrlVect));
	}*/

}