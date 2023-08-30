<?php error_reporting (E_ALL ^ E_NOTICE); ?>
<?php error_reporting(0); ?> 

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
   
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
    <style>
 body{
    
    height: 100vh;
    background: linear-gradient(to right,white,rgb(202, 167, 228));
   /* justify-content: center;
   align-items: center;  */
}
 #center{
    
    background-color: rgb(35, 32, 32);
    width: 500px;
    height: 400px;
    color: white;
 }
 
.formtb{
    color: white;
    background-color: black;
}

.s-button{
    font-size: 18px;
        font-weight: 700;
        /* font weight for the thickness  */
        border-radius: 3px;
        padding: 12px 20px;
        /* margin: 50px; */
        border: none;
        color: white;
        background-color: lightseagreen;
        transition: all ease 1s;
        
    }

    .s-button:hover{
        box-shadow:20px 10px 0 rgb(122, 223, 164);
    }




    </style>


</head>
<body>
    <div id="center" class="row container-fluid mx-auto">
        
<div class="col-6 " style="padding-top: 150px;"  >
<div style="font-weight: 400; font-size: 40px;" class="border border-5 border-top-0 border-end-0 border-bottom-0">
    
    php 
    <br> calculator

</div>    
    
    </div>
<div class="col-6">
    <form method="post" style="padding-top: 48px; ">
        <input  class="formtb container"  type="text" placeholder="enter number one" name="num1">
         <div class="mt-3">
        <input  class="container formtb mx-auto" type="text" placeholder="enter number two" name="num2"
         </div>
         <div class="container mt-5 ">
            <select name="select" id="" class="w-100">
                <option value="add">ADD</option>
                <option value="sub">SUB</option>
                <option value="multiply">MULTIPLY</option>
                <option value="division">DIVION</option>
            </select>
         </div>
         <div class="container m-5">
            <button  type="submit" class="s-button"  name="submit">submit</button>
         </div>
    </form>
</div>
<div class="texteffect">
    <p class="mx-auto fw-bolder text-info lh-sm">
<?php
if(isset($_POST['submit']))
   $num1 = $_POST['num1'];
   $num2 = $_POST['num2'];
   $select = $_POST['select'];
   $ns=2; 
   if ($num1===$ns) {

    echo 'enter valid number';
   }
   else{
switch ($select) {
    case 'add':
        $sum=$num1+$num2;
        echo 'sum of '.$num1.' and '.$num2.' is '.$sum;
        break;
    case 'sub':
        $sum=$num1-$num2;
        echo 'subtraction of number is '.$num1-$num2;
        break;
    case 'multiply':
        $multiply=$num1*$num2;
        echo 'multiplication of number is '.$multiply;
        break;
    case 'divison':
        $sum=$num1/$num2;
        echo 'divison of number is '.$divison;
        break;

        
    
    default:
    
    echo 'welocome <br>  enter  number';
    
    
        
        
        break;
}
   }
?>

</p></div>

    </div>
    
</body>
</html>