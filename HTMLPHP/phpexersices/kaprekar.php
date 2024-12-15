<?php

// Definimos una función para determinar si un número es un número de Kaprekar
function esNumeroKaprekar($n) {
    $cuadrado = $n * $n;
    $digitos = (string) $cuadrado;
    $longitud = strlen($digitos);
    for ($i = 1; $i < $longitud; $i++) {
        $parte1 = (int) substr($digitos, 0, $i);
        $parte2 = (int) substr($digitos, $i);
        if ($parte1 > 0 && $parte2 > 0 && $parte1 + $parte2 == $n) {
            return true;
        }
    }
    return false;
}

// Iteramos del 1 al 1000 y mostramos los números de Kaprekar
echo "Los números de Kaprekar en el intervalo [1,1000] son: ";
for ($i = 1; $i <= 1000; $i++) {
    if (esNumeroKaprekar($i)) {
        echo $i . " ";
    }
}

?>
