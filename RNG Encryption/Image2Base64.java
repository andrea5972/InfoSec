/*
    Author: Andrea Murphy
    encoded .PNG to a byte aray
    by using Base64
*/

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

import java.util.Base64;

public class Image2Base64
{
    public static void main(String args[])throws IOException
    {
        String dirName="Users/andreamurphy/Desktop/workspace/html/InfoSec.png";
        try
        {
            BufferedImage image = ImageIO.read(new File("lava.png"));
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(image, "png", baos);
             String encodedImage = new String(Base64.getEncoder().encode(baos.toByteArray()));
            System.out.println(encodedImage);
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}



