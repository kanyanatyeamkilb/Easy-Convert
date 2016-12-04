package rtc.kanyanat.chetsada.easyconvert;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Calculate extends AppCompatActivity implements View.OnClickListener {

    // Explicit
    private TextView textView;
    private EditText editText;
    private Spinner spinner;
    private Button button;
    private ListView listView;
    private int indexAnInt, indexSpinnerChoseAnInt;
    private String[] titleStrings, lengthStrings, tempStrings, areaStrings,
            volumeStrings, weightStrings, timeStrings, spinnerStrings;
    private MyConstant myConstant;
    private double rowMatADouble, baseADouble; // สิ่งที่รับจาก Edit text
    private String unitString;
    private double[] factorDoubles, valueDoubles;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        myConstant = new MyConstant();
        titleStrings = myConstant.getTitleStrings();

        //bind widget
        textView = (TextView) findViewById(R.id.textView2);
        editText = (EditText) findViewById(R.id.editText);
        spinner = (Spinner) findViewById(R.id.spinner);
        button = (Button) findViewById(R.id.button);
        listView = (ListView) findViewById(R.id.livAnswer);

        // get value from intent
        indexAnInt = getIntent().getIntExtra("Index", 0);


        textView.setText(titleStrings[indexAnInt]);

        //show spinner


        //การกำหนดค่า Array ใหั Spinner , Factor
        switch (indexAnInt) {
            case 0:
                spinnerStrings = myConstant.getLengthStrings();
                factorDoubles = myConstant.getLengthDoubles();
                break;
            case 1:
                spinnerStrings = myConstant.getTempStrings();
                factorDoubles = myConstant.getTempDoubles();
                break;
            case 2:
                spinnerStrings = myConstant.getAreaStrings();
                factorDoubles = myConstant.getAreaDoubles();
                break;
            case 3:
                spinnerStrings = myConstant.getVolumeStrings();
                factorDoubles = myConstant.getVolumeDoubles();
                break;
            case 4:
                spinnerStrings = myConstant.getWeightStrings();
                factorDoubles = myConstant.getWeightDoubles();
                break;
            case 5:
                spinnerStrings = myConstant.getTimeStrings();
                factorDoubles = myConstant.getTimeDoubles();
                break;


        }   //switch

        //About Spinner
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(Calculate.this,
                android.R.layout.simple_list_item_1, spinnerStrings);
        spinner.setAdapter(stringArrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                unitString = spinnerStrings[i];
                indexSpinnerChoseAnInt = i;

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                unitString = spinnerStrings[0];
                indexSpinnerChoseAnInt = 0;


            }
        });


        //Button Controller
        button.setOnClickListener(this);





    }   // main method

    @Override
    public void onClick(View view) {

        String s = null;
        s = editText.getText().toString().trim();

        if (s.equals("")) {
            Toast.makeText(Calculate.this, "Please Fill in Blank", Toast.LENGTH_SHORT).show();
        } else {
            //No Space

            rowMatADouble = Double.parseDouble(s);
            Log.d("4decV1", "rowMat ==> " + rowMatADouble + " " + unitString);

            baseADouble = rowMatADouble / factorDoubles[indexSpinnerChoseAnInt];

            Log.d("4decV1", "base ==> " + baseADouble);

            //Create Spinner
            valueDoubles = new double[factorDoubles.length];
            for (int i=0;i<factorDoubles.length;i++) {
                valueDoubles[i] = factorDoubles[i] * baseADouble;
            }

            MyAdapter myAdapter = new MyAdapter(Calculate.this, valueDoubles, spinnerStrings);
            listView.setAdapter(myAdapter);


        }   // if



    }   // onClick

}   // main class
