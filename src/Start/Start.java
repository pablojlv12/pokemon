package Start;

import gimnasio.Gimnasio;
import pokemon.Charmander;
import pokemon.Pikachu;
import pokemon.Pokemon;
import pokemon.Squirtle;
import robots.Robot;

public class Start {
	public static void main(String[] args) {
		
		
		Pikachu pika = new Pikachu("Pika");
		Robot doraemon = new Robot();
		
		Gimnasio goFit = new Gimnasio();
		goFit.batalla(pika, doraemon);

		
		
		Pokemon[] miColeccion = new Pokemon[3];
		miColeccion[0] = new Pikachu("Pika");
		miColeccion[1] = new Charmander("Char");
		miColeccion[2] = new Squirtle("Squirt");

		for (Pokemon pokemon : miColeccion) {

			System.out.println(pokemon.getNombre());

			switch (pokemon.getTipo()) {
			
			case Pokemon.POKEMON_ELECTRICO:System.out.println("electrico"); break;
			case Pokemon.POKEMON_FUEGO: System.out.println("fuego"); break;
			case Pokemon.POKEMON_AGUA:System.out.println("agua"); break;
			
			}
			System.out.println("--------------------");
		}
	}

}
