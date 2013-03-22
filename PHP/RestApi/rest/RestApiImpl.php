<?php
//require_once("IRestApi.php");
require_once(REST_DIR."/Logger/ScreenLogger.php");
require_once (REST_DIR."/dbAccess/UserDataAccess.php");
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of RestApiImpl
 *
 * @author kohli1
 */
class RestApiImpl {
    
    public function __construct() {
        ScreenLogger::logInfo("RestApi Oject Created.");
    } 
    public function get(){
        ScreenLogger::logInfo("You reached the get() method");
        
        foreach ($_GET as $key => $value) {
            ScreenLogger::logInfo("Key: $key; Value: $value");
        }
    }
    
    public function post(){
        ScreenLogger::logInfo("You reached the post() method");
        foreach ($_POST as $key => $value) {
            ScreenLogger::logInfo("Key: $key; Value: $value");
        }
        //$dbUser=new UserDataAccess();
        //$dbUser->initialize($connection, $result);
    }

    public function put(){
        ScreenLogger::logInfo("You reached the put() method");
        foreach ($_PUT as $key => $value) {
            ScreenLogger::logInfo("Key: $key; Value: $value");
        }
    }

    public function delete(){
        ScreenLogger::logInfo("You reached the delete() method");
        foreach ($_DELETE as $key => $value) {
            ScreenLogger::logInfo("Key: $key; Value: $value");
        }
    }

}

?>
