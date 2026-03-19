package kr.ac.kopo.buttontest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText edit1;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main2);
//
//        Button btn1 = findViewById(R.id.btn1);
//        edit1 = findViewById(R.id.edit1);
//        text1 = findViewById(R.id.text1);

//        btn1.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//            String name = edit1.getText().toString();
//            Toast.makeText(getApplicationContext(), name +"님 환영합니다.", Toast.LENGTH_LONG).show();
        }
    };
}