import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObtenerPokemonTest {

    @Test
    public void ejemplo(){
        Pokemon bulbasaur = ObtenerPokemonRequest.Companion.get(1);
        System.out.println(bulbasaur);
        Pokemon ivysaur = ObtenerPokemonRequest.Companion.get("bulbasaur");
        System.out.println(ivysaur);
    }


    @Test
    public void probarPokemon3Nombre(){
        // TODO Comprueba que al preguntar por Pokémon con id 3 obtienes a venasaur.
        Pokemon venasaur = ObtenerPokemonRequest.Companion.get(3);
        System.out.println(venasaur);
        Assertions.assertEquals(venasaur.getName(),"venusaur");
        Pokemon venasaurNombre = ObtenerPokemonRequest.Companion.get("venusaur");
        System.out.println(venasaurNombre);
        Assertions.assertEquals(venasaurNombre.getId(),3);
    }

    @Test
    public void probarPokemon3Id(){
        // TODO Comprueba que al preguntar por Pokémon con venasaur obtienes el id 2.
        Pokemon venasaurNombre = ObtenerPokemonRequest.Companion.get("venusaur");
        System.out.println(venasaurNombre);
        Assertions.assertEquals(venasaurNombre.getId(),3);
    }

    @Test
    public void probarPokemon3Peso(){
        // TODO Comprueba que al preguntar por Pokémon con 3 obtienes el peso de 1000.
        Pokemon venusaurPeso = ObtenerPokemonRequest.Companion.get(3);
        System.out.println(venusaurPeso);
        System.out.println("Test de peso echo");
        Assertions.assertEquals(venusaurPeso.getWeight(),1000);

    }

    @Test
    public void probarPokemon3Altura(){
        // TODO Comprueba que al preguntar por Pokémon con 3 obtienes la altura de 20.
        Pokemon venusaurAltura = ObtenerPokemonRequest.Companion.get(3);
        System.out.println(venusaurAltura);
        System.out.println("Test de altura echo");
        Assertions.assertEquals(venusaurAltura.getHeight(),20);
    }

    @Test
    public void probarPokemon4a6(){
        // TODO Comprueba que los Pokémon (id = 4, id = 5, id = 6) obtienes a charmander, charmeleon y charizard.
        Pokemon charmander = ObtenerPokemonRequest.Companion.get(4);
        Pokemon charmeleon = ObtenerPokemonRequest.Companion.get(5);
        Pokemon charizard = ObtenerPokemonRequest.Companion.get(6);
        System.out.println(charmander);
        System.out.println(charmeleon);
        System.out.println(charizard);
        Assertions.assertEquals(charmander.getName(),"charmander");
        Assertions.assertEquals(charmeleon.getName(),"charmeleon");
        Assertions.assertEquals(charizard.getName(),"charizard");

    }

    @Test
    public void probarPokemon25NombreEId(){
        // TODO Comprueba que cuando descargas un Pokémon con el id 25 obtienes un nombre, si descargas ese Pokémon por nombre obtienes un id.
        //  Comprueba que ambos Pokémon coinciden (el que has obtenido mediante el nombre y el que has obtenido mediante el id).
    }

    @Test
    public void probarPokemon140A150NombreEId(){
        // TODO Realiza lo mismo que el ejercicio anterior pero para un rango de Pokémons que van desde el 140 al 150.
        //  Estos números deberían poder cambiar fácilmente
        int minId = 140;
        int maxId = 150;

    }

}
