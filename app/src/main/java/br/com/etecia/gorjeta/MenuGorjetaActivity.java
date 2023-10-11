package br.com.etecia.gorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MenuGorjetaActivity extends AppCompatActivity {

    Button button;
    EditText Valor;
    boolean isUpdating = false;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_gorjeta_layout);
        Valor=findViewById(R.id.Valorcomanda);
        button=findViewById(R.id.buttoncaucula);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isUpdating){
                    caucular();
                }else {
                    return;
                };


            }
        });
    }
    private void caucular (){
        String Comanda = Valor.getText().toString().trim();




    }



}