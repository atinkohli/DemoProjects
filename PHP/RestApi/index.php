<?php
require_once("C:/My Data(Atin)/Personnel/GitHub/DemoProjects/PHP/RestApi/Common/Config.php");
require_once(REST_DIR."/rest/RestApiImpl.php");
require_once(REST_DIR."/Logger/ScreenLogger.php");

    $restObj=new RestApiImpl();
          
    $restObj->get();
    
    ScreenLogger::logInfo("Exit");
       
?>
