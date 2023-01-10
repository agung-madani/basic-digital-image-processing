/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author agung
 */
public class DivisionScalar {

    public static void main(String[] args) throws Exception {
        // Read the input image file and store it in a BufferedImage object
        BufferedImage img = ImageIO.read(new File("Z:\\citraJava\\girl.jpg"));

        // Loop through all pixels in the image
        for (int x = 0; x < img.getWidth(); x++) {
            for (int y = 0; y < img.getHeight(); y++) {
                // Scalar Value to adjust the brightness
                double c = 1.5;

                // Extract the red, green and blue values for the pixel
                int r = (img.getRGB(x, y) >> 16) & 0xFF;
                int g = (img.getRGB(x, y) >> 8) & 0xFF;
                int b = (img.getRGB(x, y)) & 0xFF;

                // Calculate the new red, green and blue values for the pixel using division by scalar
                int rNew = (int) (Math.abs(r / (double) c));
                int gNew = (int) (Math.abs(g / (double) c));
                int bNew = (int) (Math.abs(b / (double) c));

                // Ensure that the RGB values are within the valid range (0-255)
                rNew = Math.max(0, Math.min(rNew, 255));
                gNew = Math.max(0, Math.min(gNew, 255));
                bNew = Math.max(0, Math.min(bNew, 255));

                // Create a new pixel using the new RGB values
                int pixelNew = (rNew << 16) | (gNew << 8) | bNew;

                // Set the new pixel in the image
                img.setRGB(x, y, pixelNew);
            }
        }
        // save modified image to file
        ImageIO.write(img, "jpg", new File("Z:\\citraJava\\DivisionScalarTest.jpg"));
    }
}
