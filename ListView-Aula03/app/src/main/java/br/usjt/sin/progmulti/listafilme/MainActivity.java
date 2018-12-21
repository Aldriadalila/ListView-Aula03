/*
 *@Author: Aldria Oliveira
 *@RA: 816120980
 */
package br.usjt.sin.progmulti.listafilme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    private EditText txtNome;
    public static final String NOME = "br.usjt.progmulti.listafilme.nome";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNome = (EditText)findViewById(R.id.busca_filme);
    }
    public void buscarFilmes(View view){
        Intent intent = new Intent(this, ListarFilmesActivity.class);
        String nome = txtNome.getText().toString();
        intent.putExtra(NOME, nome);
        startActivity(intent);
    }
}
