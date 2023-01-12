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
public class Translasi {

    public static void main(String[] args) throws IOException {
        // Read the input image file and store it in a BufferedImage object
        BufferedImage img1 = ImageIO.read(new File("Z:\\citraJava\\The-original-cameraman-image.png"));

        // Get the width and height of the image
        int width = img1.getWidth();
        int height = img1.getHeight();

        //create new image with same dimension and type as original image
        BufferedImage img2 = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // Adjust translasi value
        int xTranslasi = -100;
        int yTranslasi = 100;

        //iterate through all pixels on the original image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                //get the color of the pixel at (x, y) on the original image
                Color c = new Color(img1.getRGB(x, y));

                //calculate the new coordinates of the pixel
                int xNew = x + xTranslasi;
                int yNew = y + yTranslasi;
                
                // check if the new position is within the bounds of the image
                if ((xNew >= 0 && xNew < width) && (yNew >= 0 && yNew < height)) {
                    //set the color of the pixel at new coordinate on the new image
                    img2.setRGB(xNew, yNew, c.getRGB());
                }
            }
        }
        // save modified image to file
        ImageIO.write(img2, "jpg", new File("Z:\\citraJava\\TranslasiTest.jpg"));
    }
}
