<?php
require_once("C:/My Data(Atin)/Personnel/GitHub/DemoProjects/PHP/RestApi/Common/Config.php");
require_once(REST_DIR."/Logger/iLogger.php");
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of ScreenLogger
 *
 * @author kohli1
 */
class ScreenLogger implements iLogger {
    
    public static function logError($error) {
        echo "<br/>ERROR : ".$error;
    }

    public static function logInfo($info) {
        echo "<br/>INFO : ".$info;
    }

    public static function logWarning($warning) {
        echo "<br/>WARNING : ".$warning;
    }    
}

?>
