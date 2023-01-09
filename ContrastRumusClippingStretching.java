/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

public class ContrastRumusClippingStretching {
    public static void main(String[] args) {
        try {
            // Read the image file
            BufferedImage img = ImageIO.read(new File("Z:\\citraJava\\zelda.jpg"));
            
            // Get image's width and height
            int width = img.getWidth();
            int height = img.getHeight();
            
            // Contrast Stretching adjustment values
            int c1 = 50; // start
            int c2 = 150; // end
            
            // Perform contrast stretching on the image
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    // Get the original values of the pixel
                    int r = (img.getRGB(x, y) >> 16) & 0xFF;
                    int g = (img.getRGB(x, y) >> 8) & 0xFF;
                    int b = img.getRGB(x, y) & 0xFF;

                    // Calculate the new values for the red, green, and blue components
                    int rNew = transformColor(r, c1, c2);
                    int gNew = transformColor(g, c1, c2);
                    int bNew = transformColor(b, c1, c2);
                    
                    // Create a new pixel value using the new component values
                    int pixelNew = (rNew << 16) | (gNew << 8) | bNew;
                    
                    // Set the pixel value in the image
                    img.setRGB(x, y, pixelNew);
                }
            }
            // save modified image to file
            ImageIO.write(img, "jpg", new File("Z:\\citraJava\\ContrastFormulaClippingStretchingTest.jpg"));
        } catch (IOException e) {
            // Handle exception if image cannot be read from file
        }
    }
        public static int transformColor(int color, int c1, int c2) {
        if (0 <= color && color < c1) {
            // If the intensity value is between 0 and c1, the new intensity value is equal to 0.
            return (int) (0);
        }
        if (c1 <= color && color < c2) {
            // If the intensity value is between c1 and c2, the new intensity value is equal to 2 times the original value minus c1.
            return (int) (2*(color-c1));
        }
        if (c2 <= color && color < 256) {
            // If the intensity value is between c2 and 256, the new intensity value is equal to 2 times c2 minus c1.
            return (int) (2*(c2-c1));
        }
        return color;
    }
}

