package com.example.converterdollar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class tela2 extends AppCompatActivity {

    private EditText editQuantidadeDolar;
    private EditText editCotacao;
    private TextView textResultado;
    private ListView listFuncoes;


    private String[] itens = {
            " Cotação do Dolar", "Cotação da Libra", "Cotação do Euro"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        editQuantidadeDolar = findViewById(R.id.editQuantidadeDolar);
        editCotacao = findViewById(R.id.editCotacao);
        textResultado = findViewById(R.id.textResultado);
        listFuncoes = findViewById(R.id.listFuncoes);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1, itens
        );
        listFuncoes.setAdapter(adapter);

        listFuncoes.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String funcaoSelecionada = listFuncoes.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(), "Encaminhando para " + funcaoSelecionada, Toast.LENGTH_LONG).show();
                if (i == 0) {
                    try {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=cotação+dolar+hoje&client=opera-gx&sca_esv=584099460&bih=627&biw=1325&hl=pt-BR&source=hp&ei=pNBbZbX_Gc6r5OUPweecsAs&iflsig=AO6bgOgAAAAAZVvetJW0br9rvFLbLUS1SrlHL4rpSQ5M&oq=cotação&gs_lp=Egdnd3Mtd2l6Igljb3Rhw6fDo28qAggCMgsQABiABBixAxiDATILEAAYgAQYsQMYgwEyCxAAGIAEGLEDGIMBMgsQABiABBixAxiDATIIEAAYgAQYsQMyDhAAGIAEGIoFGLEDGIMBMgsQABiABBixAxiDATIIEAAYgAQYsQMyBRAAGIAEMgsQABiABBixAxiDAUjhHlAAWIkUcAB4AJABAJgBngGgAbgGqgEDMC43uAEByAEA-AEBwgIIEC4YgAQYsQPCAhEQLhiABBixAxiDARjHARjRA8ICBRAuGIAEwgIOEC4YgAQYigUYsQMYgwHCAggQLhixAxiABMICCxAuGIAEGMcBGK8B&sclient=gws-wiz")));
                    }
                    catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "Erro" + e.toString(), Toast.LENGTH_LONG).show();
                    }
                }

                if (i == 1) {
                    try {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=cotação+libra+hoje&client=opera-gx&sca_esv=584099460&bih=627&biw=1325&hl=pt-BR&ei=qtBbZdLxDISH5OUPjfjg4Qs&ved=0ahUKEwjS7uTlw9OCAxWEA7kGHQ08OLwQ4dUDCA8&uact=5&oq=cotação+libra+hoje&gs_lp=Egxnd3Mtd2l6LXNlcnAiFGNvdGHDp8OjbyBsaWJyYSBob2plMg0QABiABBixAxhGGIICMgUQABiABDIFEAAYgAQyBRAAGIAEMgYQABgHGB4yBRAAGIAEMgUQABiABDIGEAAYBxgeMgYQABgHGB4yBhAAGAcYHkiVK1CdFligJHACeAGQAQCYAYsBoAGBBqoBAzAuNrgBA8gBAPgBAcICChAAGEcY1gQYsAPCAg0QABiABBiKBRiwAxhDwgIHEAAYgAQYDcICChAAGIAEGA0YsQPCAggQABgIGAcYHsICBxAAGIAEGAriAwQYACBBiAYBkAYK&sclient=gws-wiz-serp")));
                    }
                    catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "Erro" + e.toString(), Toast.LENGTH_LONG).show();
                    }
                }

                if (i== 2) {
                    try {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=cotação+eurohoje&client=opera-gx&sca_esv=584099460&bih=627&biw=1325&hl=pt-BR&ei=-tJbZf7_LNne5OUPuPqFiAo&ved=0ahUKEwj-5KmAxtOCAxVZL7kGHTh9AaEQ4dUDCA8&uact=5&oq=cotação+eurohoje&gs_lp=Egxnd3Mtd2l6LXNlcnAiEmNvdGHDp8OjbyBldXJvaG9qZTIGEAAYBxgeMgYQABgHGB4yBhAAGAcYHjIGEAAYBxgeMgYQABgHGB4yBhAAGAcYHjIGEAAYBxgeMgYQABgHGB4yBhAAGAcYHjIGEAAYBxgeSLsRUMEIWJUOcAJ4AZABAJgBeqAB4wOqAQMwLjS4AQPIAQD4AQHCAgoQABhHGNYEGLADwgINEAAYgAQYigUYsAMYQ8ICGRAuGIAEGIoFGMcBGNEDGMgDGLADGEPYAQHCAgoQABiABBgNGLEDwgIHEAAYgAQYDeIDBBgAIEGIBgGQBgu6BgQIARgI&sclient=gws-wiz-serp")));
                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "Erro" + e.toString(), Toast.LENGTH_LONG).show();
                    }
                }
            }



        });
        //
    }
    public void converter(View view){

        double quantidadeDolar = Double.parseDouble(editQuantidadeDolar.getText().toString());
        double cotacaoDolar = Double.parseDouble(editCotacao.getText().toString());
        double resultado = quantidadeDolar * cotacaoDolar;

        textResultado.setText("Valor convertido em R$: "+ resultado);

    }

}