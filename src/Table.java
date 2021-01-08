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
                public Table(int rows, int columns){
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
            * @param        row : int, the index of the row being accessed
            * Returns: a row of the table
            **********************************************/
            public String formatRow(int[][] table, int rows, int row) {
                String r = "";         // a row of the table
                for(int i = 0; i <= rows; i++){
                    r += String.format("%d%s", this.table[row][i], ",");
                } // end for int = 0
                
                return r;
            } // end formatRow
            
            /**********************************************
            * Description:  formats out of a column
            * Interface: 
            * @param        table : int, 2D array
            * @param        columns : int, the number of columns
            * @param        column : int, the index of the column being accessed
            * Returns: a row of the table
            **********************************************/
            public String formatColumn(int[][] table, int columns, int column) {
                String c = "";         // a row of the table
                for(int i = 0; i <= columns; i++){
                    c += String.format("%d%s", this.table[i][column], ",");
                } // end for int = 0
                
                return c;
            } // end formatColumn
            
            /**********************************************
            * Description:  formats output of table
            * Interface: 
            * @param        table : int, 2D array
            * @param        columns : int, the number of columns
            * @param        rows : int, the number of rows
            * Returns       s : a formatted table
            **********************************************/
            public String formatTable(int[][] table, int columns, int rows) {
                String s = "";         // a row of the table
                for(int i = 0; i <= rows; i++){
                    for(int j = 0; j<= columns; j++){
                        s += String.format("%d%s", this.table[i][j], ",");
                    } // end for int j = 0
                    
                    s += String.format("%s", "\n");
                } // end for int i = 0
                
                return s;
            } // end formatTable
 	
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