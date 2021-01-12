/* **********************************************************
 * Programmer:	Amy Mann
 * Class:       CS40S
 * 
 * Assignment:	01 2D Array Exercise
 *
 * Description:	table class
 *
 * ************************************************************/
 
 // import files here as needed


import java.security.cert.CertificateEncodingException;

public class Table
 {  // begin class
 	
 	// *********** class constants **********
            
            private static final int MAXROW = 20;      // max # of rows
            private static final int MAXCOL = 20;      // max # of cols
 	
 	// ********** instance variable **********
 	
            private int rows = 0;                      // number of rows
            private int columns = 0;       // number of elements in a row (# of columns)
            
            //private int[][] table = new int[MAXROW][MAXCOL];    // pointer to table
            private int[][] table = null;    // pointer to table
            
 	// ********** constructors ***********
            
            /*****************************************
            * Description: initialized constructor
            * 
            * Interface:
            * 
            * @param        rows : int, number of rows
            * @param        columns : int, number of columns
            * @param        table : int{}{}, 2D array
            * ****************************************/
                public Table(int[][] table, int rows, int columns){
                    this.table = new int[rows][columns];
                    this.table = table;
                    this.rows = rows;
                    this.columns = columns;
                } // end initialized constructor
     
 	// ********** accessors / getters **********
 	
           /*****************************************************
            * Purpose: gets rows
            * Interface: IN: none
            * Returns: current state of property rows
            *****************************************************/  
            public int getRows(){
                return rows;
            } // end getRows

            /*****************************************************
            * Purpose: gets number of columns
            * Interface: IN: none
            * Returns: current state of property columns
            *****************************************************/  
            public int getColumns(){
                return columns;
            } // end getColumns   

            /*****************************************************
            * Purpose: gets table
            * Interface: IN: none
            * Returns: current state of property table
            *****************************************************/  
            public int[][] getTable() {
                return table;
            } // end getTable
            
            /*****************************************************
            * Purpose: accesses specific cell in table
            * Interface:
            * @param    x : int, first index being accessed
            * @param    y : int, second index being accessed
            * Returns: an element of the table
            *****************************************************/  
            public int getElement(int x, int y){
                int element = this.table[x][y];      // accesses element of table
                return element;
            } // end getElement
            
            /**********************************************
            * Description:  formats output of a row
            * Interface:
            * @param        rows : int, the number of rows
            * @param        index : int, the index of the row being accessed
            * Returns: a row of the table
            **********************************************/
            public String formatRow( int rows, int index) {
                String r = "";         // a row of the table
                for(int i = 0; i <= rows; i++){
                    r += String.format("%d%s", this.getElement(index, i), ",");
                } // end for int = 0
                
                return r;
            } // end formatRow
            
            /**********************************************
            * Description:  formats out of a column
            * Interface: 
            * @param        index : int, the index of the column being accessed
            * Returns: a row of the table
            **********************************************/
            public String formatColumn(int index) {
                String c = "";         // a row of the table
                for(int i = 0; i <= this.getColumns(); i++){
                    c += String.format("%d%s", this.getElement(index, i), ",");
                } // end for int = 0
                
                return c;
            } // end formatColumn
            
            /**********************************************
            * Description:  formats output of table
            * Interface: 
            * @param        rowDirection : char, 'f' for forward or 'r' for reverse
            * @param        columnDirection : char, 'f' for forward or 'r' for reverse
            * Returns       s : a formatted table
            **********************************************/
            public String formatTable(char rowDirection, char columnDirection) {
                String s = "";         // a row of the table
                if(columnDirection == 'f'){
                    for(int i = 0; i < this.getRows(); i++){
                        if(rowDirection == 'f'){
                            for(int j = 0; j < this.getColumns(); j++){
                                s += String.format("%d%s", this.table[i][j], ",");
                                //System.out.println("Printing table element: " + this.table[0][1]);
                            } // end for int j = 0
                        } // end if columnDirection = 'f'
                        else{
                            for(int k = this.getColumns(); k > 0; k--){
                                s += String.format("%d%s", this.getElement(i,k), ",");
                            } // end for int k = 0
                        
                        } // end else rowDirection = 'r'
                    
                    s += String.format("%s", "\n");
                    } // end for int i = 0
                } // end if columnDirection = 'f'
                else{
                    for(int m = this.getRows(); m > 0; m--){
                        if(rowDirection == 'f'){
                            for(int g = 0; g < this.getColumns(); g ++){
                                s += String.format("%d%s", this.getElement(m,g), ",");
                            } // end for int g = 0
                        } // end if columnDirection = 'f'
                        else{
                            for(int p = this.getColumns(); p > 0; p --){
                                s += String.format("%d%s", this.getElement(m,p), ",");
                        } // end for int j = 0
                        
                        } // end else rowDirection = 'r'
                    
                        s += String.format("%s", "\n");
                        } // end for int m = 0
                    } // end else columnDirection = 'r'
                
                return s;
            } // end formatTable


            public String printTable() {
                String s = "";
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        s+= table[i][j] + " ";
                    }
                    s += "\n";
                }
                return s;
            } // end toString override

        /**********************************************
            * Description:  gets the sum of the table
            * Interface: 

            * Returns: a row of the table
            **********************************************/
            public int sumTable() {
                int sum = 0;         // the sum of the table
                for(int i = 0; i <= this.getRows(); i++){
                    for(int j = 0; j<= this.getColumns(); j++){
                        sum += this.getElement(i, j);
                    } // end for int j = 0
                } // end for int i = 0    
                
                return sum;
            } // end sumTable
            
        /**********************************************
            * Description:  gets the average of the table
            * Interface: 
            * Returns: a row of the table
            **********************************************/
            public int averageTable() {
                int sum = 0;        // the sum of the table
                int average = 0;    // the average of the table
                int elements = 0;   // the number of elements in the table
                
                for(int i = 0; i <= this.getRows(); i++){
                    for(int j = 0; j<= this.getColumns(); j++){
                        sum += this.getElement(i, j);
                    } // end for int j = 0
                } // end for int i = 0    
                
                for(int k = 0; k <= this.getColumns() - 1; k++){
                    elements += this.getColumns();     // finds total number of elements
                } // end for int k = 0
                
                average = sum / elements;   // calculates average
                return average;
            } // end averageTable        
 	
        // ********** mutators / setters **********

            /*****************************************
            * Description:  sets rows
            * Interface: 
            * @param        rows: int, the number of rows
            *****************************************/
            public void setRows(int rows){
                this.rows = rows;
            } // end setRows

            /*****************************************
            * Description:  sets columns
            * Interface: 
            * @param        columns: int[], the number of elements per row
            *****************************************/
            public void setRow(int columns){
                this.columns = columns;
            } // end setRow
            
            /*****************************************
            * Description:  sets table
            * Interface: 
            * @param        table: int, 2D array
            *****************************************/
            public void setTable(int[][] table) {
                this.table = table;
            } // end setTable

                
 }  // end class