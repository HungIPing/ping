package util;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Util {

	public static BufferedImage loadBufferedImage(String imgPath) {
		try {
			return ImageIO.read(new FileInputStream(imgPath));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
