package bitmap;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import exceptions.InvalidPPMFileException;
import org.junit.Before;
import domain.Color;
import org.junit.Ignore;
import org.junit.Test;

public class BitmapTest {

	private transient Bitmap bmp;
	private transient String ppmFile;

	@Before
	public void setUp() throws InvalidPPMFileException {
		bmp = new Bitmap(0, 0);
		final Scanner keyboard = new Scanner(System.in);
		System.out.println("enter path to a ppm file:\n");
		ppmFile = keyboard.next();
		bmp.createBitmapFromFile(ppmFile);

		int i =1;
	}

	@Ignore
	@Test
	public void writeToFile() throws IOException {
		bmp.writeBitmapToFile(BitmapVariant.PPM_ASCII, "Tempbitmap.PPM");
		//assert(bmp.compareTwoFiles(ppmFile , "Tempbitmap.PPM"));
		final File temp = new File("Tempbitmap.PPM");
		temp.delete();
	}

	@Test
	public void setPixel() throws Exception{

		final Color tempColor = new Color((byte)25,(byte)40,(byte)90);
		bmp.writePixel(3, 2,tempColor );
		assert(tempColor.equals(bmp.readPixel(3, 2)));
	}

}
