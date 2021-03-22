/**
 * 
 * Fecha: 16/03/2021
 * 
 * @author Edu
 * 
 * @version 1.0
 * 
 *          Clase Menu
 * 
 *          Clase que establece el men� gr�fico de la aplicaci�n
 * 
 * 
 */

package gui;

import utilidades.Escritor;

public class Menu {

	public static void principal() {
		Escritor.str("\n********** MEN� PRINCIPAL **********\n");
		Escritor.str("�Qu� quieres hacer?");
		Escritor.str("1. Gestionar Usuarios");
		Escritor.str("2. Gestionar Pel�culas");
		Escritor.str("3. Salir del programa");
	}
	
	public static void usuarios() {
		Escritor.str("\n********** GESTI�N DE USUARIOS **********\n");
		Escritor.str("�Qu� quieres hacer?");
		Escritor.str("1. Listar todos los usuarios");
		Escritor.str("2. A�adir un usuario");
		Escritor.str("3. Eliminar un usuario");
		Escritor.str("4. Modificar un usuario");
		Escritor.str("5. Volver al men� principal");
	}
	
	public static void modificarUsuario() {
		Escritor.str("\n********** MODIFICAR USUARIO **********\n");
		Escritor.str("�Qu� quieres modificar del usuario?");
		Escritor.str("1. Nombre");
		Escritor.str("2. Ciudad de residencia");
		Escritor.str("3. Fecha de nacimiento");
	}
	
}
