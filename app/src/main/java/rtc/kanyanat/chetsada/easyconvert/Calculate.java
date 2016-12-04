package rtc.kanyanat.chetsada.easyconvert;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
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
    private int indexAnInt;
    private String[] titleStrings, lengthStrings, tempStrings, areaStrings,
            volumeStrings, weightStrings, timeStrings, spinnerStrings;
    private MyConstant myConstant;
    private double[] factorDoubles;
    private double rowMatADouble; // สิ่งที่รับจาก Edit text




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
                break;
            case 1:
                spinnerStrings = myConstant.getTempStrings();
                break;
            case 2:
                spinnerStrings = myConstant.getAreaStrings();
                break;
            case 3:
                spinnerStrings = myConstant.getVolumeStrings();
                break;
            case 4:
                spinnerStrings = myConstant.getWeightStrings();
                break;
            case 5:
                spinnerStrings = myConstant.getTimeStrings();
                break;


        }   //switch

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(Calculate.this,
                android.R.layout.simple_list_item_1, spinnerStrings);
        spinner.setAdapter(stringArrayAdapter);


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
            Log.d("4decV1", "rowMat ==> " + rowMatADouble);

        }   // if



    }   // onClick

}   // main class
