<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
    <form>
        X: <input type="text" name="num1" />
		Y: <input type="text" name="num2" />
        Z: <input type="text" name="num3" />
		<input type="submit" />
    </form>
    <?php
    if(isset($_GET['num1']) && isset($_GET['num2']) && isset($_GET['num3'])) {
        $firstNum = intval($_GET['num1']);
        $secondNum = intval($_GET['num2']);
        $thirdNum = intval($_GET['num3']);
        $numbers=array($firstNum, $secondNum, $thirdNum);
        if($firstNum==0 || $secondNum==0 || $thirdNum==0) {
            echo 'Positive';
        }
        else {
            echo count(array_filter($numbers, function ($x) {
                return $x < 0;
            })) % 2 == 0 ? 'Positive' : 'Negative';
        }
    }

    ?>
</body>
</html>