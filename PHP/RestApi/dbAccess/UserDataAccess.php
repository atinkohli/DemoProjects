<?php
require_once(REST_DIR."/dbAccess/DatabaseHelper.php");
require_once(REST_DIR."/Logger/ScreenLogger.php");
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of UserDataAccess
 *
 * @author kohli1
 */
class UserDataAccess extends DatabaseHelper {

    function __construct() {
        parent::__construct();
        ScreenLogger::logInfo("UserDataAccess initialized.");
        $this->initialize();
    }
    
    public function executeSelectQuery($tableName, $queryString){
      ScreenLogger::logInfo("Inside the execute Select Query");
      $query= "select ".$queryString." from ".$tableName;
      $output = pg_query($query);
      while($row = pg_fetch_assoc($output))
      {
          ScreenLogger::logInfo($row['Id']);
      }
      $this->closeConnection();
    }
    
    public function executeInsertQuery($tableName, $queryString){
        ScreenLogger::logInfo("Inside the execute Insert Query");
    }
    public function executeUpdateQuery($tableName, $queryString){
      ScreenLogger::logInfo("Inside the execute Update Query");
    }
    public function executeDeleteQuery($tableName, $queryString){
      ScreenLogger::logInfo("Inside the execute Delete Query");
    }
}

?>
