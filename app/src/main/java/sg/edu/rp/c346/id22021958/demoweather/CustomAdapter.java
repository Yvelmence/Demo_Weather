package sg.edu.rp.c346.id22021958.demoweather;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Weather> alWeather;

    public CustomAdapter(@NonNull Context context, int resource, ArrayList<Weather> objects){
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        alWeather = objects;
    }
}
