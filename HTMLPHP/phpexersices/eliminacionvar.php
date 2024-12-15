<?php
    function prueba5()
    {
        static $x=0;
        echo $x."<br>";
        $x++;
    }
    prueba5();
    prueba5();
?>