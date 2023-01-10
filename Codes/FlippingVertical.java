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
public class FlippingVertical {
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
            for (int i = 0; i <= width - 1; i++) {
                // Initialize k as the height of the image minus 1
                int k = height - 1;
                for (int j = 0; j <= height - 1; j++) {
                    // Get the color of the pixel at (i, j) in the input image
                    Color c = new Color(img1.getRGB(i, j));
                    
                    // Set the pixel at (i, k) in the output image to the same color
                    img2.setRGB(i, k, c.getRGB());
                    
                    // Decrement k by 1
                    k -= 1;
                }
            }
            // Save the modified image to a file
            ImageIO.write(img2, "jpg", new File("Z:\\citraJava\\FlippingVerticalTest.jpg"));
        } catch (IOException e) {
            // Handle exception if image cannot be read from file
        }
    }
}
