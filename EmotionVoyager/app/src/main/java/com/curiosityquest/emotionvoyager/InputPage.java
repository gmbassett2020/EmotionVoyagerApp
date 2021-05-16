package com.curiosityquest.emotionvoyager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class InputPage extends Fragment {

    private EditText inputString;

    private TextView currentValues;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        //input_string.findViewById(R.id.get_input);
        //current_values = (TextView) current_values.findViewById(R.id.current_values);
        //findViewById(R.id.currentValues).setText = "blah";

        View myInflatedView = inflater.inflate(R.layout.fragment_first, container,false);

         // Set the Text to try this out
        if (currentValues == null)
        {
            currentValues = (TextView) myInflatedView.findViewById(R.id.current_values);
        }
        String newText = currentValues.getText() + "; x";
        currentValues.setText(newText);

         return myInflatedView;

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onResume()
    {
        super.onResume();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //current_values.setText("blah"+input_string);
                view.invalidate();
                /*
                NavHostFragment.findNavController(InputPage.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);

                 */
            }
        });
    }
}