<?php
    class Persona{
        public $nombre='Benito';
        public $edad;
        public function getNombre(){
            return $this -> nombre;
        }
    }

    $alguien = new Persona();
    $alguien->nombre='Pancho Villa';
    $alguien->edad=30;

    $amigo=new Persona();
    $amigo->nombre='Emiliano';
    $amigo->edad=18;
?>