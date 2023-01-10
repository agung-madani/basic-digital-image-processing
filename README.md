# Digital Image Processing Using Apache Netbeans IDE 15
 The repository includes examples of basic image processing. All of the code in this repository is written in Java and can be easily modified.

## Table of Contents

- [Usage](#usage)
- [Images Source](#images-source)
- [Arithmatics Operations (Division by Scalar | Division Two Images)](#arithmatics-operations)
- [Convolution](#convolution)
- [Geometry Operation (Flipping Horizontal | Flipping Vertical)](#geometry-operation)
- [Histogram](#histogram)
- [Image Enhancement (Contrast Stretching using Formula | Contrast Stretching Min Max | Contrast Stretching using Formula Clipping)](#image-enhancement)
- [Point Operation (Brightening | Grayscale Formula((R + G + B) / 3) | Grayscale Formula(0.299R + 0.587G + 0.144B) | Negative)](#point-operation)

## Usage
[Table of Contents](#table-of-contents) <br>
1. Copy script and paste it in your Apache Netbeans
2. Adjust some lines based on yours, such as package, class name, and read image file Location/save modified image file location.
3. Follow the comments in the code to learn how each technique is implemented and try experimenting with the code to see how you can customize the image processing results.

## Images Source
[Table of Contents](#table-of-contents) <br>
Zelda image source: [zelda.jpg](https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/imagesrc/zelda.jpg) <br>
One Cup BW image source: [cups_one_bw.png](https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/imagesrc/cups_one_bw.png) <br>
Three Cups BW image source: [cups_three_bw.png](https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/imagesrc/cups_three_bw.png) <br>
Smiling Girl image source: [girl.jpg](https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/imagesrc/girl.jpg) <br>
Lena Color image source: [lenaColor.jpg](https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/imagesrc/lenaColor.jpg) <br>
Lena BW image source: [lena.jpg](https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/imagesrc/lena.jpg)


## Arithmatics Operations
[Table of Contents](#table-of-contents) <br>
* Division by Scalar<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Arithmatics%20Operations/DivisionScalar.java <br>
![DivisionScalar](https://user-images.githubusercontent.com/121701309/211472113-304a3703-ff65-48e6-8147-8689b2df5fd3.jpg)

* Division Two Images<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Arithmatics%20Operations/DivisionTwoImages.java <br>
![DivisionTwoImages](https://user-images.githubusercontent.com/121701309/211473212-6cdb7185-b3d6-4cad-ba66-19cbef73701d.jpg)

## Convolution
[Table of Contents](#table-of-contents) <br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Convolution/Konvolusi.java <br>
Gaussian Blur:
| 1 | 1 | 1 |
| ------ | ------ | ------ |
| 1 | 1 | 1 |
| 1 | 1 | 1 |

![KonvolutionBlur](https://user-images.githubusercontent.com/121701309/211479014-d4c10710-4f21-428c-a451-7a8cf4078ae2.jpg) <br>
Sharpness:
| -1 | -1 | -1 |
| ------ | ------ | ------ |
| -1 | 9 | -1 |
| -1 | -1 | -1 |

![KonvolutionSharpness](https://user-images.githubusercontent.com/121701309/211479204-5ee930c6-c1bd-42f2-8e66-570b88fa2dc0.jpg)

## Geometry Operation
[Table of Contents](#table-of-contents) <br>
* Flipping Horizontal<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Geometry%20Operation/FlippingHorizontal.java <br>
![flipHorizontal](https://user-images.githubusercontent.com/121701309/211243417-dcf8bc0f-a109-4c32-8253-db6944e08317.jpg)

* Flipping Vertical<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Geometry%20Operation/FlippingVertical.java <br>
![flipVertical](https://user-images.githubusercontent.com/121701309/211243554-2e421e9c-b0f2-4fd4-83d9-5d5da01de181.jpg)

## Histogram
[Table of Contents](#table-of-contents) <br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Histogram/Histogram4.java <br>
Using Image [lenaColor.jpg](https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/imagesrc/lenaColor.jpg) the Histogram will be:<br>
![GrayHistogram](https://user-images.githubusercontent.com/121701309/211474893-273c49ec-092f-4714-b2f5-40592a5c5a72.jpg)
![RedHistogram](https://user-images.githubusercontent.com/121701309/211474905-0c1b053a-e7c5-4a24-ac63-3cc08c6991b3.jpg)
![GreenHistogram](https://user-images.githubusercontent.com/121701309/211474911-ef11ae74-b560-4a06-aa6b-4b410371d46f.jpg)
![BlueHistogram](https://user-images.githubusercontent.com/121701309/211474913-5bfcbda3-76e3-4113-b4f6-6c6a255880d1.jpg)

## Image Enhancement
[Table of Contents](#table-of-contents) <br>
* Contrast Stretching using Formula<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Image%20Enhancement/ContrastFormula1Stretching.java <br>
![ContrastStretchingFormula](https://user-images.githubusercontent.com/121701309/211243279-1e8df21c-5262-46c0-83df-6e120670f3ad.jpg)

* Contrast Stretching Min Max<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Image%20Enhancement/ContrastMinMaxStretching.java <br>
![FormulaMinMax](https://user-images.githubusercontent.com/121701309/211243374-94aa4095-15ea-49a8-b434-282cd8a4d078.jpg) <br>
![ContrastStretchingMinMax](https://user-images.githubusercontent.com/121701309/211243385-6527863f-62e5-4969-af8e-5744a5fc4221.jpg)

* Contrast Stretching using Formula Clipping<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Image%20Enhancement/ContrastRumusClippingStretching.java <br>
![Contrast StretchingClipping](https://user-images.githubusercontent.com/121701309/211243400-4a93acac-d23e-4cf0-b688-526cefc7d0a3.jpg)

## Point Operation
[Table of Contents](#table-of-contents) <br>
* Brightening<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Point%20Operation/Brightening.java <br>
![Brightening](https://user-images.githubusercontent.com/121701309/211243253-a76c58d6-9422-41fd-8b5a-17e659c598ee.jpg)

* Grayscale Formula - ((R + G + B) / 3)<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Point%20Operation/GrayscaleAverage.java <br>
![GrayscaleAverage](https://user-images.githubusercontent.com/121701309/211482516-9c45f6ff-44cb-4518-bb73-30c10d3a9599.jpg)

* Grayscale Formula - (0.299R + 0.587G + 0.144B)<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Point%20Operation/GrayscaleFormula.java <br>
![GrayscaleFormula](https://user-images.githubusercontent.com/121701309/211482484-228bc7d3-3e44-4545-b9c8-6d3af75759d8.jpg) <br>
See the difference...<br>
![DifferenceGrayscaleFormula](https://user-images.githubusercontent.com/121701309/211483010-5bcd6834-3088-4fa1-8f6e-fe3020e3f546.jpg)

* Negative<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Point%20Operation/Negative.java <br>
![Negative](https://user-images.githubusercontent.com/121701309/211483777-bd08db24-bf99-4f62-9148-4a1041e9fcbd.jpg)







