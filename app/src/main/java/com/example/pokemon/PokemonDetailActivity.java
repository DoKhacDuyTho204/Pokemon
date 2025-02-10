package com.example.pokemon;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PokemonDetailActivity extends AppCompatActivity {

    private ImageView detailPokemonImage;
    private TextView detailPokemonName, detailPokemonType, detailPokemonWeight, detailPokemonHeight;
    private ProgressBar hpBar, atkBar, defBar, spdBar, expBar;
    private TextView hpValue, atkValue, defValue, spdValue, expValue;
    private LinearLayout detailBackground; // Thêm view để chứa nền

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_detail);

        // Ánh xạ các view
        detailPokemonImage = findViewById(R.id.detailPokemonImage);
        detailPokemonName = findViewById(R.id.detailPokemonName);
        detailPokemonType = findViewById(R.id.detailPokemonType);
        detailPokemonWeight = findViewById(R.id.detailPokemonWeight);
        detailPokemonHeight = findViewById(R.id.detailPokemonHeight);
        hpBar = findViewById(R.id.hpBar);
        atkBar = findViewById(R.id.atkBar);
        defBar = findViewById(R.id.defBar);
        spdBar = findViewById(R.id.spdBar);
        expBar = findViewById(R.id.expBar);

        hpValue = findViewById(R.id.hpValue);
        atkValue = findViewById(R.id.atkValue);
        defValue = findViewById(R.id.defValue);
        spdValue = findViewById(R.id.spdValue);
        expValue = findViewById(R.id.expValue);

        detailBackground = findViewById(R.id.detailBackground); // Ánh xạ layout chứa nền

        // Lấy dữ liệu từ Intent
        String pokemonName = getIntent().getStringExtra("pokemonName");
        int pokemonImage = getIntent().getIntExtra("pokemonImage", 0);
        String pokemonType = getIntent().getStringExtra("pokemonType");
        int backgroundColor = getIntent().getIntExtra("backgroundColor", Color.WHITE); // Lấy màu nền

        int hp = getIntent().getIntExtra("hp", 118);
        int atk = getIntent().getIntExtra("atk", 166);
        int def = getIntent().getIntExtra("def", 32);
        int spd = getIntent().getIntExtra("spd", 295);
        int exp = getIntent().getIntExtra("exp", 221);

        // Thiết lập giá trị cho các view
        detailPokemonImage.setImageResource(pokemonImage);
        detailPokemonName.setText(pokemonName);
        detailPokemonType.setText(pokemonType);
        detailPokemonWeight.setText("19.0 KG");
        detailPokemonHeight.setText("1.1 M");

        // Áp dụng màu nền
        detailBackground.setBackgroundColor(backgroundColor);

        // Thiết lập giá trị và màu sắc cho thanh tiến trình
        setupProgressBar(hpBar, hpValue, hp, 300, Color.RED);
        setupProgressBar(atkBar, atkValue, atk, 300, Color.YELLOW);
        setupProgressBar(defBar, defValue, def, 300, Color.BLUE);
        setupProgressBar(spdBar, spdValue, spd, 300, Color.GREEN);
        setupProgressBar(expBar, expValue, exp, 1000, Color.MAGENTA);
    }

    /**
     * Thiết lập ProgressBar và TextView giá trị
     *
     * @param progressBar ProgressBar cần được thiết lập
     * @param valueText   TextView hiển thị giá trị
     * @param value       Giá trị hiện tại
     * @param max         Giá trị tối đa
     * @param color       Màu sắc của thanh tiến trình
     */
    private void setupProgressBar(ProgressBar progressBar, TextView valueText, int value, int max, int color) {
        progressBar.setMax(max);
        progressBar.setProgress(value);
        progressBar.getProgressDrawable().setColorFilter(color, android.graphics.PorterDuff.Mode.SRC_IN);
        valueText.setText(value + "/" + max);
    }
}
