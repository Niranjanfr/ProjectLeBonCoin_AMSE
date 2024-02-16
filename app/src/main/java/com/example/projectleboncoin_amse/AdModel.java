package com.example.projectleboncoin_amse;

public class AdModel {
    private String title;
    private String address;
    private int image;

    // Constructor
    public AdModel(String title, String address, int image) {
        this.title = title;
        this.address = address;
        this.image = image;
    }

    // Getter and Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
// ...
}
//public class AdAdapter extends BaseAdapter {
//    private final Context context;
//    private final Arraylist<admodel> admodelarraylist;
//    private final layoutinflater inflater;
//    // Constructor
//    public AdAdapter(Context context, ArrayList<AdModel> adModelArrayList) {
//        this.context = context;
//        this.adModelArrayList = adModelArrayList;
//        inflater = (LayoutInflater.from(context));
//    }
//    @Override
//    public int getCount() { return ... ; } // Return ad number
//    @Override
//    public Object getItem(int i) { return ... ; } // Return ad number i
//    @Override
//    public long getItemId(int i) { return ... ; } // Return ad id i
//    @Override
//    public View getView(int i, View view, ViewGroup viewGroup) {
//// Get ad number i
//        AdModel ad = ... ;
//        view = inflater.inflate(R.layout.votre_design_layout, null);
//// Get the image view and both text views
//        ImageView imageIV = ... ;
//        TextView titleTV = ... ;
//        TextView addressTV = ... ;
//        imageIV.setImageResource(...);
//        titleTV.setText(...);
//        addressTV.setText(...);
//        return view;
//    }
//}
