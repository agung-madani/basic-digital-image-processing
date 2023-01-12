/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author agung
 */
public class MirrorXYEqual {

    public static void main(String[] args) throws IOException {
        // Read the input image file and store it in a BufferedImage object
        BufferedImage img1 = ImageIO.read(new File("Z:\\citraJava\\lena.jpg"));

        // get the width and height of the original image
        int width = img1.getWidth();
        int height = img1.getHeight();

        //create new image with same dimension and type as original image
        BufferedImage img2 = new BufferedImage(height, width, BufferedImage.TYPE_INT_RGB);

        //iterate through all pixels on the original image
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                // get the color of the pixel at (x, y) on the original image
                Color c = new Color(img1.getRGB(x, y));
                //set the color of the pixel at (y, x) on the new image 
                img2.setRGB(y, x, c.getRGB());
            }
        }
        // save modified image to file
        ImageIO.write(img2, "jpg", new File("Z:\\citraJava\\MirrorXYEqualTest.jpg"));

    }
}
