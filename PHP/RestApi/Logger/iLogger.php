<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kohli1
 */
interface iLogger {
    public static function logError($error);
    public static function logWarning($warning);
    public static function logInfo($info);
}

?>
