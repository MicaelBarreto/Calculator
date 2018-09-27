package br.edu.ifc.videira.calculadora.Adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifc.videira.calculadora.R;
import br.edu.ifc.videira.calculadora.handlers.FinalResult;
import br.edu.ifc.videira.calculadora.handlers.FinalResultsHandler;

public class Adapter extends BaseAdapter{
    private final List<FinalResult> fR;
    private final Activity act;

    public Adapter( List<FinalResult> fR, Activity act) {
        this.fR = fR;
        this.act = act;
    }

    @Override
    public int getCount() {
        return fR.size();
    }

    @Override
    public Object getItem(int position) {
        return fR.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater()
                .inflate(R.layout.result_list_item, parent, false);
        FinalResult fr = fR.get(position);


        TextView ID = (TextView)
                view.findViewById(R.id.list_id);
        TextView account = (TextView)
                view.findViewById(R.id.list_result);
        TextView data = (TextView)
                view.findViewById(R.id.list_date);

        ID.setText(""+(position+1));
        account.setText(fr.getResult());
        data.setText(fr.toString());


        return view;
    }
}
