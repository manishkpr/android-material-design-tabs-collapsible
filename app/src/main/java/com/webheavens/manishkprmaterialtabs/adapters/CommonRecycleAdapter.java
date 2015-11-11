package com.webheavens.manishkprmaterialtabs.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.webheavens.manishkprmaterialtabs.R;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Munish on 11/5/15.
 */

public class CommonRecycleAdapter extends RecyclerView.Adapter<CommonRecycleAdapter.ViewHolder> {

    private List<String> itemsData;

    public CommonRecycleAdapter(List<String> itemsData) {
        this.itemsData = itemsData;
    }

    @Override
    public CommonRecycleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view_common_items, null);
        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        viewHolder.text.setText(itemsData.get(position));

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.text) TextView text;
        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            ButterKnife.bind(this, itemLayoutView);
        }
    }

    @Override
    public int getItemCount() {
        return itemsData.size();
    }
}