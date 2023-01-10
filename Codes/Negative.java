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
public class Negative {

    public static void main(String[] args) {
        try {
            // Read the input image file and store it in a BufferedImage object
            BufferedImage img = ImageIO.read(new File("Z:\\citraJava\\lenaColor.jpg"));

            // get image's width and height
            int width = img.getWidth();
            int height = img.getHeight();

            // apply negative filter to each pixel in the image
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    // get red, green, and blue values for current pixel
                    int r = (img.getRGB(x, y) >> 16) & 0xff;
                    int g = (img.getRGB(x, y) >> 8) & 0xff;
                    int b = img.getRGB(x, y) & 0xff;

                    // calculate negative values for red, green, and blue
                    int rNew = 255 - r;
                    int gNew = 255 - g;
                    int bNew = 255 - b;

                    // create new pixel with negative red, green, and blue values
                    int pixelNew = (rNew << 16) | (gNew << 8) | bNew;

                    // set pixel at (x, y) to new pixel value
                    img.setRGB(x, y, pixelNew);
                }
            }
            // save modified image to file
            ImageIO.write(img, "jpg", new File("Z:\\citraJava\\NegativeTest.jpg"));
        } catch (IOException e) {
            // Handle exception if image cannot be read from file
        }
    }
}
