function iniciar(){					// Ordenar un arreglo mediante sort.
	var a = [ 10, 1, 9, 2, 8, 3, 7, 4, 6, 5 ];
	imprimirArreglo( "Elementos en orden original: ", a, document.getElementById( "arregloOriginal" ) );
	a.sort( compararEnteros );			// ordenar el arreglo
	imprimirArreglo( "Elementos en orden ascendente: ", a, document.getElementById( "arregloOrdenado" ) );
}
function imprimirArreglo( encabezado, elArreglo, salida ){ // imprimir el encabezado seguido del contenido de elArreglo
	salida.innerHTML = encabezado + elArreglo.join( " " );
}
function compararEnteros( valor1, valor2 ){		// función de comparación para usar con sort
	return parseInt( valor1 ) - parseInt( valor2 );
}							// fin de la función compararEnteros
window.addEventListener( "load", iniciar, false );