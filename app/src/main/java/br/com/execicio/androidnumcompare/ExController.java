package br.com.execicio.androidnumcompare;

import android.util.Log;
import android.widget.Toast;

public class ExController {
    public ExController() {
        super();
    }

    public void sum(MainActivity mainActivity) {
        if (!validFields(mainActivity)) return;

        int num1 = Integer.parseInt(mainActivity.getEdtNum1().getText().toString());
        int num2 = Integer.parseInt(mainActivity.getEdtNum2().getText().toString());

        int result = 0;

        if (num1 < num2) {
            for (int i = num1 + 1; i < num2; i++) {
                if (i % 2 == 1) {
                    result += i;
                }
            }
        } else if (num1 > num2){
            for (int i = num2 + 1; i < num1; i++) {
                if (i % 2 == 1) {
                    result += i;
                }
            }
        }

        mainActivity.getTxvSum().setText(String.valueOf(result));
    }

    public void greater(MainActivity mainActivity) {
        if (!validFields(mainActivity)) return;

        int num1 = Integer.parseInt(mainActivity.getEdtNum1().getText().toString());
        int num2 = Integer.parseInt(mainActivity.getEdtNum2().getText().toString());

        if (num1 > num2) {
            mainActivity.getTxvGreater().setText(String.valueOf(num1));
        } else if (num1 < num2) {
            mainActivity.getTxvGreater().setText(String.valueOf(num2));
        } else {
            mainActivity.getTxvGreater().setText(R.string.equal_nums);
        }
    }

    private boolean validFields(MainActivity mainActivity) {
        if (mainActivity.getEdtNum1().getText().toString().isEmpty()) {
            Toast.makeText(mainActivity, R.string.empty_num1, Toast.LENGTH_LONG).show();
            Log.e("num-1-empty", mainActivity.getString(R.string.empty_num1));
            mainActivity.getEdtNum1().requestFocus();
            return false;
        }
        if (mainActivity.getEdtNum2().getText().toString().isEmpty()) {
            Toast.makeText(mainActivity, R.string.empty_num2, Toast.LENGTH_LONG).show();
            Log.e("num-2-empty", mainActivity.getString(R.string.empty_num2));
            mainActivity.getEdtNum2().requestFocus();
            return false;
        }
        return true;
    }
}
