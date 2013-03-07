<?php

echo "Welcome to the first database connect program";
echo "<br/>";

$conn_string = "host=localhost port=5432 dbname=atindb user=postgres password=pgdb123";
$db = pg_connect($conn_string);
if(!$db)
{
echo "Failed to connect";
echo "<br/>";
} else {
echo "Connected";
echo "<br/>";
}

$query="SELECT * from testing";
echo "Query formed";
echo "<br/>";

$result = pg_query($query);
echo "Query executed";
echo "<br/>";

while($row = pg_fetch_assoc($result))
{
echo $row['Id'];
echo "<br/>";
}

echo "Going to close connection";

pg_close($con);
?>