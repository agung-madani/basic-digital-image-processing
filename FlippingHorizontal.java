/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author agung
 */
public class FlippingHorizontal {
    public static void main(String[] args) {
        try {
            // Read the input image file and store it in a BufferedImage object
            BufferedImage img1 = ImageIO.read(new File("Z:\\citraJava\\lena.jpg"));

            // Get the width and height of the image
            int width = img1.getWidth();
            int height = img1.getHeight();

            // Create a new BufferedImage object with the same width and height as the input image
            BufferedImage img2 = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

            // Iterate over all the pixels in the image
            for (int i = 0; i <= height - 1; i++) {
                // Initialize k as the width of the image minus 1
                int k = width - 1;
                for (int j = 0; j <= width - 1; j++) {
                    // Get the color of the pixel at (j, i) in the input image
                    Color c = new Color(img1.getRGB(j, i));
                    
                    // Set the pixel at (k, i) in the output image to the same color
                    img2.setRGB(k, i, c.getRGB());
                    
                    // Decrement k by 1
                    k -= 1;
                }
            }
            // save modified image to file
            ImageIO.write(img2, "jpg", new File("Z:\\citraJava\\FlippingHorizontalTest.jpg"));
        } catch (IOException e) {
            // Handle exception if image cannot be read from file
        }
    }
}
