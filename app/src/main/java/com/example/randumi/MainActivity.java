package com.example.randumi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtGuess;
    private TextView lblOutput;
    private int theNumber;

    public void checkGuess() {
        String guessText = txtGuess.getText().toString();
        String message = "";
        try {
            int guess = Integer.parseInt(guessText);
            if (guess < theNumber) {
                message = guess + " is too low. Try again.";
            } else if (guess > theNumber) {
                message = guess + " is too high. Try again.";
            } else {
                message = guess + " is correct. You win! Let's play again!";
                newGame();
            }
        } catch (NumberFormatException e) {
            message = "Enter a whole number between 1 and 100.";
        } finally {
            lblOutput.setText(message);
            txtGuess.requestFocus();
            txtGuess.selectAll();
        }
    }

    public void newGame() {
        theNumber = (int) (Math.random() * 100 + 1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtGuess = findViewById(R.id.txtGuess);
        Button btnGuess = findViewById(R.id.btnGuess);
        lblOutput = findViewById(R.id.lblOutput);
        newGame();

        // Corrected the setOnClickListener syntax
        btnGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkGuess();
            }
        });
    }
}
