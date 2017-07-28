package com.myhexaville.androidarchitectureexample;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

public class UserNameTextView extends android.support.v7.widget.AppCompatTextView {
    private static Map<String, String> userNames = new HashMap<>();

    public UserNameTextView(Context context) {
        super(context);
    }

    public UserNameTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public UserNameTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setId(String id) {
        if (id != null) {
            if (userNames.containsKey(id)) {
                setText(userNames.get(id));
            } else {
                FirebaseDatabase.getInstance().getReference()
                        .child("users")
                        .child(id)
                        .child("name")
                        .addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String name = dataSnapshot.getValue(String.class);
                                setText(name);
                                userNames.put(id, name);
                            }

                            @Override
                            public void onCancelled(DatabaseError databaseError) {

                            }
                        });
            }
        }
    }

}
