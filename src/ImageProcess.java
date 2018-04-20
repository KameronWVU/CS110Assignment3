import java.awt.Color;

public class ImageProcess {
	public static void main(String[] args) {
		ImageUtils utils = new ImageUtils();
		Color[][] originalIMG = utils.loadImage("src/LennaCV.png");
		utils.addImage(originalIMG, "Original");
		
		Color[][] tint1 = process2(originalIMG);
		utils.addImage(tint1, "Process Two");
		
		Color[][] tint2 = process3(originalIMG);
		utils.addImage(tint2, "Process Three");
		
		Color[][] tint3 = process4(originalIMG);
		utils.addImage(tint3, "Process Four");
		
		Color[][] tint4 = process5(originalIMG);
		utils.addImage(tint4, "Process Five");
		
		Color[][] tint5 = process6(originalIMG);
		utils.addImage(tint5, "Process Six");
		
		Color[][] tint6 = process7(originalIMG);
		utils.addImage(tint6, "Process Seven");
		
		Color[][] tint7 = process8(originalIMG);
		utils.addImage(tint7, "Process Eight");
		
		Color[][] tint8 = process9(originalIMG);
		utils.addImage(tint8, "Process Nine");
		
		utils.display();
	}
	
	public static Color[][] process2(Color[][] image) {
		Color[][] t = ImageUtils.cloneArray(image);
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				Color pixel = t[i][j]; 
				//int r = pixel.getRed();
				//int g = pixel.getGreen();
				int b = pixel.getBlue();
				
				t[i][j] = new Color(0,0,b);
			}
		}
		return t;
	}
	
	public static Color[][] process3(Color[][] image) {
		Color[][] t = ImageUtils.cloneArray(image);
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				Color pixel = t[i][j]; 
				//int r = pixel.getRed();
				int g = pixel.getGreen();
				//int b = pixel.getBlue();
				
				t[i][j] = new Color(0,g,0);
			}
		}
		return t;
	}
	
	public static Color[][] process4(Color[][] image) {
		Color[][] t = ImageUtils.cloneArray(image);
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				Color pixel = t[i][j]; 
				int r = pixel.getRed();
				//int g = pixel.getGreen();
				//int b = pixel.getBlue();
				
				t[i][j] = new Color(r,0,0);
			}
		}
		return t;
	}
	
	public static Color[][] process5(Color[][] image) {
		Color[][] t = ImageUtils.cloneArray(image);
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				Color pixel = t[i][j]; 
				int r = pixel.getRed();
				//int g = pixel.getGreen();
				//int b = pixel.getBlue();
				
				t[i][j] = new Color(r,255,255);
			}
		}
		return t;
	}
	
	public static Color[][] process6(Color[][] image) {
		Color[][] t = ImageUtils.cloneArray(image);
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				Color pixel = t[i][j]; 
				//int r = pixel.getRed();
				int g = pixel.getGreen();
				//int b = pixel.getBlue();
				
				t[i][j] = new Color(255,g,255);
			}
		}
		return t;
	}
	
	public static Color[][] process7(Color[][] image) {
		Color[][] t = ImageUtils.cloneArray(image);
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				Color pixel = t[i][j]; 
				//int r = pixel.getRed();
				//int g = pixel.getGreen();
				int b = pixel.getBlue();
				
				t[i][j] = new Color(255,255,b);
			}
		}
		return t;
	}
	
	public static Color[][] process8(Color[][] image) {
		Color[][] t = ImageUtils.cloneArray(image);
		int black = 0;
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				Color pixel = t[i][j]; 
				int r = pixel.getRed();
				int g = pixel.getGreen();
				int b = pixel.getBlue();
				black = (r+g+b)/3;
				
				t[i][j] = new Color(black,black,black);
			}
		}
		return t;
	}
	
	public static Color[][] process9(Color[][] image) {
		Color[][] t = ImageUtils.cloneArray(image);
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				Color pixel = t[i][j]; 
				int r = pixel.getRed();
				int g = pixel.getGreen();
				int b = pixel.getBlue();
				t[i][j] = new Color(r,g,b);
				
				if (i < t.length/2) {
					if (j <= t[i].length/3) {
						t[i][j] = new Color(r,0,0);
					}
					else {
						t[i][j] = new Color(r,g,0);
					}
				}
				else {
					if (j<=t[i].length/1.5) {
						t[i][j] = new Color(0,g,0);
					}
					else {
						t[i][j] = new Color(0,0,b);
					}
				}
			}
		}
		return t;
	}
}
