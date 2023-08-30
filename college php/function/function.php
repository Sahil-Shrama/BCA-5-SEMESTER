<?php

use JetBrains\PhpStorm\NoReturn;

function name()
{
    echo"<h1>my name is sahil </h1>";
}

name();

$val1=200;
$val2=300;
noreturn($val1,$val2);
function NoReturn($num1,$num2)
{
    echo"<br>printing the sum of number<br>";
    $sum=$num1+$num2;
    echo"sum is ".$sum;
}

$hub=12;
function returnn($hub)
 {
echo"<br>".$hub;
$meow=$hub;
return $meow;    
}

 $torronto=      returnn($hub);

echo"<h1>the return no is".$torronto;

function return2(){
return rand(1,100);
}

$rando=return2();
echo"<h2> the random no is ".$rando
?>