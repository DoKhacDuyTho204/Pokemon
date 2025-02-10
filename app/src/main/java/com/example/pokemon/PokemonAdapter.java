package com.example.pokemon;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

import Model.Pokemon;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder> {

    private List<Pokemon> pokemonList;

    public PokemonAdapter(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    @NonNull
    @Override
    public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pokemon_item, parent, false);
        return new PokemonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonViewHolder holder, int position) {
        Pokemon pokemon = pokemonList.get(position);
        holder.pokemonName.setText(pokemon.getName());
        holder.pokemonImage.setImageResource(pokemon.getImageResource());

        // Thiết lập màu nền cho CardView
        int backgroundColor;
        switch (pokemon.getName().toUpperCase()) {
            case "BULBASAUR":
                backgroundColor = Color.parseColor("#A5D6A7");
                break;
            case "CHARMANDER":
                backgroundColor = Color.parseColor("#FFCC80");
                break;
            case "IVYSAUR":
                backgroundColor = Color.parseColor("#81C784");
                break;
            case "CHARMELEON":
                backgroundColor = Color.parseColor("#FFAB91");
                break;
            case "CHARIZARD":
                backgroundColor = Color.parseColor("#FF7043");
                break;
            case "VENUSAUR":
                backgroundColor = Color.parseColor("#4CAF50");
                break;
            case "SQUIRTLE":
                backgroundColor = Color.parseColor("#1e90ff");
                break;
            case "WARTORTLE":
                backgroundColor = Color.parseColor("#6a5acd");
                break;
            case "BLASTOISE":
                backgroundColor = Color.parseColor("#4682b4");
                break;
            case "PIKACHU":
                backgroundColor = Color.parseColor("#ffd700");
                break;
            case "RAICHU":
                backgroundColor = Color.parseColor("#daa520");
                break;
            case "JIGGLYPUFF":
                backgroundColor = Color.parseColor("#ffc0cb");
                break;
            case "GENGAR":
                backgroundColor = Color.parseColor("#1e90ff");
                break;
            case "SNORLAX":
                backgroundColor = Color.parseColor("#708090");
                break;
            default:
                backgroundColor = Color.WHITE;
                break;
        }
        holder.cardView.setCardBackgroundColor(backgroundColor);

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), PokemonDetailActivity.class);
            intent.putExtra("pokemonName", pokemon.getName());
            intent.putExtra("pokemonImage", pokemon.getImageResource());
            intent.putExtra("pokemonType", pokemon.getType());
            intent.putExtra("hp", pokemon.getHp());
            intent.putExtra("atk", pokemon.getAtk());
            intent.putExtra("def", pokemon.getDef());
            intent.putExtra("spd", pokemon.getSpd());
            intent.putExtra("exp", pokemon.getExp());
            intent.putExtra("backgroundColor", backgroundColor); // Gửi màu nền
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return pokemonList.size();
    }

    public static class PokemonViewHolder extends RecyclerView.ViewHolder {
        TextView pokemonName;
        ImageView pokemonImage;
        CardView cardView;

        public PokemonViewHolder(@NonNull View itemView) {
            super(itemView);
            pokemonName = itemView.findViewById(R.id.pokemonName);
            pokemonImage = itemView.findViewById(R.id.pokemonImage);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
