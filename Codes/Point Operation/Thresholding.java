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
public class Thresholding {

    public static void main(String[] args) throws IOException {
        // Read the input image file and store it in a BufferedImage object
        BufferedImage img = ImageIO.read(new File("Z:\\citraJava\\lenaColor.jpg"));

        // get image's width and height
        int width = img.getWidth();
        int height = img.getHeight();

        // threshold value
        int threshold = 128;

        // apply threshold filter to each pixel in the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                //get RGB value of the current pixel
                int r = (img.getRGB(x, y) >> 16) & 0xff;
                int g = (img.getRGB(x, y) >> 8) & 0xff;
                int b = img.getRGB(x, y) & 0xff;

                // Compute grayscale value
                int graysc = (int) (0.299 * r) + (int) (0.587 * g) + (int) (0.114 * b);

                // thresholding the grayscale value
                graysc = graysc < threshold ? 0 : 255;

                // Create new RGB value
                int pixelNew = (graysc << 16) | (graysc << 8) | graysc;

                // set the new RGB value to current pixel
                img.setRGB(x, y, pixelNew);
            }
        }
        // save modified image to file
        ImageIO.write(img, "jpg", new File("Z:\\citraJava\\ThresholdTest.jpg"));
    }
}
