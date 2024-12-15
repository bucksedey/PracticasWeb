<!DOCTYPE html>
<html>
<head>
    <title>Número Maravilloso</title>
</head>
<body>
    <h1>Número Maravilloso</h1>
    <form method="post">
        <label for="number">Introduzca un número:</label>
        <input type="number" name="number" id="number" required>
        <button type="submit">Comprobar</button>
    </form>

    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $num = intval($_POST["number"]);

        if ($num > 0) {
            echo "<h2>Iteraciones:</h2>";
            $iterations = 0;

            while ($num != 1) {
                $iterations++;
                if ($num % 2 == 0) {
                    $num = $num / 2;
                } else {
                    $num = $num * 3 + 1;
                }
                echo "Iteración $iterations: $num<br>";
            }

            echo "<h3>Total de iteraciones: $iterations</h3>";
        } else {
            echo "<p>Error: Introduzca un número positivo mayor que 0.</p>";
        }
    }
    ?>
</body>
</html>
