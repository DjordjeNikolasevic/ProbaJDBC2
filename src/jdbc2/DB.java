package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nikola Pesic
 * Class used for establishing connection with SQLserver for specific database.
 * Connection should be retrieved by calling DB.getInstance().getConnection().
 * NOTE: Fill with proper credentials and database name.
 * 
 */
public class DB 
{
    // SQLServer username.
    //
    private static final String username="ETF\nd160074d";
    
    // SQLserver password.
    //
    private static final String password="";
    
    // Name of the database.
    //
    private static final String database="TrzniCentar";
    
    // Default port for SQLserver.
    //
    private static final int port=1433;
    
    // Name of SQLserver.
    //
    private static final String serverName="DESKTOP-M68AUDH";
    
    //jdbc:sqlserver://[serverName[\instanceName][:portNumber]][;property=value[;property=value]]
    //
    private static final String connectionString="jdbc:sqlserver://"+serverName+":"+port+";"+"database="+database+";integratedSecurity=true";
    
    // Database connection.
    //
    private Connection connection;   

    
    //Database instance.
    //
    private static DB db=null;
    
        
    // Database constructor.
    // Creates database connection.
    //
    private DB()
    {
        try 
        {
            connection=DriverManager.getConnection(connectionString);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Create Singleton database object.
    //
    public static DB getInstance()
    {
        if(db==null)
        {
            db=new DB();
        }
        return db;
    }
    
    // Connection getter.
    //
    public Connection getConnection() 
    {
        return connection;
    }
}
