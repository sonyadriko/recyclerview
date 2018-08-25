package com.example.xdreamer.smk_pulau;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterKota extends RecyclerView.Adapter<AdapterKota.KotaHolder> {

    private List<ModelData> mData;
    public ClickListerner ClickListerner;

    public AdapterKota(List<ModelData> data){
        mData = data;
    }
    public AdapterKota(List<ModelData> data, ClickListerner click){
        mData = data;
        ClickListerner = click;
    }

    @NonNull
    @Override
    public AdapterKota.KotaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_kota, parent, false);
        return new KotaHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterKota.KotaHolder holder, int position) {
        holder.bind(mData.get(position), ClickListerner);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public class KotaHolder extends RecyclerView.ViewHolder {
        private ImageView gambarKota;
        private CardView cardView;
        private TextView namaKota, provinsiKota;

        public KotaHolder (View dataView){
            super(dataView);
        }

        public void bind(final ModelData modelData,
                         final ClickListerner clickListerner){
            cardView = itemView.findViewById(R.id.cardView);
            gambarKota = itemView.findViewById(R.id.imageView);
            namaKota = itemView.findViewById(R.id.textNamaKota);
            provinsiKota = itemView.findViewById(R.id.textProvinsi);

            gambarKota.setImageResource(modelData.getGambarKota());
            namaKota.setText(modelData.getNamaKota());
            provinsiKota.setText(modelData.getProvinsiKota());

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (clickListerner != null){
                        clickListerner. onClick(modelData);
                    }
                }
            });
        }
    }
    interface ClickListerner {
        public void onClick(ModelData modelData);
    }
}
