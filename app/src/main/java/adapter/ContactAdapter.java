package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.e.recyclerview.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import model.Contacts;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder>{

    Context mContext;
    List<Contacts> contactsList;


    public ContactAdapter(Context mContext, List<Contacts> contactsList) {
        this.mContext = mContext;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.contacts,viewGroup,false);

        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder contactViewHolder, int i) {
        Contacts contacts=contactsList.get(i);
        contactViewHolder.imageprofile.setImageResource(contacts.getImageid());
        contactViewHolder.tvname.setText(contacts.getName());
        contactViewHolder.tvphone.setText(contacts.getPhoneno());


    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder{

    CircleImageView imageprofile;
    TextView tvname,tvphone;


    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);

        imageprofile=itemView.findViewById(R.id.imageprofile);
        tvname=itemView.findViewById(R.id.tvname);
        tvphone=itemView.findViewById(R.id.tvphone);

    }
}

}
