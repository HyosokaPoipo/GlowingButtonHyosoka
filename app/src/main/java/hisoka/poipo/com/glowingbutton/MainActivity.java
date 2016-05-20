package hisoka.poipo.com.glowingbutton;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = (Button)findViewById(R.id.glow_2);
        button2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Button view = (Button ) v;
                        view.getBackground().setColorFilter(0x7700FFFF, PorterDuff.Mode.SRC_ATOP);
                        //v.invalidate();
                        break;
                    case MotionEvent.ACTION_UP:
                        Button view1 = (Button ) v;
                        view1.getBackground().clearColorFilter();
                        // Your action here when button is clicked....

                        break;
                    case MotionEvent.ACTION_CANCEL:

                        break;
                }
                return true;
            }
        });

    }
}
