import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;


public class main
{
  String ASCII_CHARS = "`^\",:;Il!i~+_-?][}{1)(|\\/tfjrxnuvczXYUJCLQ0OZmwqpdbkhao*#MW&8%B@$";
		  
  public static void main(String[] args)
  {
	  int picHeight;
	  int picWidth;
      System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
      Mat srcImg = Imgcodecs.imread("C:/rainbowtest2.png");
    //  srcImg.resize(50);
      Mat ASCIIImg = new Mat(srcImg.rows(), srcImg.cols(), srcImg.type());
      picHeight = srcImg.height();
      picWidth = srcImg.width();
      
      double[][][] threeD = new double [picHeight][picWidth][3];
      int [][] averageArry = new int [picHeight][picWidth];
      String [][] ascii_matrix = new String [picHeight][picWidth];
      
    //  System.out.println("Succesfully loaded image!");
    //  System.out.println("Image Size: " + picWidth + " x " + picHeight);
    //  System.out.println("");
      
      threeD = createArry(srcImg,  picWidth,  picHeight);
    //  outputArray(threeD, picWidth, picHeight);
       averageArry = convertArry(threeD, picWidth, picHeight);
  //    System.out.println("");
    //  System.out.println("");
   //   System.out.println("");
   //   outputAvgArry(averageArry, picWidth, picHeight);
      ascii_matrix = convert_to_ascii(averageArry, picWidth, picHeight);
      printAsciiImg( ascii_matrix, picWidth, picHeight);
  }
  

  private static void printAsciiImg(String[][] ascii_matrix, int width, int height) 
  {
		for (int i = 0; i < height; i++)
		{
		  for (int j = 0; j < width; j++)
		  {
			  System.out.print(ascii_matrix[i][j]);
		  }
		  System.out.println("");
		}
  }
private static String[][] convert_to_ascii(int[][] averageArry, int width, int height) 
  {
	  String[][] ascii_matrix = new String [height][width];
		for (int i = 0; i < height; i++)
		{
		  for (int j = 0; j < width; j++)
		  {
			 ascii_matrix[i][j] = getAsciiValue(averageArry[i][j]);
		  }
		}
	 return ascii_matrix;
  }

private static void outputAvgArry(int[][] averageArry, int width, int height) 
  {
		for (int i = 0; i < height; i++)
		{
		  for (int j = 0; j < width; j++)
		  {
			  System.out.print(averageArry[i][j] + " ");
		  }
		  System.out.println("");
		}
	
  }

private static int[][] convertArry(double[][][] threeD, int width, int height)
  {
	int [][] averageArry = new int [height][width];
	int sum = 0;
	
	
	for (int i = 0; i < height; i++)
	{
	  for (int j = 0; j < width; j++)
	  {
	    for (int k = 0; k < 3; k++)
	    {
	    	sum += threeD[i][j][k];
	    }
	    averageArry[i][j] = sum / 3;
	    sum = 0;
	  }
	}
	
	return averageArry;
  }

private static void outputArray(double[][][] threeD, int width, int height) 
  {
	for (int i = 0; i < height; i++)
	{
	  System.out.print("Row: "+ i);
	  for (int j = 0; j < width; j++)
	  {
		System.out.print("[");
		for (int k = 0; k < 3; k++)
		{
		  System.out.print((int)threeD[i][j][k] + " ");
		}
		System.out.print("]");
	  }
	  System.out.println("");
	}
  }

private static double[][][] createArry(Mat srcImg, int width, int height)
  {
	double[][][] Picturearray = new double [height][width][3]; 
	double [] arry = new double [3];
	
	for (int i = 0; i < height; i++)
	{
	  for (int j = 0; j < width; j++)
	  {
	    for (int k = 0; k < 3; k++)
	    {
	      arry = srcImg.get(i, j);
	      Picturearray[i][j][k] = arry[k];
	    }
	  }
	}
	return Picturearray;
  }





private static String getAsciiValue(int i) 
{
  String ASCII_CHARS = "|\\/tfjrxnuvczXYUJCLQ0OZmwqpdbkhao*#MW&8%B@$";
  String asciiChar = "";
  double num = 0;
 	 
  num = i / 255.0;
  num = num * ASCII_CHARS.length() - 3;
  
  asciiChar = String.valueOf(ASCII_CHARS.charAt((int) Math.floor(num)));
  return asciiChar;
     
}
}
