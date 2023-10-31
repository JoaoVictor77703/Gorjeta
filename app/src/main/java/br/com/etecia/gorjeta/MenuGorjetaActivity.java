package br.com.etecia.gorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputEditText;

public class MenuGorjetaActivity extends AppCompatActivity {

    EditText valorcomanda;
    EditText gorgeta1;
    EditText total;
    Spinner spinner;
    Button btncaucula;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_gorjeta_layout);

        valorcomanda = findViewById(R.id.Valorcomanda);
        gorgeta1 = findViewById(R.id.gorjeta1);
        total = findViewById(R.id.total);
        spinner=findViewById(R.id.spinneravalia);
        btncaucula = findViewById(R.id.btncaucula);

        total.setEnabled(false);
        gorgeta1.setEnabled(false);

        btncaucula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Gorjeta gorjeta= new Gorjeta();
              gorjeta.valor = Integer.parseInt(valorcomanda.getText().toString());

              switch (spinner.getSelectedItem().toString()) {
                  case "Excelente -> 10%":
                      gorjeta.qualidade = 10;
                      break;
                  case "Otimo -> 8%":
                      gorjeta.qualidade = 8;
                      break;
                  case"Bom -> 5%":
                        gorjeta.qualidade = 5;
                      break;
                  case"Ruim -> 2%":
                        gorjeta.qualidade = 2;
                      break;
              }
              gorjeta.calcularGorgeta();

              total.setText(gorjeta.getValorTotal()+"");
              gorgeta1.setText(gorjeta.getGorjeta()+"");
            }
        });


    }



}