package br.com.execicio.androidnumcompare;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText edtNum1;
    private EditText edtNum2;
    private TextView txvSum;
    private TextView txvGreater;
    private Button btnGreater;
    private Button btnSum;
    private TextView txvNum1;
    private TextView txvNum2;
    private ExController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);
        txvSum = findViewById(R.id.txvSum);
        txvGreater = findViewById(R.id.txvGreater);
        btnGreater = findViewById(R.id.btnGreater);
        btnSum = findViewById(R.id.btnSum);
        txvNum1 = findViewById(R.id.txvNum1);
        txvNum2 = findViewById(R.id.txvNum2);

        controller = new ExController();
        btnGreater.setOnClickListener(gret -> controller.greater(this));
        btnSum.setOnClickListener(sum -> controller.sum(this));
    }

    public EditText getEdtNum1() {
        return edtNum1;
    }

    public void setEdtNum1(EditText edtNum1) {
        this.edtNum1 = edtNum1;
    }

    public EditText getEdtNum2() {
        return edtNum2;
    }

    public void setEdtNum2(EditText edtNum2) {
        this.edtNum2 = edtNum2;
    }

    public TextView getTxvSum() {
        return txvSum;
    }

    public void setTxvSum(TextView txvSum) {
        this.txvSum = txvSum;
    }

    public TextView getTxvGreater() {
        return txvGreater;
    }

    public void setTxvGreater(TextView txvGreater) {
        this.txvGreater = txvGreater;
    }

    public Button getBtnGreater() {
        return btnGreater;
    }

    public void setBtnGreater(Button btnGreater) {
        this.btnGreater = btnGreater;
    }

    public Button getBtnSum() {
        return btnSum;
    }

    public void setBtnSum(Button btnSum) {
        this.btnSum = btnSum;
    }

    public TextView getTxvNum1() {
        return txvNum1;
    }

    public void setTxvNum1(TextView txvNum1) {
        this.txvNum1 = txvNum1;
    }

    public TextView getTxvNum2() {
        return txvNum2;
    }

    public void setTxvNum2(TextView txvNum2) {
        this.txvNum2 = txvNum2;
    }

    public ExController getController() {
        return controller;
    }

    public void setController(ExController controller) {
        this.controller = controller;
    }
}