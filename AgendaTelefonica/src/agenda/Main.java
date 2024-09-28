package agenda;

public class Main 
{
	public static void main(String args[]) 
	{
		Agenda agendita = new Agenda();
		Contacto contacto = new Contacto();
		Contacto contacto1 = new Contacto();
		Contacto contacto2 = new Contacto();
		
		
		contacto.setNombre("Alonso");
		contacto.setNumero("5632418065");
		
		contacto1.setNombre("Roberto");
		contacto1.setNumero("5534408063");
		
		contacto2.setNombre("Luis");
		contacto2.setNumero("5666493665");
		
		
		agendita.registrarContacto(contacto);
		agendita.registrarContacto(contacto1);
		agendita.registrarContacto(contacto2);
		agendita.listarContactos();
		agendita.buscarContacto("Alonso");
		System.out.println("Contactos disponibles: " + agendita.disponibles());	
	}
}
