package com.example.bookinghotel.fragment_room_history;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bookinghotel.R;
import com.example.bookinghotel.adapter.AdapterRoomHistoryCancel;
import com.example.bookinghotel.database._2_table;

import java.util.ArrayList;
import java.util.List;

public class CancelFragment extends Fragment {

    RecyclerView recyclerView_cancel;
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView_cancel = (RecyclerView) view.findViewById(R.id.recyclerView_cancel);
        GridLayoutManager gridLayoutManager_cancel = new GridLayoutManager(getActivity(), 1);
        recyclerView_cancel.setLayoutManager(gridLayoutManager_cancel);

        AdapterRoomHistoryCancel adapterRoomHistory_cancel = new AdapterRoomHistoryCancel(getListRoom_Cancel());
        recyclerView_cancel.setAdapter(adapterRoomHistory_cancel);
    }

    private List<_2_table> getListRoom_Cancel() {
        List<_2_table> room_histories = new ArrayList<>();
        room_histories.add(new _2_table("", "", "", "", "", "", "", "", R.drawable.hotelroom1,"GO2JOY - WHITE LION ROOM", 179, "2N - 1D", "Single beds", "Da Nang"));
        room_histories.add(new _2_table("", "", "", "", "", "", "", "", R.drawable.hotelroom2,"GO2JOY - MILAN 1 ROOM", 30, "2N - 1D", "Single beds", "Hoi An"));
        room_histories.add(new _2_table("", "", "", "", "", "", "", "", R.drawable.hotelroom3,"GO2JOY- TRẦN GIA ROOM TÂN PHÚ", 14, "2N - 1D", "Single beds", "Da Nang"));
        room_histories.add(new _2_table("", "", "", "", "", "", "", "", R.drawable.hotelroom1,"GO2JOY - BẠN TÔI ROOM", 15, "2N - 1D", "Single beds", "Da Nang"));
        return room_histories;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cancel, container, false);
    }
}