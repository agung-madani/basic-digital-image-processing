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
public class ZoomIn {

    public static void main(String[] args) throws IOException {
        // Read the input image file and store it in a BufferedImage object
        BufferedImage img1 = ImageIO.read(new File("Z:\\citraJava\\1970s-1980s-san-francisco.jpg"));

        // Get the width and height of the image
        int width = img1.getWidth();
        int height = img1.getHeight();

        // Adjust zoom value
        int zoom = 2;

        //create new image with same type as original image and dimension width*zoom and height*zoom
        BufferedImage img2 = new BufferedImage(width * zoom, height * zoom, BufferedImage.TYPE_INT_RGB);

        //iterate through all pixels on the original image
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                // get the color of the pixel at (x, y) on the original image
                Color c = new Color(img1.getRGB(x, y));
                //set the color of the new image on the zoomed position
                for (int i = 0; i < zoom; i++) {
                    for (int j = 0; j < zoom; j++) {
                        int xx = x * zoom + i;
                        int yy = y * zoom + j;
                        if (xx >= 0 && xx < width * zoom && yy >= 0 && yy < height * zoom) {
                            img2.setRGB(xx, yy, c.getRGB());
                        }
                    }
                }
            }
        }
        // save modified image to file
        ImageIO.write(img2, "jpg", new File("Z:\\citraJava\\ZoomInTest.jpg"));

    }
}
