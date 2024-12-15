<?php
    //Crear la base de datos
    $servername = "localhost";
    $username = "root";
    $password = "";
    $conn = new mysqli($servername, $username, $password);

    //Una vez aceptada la conexión
    if(!$conn){
        die("Sin conexión:".mysqli_connect_error());
    }
    echo "Conexión correcta";
    //Una vez creada la conexión y la base de datos

    $sql="CREATE TABLE Alumnos{
          id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY, firstname VARCHAR(30) NOT NULL,
          lastname VARCHAR(30) NOT NULL, email VARCHAR(50), reg_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE
          CURRENT_TIMESTAMP)";
    
    if(mysqli_query($conn,$sql)){
        echo "Se creó la tabla correctamente";
    }else{
        echo "Error. No se creó la base de datos:".mysqli_error($conn);
    }
    mysqli_close($conn);
?>