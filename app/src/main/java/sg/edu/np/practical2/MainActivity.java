package sg.edu.np.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    User user = new User();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String name = user.name;
        String description = user.description;
    }
    public void FollowToggler(View view) {
        Button followBtn = findViewById(R.id.followBtn);
        if(followBtn.getText().toString().compareTo("Follow") == 0){
            followBtn.setText("Unfollow");
            user.followed = true;
        }
        else{
            followBtn.setText("Follow");
            user.followed = false;
        }
    }
}
