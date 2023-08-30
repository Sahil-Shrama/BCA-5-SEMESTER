<?php
$product=array(
    array(
    "productid"=>"po1",
    "productname"=>"pen",
    "productcost"=>50,
    "productquality"=>500
    ),
    array(
    "productid"=>"po1",
    "productname"=>"pen",
    "productcost"=>50,
    "productquality"=>500
    ),
    array(
    "productid"=>"po1",
    "productname"=>"pen",
    "productcost"=>50,
    "productquality"=>500
    ),
    array(
    "productid"=>"po1",
    "productname"=>"pen",
    "productcost"=>50,
    "productquality"=>500
    ),
);

foreach ($product as $value) {
  
  foreach ($value as $key => $name) {
    echo$key." = ".$name."<br> ";
    # code...
  }
  echo"<br>";
    # code...
};

echo"<table border='1'>
<th>productid</th>
<th>productname</th>
<th>productcost</th>
<th>productquntity</th>";

foreach ($product as  $value)
 {
    echo"<tr>";
    foreach ($value as  $item) {
        # code...
        echo"<td>".$item."</td>;
    }
    

}



?>