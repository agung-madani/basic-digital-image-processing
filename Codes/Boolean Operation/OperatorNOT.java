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
public class OperatorNOT {

    public static void main(String[] args) throws Exception {
        // Read the input two imgs file and store it in a BufferedImage object
        BufferedImage img = ImageIO.read(new File("Z:\\citraJava\\lenaColor.jpg"));

        // Loop through all pixels in the imgs
        for (int x = 0; x < (img.getWidth()); x++) {
            for (int y = 0; y < (img.getHeight()); y++) {
                // get the pixel value of the pixel at (x, y) in img
                int c1 = img.getRGB(x, y);

                // perform NOT operation
                int cNew = ~c1;

                // set pixel at (x, y) to new pixel value
                img.setRGB(x, y, cNew);
            }
        }
        // save modified img to file
        ImageIO.write(img, "jpg", new File("Z:\\citraJava\\NOTImagesTest.jpg"));
    }
}
