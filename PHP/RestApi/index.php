<?php
require_once("C:/My Data(Atin)/Personnel/GitHub/DemoProjects/PHP/RestApi/Common/Config.php");
require_once(REST_DIR."/rest/RestApiImpl.php");
require_once(REST_DIR."/Logger/ScreenLogger.php");

$restObj=new RestApiImpl();
          
$reqType=$_SERVER['REQUEST_METHOD'];
//ScreenLogger::logInfo($reqType);


if($reqType=="GET") {
    $restObj->get();
    ScreenLogger::logInfo($_GET['app']);
} else if($reqType=="POST") {
    $restObj->post();
    ScreenLogger::logInfo($_GET['app']);
} else if($reqType=="PUT") {
    $restObj->put();
} else if ($reqType=="DELETE") {
    $restObj->delete();
} else {
    ScreenLogger::logInfo("Un-Supported Request Type");
}

    
ScreenLogger::logInfo("Exit");
       
?>
