package jhonar.com.elementsofmachine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Obtenemos una referencia a los controles de la interfaz
        Button btn1 = (Button)findViewById(R.id.btn_actividad1);
        Button btn2 = (Button)findViewById(R.id.btn_actividad2);
        Button btn3 = (Button)findViewById(R.id.btn_actividad3);
        Button btn4 = (Button)findViewById(R.id.btn_actividad4);
        Button btn5 = (Button)findViewById(R.id.btn_actividad5);
        Button btn6 = (Button)findViewById(R.id.btn_actividad6);
        //Implementamos el evento “click” del botón
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Main2Activity.this, PreguntarActivity.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Main2Activity.this, PreguntarActivity.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Main2Activity.this, PreguntarActivity.class);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Main2Activity.this, PreguntarActivity.class);
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Main2Activity.this, PreguntarActivity.class);
                startActivity(intent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Main2Activity.this, PreguntarActivity.class);
                startActivity(intent);
            }
        });
    }
}
