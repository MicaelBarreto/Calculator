package br.edu.ifc.videira.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import br.edu.ifc.videira.calculadora.handlers.FinalResult;
import br.edu.ifc.videira.calculadora.handlers.FinalResultsHandler;
import br.edu.ifc.videira.calculadora.Adapter.Adapter;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ArrayList<FinalResult> resultList = FinalResultsHandler.finalResults;

        ListView resultListView = (ListView) findViewById(R.id.finalList);

        //ArrayAdapter<FinalResult> adapter = new ArrayAdapter<FinalResult>(this, R.layout.result_list_item, resultList);

        //resultListView.setAdapter(adapter);

        Adapter adapter = new Adapter(resultList, this);

        resultListView.setAdapter(adapter);


    }
}
