<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Ecuacion Segundo Grado</title>
</head>
<body>
    <form method="post">
        <label for="numero">Proporciona un número mayor que cero:</label>
        <input type="number" id="a" name="a" min="1" required>
        <input type="number" id="b" name="b" min="1" required>
        <input type="number" id="c" name="c" min="1" required>
        <button type="submit">Resolver Ecuacion</button>
    </form>

    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST")
    {
        if($a!=0 && $b!=0 && $c!=0)
        {
            function ecuacion($a, $b, $c, $x1, $x2)
            {
                $x1=(-$b+sqrt($b*$b-4*$a*$c))/2*$a;
                $x2=(-$b-sqrt($b*$b-4*$a*$c))/2*$a;
                
                echo "Esto es el valor de x1 $x1";
                echo "Esto es el valor de x1 $x2";
            }
        }
    }
    ?>
</body>
</html>