<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <?php
          foreach ($_GET as $key => $value) {
           echo "Key: $key; Value: $value<br />\n";
        }
         if($_GET['action'] == "POST") {
            echo $_GET['id'];
        } else {
            echo "NOT POST1";
        }
        ?>
    </body>
</html>
