<?php
$product = array(
    "productid"=>"name",
    "prroduct-name"=>"exin",
    "product-price"=>500
);
$at = count($product);
echo"<pre>";
print_r($product);
echo"<br>";
foreach ($product as $key => $value) {
    # code
    echo"<br>".$key."=".$value."<br>";
}
?>