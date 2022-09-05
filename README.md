# ParathyroidCalculator
Fun tool to automatically calculate the volume of your parathyroid based on a folder of cross-sections :)


![parathyroid](https://user-images.githubusercontent.com/103232379/188338480-9759ee10-f762-4823-ad0d-5e17677bd756.jpg)
Here is a parathyroid cross-section under a microscope at 40X magnification.
### Backstory:
The summer of 2022, I worked at a cancer research lab on a project that involved the analysis of parathyroid tumors. One of my responsibilities was to compare the relative sizes of normal parathyroids and parathyroid tumors (many times larger than a normal parathyroid) in different transgenic and wild-type mice. 
This involved a drawn-out process of hand tracing hundreds of mouse parathyroid cross-sections and calculating the volumes by individual areas: a process that was unnecessarily tedious and precise. My goal was to write an algorithm that would quickly go through hundreds of images, find the parathyroids, and return the estimated volume in a minimum amount steps.

## Description
The program involves 2 classes. 

### Challenges and Future
The algorithm isn't meant to be super precise to the exact parathyroid/tumor volume; rather it was only meant to serve as a quick and consistent means of comparison between the glands of different mice. 
With that being said, if I were to come back to this program with the intention of maximum accuracy and precision, 
In future implementations, I would like to add an option to retrieve the areas of individual cross-sections onto a spreadsheet for ease of reference. 

## How to use:
Once the program is running, you will be given the following prompt:

