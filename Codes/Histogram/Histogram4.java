/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Histogram4 extends Canvas {

    // Declare arrays for storing histogram data for each color channel
    private final int[] nilaigray;
    private final int[] nilaired;
    private final int[] nilaigreen;
    private final int[] nilaiblue;

    // Constructor reads the input image file and calculates the histogram data
    public Histogram4() throws IOException {
        // Read the input image file
        BufferedImage img = ImageIO.read(new File("Z:\\citraJava\\lenaColor.jpg"));

        // Initialize histogram arrays
        nilaigray = new int[256];
        nilaired = new int[256];
        nilaigreen = new int[256];
        nilaiblue = new int[256];

        // Get image dimensions
        int width = img.getWidth();
        int height = img.getHeight();

        // Iterate through all pixels in the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // Get the color of the pixel
                Color c = new Color(img.getRGB(x, y));
                
                // Get the red, green, and blue values of the pixel
                int red = (int) c.getRed();
                int green = (int) c.getGreen();
                int blue = (int) c.getBlue();
                
                // Calculate the gray value of the pixel using a weighted average
                int gray = (int) (red * 0.299) + (int) (green * 0.587) + (int) (blue * 0.114);
                
                // Increment the appropriate element of the histogram arrays
                nilaigray[gray]++;
                nilaired[red]++;
                nilaigreen[green]++;
                nilaiblue[blue]++;
            }
        }
    }

    /**
     *
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        // Draw the title
        String title = "Histogram";
        int titleWidth = g.getFontMetrics().stringWidth(title);
        g.drawString(title, (getWidth() - titleWidth) / 2, 20);

        // Draw the x-axis title
        String xAxisTitle = "Color Level";
        int xAxisTitleWidth = g.getFontMetrics().stringWidth(xAxisTitle);
        g.drawString(xAxisTitle, (getWidth() - xAxisTitleWidth) / 2, getHeight() - 5);

        // Draw the y-axis title
        String yAxisTitle = "Numbers of Pixels";
        int yAxisTitleWidth = g.getFontMetrics().stringWidth(yAxisTitle);
        int yAxisTitleHeight = g.getFontMetrics().getHeight();
        g.drawString(yAxisTitle, 5, (getHeight() - yAxisTitleHeight) / 2);

        // Set the "choice" variable to specify which color channel to display the histogram for
        String choice = "blue"; // gray,red,green,blue

        // Set the color of the histogram bars based on the value of choice
        switch (choice) {
            case "gray" ->
                g.setColor(Color.GRAY);
            case "red" ->
                g.setColor(Color.RED);
            case "green" ->
                g.setColor(Color.GREEN);
            case "blue" ->
                g.setColor(Color.BLUE);
            default -> {
            }
        }

        // Determine the data to use for the histogram based on the value of choice
        int[] data = null;
        switch (choice) {
            case "gray" ->
                data = nilaigray;
            case "red" ->
                data = nilaired;
            case "green" ->
                data = nilaigreen;
            case "blue" ->
                data = nilaiblue;
            default -> {
            }
        }

        // Find the maximum pixel intensity value in the data
        int max = 0;
        for (int i = 0; i < data.length; i++) {
            max = Math.max(max, data[i]);
        }

        // Scale the dimensions of the histogram based on the size of the graphics window and the maximum pixel intensity value
        double xScale = ((getWidth() - 40.0) / data.length);
        double yScale = ((getHeight() - 40.0) / max);

        // Draw the histogram bars
        for (int i = 0; i < data.length; i++) {
            int x1 = (int) (i * xScale + 20);
            int y1 = getHeight() - 20;
            int x2 = (int) (x1 + xScale - 1);
            int y2 = (int) (y1 - data[i] * yScale);
            g.fillRect(x1, y2, x2 - x1, y1 - y2);
        }

        // Set the color of the axes to black
        g.setColor(Color.BLACK);

        // Scale the dimensions of the axes labels based on the size of the graphics window and the maximum pixel intensity value
        double xScalefix = ((getWidth() - 40.0) / 256);
        double yScalefix = ((getHeight() - 40.0) / max);

        // Draw the x-axis labels
        for (int i = 0; i < 256; i += 51) {
            g.drawString(String.valueOf(i), (int) (i * xScalefix + 20), getHeight() - 10);
        }

        // Draw the y-axis labels
        for (int i = 0; i <= max; i += (max / 10)) {
            g.drawString(String.valueOf(i), 10, (int) (getHeight() - i * yScalefix - 20));
        }
    }

    public static void main(String[] args) throws IOException {
        // create a frame for the Histogram
        Histogram4 canvas = new Histogram4();
        JFrame frame = new JFrame();
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }
}
