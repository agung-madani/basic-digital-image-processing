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
public class AdditionTwoImages {

    public static void main(String[] args) throws Exception {
        // Read the input two imgs file and store it in a BufferedImage object
        BufferedImage img1 = ImageIO.read(new File("Z:\\citraJava\\peppers_fake.png"));
        BufferedImage img2 = ImageIO.read(new File("Z:\\citraJava\\peppers.png"));

        // Loop through all pixels in the imgs
        for (int x = 0; x < (img1.getWidth()); x++) {
            for (int y = 0; y < (img1.getHeight()); y++) {
                // Extract the red, green and blue values for the first image
                int r1 = (img1.getRGB(x, y) >> 16) & 0xFF;
                int g1 = (img1.getRGB(x, y) >> 8) & 0xFF;
                int b1 = (img1.getRGB(x, y)) & 0xFF;

                // Extract the red, green and blue values for the second image
                int r2 = (img2.getRGB(x, y) >> 16) & 0xFF;
                int g2 = (img2.getRGB(x, y) >> 8) & 0xFF;
                int b2 = (img2.getRGB(x, y)) & 0xFF;

                // Calculate the new red, green and blue values for the pixel by addition
                int rNew = (r2 + r1);
                int gNew = (g2 + g1);
                int bNew = (b2 + b1);

//                Ensure that the RGB values are within the valid range (0-255)
                rNew = Math.min(rNew, 255);
                gNew = Math.min(gNew, 255);
                bNew = Math.min(bNew, 255);

                // create new pixel with negative red, green, and blue values
                int pixelNew = (rNew << 16) | (gNew << 8) | bNew;

                // set pixel at (x, y) to new pixel value
                img1.setRGB(x, y, pixelNew);
            }
        }
        // save modified img to file
        ImageIO.write(img1, "jpg", new File("Z:\\citraJava\\AdditionTwoImagesTest.jpg"));
    }
}
