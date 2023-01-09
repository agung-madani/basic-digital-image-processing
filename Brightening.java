/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author agung
 */
public class Brightening {
    public static void main(String[] args) {
        try {
            // Read image from file and store in img
            BufferedImage img = ImageIO.read(new File("Z:\\citraJava\\zelda.jpg"));
            
            // Get image's width and height
            int width = img.getWidth();
            int height = img.getHeight();

            // Brightness adjustment value
            int bright = 100; 

            // Loop through each pixel in the image
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    // Get the original values of the pixel
                    int r = (img.getRGB(x, y) >> 16) & 0xff;
                    int g = (img.getRGB(x, y) >> 8) & 0xff;
                    int b = img.getRGB(x, y) & 0xff;

                    // Adjust brightness by adding bright to each component
                    int rNew = r + bright;
                    int gNew = g + bright;
                    int bNew = b + bright;

                    // Ensure that the RGB values are within the valid range (0-255)
                    rNew = Math.max(0, Math.min(rNew, 255));
                    gNew = Math.max(0, Math.min(gNew, 255));
                    bNew = Math.max(0, Math.min(bNew, 255));
                    
                    // Set new RGB value for the pixel
                    int pixelNew = (rNew << 16) | (gNew << 8) | bNew;
                    img.setRGB(x, y, pixelNew);
                }
            }
            // save modified image to file
            ImageIO.write(img, "jpg", new File("Z:\\citraJava\\brighteningTest.jpg"));
        } catch (IOException e) {
            // Handle exception if image cannot be read from file
        }
    }
}
