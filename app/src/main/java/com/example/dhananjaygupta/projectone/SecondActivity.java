package com.example.dhananjaygupta.projectone;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondActivity extends Activity {

    EditText editTextNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editTextNumber = (EditText)findViewById(R.id.editTextNumber);
        //Calls the compare method when pressed return or done on keyboard
        editTextNumber.setOnEditorActionListener(new TextView.OnEditorActionListener(){
            @Override public boolean onEditorAction(TextView textView, int id, KeyEvent event){
                if (id == EditorInfo.IME_ACTION_DONE || id==EditorInfo.IME_NULL)
                {
                    compare();
                }
                return false;
            }});
    }
    // cmaparing the number format to (xxx) xxx-xxxx and sending it to the parent method.
    public void compare(){

        editTextNumber=(EditText)findViewById(R.id.editTextNumber);
        String message=editTextNumber.getText().toString();
        Pattern p = Pattern.compile("\\s*\\(\\d{3}\\)\\s\\d{3}-\\d{4}\\s*");
        Matcher m = p.matcher(message);
        Intent intent= new Intent();
        if(m.matches())
        {
            intent.putExtra("RESULT_OK",message);
            setResult(Activity.RESULT_OK,intent);
        }
        else{
            intent.putExtra("RESULT_CANCELED",message);
            setResult(Activity.RESULT_CANCELED,intent);
        }
        finish();
    }

    @Override
    public void onBackPressed() {
        compare();
    }

}
