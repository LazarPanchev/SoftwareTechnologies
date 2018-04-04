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
        $firstFibo=1;
        $secondFibo=1;
        $thirdFibo=2;
        $result=$firstFibo+$secondFibo+$thirdFibo;

        for($i = 0; $i < $number; $i++) {
            $result=$firstFibo;
            $firstFibo = $secondFibo;
            $secondFibo=$thirdFibo;
            $thirdFibo=$firstFibo+$secondFibo+$result;

            echo $result . " ";

        }
    }
    ?>
</body>
</html>