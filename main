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





private static String getAsciiValue2(int i) 
{
  String ASCII_CHARS = "|\\/tfjrxnuvczXYUJCLQ0OZmwqpdbkhao*#MW&8%B@$";
  String asciiChar = "";
  double num = 0;
 	 
  num = i / 255.0;
  num = num * ASCII_CHARS.length() - 3;
  
  asciiChar = String.valueOf(ASCII_CHARS.charAt((int) Math.floor(num)));
  return asciiChar;
     
}


private static String getAsciiValue(int i) 
{
	String asciiChar = "";
	
	if(i < 4)
	{
	  asciiChar = "'";
	}
	else if(i < 8)
	{
	  asciiChar = "^";
	}
	else if(i < 12)
	{
	  asciiChar = "\\";
	}
	else if(i < 16)
	{
		 asciiChar = "\"";
	}
	else if(i < 20)
	{
		 asciiChar = ",";
	}
	else if(i < 24)
	{
		 asciiChar = ":";
	}
	else if(i < 28)
	{
		 asciiChar = ";";
	}
	else if(i < 32)
	{
		 asciiChar = "I";
	}
	else if(i < 36)
	{
		 asciiChar = "l";
	}
	else if(i < 40)
	{
		 asciiChar = "!";
	}
	else if(i < 44)
	{
		 asciiChar = "i";
	}
	else if(i < 48)
	{
		 asciiChar = "~";
	}
	else if(i < 52)
	{
		 asciiChar = "+";
	}
	else if(i < 56)
	{
		 asciiChar = "_";
	}
	else if(i < 60)
	{
		 asciiChar = "-";
	}
	else if(i < 64)
	{
		 asciiChar = "?";
	}
	else if(i < 68)
	{
		 asciiChar = "]";
	}
	else if(i < 72)
	{
		 asciiChar = "[";
	}
	else if(i < 76)
	{
		 asciiChar = "}";
	}
	else if(i < 80)
	{
		 asciiChar = "}";
	}
	else if(i < 84)
	{
		 asciiChar = "1";
	}
	else if(i < 88)
	{
		 asciiChar = ")";
	}
	else if(i < 92)
	{
		 asciiChar = "(";
	}	
	else if(i < 96)
	{
		 asciiChar = "|";
	}
	else if(i < 100)
	{
		 asciiChar = "\\";
	}
	else if(i < 104)
	{
		 asciiChar = "/";
	}
	else if(i < 108)
	{
		 asciiChar = "t";
	}
	else if(i < 112)
	{
		 asciiChar = "f";
	}
	else if(i < 116)
	{
		 asciiChar = "j";
	}
	else if(i < 120)
	{
		 asciiChar = "r";
	}
	else if(i < 124)
	{
		 asciiChar = "x";
	}
	else if(i < 128)
	{
		 asciiChar = "n";
	}
	else if(i < 132)
	{
		 asciiChar = "u";
	}
	else if(i < 136)
	{
		 asciiChar = "v";
	} 
	else if(i < 140)
	{
		 asciiChar = "c";
	}
	else if(i < 144)
	{
		 asciiChar = "z";
	}
	else if(i < 148)
	{
		 asciiChar = "X";
	}
	else if(i < 152)
	{
		 asciiChar = "Y";
	}
	else if(i < 156)
	{
		 asciiChar = "U";
	}
	else if(i < 160)
	{
		 asciiChar = "J";
	}
	else if(i < 164)
	{
		 asciiChar = "C";
	}
	else if(i < 168)
	{
		 asciiChar = "L";
	}
	else if(i < 172)
	{
		 asciiChar = "Q";
	}   
	else if(i < 176)
	{
		 asciiChar = "O";
	}
	else if(i < 180)
	{
		 asciiChar = "0";
	}
	else if(i < 184)
	{
		 asciiChar = "Z";
	} 
	else if(i < 188)
	{
		 asciiChar = "m";
	}
	else if(i < 192)
	{
		 asciiChar = "w";
	}
	else if(i < 196)
	{
		 asciiChar = "q";
	}
	else if(i < 200)
	{
		 asciiChar = "p";
	}
	else if(i < 204)
	{
		 asciiChar = "d";
	}
	else if(i < 208)
	{
		 asciiChar = "b";
	} 
	else if(i < 212)
	{
		 asciiChar = "k";
	}
	else if(i < 216)
	{
		 asciiChar = "h";
	}
	else if(i < 220)
	{
		 asciiChar = "a";
	}
	else if(i < 224)
	{
		 asciiChar = "o";
	}
	else if(i < 228)
	{
		 asciiChar = "#";
	}
	else if(i < 232)
	{
		 asciiChar = "M";
	}  
	else if(i < 236)
	{
		 asciiChar = "W";
	}
	else if(i < 240)
	{
		 asciiChar = "&";
	}
	else if(i < 244)
	{
		 asciiChar = "8";
	}
	else if(i < 248)
	{
		 asciiChar = "%";
	}
	else if(i < 252)
	{
		 asciiChar = "@";
	}
	else if(i < 256)
	{
		 asciiChar = "$";
	}
	else {
		asciiChar = "NAN";
	}
	
	return asciiChar;
}

}
