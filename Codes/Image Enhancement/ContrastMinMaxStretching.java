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

public class ContrastMinMaxStretching {

    public static void main(String[] args) {
        try {
            // Read the image file
            BufferedImage img = ImageIO.read(new File("Z:\\citraJava\\zelda.jpg"));
            
            // Get image's width and height
            int width = img.getWidth();
            int height = img.getHeight();

            // Initialize min and max values to the first pixel's values
            int minR = (img.getRGB(0, 0) >> 16) & 0xFF;
            int maxR = minR;
            int minG = (img.getRGB(0, 0) >> 8) & 0xFF;
            int maxG = minG;
            int minB = img.getRGB(0, 0) & 0xFF;
            int maxB = minB;

            // Find the minimum and maximum values of the red, green, and blue components among all the pixels
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    // Get the red, green, and blue components of the pixel
                    int r = (img.getRGB(x, y) >> 16) & 0xFF;
                    int g = (img.getRGB(x, y) >> 8) & 0xFF;
                    int b = img.getRGB(x, y) & 0xFF;
                    
                    // Update the min and max values if necessary
                    minR = Math.min(minR, r);
                    maxR = Math.max(maxR, r);
                    minG = Math.min(minG, g);
                    maxG = Math.max(maxG, g);
                    minB = Math.min(minB, b);
                    maxB = Math.max(maxB, b);
                }
            }
            // Perform contrast stretching on the image
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    // Get the original values of the pixel
                    int r = (img.getRGB(x, y) >> 16) & 0xFF;
                    int g = (img.getRGB(x, y) >> 8) & 0xFF;
                    int b = img.getRGB(x, y) & 0xFF;
                    
                    // Calculate the new values for the red, green, and blue components
                    int rNew = (int) ((double) (r - minR) / (maxR - minR) * 255);
                    int gNew = (int) ((double) (g - minG) / (maxG - minG) * 255);
                    int bNew = (int) ((double) (b - minB) / (maxR - minB) * 255);
                    
                    // Create a new pixel value using the new component values
                    int pixelNew = (rNew << 16) | (gNew << 8) | bNew;
                    
                    // Set the pixel value in the image
                    img.setRGB(x, y, pixelNew);
                }
            }
            // save modified image to file
            ImageIO.write(img, "jpg", new File("Z:\\citraJava\\constrastMinMaxStretchingTest.jpg"));
        } catch (IOException e) {
            // Handle exception if image cannot be read from file
        }
    }
}
