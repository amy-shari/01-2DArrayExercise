/* **********************************************************
 * Programmer:	Amy Mann
 * Class:       CS40S
 * 
 * Assignment:	01 2D Array Exercise
 *
 * Description:	describe the class you are creating
 *
 * ************************************************************/
 
 // import files here as needed
 
 
 public class Table
 {  // begin class
 	
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********
 	
            int rows = 0;       // number of rows
            int columns = 0;    // number of columns
            
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
                
 }  // end class