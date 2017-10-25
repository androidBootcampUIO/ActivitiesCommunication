package androidbootcamp.uio.activitiescommunication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    public static final String EXTRA_MESSAGE = "androidbootcamp.uio.activitiescommunication.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText editText = findViewById(R.id.editText);
        String message = editText.getText().toString();

        Intent intent = new Intent(this, ReceivingActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
