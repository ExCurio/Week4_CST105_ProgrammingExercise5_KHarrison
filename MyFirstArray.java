/** Program: My First Array
 * File: MyFirstArray.java
 * Summary: This program reads text from a text file and puts it into a 20x45, 2D array, row major order. It then extracts that data, 
 * column major order, puts it into a string and prints the string to the console.
 * Author: Keith Harrison
 * Date: 3/10/2018
 * 
 */


// Import Scanner
import java.util.Scanner;

public class MyFirstArray {

    public static void main(String[] args) throws Exception {

    // Initialize the entireText variable    
    String entireText = "";
    
    // Create array    
    char[][] textArray;    
        
    // Create a File instance	
    java.io.File file = new java.io.File("WeThePeople.txt");

    // Create a Scanner object
    Scanner sc = new Scanner(file);
   
    // While loop that reads the text from the file and loads it into the entireText variable
    while(sc.hasNext()) {
	entireText = sc.nextLine();
	}
    
    // Close Scanner object    
    sc.close();
    
    // Call the loadArray method to load entireText variable into the textArray array
    textArray = loadArray(entireText);
		
    // Call the arrayOutput method to print the results
    arrayOutput(textArray);
    
    }
    
    
   
    // Method that loads the array with the text from the entireText variable
    public static char[][] loadArray(String entireText) {
	char[][] textArray = new char[20][45];
	int counter = 0;
		
	for (int i = 0; i < 20; i++){  
            for (int j = 0; j < 45; j++){  
		if (counter < entireText.length()){
                    textArray[i][j] = entireText.charAt(counter);
                    counter++;
		} 
                else { 
                    textArray[i][j] = '@'; // Fill unused space with '@' character
		}
				
            }
	}
	// Return the textArray array	
	return textArray;
		
	}
    
    
    // Method that outputs the text from the array in column major order    
    private static void arrayOutput(char[][] textArray) {
	StringBuilder outputText = new StringBuilder();
		
	for (int i = 0; i < 45; i++){
            for (int j = 0; j < 20; j++){
                outputText.append(textArray[j][i]);
            }
	}
	// Print the outputText results to the console	
	System.out.println(outputText);
		
    }
   

}
 
    

