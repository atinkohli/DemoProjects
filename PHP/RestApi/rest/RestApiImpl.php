<?php
//require_once("IRestApi.php");
require_once(REST_DIR."/Logger/ScreenLogger.php");
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
    }
    
    public function post(){
        ScreenLogger::logInfo("You reached the post() method");
    }

    public function put(){
        ScreenLogger::logInfo("You reached the put() method");
    }

    public function delete(){
        ScreenLogger::logInfo("You reached the delete() method");
    }

}

?>
