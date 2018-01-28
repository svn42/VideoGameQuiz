package com.example.android.videogamequiz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This app displays a quiz and checks if the answers are correct. After finishing the Quiz the User can see the results and share them with a text messaging app
 * It works in english and german.
 */
public class MainActivity extends AppCompatActivity {

    String userName;
    int correctAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // accomplishes that the android Keyboard is not shown, after switching the oriantation from portrait do landscape
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    /**
     * This method is called when the check answers button is clicked.
     * 1. Checks, if the user set a Name
     * --> if not: Toast, which reminds him to do it.
     * 2. Checks, if the user answered every 8 question
     * --> if not: Toast, which reminds him to do it
     * 3. Counts the correct answers, if everything is answered.
     * 4. Calls the method "createToast", which creates a Toast, that displays the score
     * 5. Makes the quiz results and the share button visible
     */
    public void checkAnswers(View view) {

        //the given Name in the EditText is assigned to the variable userName
        EditText nameField = findViewById(R.id.nameField);
        userName = nameField.getText().toString();

        //set number of correct answers to 0 before the method counts the correct ones
        correctAnswers = 0;
        //this int counts the number of questions, which has been answered
        int questionsAnswered = 0;

        //the 8 RadioGroups are assigned to local variables, which are needed to check, if the user
        //answered the question and if the answer is correct
        RadioGroup rg1 = findViewById(R.id.question1);
        RadioGroup rg2 = findViewById(R.id.question2);
        RadioGroup rg3 = findViewById(R.id.question3);
        RadioGroup rg4 = findViewById(R.id.question4);
        RadioGroup rg5 = findViewById(R.id.question5);
        RadioGroup rg6 = findViewById(R.id.question6);
        RadioGroup rg7 = findViewById(R.id.question7);
        RadioGroup rg8 = findViewById(R.id.question8);

        //if the nameField is not empty
        if (!nameField.getText().toString().equals("")) {

            //if the 1st group is answered
            //if the checked Radio button ID is not empty.
            if (rg1.getCheckedRadioButtonId() != -1) {
                //add 1 to questionsAnswered, which counts the number of answered questions
                questionsAnswered++;
                //assigns the relevant Textview of the Quiz Summary Section to a new variable "sq1"
                TextView sq1 = findViewById(R.id.summaryQuestion1);
                //if the ID of the checked Button is the same as the correct answer (in this case answer 3)
                if (rg1.getCheckedRadioButtonId() == findViewById(R.id.question1c).getId()) {
                    //add 1 to the correctAnswers counter
                    correctAnswers++;
                    //sets the text of the relevant Textview of the Quiz Summary Section and adds the boolean true
                    sq1.setText(getString(R.string.summaryQuestion1, true));
                    //dyes the text in a green color
                    sq1.setTextColor(Color.GREEN);
                    //if the ID is not the same as the correct ID
                } else if (rg1.getCheckedRadioButtonId() != findViewById(R.id.question1c).getId()) {
                    //appends a false to the String
                    sq1.setText(getString(R.string.summaryQuestion1, false));
                    //and dyes the Color red
                    sq1.setTextColor(Color.RED);
                }
            }

            //the code for the following 7 Questions works as the previous section
            //if the 2nd group is answered
            if (rg2.getCheckedRadioButtonId() != -1) {
                questionsAnswered++;
                TextView sq2 = findViewById(R.id.summaryQuestion2);

                if (rg2.getCheckedRadioButtonId() == findViewById(R.id.question2a).getId()) {
                    correctAnswers++;
                    sq2.setText(getString(R.string.summaryQuestion2, true));
                    sq2.setTextColor(Color.GREEN);
                } else if (rg2.getCheckedRadioButtonId() != findViewById(R.id.question2a).getId()) {
                    sq2.setText(getString(R.string.summaryQuestion2, false));
                    sq2.setTextColor(Color.RED);
                }
            }

            //if the 3rd group is answered
            if (rg3.getCheckedRadioButtonId() != -1) {
                questionsAnswered++;
                TextView sq3 = findViewById(R.id.summaryQuestion3);

                if (rg3.getCheckedRadioButtonId() == findViewById(R.id.question3b).getId()) {
                    correctAnswers++;
                    sq3.setText(getString(R.string.summaryQuestion3, true));
                    sq3.setTextColor(Color.GREEN);
                } else if (rg3.getCheckedRadioButtonId() != findViewById(R.id.question3b).getId()) {
                    sq3.setText(getString(R.string.summaryQuestion3, false));
                    sq3.setTextColor(Color.RED);
                }
            }

            //if the 4th group is answered
            if (rg4.getCheckedRadioButtonId() != -1) {
                questionsAnswered++;
                TextView sq4 = findViewById(R.id.summaryQuestion4);

                if (rg4.getCheckedRadioButtonId() == findViewById(R.id.question4d).getId()) {
                    correctAnswers++;
                    sq4.setText(getString(R.string.summaryQuestion4, true));
                    sq4.setTextColor(Color.GREEN);
                } else if (rg4.getCheckedRadioButtonId() != findViewById(R.id.question4d).getId()) {
                    sq4.setText(getString(R.string.summaryQuestion4, false));
                    sq4.setTextColor(Color.RED);
                }
            }

            //if the 5th group is answered
            if (rg5.getCheckedRadioButtonId() != -1) {
                questionsAnswered++;
                TextView sq5 = findViewById(R.id.summaryQuestion5);

                if (rg5.getCheckedRadioButtonId() == findViewById(R.id.question5c).getId()) {
                    correctAnswers++;
                    sq5.setText(getString(R.string.summaryQuestion5, true));
                    sq5.setTextColor(Color.GREEN);
                } else if (rg5.getCheckedRadioButtonId() != findViewById(R.id.question5c).getId()) {
                    sq5.setText(getString(R.string.summaryQuestion5, false));
                    sq5.setTextColor(Color.RED);
                }
            }


            //if the 6th group is answered
            if (rg6.getCheckedRadioButtonId() != -1) {
                questionsAnswered++;
                TextView sq6 = findViewById(R.id.summaryQuestion6);

                if (rg6.getCheckedRadioButtonId() == findViewById(R.id.question6a).getId()) {
                    correctAnswers++;
                    sq6.setText(getString(R.string.summaryQuestion6, true));
                    sq6.setTextColor(Color.GREEN);
                } else if (rg6.getCheckedRadioButtonId() != findViewById(R.id.question6a).getId()) {
                    sq6.setText(getString(R.string.summaryQuestion6, false));
                    sq6.setTextColor(Color.RED);
                }
            }

            //if the 7th group is answered
            if (rg7.getCheckedRadioButtonId() != -1) {
                questionsAnswered++;
                TextView sq7 = findViewById(R.id.summaryQuestion7);

                if (rg7.getCheckedRadioButtonId() == findViewById(R.id.question7c).getId()) {
                    correctAnswers++;
                    sq7.setText(getString(R.string.summaryQuestion7, true));
                    sq7.setTextColor(Color.GREEN);
                } else if (rg7.getCheckedRadioButtonId() != findViewById(R.id.question7c).getId()) {
                    sq7.setText(getString(R.string.summaryQuestion7, false));
                    sq7.setTextColor(Color.RED);
                }
            }

            //if the 8th group is answered
            if (rg8.getCheckedRadioButtonId() != -1) {
                questionsAnswered++;
                TextView sq8 = findViewById(R.id.summaryQuestion8);

                if (rg8.getCheckedRadioButtonId() == findViewById(R.id.question8c).getId()) {
                    correctAnswers++;
                    sq8.setText(getString(R.string.summaryQuestion8, true));
                    sq8.setTextColor(Color.GREEN);
                } else if (rg8.getCheckedRadioButtonId() != findViewById(R.id.question8c).getId()) {
                    sq8.setText(getString(R.string.summaryQuestion8, false));
                    sq8.setTextColor(Color.RED);
                }
            }

            //if every question was answered
            if (questionsAnswered == 8) {
                //create the toast message with the result
                createToast();
                //makes the quiz results and the share button visible
                findViewById(R.id.summaryTitle).setVisibility(View.VISIBLE);
                findViewById(R.id.summary).setVisibility(View.VISIBLE);
                findViewById(R.id.shareButton).setVisibility(View.VISIBLE);
                findViewById(R.id.summaryLine).setVisibility(View.VISIBLE);

            } else {
                //if the user forgot to answer everything, the app shows a toast, which reminds him to do it
                Toast.makeText(this, getString(R.string.questionForgotten, userName),
                        Toast.LENGTH_SHORT).show();
            }
            // if the nameField is empty
        } else {
            //if the nameField is empty, the app creates a Toast, which reminds the user to enter a name
            Toast.makeText(this, getString(R.string.nameForgotten),
                    Toast.LENGTH_SHORT).show();
            //jumps to the top and focuses the textfield
            nameField.requestFocus();

        }
    }


    /**
     * creates the toast-message. The string depends on the amount of correct answers.
     * The username is added to the string as well
     */
    public void createToast() {
        String toastString = null;

        //Try again
        if (correctAnswers < 5)
            toastString = getString(R.string.toastBad, userName, correctAnswers);
        else if (correctAnswers > 4 && correctAnswers < 8)
            toastString = getString(R.string.toastGood, userName, correctAnswers);
        else if (correctAnswers == 8)
            toastString = getString(R.string.toastPerfect, userName, correctAnswers);
        Toast.makeText(this, toastString,
                Toast.LENGTH_LONG).show();
    }

    /**
     * by clicking the Share Results Button you can share your Result via Whatsapp, Messenger or another Text Messenger.
     * I added a link to google.com. This is a placeholder for a link to the Quiz (e.g. the Play Store site)
     */
    public void shareResult(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, getString(R.string.shareMsg, correctAnswers));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}