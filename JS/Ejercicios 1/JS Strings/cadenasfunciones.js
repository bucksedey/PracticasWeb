function cadenasYcaracteres() {
	var textoUsuario = prompt ('Ingresar el texto:');
	var mayusculas = textoUsuario.toUpperCase();		var minusculas = textoUsuario.toLowerCase();
	var primeraLetra = textoUsuario.charAt(0);		var ultimaLetra = textoUsuario.charAt(textoUsuario.length-1);
	var subcadena26 = textoUsuario.substring(2, 6);		var subcadena26sli = textoUsuario.slice(2,6);
	var subcadena5aFinal = textoUsuario.substring(5);	var subcadena5aFinalsli = textoUsuario.slice(5);
	var tresCharDesdeFinal = textoUsuario.slice(-5, -2);	var cincoUltimasLetras = textoUsuario.slice(-5);
	var indicePrimeraP = textoUsuario.indexOf('p');		var indicePrimeraPDesdeIndice5 = textoUsuario.indexOf('p', 5);
	var ultimaP = textoUsuario.lastIndexOf('p');		var subcadenasPorEspacios = textoUsuario.split(' ');
	var cambiaPrimeraPorSegundaLetra = textoUsuario.replace('e', 'E');
	var cadenaCambiaTodasePorE = textoUsuario.replace (/e/g, 'E');
	var reemplazoSubcadena = textoUsuario.replace (/plo/g, 'XX');
	var caracterIndice3 = textoUsuario[3];
	var msg = 'Entrada: '+ textoUsuario + '\n';
	msg = msg + 'Mayúsculas: ' + mayusculas +'\nLa entrada en minúsculas es: ' + minusculas + '\n';
	msg = msg + 'Primera letra: ' + primeraLetra + ' y última letra es: '+ultimaLetra + '\n';
	msg = msg + 'Subcadena entre 3a letra y 6a letra: ' + subcadena26 + '. Extraer con slice: '+subcadena26sli +'\n';
	msg = msg + 'Subcadena desde el caracter indice 5 hasta el final es: ' + subcadena5aFinal+ '. Si se extrae con slice: '+subcadena5aFinalsli+'\n';
	msg = msg + 'Uso de slice negativo para extraer del 5o por atrás al antepenúltimo caracter: ' + tresCharDesdeFinal+ '\n';
	msg = msg + 'Cinco últimos caracteres: '+ cincoUltimasLetras + '\n';
	msg = msg + 'Indice posición de la primera p en la cadena: ' + indicePrimeraP + ' y de la última p es: ' +ultimaP +'\n';
	msg = msg + 'Indice primera p desde la 5a posición es: ' + indicePrimeraPDesdeIndice5 +'\n';
	msg = msg + 'División de subcadenas por espacios: ';
	for (var i=0; i<subcadenasPorEspacios.length; i++) {
		msg = msg + 'Subcadena ' + (i+1) + ':\<\<'+subcadenasPorEspacios[i] + '\>\> '; }
	msg = msg + '\n';
	msg = msg + 'Primera e reemplazada por E: ' + cambiaPrimeraPorSegundaLetra + '\n';
	msg = msg + 'Todas las e reemplazada por E: ' + cadenaCambiaTodasePorE + '\n';
	msg = msg + 'Reemplazando plo por XX: ' + reemplazoSubcadena + '\n';
	msg = msg + 'El carácter con índice 3 es: ' + caracterIndice3;
	alert (msg);
}