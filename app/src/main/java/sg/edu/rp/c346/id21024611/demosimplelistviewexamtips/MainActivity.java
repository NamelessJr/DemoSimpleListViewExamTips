package sg.edu.rp.c346.id21024611.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.biometrics.BiometricManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvExamTips;
    BiometricManager.Strings[] examTips;
    ArrayList<String> ExamTips;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExamTips = new ArrayList<String>();
        ExamTips.add("1. Don't just read the code, code it as much as possible during each practical session.");
        ExamTips.add("2. Seek help from the lecturer ASAP, don't wait till you lost in the jungle.");
        ExamTips.add("3. Prepare your template source code for each topic.");
        ExamTips.add("4. Create a few empty Android projects to speed up your coding during the exam.");
        ExamTips.add("5. Ensure that your Android Studio is up and running before the exam.");
        lvExamTips = findViewById(R.id.listViewExamTips);

        ArrayList<String> examTipsArray = new ArrayList<>();
        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, examTipsArray);

        lvExamTips.setAdapter(adapter);


    }
}