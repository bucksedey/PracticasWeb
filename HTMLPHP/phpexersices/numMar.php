<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Cuadro Mágico</title>
</head>
<body>
    <form method="post">
        <label for="numero">Proporciona un número natural:</label>
        <input type="number" id="numero" name="numero" min="1" required>
        <button type="submit">Verificar</button>
    </form>

    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") 
    {
        function esMaravilloso($numero)
        {
            while ($numero != 1)
            {
                if ($numero % 2 == 0)
                {
                    $numero /= 2;
                }
                else
                {
                    $numero = 3 * $numero + 1;
                }
                if ($numero < 1)
                {
                    return false;
                }
            }
            return true;
        }

        $numero = intval($_POST["numero"]);

        if (esMaravilloso($numero))
        {
            echo "El número $numero es maravilloso.";
        }
        else
        {
            echo "El número $numero no es maravilloso.";
        }
    }
    ?>
</body>
</html>
