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
public class RotateClockWise {

    public static void main(String[] args) throws Exception {
        // Read the input image file and store it in a BufferedImage object
        BufferedImage img1 = ImageIO.read(new File("Z:\\citraJava\\The-original-cameraman-image.png"));

        // Get image's width and height
        int width = img1.getWidth();
        int height = img1.getHeight();

        // Create a new BufferedImage with the same width and height, but with a different image type (TYPE_INT_RGB)
        BufferedImage img2 = new BufferedImage(height, width, BufferedImage.TYPE_INT_RGB);

        // Iterate over the pixels of the original image
        for (int x = 0; x < width; x++) {
            int k = height - 1;
            for (int y = 0; y < height; y++) {
                // Extract red, green and blue color values using bitwise operations
                int r = (img1.getRGB(x, y) >> 16) & 0xFF;
                int g = (img1.getRGB(x, y) >> 8) & 0xFF;
                int b = img1.getRGB(x, y) & 0xFF;

                // Create a new pixel value with the extracted color values
                int pixelNew = (r << 16) | (g << 8) | b;

                // Set the pixel in the new image at the coordinates (k, x) with the new pixel value
                // So for every x,y in original it is saved in k,x in new image 
                // k is calculated as height -1 to reverse the y axis.
                img2.setRGB(k, x, pixelNew);
                k--;
            }
        }
        // Save the modified image to file
        ImageIO.write(img2, "jpg", new File("Z:\\citraJava\\RotateCWTest.jpg"));
    }
}