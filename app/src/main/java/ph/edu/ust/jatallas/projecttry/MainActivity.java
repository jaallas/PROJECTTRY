package ph.edu.ust.jatallas.projecttry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button milk = (Button) findViewById(R.id.milktea);
        milk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent milk = new Intent(getApplicationContext(), Milktea.class);
                startActivity(milk);
            }
        });

        Button lemon = (Button) findViewById(R.id.lemon);
        lemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lemon = new Intent(getApplicationContext(), Lemonade.class);
                startActivity(lemon);
            }
        });

        Button fruit = (Button) findViewById(R.id.fruit);
        fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fruit = new Intent(getApplicationContext(), Fruit_Juice.class);
                startActivity(fruit);
            }
        });

        Button alcohol = (Button) findViewById(R.id.alcohol);
        alcohol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alcohol = new Intent(getApplicationContext(), Alcohol.class);
                startActivity(alcohol);
            }
        });

        Button frappe = (Button) findViewById(R.id.frappe);
        frappe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent frappe = new Intent(getApplicationContext(), Frappe.class);
                startActivity(frappe);
            }
        });

        Button soda = (Button) findViewById(R.id.soda);
        soda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent soda = new Intent(getApplicationContext(), Soda.class);
                startActivity(soda);
            }
        });

        Button smooth = (Button) findViewById(R.id.smooth);
        smooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent smooth = new Intent(getApplicationContext(), Smoothies.class);
                startActivity(smooth);
            }
        });

        Button mock = (Button) findViewById(R.id.mock);
        mock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mock = new Intent(getApplicationContext(), Mocktails.class);
                startActivity(mock);
            }
        });

        Button cotea = (Button) findViewById(R.id.cotea);
        cotea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cotea = new Intent(getApplicationContext(), Coffee.class);
                startActivity(cotea);
            }
        });

        Button choco = (Button) findViewById(R.id.choco);
        choco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent choco = new Intent(getApplicationContext(), Choco.class);
                startActivity(choco);
            }
        });
    }
}
