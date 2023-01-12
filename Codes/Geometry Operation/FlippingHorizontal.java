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

    public static void main(String[] args) throws IOException {
        // Read the input image file and store it in a BufferedImage object
        BufferedImage img1 = ImageIO.read(new File("Z:\\citraJava\\lena.jpg"));

        int width = img1.getWidth();
        int height = img1.getHeight();

        BufferedImage img2 = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Color c = new Color(img1.getRGB(x, y));
                img2.setRGB(width-1-x, y, c.getRGB());
            }
        }
        // save modified image to file
        ImageIO.write(img2, "jpg", new File("Z:\\citraJava\\FlippingHorizontalTest2.jpg"));
    }
}
