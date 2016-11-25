package rtc.kanyanat.chetsada.easyconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class Calculate extends AppCompatActivity {

    // Explicit
    private TextView textView;
    private EditText editText;
    private Spinner spinner;
    private Button button;
    private ListView listView;
    private int indexAnInt;
    private String[] titleStrings, lengthStrings, tempStrings, areaStrings,
            volumeStrings, weightStrings, timeStrings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        //bind widget
        textView = (TextView) findViewById(R.id.textView2);
        editText = (EditText) findViewById(R.id.editText);
        spinner = (Spinner) findViewById(R.id.spinner);
        button = (Button) findViewById(R.id.button);
        listView = (ListView) findViewById(R.id.livAnswer);

        // get value from intent
        indexAnInt = getIntent().getIntExtra("Index", 0);

        //show text
        titleStrings = new String[6];
        titleStrings[0] = "Length";
        titleStrings[1] = "Temp";
        titleStrings[2] = "Area";
        titleStrings[3] = "Volume";
        titleStrings[4] = "Weight";
        titleStrings[5] = "Time";
        textView.setText(titleStrings[indexAnInt]);

        //show spinner
        lengthStrings = new String[6];
        lengthStrings[0] = "มม.";
        lengthStrings[1] = "ซม.";
        lengthStrings[2] = "ม.";
        lengthStrings[3] = "กม.";
        lengthStrings[4] = "นิ้ว";
        lengthStrings[5] = "หลา";

        tempStrings = new String[3];
        tempStrings[0] = "องศา C";
        tempStrings[2] = "องศา F";
        tempStrings[3] = "องศา K";

        areaStrings = new String[7];
        areaStrings[0] = "ตร.ม.";
        areaStrings[1] = "ตร.กม.";
        areaStrings[2] = "ตร.ซม.";
        areaStrings[3] = "ตร.มม.";
        areaStrings[4] = "ตร.ไมล์";
        areaStrings[5] = "ตร.ฟุต";
        areaStrings[6] = "ตร.นิ้ว";

        volumeStrings = new String[6];
        volumeStrings[0] = "ลบ.ม.";
        volumeStrings[1] = "ลบ.กม.";
        volumeStrings[2] = "ลบ.ซม.";
        volumeStrings[3] = "ลบ.มม.";
        volumeStrings[4] = "ล.";
        volumeStrings[5] = "มล.";

        weightStrings = new String[6];
        weightStrings[0] = "กก.";
        weightStrings[1] = "ก.";
        weightStrings[2] = "มก.";
        weightStrings[3] = "ตัน";
        weightStrings[4] = "ปอนด์";
        weightStrings[5] = "ออนซ์";

        timeStrings = new String[7];
        timeStrings[0] = "วินาที";
        timeStrings[1] = "นาที";
        timeStrings[2] = "ชั่วโมง";
        timeStrings[3] = "วัน";
        timeStrings[4] = "สัปดาห์";
        timeStrings[5] = "เดือน";
        timeStrings[6] = "ปี";


    }   // main method
}   // main class
