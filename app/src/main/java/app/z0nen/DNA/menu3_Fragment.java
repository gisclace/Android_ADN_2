package app.z0nen.DNA;

import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;


public class menu3_Fragment extends Fragment {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.acidamin, container, false);

        ListView listViewAcidAmin = (ListView) rootview.findViewById(R.id.listViewAcidAmin);

        ArrayList<HashMap<String, String>> listItem = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> map;

        map = new HashMap<String, String>();
        map.put("Nom", "Alanine");
        map.put("Code", "A");
        map.put("Abv", "Ala");
        map.put("Nature", "Apolaire, aliphatique");
        map.put("Codon", "GCU, GCC, GCA, GCG");
        //map.put("image", String.valueOf(R.drawable.Alanin));
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Cystéine");
        map.put("Code", "C");
        map.put("Abv", "Cys");
        map.put("Nature", "Polaire");
        map.put("Codon", "UGU, UGC");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Acide aspartique");
        map.put("Code", "D");
        map.put("Abv", "Asp");
        map.put("Nature", "Acide");
        map.put("Codon", "GAU, GAC");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Acide glutamique");
        map.put("Code", "E");
        map.put("Abv", "Glu");
        map.put("Nature", "Acide");
        map.put("Codon", "GAA, GAG");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Phénylalanine");
        map.put("Code", "F");
        map.put("Abv", "Phe");
        map.put("Nature", "Apolaire, aromatique");
        map.put("Codon", "UUU, UUC");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Glycine");
        map.put("Code", "G");
        map.put("Abv", "Gly");
        map.put("Nature", "Apolaire, aliphatique");
        map.put("Codon", "GGU, GGC, GGA, GGG");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Histidine");
        map.put("Code", "H");
        map.put("Abv", "His");
        map.put("Nature", "Basique, aromatique");
        map.put("Codon", "CAU, CAC");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Isoleucine");
        map.put("Code", "I");
        map.put("Abv", "Ile");
        map.put("Nature", "Apolaire, aliphatique");
        map.put("Codon", "AUU, AUC, AUA");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", " Lysine");
        map.put("Code", "K");
        map.put("Abv", "Lys");
        map.put("Nature", "Basique");
        map.put("Codon", "AAA, AAG");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Leucine");
        map.put("Code", "L");
        map.put("Abv", "Leu");
        map.put("Nature", "Apolaire, aliphatique");
        map.put("Codon", "UUA, UUG, CUU, CUC, CUA, CUG");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Méthionine");
        map.put("Code", "M");
        map.put("Abv", "Met");
        map.put("Nature", "Apolaire");
        map.put("Codon", "AUG");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", " Asparagine");
        map.put("Code", "N");
        map.put("Abv", "Asn");
        map.put("Nature", "Polaire");
        map.put("Codon", "AAU, AAC");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", " Pyrrolysine");
        map.put("Code", "O");
        map.put("Abv", "Pyl");
        map.put("Nature", "Polaire");
        map.put("Codon", "UAG + élément PYLIS");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Proline");
        map.put("Code", "P");
        map.put("Abv", "Pro");
        map.put("Nature", "Apolaire");
        map.put("Codon", "CCU, CCC, CCA, CCG");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Glutamine");
        map.put("Code", "Q");
        map.put("Abv", "Gln");
        map.put("Nature", "Polaire");
        map.put("Codon", "CAA, CAG");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Arginine");
        map.put("Code", "R");
        map.put("Abv", "Arg");
        map.put("Nature", "Basique");
        map.put("Codon", "CGU, CGC, CGA, CGG, AGA, AGG");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Sérine");
        map.put("Code", "S");
        map.put("Abv", "Ser");
        map.put("Nature", "Polaire");
        map.put("Codon", "UCU, UCC, UCA, UCG, AGU, AGC");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", " Thréonine");
        map.put("Code", "T");
        map.put("Abv", "Thr");
        map.put("Nature", "Polaire");
        map.put("Codon", "ACU, ACC, ACA, ACG");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Sélénocystéine");
        map.put("Code", "U");
        map.put("Abv", "Sec");
        map.put("Nature", "Polaire");
        map.put("Codon", "UGA + élément SECIS");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Valine");
        map.put("Code", "V");
        map.put("Abv", "Val");
        map.put("Nature", "Apolaire, aliphatique");
        map.put("Codon", "GUU, GUC, GUA, GUG");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Tryptophane");
        map.put("Code", "W");
        map.put("Abv", "Trp");
        map.put("Nature", "Apolaire, aromatique");
        map.put("Codon", "UGG (et UGA chez les mycoplasmes)");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Tyrosine");
        map.put("Code", "Y");
        map.put("Abv", "Tyr");
        map.put("Nature", "Polaire, aromatique");
        map.put("Codon", "UAU, UAC");
        map.put("image", String.valueOf(R.drawable.alanin));
        listItem.add(map);

        SimpleAdapter mSchedule = new SimpleAdapter (rootview.getContext(), listItem, R.layout.affichageitems,
                new String[] { "Nom"}, new int[] { R.id.type});
        listViewAcidAmin.setAdapter(mSchedule);
        listViewAcidAmin.setOnItemClickListener(new OnItemClickListener() {
            @Override
            @SuppressWarnings("unchecked")
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {

                ListView listViewAcidAmin = (ListView) rootview.findViewById(R.id.listViewAcidAmin);
                TextView nom = (TextView) rootview.findViewById(R.id.Nom);
                TextView code = (TextView) rootview.findViewById(R.id.Code);
                TextView abv = (TextView) rootview.findViewById(R.id.Abv);
                TextView nat = (TextView) rootview.findViewById(R.id.Nature);
                TextView codon = (TextView) rootview.findViewById(R.id.Codon);
                ImageView image = (ImageView) rootview.findViewById(R.id.imageacid);

                HashMap<String, String> map = (HashMap<String, String>) listViewAcidAmin.getItemAtPosition(position);
                nom.setText(map.get("Nom"));
                code.setText(map.get("Code"));
                abv.setText(map.get("Abv"));
                nat.setText(map.get("Nature"));
                codon.setText(map.get("Codon"));
                //image.getDrawable(map.get("image"));

            }
        });
        return rootview;
    }
}

