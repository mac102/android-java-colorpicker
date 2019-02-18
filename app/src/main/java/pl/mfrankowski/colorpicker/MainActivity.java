package pl.mfrankowski.colorpicker;

import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ColorPickerDialog.OnColorChangedListener {

    private TextView colorPreview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorPreview = findViewById(R.id.tv_colorPreview);

        Button btColorPicker = findViewById(R.id.bt_pick_color);
        btColorPicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ColorPickerDialog CPDialog = new ColorPickerDialog(MainActivity.this, MainActivity.this, 0xFFFF0000);
                CPDialog.show();
            }
        });
    }

    @Override
    public void colorChanged(int color) {
        colorPreview.setBackgroundColor(color);
    }
}
