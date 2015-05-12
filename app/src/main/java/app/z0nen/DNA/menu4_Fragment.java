package app.z0nen.DNA;

import android.app.Fragment;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;


public class menu4_Fragment extends Fragment  {

    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.acidamin, container, false);

        ListView listViewAcidAmin = (ListView) rootview.findViewById(R.id.listViewAcidAmin);
        EditText search = (EditText) rootview.findViewById(R.id.search);

        ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();

        HashMap<String, Object> map;

        map = new HashMap<String, Object>();
        map.put("Nom", "Acide aspartique");
        map.put("Code", "D");
        map.put("Abv", "Asp");
        map.put("Nature", "Acide");
        map.put("Codon", "GAU, GAC");
        map.put("image", R.drawable.alanin);
        map.put("Ref", "1");
        list.add(map);


        map = new HashMap<String, Object>();

        map.put("Nom", "Tyrosine");
        map.put("Code", "Y");
        map.put("Abv", "Tyr");
        map.put("Nature", "Polaire, aromatique");
        map.put("Codon", "UAU, UAC");
        map.put("image", R.drawable.alanin);
        map.put("Ref", "2");
        list.add(map);


        SimpleAdapter mSchedule = new SimpleAdapter (rootview.getContext(), list, R.layout.affichageitems,
                new String[] { "Nom"}, new int[] { R.id.type});
        listViewAcidAmin.setAdapter(mSchedule);


        listViewAcidAmin.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            @SuppressWarnings("unchecked")
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {

                ListView listViewAcidAmin = (ListView) rootview.findViewById(R.id.listViewAcidAmin);
                TextView nom = (TextView) rootview.findViewById(R.id.Nom);
                TextView code = (TextView) rootview.findViewById(R.id.Code);
                TextView abv = (TextView) rootview.findViewById(R.id.Abv);
                TextView nat = (TextView) rootview.findViewById(R.id.Nature);
                TextView codon = (TextView) rootview.findViewById(R.id.Codon);
                TextView ref = (TextView) rootview.findViewById(R.id.check);
                ImageView image = (ImageView)rootview.findViewById(R.id.imageacid);


                HashMap<String, String> map = (HashMap) listViewAcidAmin.getItemAtPosition(position);
                nom.setText(map.get("Nom"));
                code.setText(map.get("Code"));
                abv.setText(map.get("Abv"));
                nat.setText(map.get("Nature"));
                codon.setText(map.get("Codon"));
                ref.setText(map.get("ref"));
                //image.setImageResource(R.drawable.alanin);

                int Checkvalue = Integer.parseInt(nom.getText().toString());
            if (Checkvalue == 1 ) {
                image.setImageResource(R.drawable.alanin);
            }


            }
        });
        return rootview;
    }
}
