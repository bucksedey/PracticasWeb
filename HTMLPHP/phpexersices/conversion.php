<?php
    $x=5;
    $y=10;
    function prueba3()
    {
        global $x, $y;
        $y=$x+$y;
    }
    prueba3();
    echo $y."<br>";
    function prueba4()
    {
        $GLOBALS['y']=$GLOBALS['x']+$GLOBALS['y'];
    }
    prueba4();
?>