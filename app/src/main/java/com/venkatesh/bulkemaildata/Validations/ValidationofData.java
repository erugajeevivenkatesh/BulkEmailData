package com.venkatesh.bulkemaildata.Validations;

import android.text.TextUtils;
import android.widget.EditText;

public class ValidationofData {
    public boolean ValidateMaildata(EditText[] data)
    {
        boolean valid=true;
        for (EditText d:data)
        {
           if(TextUtils.isEmpty(d.getText().toString()))
           {
               d.setError("Please Fill Data");
               valid=false;
           }
           else
           {
               d.setError(null
               );
           }
        }
     return valid;
    }
}
