<?php
    class Persona{
        public $nombre='Benito';
        public $edad;

        public function getNombre(){
            return $this->nombre;
        }

        public function setEdad($edad){
            $this->edad = $edad;
        }

        public function getEdad(){
            return $this->edad;
        }
        
    }
    
    function datos($amigo){
        echo 'Nombre: '.$amigo->getNombre();
        echo 'Edad: '.$amigo->getEdad();
    }

    $alguien=new Persona();
    $alguien->nombre='Pancho Villa';
    $alguien->edad=20;

    $amigo=new Persona();
    $amigo->nombre='Emiliano Zapata';
    $amigo->edad=18;
    datos($alguien);
    echo "\n";
    datos($amigo);
?>