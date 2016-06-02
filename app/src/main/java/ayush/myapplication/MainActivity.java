package ayush.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text = (TextView) findViewById(R.id.txt);
        final ImageView imgRan = (ImageView) findViewById(R.id.imgR);



        Button clikMe = (Button) findViewById(R.id.clikMe);
        clikMe.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Random rand = new Random();
                        int rndInt = rand.nextInt(16);
                        String imgName = "img" + rndInt;
                        int id = getResources().getIdentifier(imgName,"drawable",getPackageName());

                        text.setText("Here is a cat");
                        imgRan.setImageResource(id);
                    }
                }
        );
    }
}
