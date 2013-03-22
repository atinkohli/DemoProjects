<?php
require_once(REST_DIR."/Logger/ScreenLogger.php");

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of DatabaseHelper
 *
 * @author kohli1
 */
class DatabaseHelper {
    
    var $connection=null;
    
    function __construct() {
        ScreenLogger::logInfo("DatabaseHelper initialized.");
    }

    public function initialize($connection, $result) {
        $conn_string = "host=localhost port=5432 dbname=atindb user=postgres password=pgdb123";
        $connection = pg_connect($conn_string);
        
        if(!$connection)
        {
            ScreenLogger::logError("Failed to connect to the Database");
            $result=false;
        } else {
            ScreenLogger::logInfo("Connected to the Database");
            $result=true;
        }
    }
    
    public function closeConnection(){
        pg_close($connection);
    }
    public function executeSelectQuery($connection, $tableName, $queryString);
    public function executeInsertQuery($connection, $tableName, $queryString);
    public function executeUpdateQuery($connection, $tableName, $queryString);
    public function executeDeleteQuery($connection, $tableName, $queryString);
    
}

?>
