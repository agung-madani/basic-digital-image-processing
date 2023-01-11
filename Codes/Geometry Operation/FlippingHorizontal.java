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
public class FlippingHorizontal {

    public static void main(String[] args) throws IOException {
        // Read the input image file and store it in a BufferedImage object
        BufferedImage img1 = ImageIO.read(new File("Z:\\citraJava\\lena.jpg"));

        // Get the width and height of the image
        int width = img1.getWidth();
        int height = img1.getHeight();

        // Create a new BufferedImage object with the same width and height as the input image
        BufferedImage img2 = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // Iterate over all the pixels in the image
        for (int x = 0; x < height; x++) {
            // Initialize k as the width of the image minus 1
            int k = width - 1;
            for (int y = 0; y < width; y++) {
                // Extract red, green and blue color values using bitwise operations
                int r = (img1.getRGB(y, x) >> 16) & 0xFF;
                int g = (img1.getRGB(y, x) >> 8) & 0xFF;
                int b = img1.getRGB(y, x) & 0xFF;

                // Create a new pixel value with the extracted color values
                int pixelNew = (r << 16) | (g << 8) | b;

                // Set the pixel in the new image at the coordinates (k, x) with the new pixel value
                // So for every x,y in original it is saved in k,x in new image 
                // k is calculated as height -1 to reverse the y axis.
                img2.setRGB(k, x, pixelNew);
                
                // Decrement k by 1
                k--;
            }
        }
        // save modified image to file
        ImageIO.write(img2, "jpg", new File("Z:\\citraJava\\FlippingHorizontalTest2.jpg"));
    }
}
