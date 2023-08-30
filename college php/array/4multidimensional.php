<?php
$myarray=array(
    array(10,20,30),
    array(20,20,30),
    array(30,20,30)
);

echo"<pre>";
print_r($myarray);

for ($row=0; $row <3 ; $row++) { 

    for ($col=0; $col < 3; $col++) { 
        echo$myarray[$row][$col]." ";
        # code...
    }
    echo"<br>";
    # code...
}


?>