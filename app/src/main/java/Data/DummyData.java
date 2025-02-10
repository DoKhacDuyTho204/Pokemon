package Data;

import com.example.pokemon.R;

import Model.Pokemon;
import java.util.ArrayList;
import java.util.List;

public class DummyData {
    public static List<Pokemon> getPokemonList() {
        List<Pokemon> pokemonList = new ArrayList<>();

        pokemonList.add(new Pokemon("Bulbasaur", R.drawable.p1, "Grass", 118, 49, 49, 45, 64));
        pokemonList.add(new Pokemon("Ivysaur", R.drawable.p2, "Grass", 155, 62, 63, 60, 142));
        pokemonList.add(new Pokemon("Venusaur", R.drawable.p3, "Grass", 190, 82, 83, 80, 236));
        pokemonList.add(new Pokemon("Charmander", R.drawable.p44, "Fire", 118, 52, 43, 65, 62));
        pokemonList.add(new Pokemon("Charmeleon", R.drawable.p5, "Fire", 151, 64, 58, 80, 142));
        pokemonList.add(new Pokemon("Charizard", R.drawable.p6, "Fire", 186, 84, 78, 100, 240));
        pokemonList.add(new Pokemon("Squirtle", R.drawable.p7, "Water", 127, 48, 65, 43, 63));
        pokemonList.add(new Pokemon("Wartortle", R.drawable.p8, "Water", 153, 63, 80, 58, 142));
        pokemonList.add(new Pokemon("Blastoise", R.drawable.p9, "Water", 188, 83, 100, 78, 239));
        pokemonList.add(new Pokemon("Pikachu", R.drawable.p10, "Electric", 112, 55, 40, 90, 112));
        pokemonList.add(new Pokemon("Raichu", R.drawable.p11, "Electric", 155, 90, 55, 110, 218));
        pokemonList.add(new Pokemon("Jigglypuff", R.drawable.p12, "Normal", 251, 45, 20, 20, 95));
        pokemonList.add(new Pokemon("Gengar", R.drawable.p13, "Ghost", 155, 65, 60, 110, 225));
        pokemonList.add(new Pokemon("Snorlax", R.drawable.p15, "Normal", 330, 110, 65, 30, 189));

        return pokemonList;
    }
}
