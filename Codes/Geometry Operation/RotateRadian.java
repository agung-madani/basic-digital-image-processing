/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author agung
 */
public class RotateRadian {

    public static void main(String[] args) throws Exception {
// Read the input image file and store it in a BufferedImage object
        BufferedImage img1 = ImageIO.read(new File("Z:\\citraJava\\The-original-cameraman-image.png"));

        int width = img1.getWidth();
        int height = img1.getHeight();

        // Calculate the center coordinates of the original image
        int midx = (width / 2);
        int midy = (height / 2);

        // Width and height of new image
        int widthNew = 1000; // must bigger than original image, recommend twice bigger
        int heightNew = 1000; // must bigger than original image, recommend twice bigger

        // Create a new BufferedImage with new width and height, with a different image type (TYPE_INT_RGB)
        BufferedImage img2 = new BufferedImage(widthNew, heightNew, BufferedImage.TYPE_INT_RGB);

        // Calculate the center coordinates of new image
        int midNewx = (widthNew / 2);
        int midNewy = (heightNew / 2);
        
        int degree = 60; // adjust degree of rotation here

        // Iterate over the pixels of the original image
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color c = new Color(img1.getRGB(i, j));

                // use rotation formula in radian to calculate new x and y coordinates
                double x = (i - midx) * Math.cos(Math.toRadians(degree)) + (j - midy) * Math.sin(Math.toRadians(degree));
                double y = -(i - midx) * Math.sin(Math.toRadians(degree)) + (j - midy) * Math.cos(Math.toRadians(degree));

                // cast double to int
                int xNew = (int) (Math.round(x + midNewx));
                int yNew = (int) (Math.round(y + midNewy));

                // check if the new pixel coordinate is still within the new image's boundary
                if (xNew >= 0 && xNew < widthNew && yNew >= 0 && yNew < heightNew) {
                    // set pixel in new image at the calculated coordinates (xNew, yNew) with the same color as the original pixel
                    img2.setRGB(xNew, yNew, c.getRGB());
                }
            }
        }
        // save modified image to file
        ImageIO.write(img2, "jpg", new File("Z:\\citraJava\\RotateRadianTest.jpg"));
    }
}
