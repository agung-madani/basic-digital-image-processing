/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
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
public class Konvolusi {

    public static void main(String[] args) throws IOException {
        // Read the input image file and store it in a BufferedImage object
        BufferedImage img = ImageIO.read(new File("Z:\\citraJava\\lena.jpg"));

        // get image's width and height
        int width = img.getWidth();
        int height = img.getHeight();

        // define values for convolution kernel
        int n1 = -1;
        int n2 = -1;
        int n3 = -1;
        int n4 = -1;
        int n5 = 9;
        int n6 = -1;
        int n7 = -1;
        int n8 = -1;
        int n9 = -1;

        // calculate divider value for kernel
        double divider = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9;
        // if divider is 0, set it to 1 to avoid dividing by 0
        if (divider == 0) {
            divider = 1;
        }

        // apply convolution operation to each pixel in the image
        for (int y = 1; y < height - 1; y++) {
            for (int x = 1; x < width - 1; x++) {
                // get RGB values for current pixel and its 8 neighbors
                int p1 = img.getRGB(x - 1, y - 1);
                int p2 = img.getRGB(x, y - 1);
                int p3 = img.getRGB(x + 1, y - 1);
                int p4 = img.getRGB(x - 1, y);
                int p5 = img.getRGB(x, y);
                int p6 = img.getRGB(x + 1, y);
                int p7 = img.getRGB(x - 1, y + 1);
                int p8 = img.getRGB(x, y + 1);
                int p9 = img.getRGB(x + 1, y + 1);

                // get red, green, and blue values for current pixel
                int r = (p5 >> 16) & 0xFF;
                int g = (p5 >> 8) & 0xFF;
                int b = p5 & 0xFF;

                // get red, green, and blue values for current pixel's neighbors
                int r1 = (p1 >> 16) & 0xFF;
                int r2 = (p2 >> 16) & 0xFF;
                int r3 = (p3 >> 16) & 0xFF;
                int r4 = (p4 >> 16) & 0xFF;
                int r5 = (p5 >> 16) & 0xFF;
                int r6 = (p6 >> 16) & 0xFF;
                int r7 = (p7 >> 16) & 0xFF;
                int r8 = (p8 >> 16) & 0xFF;
                int r9 = (p9 >> 16) & 0xFF;

                int g1 = (p1 >> 8) & 0xFF;
                int g2 = (p2 >> 8) & 0xFF;
                int g3 = (p3 >> 8) & 0xFF;
                int g4 = (p4 >> 8) & 0xFF;
                int g5 = (p5 >> 8) & 0xFF;
                int g6 = (p6 >> 8) & 0xFF;
                int g7 = (p7 >> 8) & 0xFF;
                int g8 = (p8 >> 8) & 0xFF;
                int g9 = (p9 >> 8) & 0xFF;

                int b1 = p1 & 0xFF;
                int b2 = p2 & 0xFF;
                int b3 = p3 & 0xFF;
                int b4 = p4 & 0xFF;
                int b5 = p5 & 0xFF;
                int b6 = p6 & 0xFF;
                int b7 = p7 & 0xFF;
                int b8 = p8 & 0xFF;
                int b9 = p9 & 0xFF;

                // calculate new red, green, and blue values using convolution kernel
                int rNew = (int) (((n1 * r1) + (n2 * r2) + (n3 * r3) + (n4 * r4) + (n5 * r5) + (n6 * r6) + (n7 * r7) + (n8 * r8) + (n9 * r9)) / divider);
                int gNew = (int) (((n1 * g1) + (n2 * g2) + (n3 * g3) + (n4 * g4) + (n5 * g5) + (n6 * g6) + (n7 * g7) + (n8 * g8) + (n9 * g9)) / divider);
                int bNew = (int) (((n1 * b1) + (n2 * b2) + (n3 * b3) + (n4 * b4) + (n5 * b5) + (n6 * b6) + (n7 * b7) + (n8 * b8) + (n9 * b9)) / divider);

                // ensure new values are within valid range (0-255)
                if (rNew < 0 || rNew > 255) {
                    rNew = r;
                }
                if (gNew < 0 || gNew > 255) {
                    gNew = g;
                }
                if (bNew < 0 || bNew > 255) {
                    bNew = b;
                }

                // set new RGB value
                int pixelNew = (rNew << 16) | (gNew << 8) | bNew;

                // set pixel at (x, y) to new pixel value
                img.setRGB(x, y, pixelNew);
            }
        }
        // save modified image to file
        ImageIO.write(img, "jpg", new File("Z:\\citraJava\\KonvolusiTest.jpg"));
    }
}
