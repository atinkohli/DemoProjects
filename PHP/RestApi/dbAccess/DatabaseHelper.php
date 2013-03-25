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
    var $result = false;
    
    function __construct() {
        ScreenLogger::logInfo("DatabaseHelper initialized.");
    }

    public function initialize() {
        $conn_string = "host=localhost port=5432 dbname=atindb user=postgres password=pgdb123";
        $this->connection = pg_connect($conn_string);
        
        if(!$this->connection)
        {
            ScreenLogger::logError("Failed to connect to the Database");
            $this->result=false;
        } else {
            ScreenLogger::logInfo("Connected to the Database");
            $this->result=true;
        }
    }
    
    public function closeConnection(){
        ScreenLogger::logInfo("Closing Database Connection");
        pg_close($this->connection);
    }
    
    function getConnection(){
        return $this->connection;
    }
    
    function getResult(){
        return $this->result;
    }
}

?>
