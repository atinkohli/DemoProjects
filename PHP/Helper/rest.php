<?php

/*$url ="http://www.timesofindia.indiatimes.com/";
$response = file_get_contents($url);
echo $response; */
 $host  = $_SERVER['HTTP_HOST'];
$uri   = rtrim(dirname($_SERVER['PHP_SELF']), '/\\');
$extra='db.php';
header("Location: http://$host$uri/$extra");

?>