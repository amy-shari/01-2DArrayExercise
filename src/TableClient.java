/***********************************************************************
* Programmer:	Amy Mann
* Class:	CS40S
*
* Assignment:	01 2D Array Exercise
*
* Description:	client code
*
*
*  Input:	tableData.txt
*
*  Output:	prints table, prints table in reverse order, prints rows
*               & columns in reverse order, prints row by row, and column
*               by column, prints sum & average of each row and of each
*               column, prints sum of any two table elements
************************************************************************/

import javax.swing.*;
import java.text.DecimalFormat;
 import java.io.*;
import java.util.ArrayList;

public class TableClient
{  // begin class
	
        public static void main(String args[])throws IOException{  // begin main
            
	// ***** declaration of constants *****
	
            final int MAXROW = 20;      // max # of rows
            final int MAXCOL = 20;      // max # of cols
        
	// ***** declaration of variables *****
	
            String strin;		// string data input from keyboard
            String strout;		// processed info string to be output
            String bannerOut;		// string to print banner to message dialogs

            BufferedReader fin = null;
            
            String prompt;		// prompt for use in input dialogs

            String delim = "[ :]+";	// delimiter string for splitting input string
            String[] tokens;                        // string array for gathering input
        
            String tabSpace = "      ";     // six spaces
            String nl = System.lineSeparator();  // universal new line character
            
            int rows = 0;        // number of rows
            int columns = 0;     // number of columns
            
            int row = 0;         // row counter
            
            int[][] table = new int[MAXROW][MAXCOL];    // creates table
            
	// ***** create objects *****
		
            ArrayList<Table> tables = new ArrayList<>();
            
	// ***** create input stream *****
	
            try{
                fin = new BufferedReader(new FileReader("tableData.txt"));
            }  // end try
            catch(FileNotFoundException e){
                System.out.println("file not found");
            } // end catch

            PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
                
	// ***** Print Banner *****
	
            System.out.println("**********************************");
            System.out.println("Name:        Amy Mann");
            System.out.println("Class:       CS40S");
            System.out.println("Assignment:  01 2D Array Exercise");
            System.out.println("**********************************");
                
            bannerOut = "*******************************************" + nl;
            bannerOut += "Name:		Amy Mann" + nl;
            bannerOut += "Class:		CS40S" + nl;
            bannerOut += "Assignment:	01 2D Array Exercise" + nl;
            bannerOut += "*******************************************" + nl + nl;
        
            fout.print(bannerOut);
		
	// ***** get input *****
	
            strin = fin.readLine();     // reads first line of text file
            
            while(strin != null){               
                tokens = strin.split(delim);   // splits input
                columns = Integer.parseInt(tokens[1]);
                rows = Integer.parseInt(tokens[0]);

                for(int i = 0; i < rows; i++){
                    strin = fin.readLine(); // reads next line of text file
                    tokens = strin.split(delim);   // splits input
                    for(int k = 0; k < columns; k ++){
                        table[i][k] = Integer.parseInt(tokens[k]);
                    } // end for int k = 0
                } // for for loop

                /*for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print(table[i][j] + " ");
                    }
                    System.out.println();
                } */

                Table t = new Table(table, rows, columns);
                //System.out.println(t.printTable());
		    
	/* so, if I remember correctly, the preceding line (111 and 112) worked as expected
	it's the next line where the table seeems to get messed up?
	*/
                tables.add(t);   // uses initialized constructor to create table

		    
                System.out.println(tables.get(0).printTable());
		    //try this
		System.out.prinlnt(t);			// invoke the toString() method on t
		System.out.println(tables.get(0);	// invoke the toString() method on tables(0)

                strin = fin.readLine(); // reads next line of text file
            } // end EOF loop

// what happens if you uncomment the following line?
            //System.out.println(tables.get(0).printTable());
		
// try this
		System.out.println(tables);  // this invokes the built in toString() method in the arraylsit the output might seem a bit 
						// confusing at first but have a close look at it to see if it matches what is supposed to print




	// ***** processing *****
	
		
	// ***** output *****
        
            //System.out.println(tables.get(0).formatTable('f','f'));
            //System.out.println(tables.get(1).formatTable('f','f'));
            //System.out.println(tables.get(2).formatTable('f','f'));
            
            /* for(int j = 0; j < tables.size(); j++){
            System.out.println("Printing table:");
            System.out.println(tables.get(j).formatTable('f', 'f'));
            
            System.out.println("Printing table in reverse:");
            System.out.println(tables.get(j).formatTable('r', 'r'));
            
            System.out.println("Printing table with columns in reverse:");
            System.out.println(tables.get(j).formatTable('f', 'r'));
            
            System.out.println("Printing table with rows in reverse:");
            System.out.println(tables.get(j).formatTable('r', 'f'));
            
            System.out.println("The sum of the table is " + tables.get(j).sumTable() + ".");
            System.out.println("The average of the table is " + tables.get(j).averageTable() + ".");        
            } // end for int j = 0
*/
            
	// ***** closing message *****
	
            System.out.println("end of processing");
            fout.println("end of processing");
                
        // ***** close streams *****
        
            fin.close();                // close input buffer stream
            fout.close();               // close output stream
                
	}  // end main	
}  // end class
