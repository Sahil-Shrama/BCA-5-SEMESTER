<?php
$yoyo = array(
 "red",
 "rred",
 "rerd"

);

echo"<pre>";
// echo $yoyo;
print_r($yoyo);
echo $yoyo[1];
// php array lenght
$arrat = count($yoyo) ;

echo "<br>". $arrat ."<br>";

for ($i=0; $i <$arrat ; $i++) { 

    echo $yoyo[$i] ."<br>";
    # code...
}

echo "<ol>";
for ($i=0; $i <$arrat ; $i++) { 
    # code...
  echo "<li>".$yoyo[$i]."</li>";

}
echo "</ol>";

?>