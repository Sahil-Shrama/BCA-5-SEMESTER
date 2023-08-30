<?php
$arrmay=array('sahil','sahil','sharma');
foreach ($arrmay as $key =>  $value) {
    # code...
    echo $value;
    echo"<br>".$key;
}
echo"<br>";

$arrmay[3]="arigato";

foreach ($arrmay as $key => $value) {
    # code...
echo$value;
}


?>