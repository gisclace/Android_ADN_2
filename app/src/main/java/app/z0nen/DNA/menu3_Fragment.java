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
        map.put("ref","1");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Cystéine");
        map.put("Code", "C");
        map.put("Abv", "Cys");
        map.put("Nature", "Polaire");
        map.put("Codon", "UGU, UGC");
        map.put("ref","2");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Acide aspartique");
        map.put("Code", "D");
        map.put("Abv", "Asp");
        map.put("Nature", "Acide");
        map.put("Codon", "GAU, GAC");
        map.put("ref","3");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Acide glutamique");
        map.put("Code", "E");
        map.put("Abv", "Glu");
        map.put("Nature", "Acide");
        map.put("Codon", "GAA, GAG");
        map.put("ref","4");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Phénylalanine");
        map.put("Code", "F");
        map.put("Abv", "Phe");
        map.put("Nature", "Apolaire, aromatique");
        map.put("Codon", "UUU, UUC");
        map.put("ref","5");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Glycine");
        map.put("Code", "G");
        map.put("Abv", "Gly");
        map.put("Nature", "Apolaire, aliphatique");
        map.put("Codon", "GGU, GGC, GGA, GGG");
        map.put("ref","6");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Histidine");
        map.put("Code", "H");
        map.put("Abv", "His");
        map.put("Nature", "Basique, aromatique");
        map.put("Codon", "CAU, CAC");
        map.put("ref","7");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Isoleucine");
        map.put("Code", "I");
        map.put("Abv", "Ile");
        map.put("Nature", "Apolaire, aliphatique");
        map.put("Codon", "AUU, AUC, AUA");
        map.put("ref","8");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Lysine");
        map.put("Code", "K");
        map.put("Abv", "Lys");
        map.put("Nature", "Basique");
        map.put("Codon", "AAA, AAG");
        map.put("ref","9");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Leucine");
        map.put("Code", "L");
        map.put("Abv", "Leu");
        map.put("Nature", "Apolaire, aliphatique");
        map.put("Codon", "UUA, UUG, CUU, CUC, CUA, CUG");
        map.put("ref","10");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Méthionine");
        map.put("Code", "M");
        map.put("Abv", "Met");
        map.put("Nature", "Apolaire");
        map.put("Codon", "AUG");
        map.put("ref","11");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Asparagine");
        map.put("Code", "N");
        map.put("Abv", "Asn");
        map.put("Nature", "Polaire");
        map.put("Codon", "AAU, AAC");
        map.put("ref","12");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Pyrrolysine");
        map.put("Code", "O");
        map.put("Abv", "Pyl");
        map.put("Nature", "Polaire");
        map.put("Codon", "UAG + élément PYLIS");
        map.put("ref","13");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Proline");
        map.put("Code", "P");
        map.put("Abv", "Pro");
        map.put("Nature", "Apolaire");
        map.put("Codon", "CCU, CCC, CCA, CCG");
        map.put("ref","14");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Glutamine");
        map.put("Code", "Q");
        map.put("Abv", "Gln");
        map.put("Nature", "Polaire");
        map.put("Codon", "CAA, CAG");
        map.put("ref","15");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Arginine");
        map.put("Code", "R");
        map.put("Abv", "Arg");
        map.put("Nature", "Basique");
        map.put("Codon", "CGU, CGC, CGA, CGG, AGA, AGG");
        map.put("ref","16");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Sérine");
        map.put("Code", "S");
        map.put("Abv", "Ser");
        map.put("Nature", "Polaire");
        map.put("Codon", "UCU, UCC, UCA, UCG, AGU, AGC");
        map.put("ref","17");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Thréonine");
        map.put("Code", "T");
        map.put("Abv", "Thr");
        map.put("Nature", "Polaire");
        map.put("Codon", "ACU, ACC, ACA, ACG");
        map.put("ref","18");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Sélénocystéine");
        map.put("Code", "U");
        map.put("Abv", "Sec");
        map.put("Nature", "Polaire");
        map.put("Codon", "UGA + élément SECIS");
        map.put("ref","19");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Valine");
        map.put("Code", "V");
        map.put("Abv", "Val");
        map.put("Nature", "Apolaire, aliphatique");
        map.put("Codon", "GUU, GUC, GUA, GUG");
        map.put("ref","20");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Tryptophane");
        map.put("Code", "W");
        map.put("Abv", "Trp");
        map.put("Nature", "Apolaire, aromatique");
        map.put("Codon", "UGG (et UGA chez les mycoplasmes)");
        map.put("ref","21");
        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Tyrosine");
        map.put("Code", "Y");
        map.put("Abv", "Tyr");
        map.put("Nature", "Polaire, aromatique");
        map.put("Codon", "UAU, UAC");
        map.put("ref","22");
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
                TextView ref = (TextView) rootview.findViewById(R.id.ref);
                ImageView image = (ImageView) rootview.findViewById(R.id.imageacid);

                HashMap<String, String> map = (HashMap<String, String>) listViewAcidAmin.getItemAtPosition(position);
                nom.setText(map.get("Nom"));
                code.setText(map.get("Code"));
                abv.setText(map.get("Abv"));
                nat.setText(map.get("Nature"));
                codon.setText(map.get("Codon"));
                ref.setText(map.get("ref"));

                int Checkvalue = Integer.parseInt(ref.getText().toString());
                if (Checkvalue == 1 ) {
                    image.setImageResource(R.drawable.alanin);
                }
                if (Checkvalue == 2 ) {
                    image.setImageResource(R.drawable.cysteine);
                }
                if (Checkvalue == 3 ) {
                    image.setImageResource(R.drawable.aspartate);
                }
                if (Checkvalue == 4 ) {
                    image.setImageResource(R.drawable.glutamate);
                }
                if (Checkvalue == 5 ) {
                    image.setImageResource(R.drawable.phenylalanine);
                }
                if (Checkvalue == 6 ) {
                    image.setImageResource(R.drawable.glycinel);
                }
                if (Checkvalue == 7 ) {
                    image.setImageResource(R.drawable.histidine);
                }
                if (Checkvalue == 8 ) {
                    image.setImageResource(R.drawable.isoleucine);
                }
                if (Checkvalue == 9 ) {
                    image.setImageResource(R.drawable.lysine);
                }
                if (Checkvalue == 10 ) {
                    image.setImageResource(R.drawable.leucine);
                }
                if (Checkvalue == 11 ) {
                    image.setImageResource(R.drawable.methionine);
                }
                if (Checkvalue == 12 ) {
                    image.setImageResource(R.drawable.asparagine);
                }
                if (Checkvalue == 13 ) {
                    image.setImageResource(R.drawable.pyrrolysine);
                }
                if (Checkvalue == 14 ) {
                    image.setImageResource(R.drawable.proline);
                }
                if (Checkvalue == 15 ) {
                    image.setImageResource(R.drawable.glutamine);
                }
                if (Checkvalue == 16 ) {
                    image.setImageResource(R.drawable.arginine);
                }
                if (Checkvalue == 17 ) {
                    image.setImageResource(R.drawable.serine);
                }
                if (Checkvalue == 18 ) {
                    image.setImageResource(R.drawable.threonine);
                }
                if (Checkvalue == 19 ) {
                    image.setImageResource(R.drawable.selenocysteine);
                }
                if (Checkvalue == 20 ) {
                    image.setImageResource(R.drawable.valine);
                }
                if (Checkvalue == 21 ) {
                    image.setImageResource(R.drawable.tryptophan);
                }
                if (Checkvalue == 22 ) {
                    image.setImageResource(R.drawable.tyrosine);
                }

            }
        });
        return rootview;
    }
}

