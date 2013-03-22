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
class UserDataAccess {

    function __construct() {
       // parent::__construct();
        ScreenLogger::logInfo("UserDataAccess initialized.");
    }
    
}

?>
