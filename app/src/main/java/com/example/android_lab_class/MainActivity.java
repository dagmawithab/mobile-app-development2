import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    EditText name_edit1;
    Button bt1;

    @Override
    public class MainActivity extends AppCompatActivity {

        EditText name_edit1;
        Button bt1;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.lab_demo);

            fxt = (TextView) findViewById(R.id.fname);
            name_edit1 = (EditText) findViewById(R.id.fname_edit);
            bt1 = (Button) findViewById(R.id.savebt);

            bt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String namesame = name_edit1.getText().toString();
                    Toast.makeText(getApplicationContext(), "welcome " + namesame,
                            Toast.LENGTH_LONG).show();
                }
            });
        }
    }