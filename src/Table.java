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
 
 
 public class Table
 {  // begin class
 	
 	// *********** class constants **********
            
            final int MAXROW = 20;      // max # of rows
            final int MAXCOL = 20;      // max # of cols
 	
 	// ********** instance variable **********
 	
            int rows = 0;       // number of rows
            int columns = 0;    // number of columns
            
            int[][] table = new int[MAXROW][MAXCOL];    // pointer to table
            
 	// ********** constructors ***********
 	
            /*****************************************
            * Description: default constructor
            * 
            * ****************************************/
                public Table(){
                    this.rows = 0;        // sets rows to zero
                    this.columns = 0;     // sets columns to zero
                }  // end default constructor
            
            /*****************************************
            * Description: initialized constructor
            * 
            * Interface:
            * 
            * @param        rows : int, number of rows
            * @param        columns : int, number of columns
            * 
            * ****************************************/
                public Table(int[][] table, int rows, int columns){
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
            * Purpose: gets columns
            * Interface: IN: none
            * Returns: current state of property rows
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
            * @param    table[][] : int table
            * @param    x : int, first index being accessed
            * @param    y : int, second index being accessed
            * Returns: an element of the table
            *****************************************************/  
            public int getElement(int table[][], int x, int y){
                int element = this.table[x][y];      // accesses element of table
                return element;
            } // end getElement
            
            /**********************************************
            * Description:  formats output of a row
            * Interface: 
            * @param        table : int, 2D array
            * @param        rows : int, the number of rows
            * @param        index : int, the index of the row being accessed
            * Returns: a row of the table
            **********************************************/
            public String formatRow(int[][] table, int rows, int index) {
                String r = "";         // a row of the table
                for(int i = 0; i <= rows; i++){
                    r += String.format("%d%s", this.table[index][i], ",");
                } // end for int = 0
                
                return r;
            } // end formatRow
            
            /**********************************************
            * Description:  formats out of a column
            * Interface: 
            * @param        table : int, 2D array
            * @param        columns : int, the number of columns
            * @param        index : int, the index of the column being accessed
            * Returns: a row of the table
            **********************************************/
            public String formatColumn(int[][] table, int columns, int index) {
                String c = "";         // a row of the table
                for(int i = 0; i <= columns; i++){
                    c += String.format("%d%s", this.table[i][index], ",");
                } // end for int = 0
                
                return c;
            } // end formatColumn
            
            /**********************************************
            * Description:  formats output of table
            * Interface: 
            * @param        table : int, 2D array
            * @param        columns : int, the number of columns
            * @param        rows : int, the number of rows
            * @param        rowDirection : char, 'f' for forward or 'r' for reverse
            * @param        columnDirection : char, 'f' for forward or 'r' for reverse
            * Returns       s : a formatted table
            **********************************************/
            public String formatTable(int[][] table, int columns, int rows, char rowDirection, char columnDirection) {
                String s = "";         // a row of the table
                if(columnDirection == 'f'){
                    for(int i = 0; i <= rows; i++){
                        if(rowDirection == 'f'){
                            for(int j = 0; j<= columns; j++){
                                s += String.format("%d%s", this.table[i][j], ",");
                            } // end for int j = 0
                        } // end if columnDirection = 'f'
                        else{
                            for(int k = columns; k>= 0; k--){
                                s += String.format("%d%s", this.table[i][k], ",");
                            } // end for int k = 0
                        
                        } // end else rowDirection = 'r'
                    
                    s += String.format("%s", "\n");
                    } // end for int i = 0
                } // end if columnDirection = 'f'
                else{
                    for(int m = rows; m >= 0; m--){
                        if(rowDirection == 'f'){
                            for(int g = 0; g <= columns; g ++){
                                s += String.format("%d%s", this.table[m][g], ",");
                            } // end for int g = 0
                        } // end if columnDirection = 'f'
                        else{
                            for(int p = columns; p >= 0; p --){
                                s += String.format("%d%s", this.table[m][p], ",");
                        } // end for int j = 0
                        
                        } // end else rowDirection = 'r'
                    
                        s += String.format("%s", "\n");
                        } // end for int m = 0
                    } // end else columnDirection = 'r'
                
                return s;
            } // end formatTable
            
        /**********************************************
            * Description:  gets the sum of the table
            * Interface: 
            * @param        table : int, 2D array
            * @param        columns : int, the number of columns
            * @param        rows : int, the number of rows
            * Returns: a row of the table
            **********************************************/
            public int getSumTable(int[][] table, int columns, int rows) {
                int sum = 0;         // the sum of the table
                for(int i = 0; i <= rows; i++){
                    for(int j = 0; j<= columns; j++){
                        sum += this.table[i][j];
                    } // end for int j = 0
                } // end for int i = 0    
                
                return sum;
            } // end getSumTable
            
        /**********************************************
            * Description:  gets the average of the table
            * Interface: 
            * @param        table : int, 2D array
            * @param        columns : int, the number of columns
            * @param        rows : int, the number of rows
            * Returns: a row of the table
            **********************************************/
            public int getAverageTable(int[][] table, int columns, int rows) {
                int sum = 0;        // the sum of the table
                int average = 0;    // the average of the table
                for(int i = 0; i <= rows; i++){
                    for(int j = 0; j<= columns; j++){
                        sum += this.table[i][j];
                    } // end for int j = 0
                } // end for int i = 0    
                average = sum / (columns * rows);   // calculates average (CURRENTLY INCORRECT BECAUSE OF EXTRA ZEROS)
                return average;
            } // end getSumTable        
 	
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
            * @param        columns: int, the number of columns
            *****************************************/
            public void setColumns(int columns){
                this.columns = columns;
            } // end setColumns
            
            /*****************************************
            * Description:  sets table
            * Interface: 
            * @param        table: int, 2D array
            *****************************************/
            public void setTable(int[][] table) {
                this.table = table;
            } // end setTable
                
 }  // end class