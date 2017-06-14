package com.example.erzse.pieceofcake;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void imprimir (View view){
        Intent imprimirIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://gtechdesign.net/es/blog/como-preparar-tus-disenos-correctamente-antes-de-imprimir"));
        startActivity(imprimirIntent);
    }

    public void cobrar (View view){
        Intent cobrarIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.calculadorafreelance.com/"));
        startActivity(cobrarIntent);
    }

    public void color (View view){
        Intent colorIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://paletton.com/#uid=1000u0kllllaFw0g0qFqFg0w0aF"));
        startActivity(colorIntent);
    }
}
