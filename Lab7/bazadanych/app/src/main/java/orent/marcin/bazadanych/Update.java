package orent.marcin.bazadanych;

import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.util.Log;

import static android.content.ContentValues.TAG;

public class Update extends AsyncTask <String,Void,Boolean>{

    public Update(DatabaseHelper test) {
        this.test = test;
    }

    DatabaseHelper test;

    @Override
    protected Boolean doInBackground(String[] string) {



        SQLiteDatabase db = test.getWritableDatabase();
        String query = "UPDATE " + test.TABLE_NAME + " SET " + test.COL2 +
                " = '" + string[2] + "' WHERE " + test.COL1 + " = '" + string[0] + "'" +
                " AND " + test.COL2 + " = '" + string[1] + "'";
        Log.d(TAG, "updateName: query: " + query);
        Log.d(TAG, "updateName: Setting name to " + string[2]);
        db.execSQL(query);
        return true;
    }

}
