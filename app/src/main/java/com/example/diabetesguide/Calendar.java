package com.example.diabetesguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.util.Date;

public class Calendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        TextView remindersList = findViewById(R.id.events_txt);
        Button createNewReminder_btn = findViewById(R.id.createNewEvent_btn);
        /*ListView reminders_List = findViewById(R.id.reminderItems);
*/
        // get the reference of CalendarView
        CalendarView eventCalender = findViewById(R.id.testCalendar);
        eventCalender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int year, int month, int day) {
                String  dateDay = String.valueOf(day);
                String  dateYear = String.valueOf(year);
                String  dateMonth = String.valueOf(month);
                String date = "Selected Date: " + dateDay+"/"+dateMonth+"/"+dateYear;
                Toast.makeText(Calendar.this, date, Toast.LENGTH_SHORT).show();
            }
        });

        /*//code to intialise date will be added based on data values within list and string builder

        if (reminders_List.getAdapter().getCount() > 0 && reminders_List.dateOfEvent == date) {
            // create the get Intent object
            Intent intent = getIntent();
            // receive the value by getStringExtra() method and
            // key must be same which is send by first activity
            String str = intent.getStringExtra("message_key");
            // display the string into textView
            remindersList.setText(str);
        }
        else
        {
            //set to default display
            remindersList.setText("No events currently available...");
        }*/

        createNewReminder_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*// create intent object with context and class name of other activity
                Intent intent = new Intent(getApplicationContext(), Reminder.class);
                // call startActivity method and pass intent
                startActivity(intent);*/
            }
        });
    }
}