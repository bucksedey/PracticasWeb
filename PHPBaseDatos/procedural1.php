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

    $sql="CREATE DATABASE Amigos";

    if(mysqli_query($conn,$sql)){
        echo "Se creó la base de datos";
    }else{
        echo "Error. No se creó la base de datos:".mysqli_error($conn);
    }
    mysqli_close($conn);
?>