<!DOCTYPE html>
<!--
FizzBuzz in PHP.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>FizzBuzz in PHP</title>
    </head>
    <body>
        <?php
        define("FIZZ", "Fizz");
        define("BUZZ", "Buzz");
        define("MAX", 100);
        
        function start() {
             $counter = 0;
             $endCounter = fizzBuzz1($counter);
             // Or use the second function:
             // $endCounter = fizzBuzz2($counter);
             echo "Total amount of FizzBuzzes " . $endCounter . "<br>";
             
        }
        
        function fizzBuzz1($c) {
            
            for($x = 0; $x < MAX; $x++) {
                if ($x % 3 == 0) {
                    if ($x % 5 == 0) {
                        echo "$x: " . FIZZ . BUZZ . "<br>";
                        $c++;
                    } else {
                        echo "$x: " . FIZZ . "<br>";
                    }
                }
                else if ($x % 5 == 0) {
                    echo "$x: " . BUZZ . "<br>";
                }
            }
            return $c;
            
        }
        
        function fizzBuzz2($c) {
            for ($x = 0; $x < MAX; $x++) {
                if (($x % 5 == 0) && ($x % 3 == 0)) {
                    echo "$x: FizzBuzz<br>";
                    $c++;
                }
                else if ($x % 5 == 0) {
                    echo "$x: Fizz<br>";
                } else if ($x % 3 == 0) {
                    echo "$x: Buzz<br>";
                }
            }
            return $c;  
        }
        
        start();
        ?>
    </body>
</html>
