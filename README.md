# Digital Image Processing Using Apache Netbeans IDE 15
 The repository includes examples of basic image processing. All of the code in this repository is written in Java and can be easily modified.

## Table of Contents

- [Usage](#usage)
- [Images Source](#images-source)
- [Arithmatics Operations (Addition Two Images | Average Two Images | Division by Scalar | Division Two Images | Multiplication by Scalar | Multiplication Two Images | Substraction Two Images)](#arithmatics-operations)
- [Boolean Operation (Operator AND | Operator NOT | Operator OR)](#boolean-operation)
- [Convolution](#convolution)
- [Geometry Operation (Flipping x = width-x, y | Flipping x, y = height-y | Flipping x = width-x, y = height-y | Flipping x = y | Rotation Clockwise | Rotation Counter Clockwise | Rotation Radians | Translation | Zoom In/Resize Bigger | Zoom Out/Resize Smaller)](#geometry-operation)
- [Histogram](#histogram)
- [Image Enhancement (Contrast Stretching using Formula | Contrast Stretching Min Max | Contrast Stretching using Formula Clipping)](#image-enhancement)
- [Point Operation (Brightening | Grayscale Formula((R + G + B) / 3) | Grayscale Formula(0.299R + 0.587G + 0.144B) | Negative | Thresholding)](#point-operation)

## Usage
[Table of Contents](#table-of-contents)

1. Copy script and paste it in your Apache Netbeans
2. Adjust some lines based on yours, such as package, class name, and read image file Location/save modified image file location.
3. Follow the comments in the code to learn how each technique is implemented and try experimenting with the code to see how you can customize the image processing results.

## Images Source
[Table of Contents](#table-of-contents)

San Francisco image source: [1970s-1980s-san-francisco.jpg](https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/imagesrc/1970s-1980s-san-francisco.jpg) <br>
Cameramen image source: [The-original-cameraman-image.png](https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/imagesrc/The-original-cameraman-image.png) <br>
One Cup BW image source: [cups_one_bw.png](https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/imagesrc/cups_one_bw.png) <br>
Three Cups BW image source: [cups_three_bw.png](https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/imagesrc/cups_three_bw.png) <br>
Girl Smilling image source: [girl.jpg](https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/imagesrc/girl.jpg) <br>
Lena BW image source: [lena.jpg](https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/imagesrc/lena.jpg) <br>
Lena Color image source: [lenaColor.jpg](https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/imagesrc/lenaColor.jpg) <br>
Peppers image source: [peppers.png](https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/imagesrc/peppers.png) <br>
Peppers Fake image source: [peppers_fake.png](https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/imagesrc/peppers_fake.png) <br>
Zelda image source: [zelda.jpg](https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/imagesrc/zelda.jpg)

## Arithmatics Operations
[Table of Contents](#table-of-contents) <br>
* Addition Two Images<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Arithmatics%20Operations/AdditionTwoImages.java <br>
![AdditionTwoImages](https://user-images.githubusercontent.com/121701309/211736238-f82e7483-4912-447e-b1a0-f82ffe7a7512.jpg)

* Average Two Images<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Arithmatics%20Operations/AverageTwoImages.java <br>
![AverageTwoImages](https://user-images.githubusercontent.com/121701309/211736356-5cc4688b-7bd5-459b-a458-1bfd36eba885.jpg)

* Division by Scalar<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Arithmatics%20Operations/DivisionScalar.java <br>
![DivisionScalar](https://user-images.githubusercontent.com/121701309/211472113-304a3703-ff65-48e6-8147-8689b2df5fd3.jpg)

* Division Two Images<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Arithmatics%20Operations/DivisionTwoImages.java <br>
![DivisionTwoImages](https://user-images.githubusercontent.com/121701309/211473212-6cdb7185-b3d6-4cad-ba66-19cbef73701d.jpg)

* Multiplication by Scalar<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Arithmatics%20Operations/MultiplicationScalar.java <br>
![MultiplicationScalar](https://user-images.githubusercontent.com/121701309/211736610-2cebb362-5c40-4c8e-bbf9-97985a239705.jpg)

* Multiplication Two Images<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Arithmatics%20Operations/MultiplicationTwoImages.java <br>
![MultiplicationTwoImages](https://user-images.githubusercontent.com/121701309/211736730-1af7f8a6-1951-40b6-acf4-7d878c2cdf4e.jpg)

* Substraction Two Images<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Arithmatics%20Operations/SubstractionTwoImages.java <br>
![SubstractionTwoImages](https://user-images.githubusercontent.com/121701309/211736821-54b4719e-a5d5-47b7-beeb-16b63358d8bf.jpg)

## Boolean Operation
[Table of Contents](#table-of-contents) <br>
* Operator AND<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Boolean%20Operation/OperatorAND.java <br>
![AndOperator](https://user-images.githubusercontent.com/121701309/211987363-8d8df252-0e23-4e67-8719-c26d7d13e8ff.jpg)

* Operator NOT<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Boolean%20Operation/OperatorNOT.java <br>
![NotOperator](https://user-images.githubusercontent.com/121701309/211987471-0d19de8a-5270-4014-98d2-f2c967852474.jpg)

* Operator OR<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Boolean%20Operation/OperatorOR.java <br>
![OrOperator](https://user-images.githubusercontent.com/121701309/211987573-03401485-a524-4457-8c63-b33a1c563279.jpg)

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
* Flipping x = width-x, y<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Geometry%20Operation/FlippingHorizontal.java <br>
![flipHorizontal](https://user-images.githubusercontent.com/121701309/211243417-dcf8bc0f-a109-4c32-8253-db6944e08317.jpg)

* Flipping x, y = height-y<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Geometry%20Operation/FlippingVertical.java <br>
![flipVertical](https://user-images.githubusercontent.com/121701309/211243554-2e421e9c-b0f2-4fd4-83d9-5d5da01de181.jpg)

* Flipping x = width-x, y = height-y<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Geometry%20Operation/MirrorCartesian.java <br>
![MirrorCartesian](https://user-images.githubusercontent.com/121701309/211988153-8f750859-91c2-4d69-8c6e-29aa4e107f32.jpg)

* Flipping x = y<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Geometry%20Operation/MirrorXYEqual.java <br>
![MirrorXYEqual](https://user-images.githubusercontent.com/121701309/211988095-7ce8c834-eb15-42c2-88f8-ab59cb74eaa1.jpg)

* Rotation Clockwise<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Geometry%20Operation/RotateClockWise.java <br>
![RotateCW](https://user-images.githubusercontent.com/121701309/211737258-87408e25-f8c2-423c-91b2-525e370f3946.jpg)

* Rotation Counter Clockwise<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Geometry%20Operation/RotateCounterClockWise.java <br>
![RotateCCW](https://user-images.githubusercontent.com/121701309/211737337-f2cd87a1-acba-4f97-bcaa-a335d0b66194.jpg)

* Rotation Radians<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Geometry%20Operation/RotateRadian.java <br>
![RotateRadian](https://user-images.githubusercontent.com/121701309/211737604-b3d4bb35-78b5-4b49-bf4d-506a1a402d14.jpg)

* Translation<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Geometry%20Operation/Translasi.java <br>
![Translation](https://user-images.githubusercontent.com/121701309/211988403-036b7f08-7ae7-4efc-86e2-c42ad6800a50.jpg)

* Zoom In/Resize Bigger<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Geometry%20Operation/ZoomIn.java <br>
![ZoomIn](https://user-images.githubusercontent.com/121701309/211988413-c7838a16-314f-4563-989a-8148fe256d66.jpg)

* Zoom Out/Resize Smaller<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Geometry%20Operation/ZoomOut.java <br>
![ZoomOut](https://user-images.githubusercontent.com/121701309/211988421-8fa097be-fe99-4a3e-96be-79c2bd29b651.jpg)

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

* Thresholding<br>
https://github.com/agung-madani/digital-image-processing-apache-netbeans-java/blob/main/Codes/Point%20Operation/Thresholding.java <br>
![Thresholding](https://user-images.githubusercontent.com/121701309/211988518-0af5f0b2-5035-4a4a-9e0e-432406f419bb.jpg)
