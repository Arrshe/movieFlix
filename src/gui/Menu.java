/*
 * @author Edu
 * 
 * @version 1.0
 */
package gui;

public class Menu {

	public static void principal() {
		System.out.println("\n********** MEN� PRINCIPAL **********\n");
		System.out.println("�Qu� quieres hacer?");
		System.out.println("1. Gestionar Usuarios");
		System.out.println("2. Gestionar Pel�culas");
		System.out.println("3. Salir del programa");
	}
	
	public static void usuarios() {
		System.out.println("\n********** GESTI�N DE USUARIOS **********\n");
		System.out.println("�Qu� quieres hacer?");
		System.out.println("1. Listar todos los usuarios");
		System.out.println("2. A�adir un usuario");
		System.out.println("3. Eliminar un usuario");
		System.out.println("4. Modificar un usuario");
		System.out.println("5. Volver al men� principal");
	}
	
	public static void modificarUsuario() {
		System.out.println("\n********** MODIFICAR USUARIO **********\n");
		System.out.println("�Qu� quieres modificar del usuario?");
		System.out.println("1. Nombre");
		System.out.println("2. Ciudad de residencia");
		System.out.println("3. Fecha de nacimiento");
	}
	
}
