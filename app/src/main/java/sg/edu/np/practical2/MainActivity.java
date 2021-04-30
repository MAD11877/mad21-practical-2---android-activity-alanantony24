package sg.edu.np.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user = new User();
        String name = user.name;
        String description = user.description;
    }
    public void FollowToggler(View view) {
        User user = new User();
        Button followBtn = findViewById(R.id.followBtn);
        if(followBtn.getText() == "Follow"){
            followBtn.setText("Unfollow");
            user.followed = true;
        }
        else{
            followBtn.setText("Follow");
            user.followed = false;
        }
    }
}
