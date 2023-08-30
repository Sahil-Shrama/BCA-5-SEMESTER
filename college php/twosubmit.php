<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form method="post">
   <input type="email" name="e-mail" id="" placeholder="your email">
   <button type="submit" name="submit1">submit</button>

    </form>

    <div><form method="post">

        <input type="color" name="color" id="">
        <input type="text" name="text" placeholder="enter text">

        <button type="submit" name="submit2">submit</button>

    </form>
    <p>

        <?php 

        
        if(isset($_POST['submit1'])){

        $hy = $_POST['e-mail'];
        
        echo 'the no is '.$hy;
        
        
        
        }

        if(isset($_POST['submit2'])){
            $mt = $_POST['text'];
            $col =$_POST['color'];
            echo 'text is '.$mt;
            echo 'color is '.$col;
        }
        
        
        ?>


    </p>
</div>
</body>
</html>