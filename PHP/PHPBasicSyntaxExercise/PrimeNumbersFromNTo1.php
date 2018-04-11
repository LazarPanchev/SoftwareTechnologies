<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
</head>
<body>
    <form>
        N: <input type="text" name="num" />
        <input type="submit" />
    </form>
    <?php
    if(isset($_GET['num'])) {
        $number=intval($_GET['num']);

        while ($number>0) {
            if(isPrime($number)) {
                echo $number . ' ';
            }
            $number--;
        }
    }
    function isPrime($num) {
        if($num<2) {
            return false;
        }

        for($i = 2; $i <=$num/2; $i++) {
                if($num % $i == 0) {
                    return false;
                }
            }
            return true;
    }
    ?>
</body>
</html>