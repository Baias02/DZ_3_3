package com.example.dz_3_3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactsViewHolder extends RecyclerView.ViewHolder {

    TextView nameTextView, surNameText;
    ImageView icon;

    public ContactsViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(String contactName, String contactSurname){
        nameTextView = itemView.findViewById(R.id.textView_one);
        surNameText = itemView.findViewById(R.id.textView_two);
        icon = itemView.findViewById(R.id.imageView);
        nameTextView.setText(contactName);
        surNameText.setText(contactSurname);
    }
}
