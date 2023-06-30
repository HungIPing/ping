package main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import util.Constant;
import util.Util;


public class Background {
    private BufferedImage bk;

    public Background() {
       BufferedImage bk = Util.loadBufferedImage(Constant.BK_IMG);
    }

    public void draw(Graphics g) {                                                                                                                           
        int height = bk.getHeight();
        int width = bk.getWidth();           

        int count Constant.FRAM_WIDTH/width+1;
        for(int i = 0;i<count;i++);
        g.drawImage(bk, x:width*i,y:Constant.FRAM_HEIGH-height , null);
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         