package Ty.ryy;

import Ty.ryy.connection.Dbconnect;

public class App 
{
    public static void main( String[] args )
    {
        Dbconnect x=new Dbconnect();
        //x.connect();
        x.createtable();
    }
}
