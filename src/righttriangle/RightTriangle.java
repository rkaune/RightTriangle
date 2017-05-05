/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package righttriangle;

/**
 *
 * @author rkaune
 */
 /**
  * Draws a right triangle.
  */
 public class RightTriangle {
	
	public static void drawBar(int length, String mark) {
		
		for (int i = 1; i <= length; i++) {
			System.out.print(mark);
		}
		System.out.println();
	}

	
	public static void drawBar(int length) {
		
		for (int i = 1; i <= length; i++) {
			System.out.print("@");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		
		/* draw a right triangle with base size 6 */
		for (int i = 1; i <= 6; i++) {
			drawBar(i,"#");
                        drawBar(i);
		}
	}
}
