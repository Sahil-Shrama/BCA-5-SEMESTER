<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
<style> 
.lg{
    background: linear-gradient( to right, rgb(150, 177, 146),rgb(180, 238, 214));
}
</style>
</head>
<body>
    
    <div class="row  flex-column flex-lg-row">
        <div class="col-6">
        <div class="d-flex flex-column">
            <img class="w-100" src="images.jpg" alt="" srcset="">
            <div class=" mx-auto" style="width: 19rem;" ><img src="download (2).jpg" class="w-75" alt="" srcset=""></div>
        </div>
        </div>
        <div class="lg d-flex col-6 flex-column ">
            <h2 class="mx-auto">TEMPERATURE</h2>
            <h5 class="ps-2 mx-auto">  CONVERTOR </h5>
              <hr>
            <div class="p-3 d-flex justify-content-center align-items-center mt-5">
                <form method="post" >
                    <input class="form-control" type="text" name="number" id="" placeholder="enter your number">
                <div class="d-flex  my-3"><input type="radio" name="calceuis" value="celc"><h3>
                    CONVERT </h3> <h5 class="ps-2">to cencius</h5></div>
                <div class="d-flex my-3 "><input type="radio" name="calceuis" value="fer"><h3>
                    CONVERT </h3> <h5 class="ps-2">to farahniet</h5>
                </div>
                <button class="btn btn-dark mx-auto" type="submit" name = "submit"> check result</button>
                </form>
            </div>

            <p  class="placeholder-gw h3 fw-bold  mx-auto  w-25">
                <?php
                if (isset($_POST['submit'])) {
                 $convert = $_POST['number'];
                 $to = $_POST['calceuis'];
    
    
                 if ($to=='celc') {
                    $a = ($convert-32)*5/9;
                    echo 'converted to celcius '.$a.'f';
                 }
                 
                 elseif ($to=='fer') {
                    $a = ($convert * (9/5)+32);
                 }
                    else {
                      echo "please enter conrrect value ";                    
                    }
                 }
                 
                 
    
                 
                
    
    
                ?>
            </p>
        </div>

    </div>    

    
</body>
</html>