/* **********************************************************
 * Programmer:	Amy Mann
 * Class:		CS40S
 * 
 * Assignment:	01 2D Array Exercise
 *
 * Description:	describe the class you are creating
 *
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Table
 {  // begin class
 	
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********
 	
            int rows = 0;       // number of rows
            int colomns = 0;    // number of colomns
            
 	// ********** constructors ***********
 	
            /*****************************************
            * Description: default constructor
            * 
            * ****************************************/
                public Table(){
                    this.rows = 0;        // sets rows to zero
                    this.colomns = 0;     // sets colomns to zero
                }  // end default constructor
            
            /*****************************************
            * Description: initialized constructor
            * 
            * Interface:
            * 
            * @param        rows : int, number of rows
            * @param        colomns : int, number of colomns
            * 
            * ****************************************/
                public Table(int rows, int colomns){
                    this.rows = rows;
                    this.colomns = colomns;
                } // end initialized constructor
     
 	// ********** accessors / getters **********
 	
     //*****************************************************
    // Purpose: get the id number of the circle
    // Interface: IN: none
    // Returns: current state of property id (id number)
    // *****************************************************          	
 	// ********** mutators / setters **********
 
 }  // end class