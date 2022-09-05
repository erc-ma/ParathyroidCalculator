# ParathyroidCalculator
Fun tool to automatically calculate the volume of your parathyroid from a directory of image cross-sections :)

![parathyroid](https://user-images.githubusercontent.com/103232379/188338480-9759ee10-f762-4823-ad0d-5e17677bd756.jpg)
Here is a parathyroid cross-section under a microscope at 40X magnification. The parathyroid can be identified as the dark purple tissue. The surrounding light purple tissue is thyroid, and the white-ish background is from the glass slide under the light. My algorithm relies on these color differences.

### Backstory:
The summer of 2022, I worked at a cancer research lab on a project that involved the analysis of parathyroid tumors. One of my responsibilities was to compare the relative sizes of normal parathyroids and parathyroid tumors (many times larger than a normal parathyroid) in different transgenic and wild-type mice. 
This involved a drawn-out process of hand tracing hundreds of mouse parathyroid cross-sections and calculating the volumes by individual areas: a process that was unnecessarily tedious and precise. My goal was to write an algorithm that would quickly go through hundreds of images, find the parathyroids, and return the estimated volume in a minimum amount steps.

## Description
The program involves 3 classes. The Driver class where the main function is called, a SelectedRegion class, and class Constants that stores public static color objects (the average color of thyroid tissue, white background, and parathyroid). 

The Driver class contains a "for each" loop that adds up the value executeProgram with each image input, multiplied by the thickness. Since executeProgram returns the area of the image, the resulting integer at the end of the loop is the estimated volume of the parathyroid. Within the executeProgram function, a new SelectedRegion is created. The SelectedRegion is then passed through scanImage with the image file, which fills the SelectedRegion with the coordinates of where the algorithm found parathyroid tissue and accumulates the area of the SelectedRegion. 

scanImage:
This function uses a nested for loop to iterate through every pixel of the image. To determine whether or not the pixel belongs to the parathyroid tissue, the hues of each pixel are calculated with getHue and compared with hueDistance against the constants of thyroid color and background color. If the hue distance between the pixel and normal color of parathyroid is less than that of the color of thyroid and the color of the background, the pixel coordinates are added to the SelectedRegion and its area is incremented by one.


### Challenges and Future
The algorithm isn't meant to be super precise to the exact parathyroid/tumor volume; rather it was only meant to serve as a quick and consistent means of comparison between the glands of different mice. 
With that being said, if I were to come back to this program with the intention of maximum accuracy and precision in mind, I would use a pixelGroup function to distinguish between groups of touching pixels. The largest group would be considered the parathyroid. The smaller ones are the cell linings of the thyroid follicles.
In future implementations, I also would like to add an option to retrieve the areas of individual cross-sections onto a spreadsheet for ease of reference. 


## How to use:
Once the program is running, follow the following prompts:

<img width="395" alt="Screen Shot 2022-09-05 at 11 30 28 AM" src="https://user-images.githubusercontent.com/103232379/188481998-67446e55-bb76-4c64-a10b-17bf0a9ffad5.png">
<img width="448" alt="Screen Shot 2022-09-05 at 11 31 52 AM" src="https://user-images.githubusercontent.com/103232379/188482458-a6a933e8-6ebb-4ef6-8f5d-a03e06757ee4.png">

The program will then display the calculated volume after a few seconds:

<img width="356" alt="Screen Shot 2022-09-05 at 11 32 48 AM" src="https://user-images.githubusercontent.com/103232379/188482462-9978d7de-19aa-4d71-b462-a25798a061d0.png">
