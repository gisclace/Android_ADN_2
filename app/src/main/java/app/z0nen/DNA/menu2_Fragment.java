package app.z0nen.DNA;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;


public class menu2_Fragment extends Fragment {
    View rootview;
    Random random = new Random();
    private static final String _CHAR = "ATGC ";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.menu2_layout, container, false);
        Button btn = (Button) rootview.findViewById(R.id.Gadn);
        Button btn2 = (Button) rootview.findViewById(R.id.convert);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView text_Random = (TextView) rootview.findViewById(R.id.adn);
                TextView input = (TextView) rootview.findViewById(R.id.input);
                text_Random.setText(getRandomString());
            }
        });
        Button a = (Button) rootview.findViewById(R.id.button_A);
        Button c = (Button) rootview.findViewById(R.id.button_C);
        Button g = (Button) rootview.findViewById(R.id.button_G);
        Button t = (Button) rootview.findViewById(R.id.button_T);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView adn = (TextView) rootview.findViewById(R.id.adn);
                String source = adn.getText ().toString();
                adn.setText(source+"A");
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView adn = (TextView) rootview.findViewById(R.id.adn);
                String source = adn.getText ().toString();
                adn.setText(source+"C");
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView adn = (TextView) rootview.findViewById(R.id.adn);
                String source = adn.getText ().toString();
                adn.setText(source+"G");
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView adn = (TextView) rootview.findViewById(R.id.adn);
                String source = adn.getText ().toString();
                adn.setText(source+"T");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView convert = (TextView) rootview.findViewById(R.id.adn);
                TextView arn = (TextView) rootview.findViewById(R.id.arn);
                String source = convert.getText().toString();
                String newValue = source.replace("A", "U");
                newValue = newValue.replace("T", "A");
                newValue = newValue.replace("G", "K");
                newValue = newValue.replace("C", "G");
                newValue = newValue.replace("K", "C");
                arn.setText(String.valueOf(newValue));
            }
        });

        return rootview;
    }
    public String getRandomString(){
        TextView input = (TextView) rootview.findViewById(R.id.input);
        float v = Float.parseFloat(input.getText().toString());
        StringBuffer randStr = new StringBuffer();
        for (int i = 0; i < v; i++) {
            int number = getRandomNumber();
            char ch = _CHAR.charAt(number);
            randStr.append(ch);
        }
        return randStr.toString();
    }

    private int getRandomNumber() {
        int randomInt = 0;
        randomInt = random.nextInt(_CHAR.length());
        if (randomInt - 1 == -1) {
            return randomInt;
        } else {
            return randomInt - 1;

        }
    }
}
