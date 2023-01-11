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
public class GrayscaleFormula {

    public static void main(String[] args) throws IOException {
        // Read the input image file and store it in a BufferedImage object
        BufferedImage img = ImageIO.read(new File("Z:\\citraJava\\lenaColor.jpg"));

        // get image's width and height
        int width = img.getWidth();
        int height = img.getHeight();

        // convert to grayscale
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // get red, green, and blue values of pixel at (x, y)
                int r = (img.getRGB(x, y) >> 16) & 0xff;
                int g = (img.getRGB(x, y) >> 8) & 0xff;
                int b = img.getRGB(x, y) & 0xff;

                // calculate grayscale value using formula
                int avg = (int) (0.299 * r) + (int) (0.587 * g) + (int) (0.114 * b);

                // create new pixel with grayscale value for red, green, and blue channels
                int pixelNew = (avg << 16) | (avg << 8) | avg;

                // set pixel at (x, y) to new pixel value
                img.setRGB(x, y, pixelNew);
            }
        }
        // save modified image to file
        ImageIO.write(img, "jpg", new File("Z:\\citraJava\\GrayscaleFormulaTest.jpg"));
    }
}
