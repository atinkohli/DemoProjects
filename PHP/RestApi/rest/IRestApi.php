<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of RestApi
 *
 * @author kohli1
 */
class IRestApi {
    //put your code here
    
    // need methods to handle POST, GET, PUT, DELETE
    // need helper methods that can help me get the var for POST args and GET args
    //
    
    public function get();
    
    public function put();
    
    public function post();
    
    public function delete();
    
    public function fetchGetArgs($request, $response) {
        
    }
    
    public function fetchPostArgs($request, $response) {
        
    }
    
    public function fetchPutArgs($request, $response) {
        
    }
    
    public function fetchDeleteArgs($request, $response) {
        
    }
}

?>
