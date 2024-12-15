<?php

// Definimos los valores de las variables a, b y c
$a = 2;
$b = -7;
$c = 3;

// Calculamos el discriminante
$discriminante = $b * $b - 4 * $a * $c;

// Verificamos si el discriminante es negativo
if ($discriminante < 0) {
    // Si el discriminante es negativo, los valores son complejos
    $realPart = - $b / (2 * $a);
    $imaginaryPart = sqrt(- $discriminante) / (2 * $a);
    echo "Los valores son: " . $realPart . " + " . $imaginaryPart . "i y " . $realPart . " - " . $imaginaryPart . "i";
} else {
    // Si el discriminante es positivo o cero, los valores son reales
    $x1 = (- $b + sqrt($discriminante)) / (2 * $a);
    $x2 = (- $b - sqrt($discriminante)) / (2 * $a);
    echo "Los valores son: " . $x1 . " y " . $x2;
}

?>
