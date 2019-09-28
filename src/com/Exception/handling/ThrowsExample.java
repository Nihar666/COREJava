package com.Exception.handling;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsExample  {
     void methodOne()throws SQLException{
    	 //this method may throw SQLException
     }
     
     void methodTwo() throws IOException{
    	 //This method may throw IOException
     }
     
     void methodThree() throws ClassNotFoundException {
    	 //This method may throw ClassNotFoundException
     }
}
