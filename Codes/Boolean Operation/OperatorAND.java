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
public class OperatorAND {

    public static void main(String[] args) throws Exception {
        // Read the input two images file and store it in a BufferedImage object
        BufferedImage img1 = ImageIO.read(new File("Z:\\citraJava\\peppers_fake.png"));
        BufferedImage img2 = ImageIO.read(new File("Z:\\citraJava\\peppers.png"));

        // Loop through all pixels in the images
        for (int x = 0; x < (img1.getWidth()); x++) {
            for (int y = 0; y < (img1.getHeight()); y++) {
                // get the pixel value of the pixel at (x, y) in img1 and img2
                int c1 = img1.getRGB(x, y);
                int c2 = img2.getRGB(x, y);

                // perform bitwise AND operation between the two pixel values
                int cNew = (c1 & c2);

                // set pixel at (x, y) to new pixel value
                img1.setRGB(x, y, cNew);
            }
        }
        // save modified img to file
        ImageIO.write(img1, "jpg", new File("Z:\\citraJava\\ANDTwoImagesTest.jpg"));
    }
}
