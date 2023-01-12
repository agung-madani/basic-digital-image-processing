/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author agung
 */
public class RotateClockWise {

    public static void main(String[] args) throws Exception {
        // Read the input image file and store it in a BufferedImage object
        BufferedImage img1 = ImageIO.read(new File("Z:\\citraJava\\The-original-cameraman-image.png"));

        // Get image's width and height
        int width = img1.getWidth();
        int height = img1.getHeight();

        // Create a new BufferedImage with the same width and height, but with a different image type (TYPE_INT_RGB)
        BufferedImage img2 = new BufferedImage(height, width, BufferedImage.TYPE_INT_RGB);

        // Iterate over the pixels of the original image
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                // get the color of the pixel at (x, y) on the original image
                Color c = new Color(img1.getRGB(x, y));
                //set the color of the pixel at (y, x) on the new image 
                img2.setRGB(height - 1 - y, x, c.getRGB());
            }
        }
        // Save the modified image to file
        ImageIO.write(img2, "jpg", new File("Z:\\citraJava\\RotateCWTest2.jpg"));
    }
}
