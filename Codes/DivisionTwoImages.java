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
public class DivisionTwoImages {

    public static void main(String[] args) throws Exception {
        // Read the input two images file and store it in a BufferedImage object
        BufferedImage img1 = ImageIO.read(new File("Z:\\citraJava\\cups_three_bw.png"));
        BufferedImage img2 = ImageIO.read(new File("Z:\\citraJava\\cups_one_bw.png"));
        
        // Loop through all pixels in the images
        for (int x = 0; x < img1.getWidth(); x++) {
            for (int y = 0; y < img1.getHeight(); y++) {
                // Get the pixel values for the current position
                int p1 = img1.getRGB(x, y);
                int p2 = img2.getRGB(x, y);

                // Extract the red, green and blue values for the first image
                int r1 = (p1 >> 16) & 0xFF;
                int g1 = (p1 >> 8) & 0xFF;
                int b1 = (p1) & 0xFF;

                // Extract the red, green and blue values for the second image
                int r2 = (p2 >> 16) & 0xFF;
                int g2 = (p2 >> 8) & 0xFF;
                int b2 = (p2) & 0xFF;

                // Calculate the new red, green and blue values for the pixel by division formula
                // 0.1 to prevent error division by zero and get better result
                int rNew = (int) ((((double) r2 / 255) / ((double) r1 / 255 + 0.1)) * 255);
                int gNew = (int) ((((double) g2 / 255) / ((double) g1 / 255 + 0.1)) * 255);
                int bNew = (int) ((((double) b2 / 255) / ((double) b1 / 255 + 0.1)) * 255);

                // Ensure that the RGB values are within the valid range (0-255)
                rNew = Math.max(0, Math.min(rNew, 255));
                gNew = Math.max(0, Math.min(gNew, 255));
                bNew = Math.max(0, Math.min(bNew, 255));

                // create new pixel with negative red, green, and blue values
                int pixelNew = (rNew << 16) | (gNew << 8) | bNew;

                // set pixel at (x, y) to new pixel value
                img1.setRGB(x, y, pixelNew);
            }
        }
        // save modified image to file
        ImageIO.write(img1, "jpg", new File("Z:\\citraJava\\DivisionTwoImagesTest.jpg"));
    }
}
