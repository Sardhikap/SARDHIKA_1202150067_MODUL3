package com.example.asus.sardhika_1202150067_modul3;

import android.widget.TextView;

import java.util.ArrayList;


        import android.content.Intent;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.LinearLayout;
        import android.widget.TextView;


        import java.util.ArrayList;

// Mengatur Bagaimana Data akan Ditampilkan
public class AdapterRV extends RecyclerView.Adapter<AdapterRV.ViewHolder> {

    //menerima dan menyimpan list item
    private ArrayList<String> arrayListTitle, arrayListDesc;
    private ArrayList<Integer> arrayListGambar;

    //Membuat Konstruktor pada Class RecyclerViewAdapter
    AdapterRV(ArrayList<String> arrayListTitle, ArrayList<String> arrayListDesc, ArrayList<Integer> arrayListGambar){
        this.arrayListTitle = arrayListTitle;
        this.arrayListDesc = arrayListDesc;
        this.arrayListGambar = arrayListGambar;
    }

    // Menyimpan Referensi Dari View-View
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView Title, Desc;
        private ImageView Gambar;
        private LinearLayout itemList;

        public ViewHolder(View itemView) {
            super(itemView);
            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            Title = itemView.findViewById(R.id.title);
            Desc = itemView.findViewById(R.id.desc);
            Gambar = itemView.findViewById(R.id.gambar);
            itemList = itemView.findViewById(R.id.list_item);
        }
    }

    @Override
    public AdapterRV.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Membuat View untuk Menyiapkan dan Memasang Layout yang Akan digunakan pada RecyclerView
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_adapter_rv, parent,false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }

    @Override
    public void onBindViewHolder(AdapterRV.ViewHolder holder, final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        final String title = arrayListTitle.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final String desc = arrayListDesc.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final Integer gambar = arrayListGambar.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        holder.Title.setText(title);// Mengambil text sesuai posisi yang telah ditentukan
        holder.Desc.setText(desc); // Mengambil text sesuai posisi yang telah ditentukan
        holder.Gambar.setImageResource(gambar); // Mengambil gambar sesuai posisi yang telah ditentukan
        //Membuat Aksi Saat List Ditekan
        holder.itemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Detail.class);
                String descs1 = "Ades (sebelumnya pernah disebut AdeS) adalah merek air mineral atau air minum dalam kemasan (AMDK) yang diproduksi oleh PT. Coca-Cola Bottling Indonesia, Bekasi. Air mineral tersebut juga dikenal sebagai I-Lohas di Jepang. Kini The Coca-Cola Company merupakan pemilik merek dagang Ades, menggantikan PT. Akasha Wira Internasional atau PT. AdeS Waters Indonesia, pemilik merek dagang Ades sebelumnya.";
                String descs2= "AMIDIS adalah produk Air Minum Dalam Kemasan (AMDK) yang sudah diproduksi sejak tahun 1997 dan merupakan air minum distilasi pertama di Indonesia yang telah menjadi salah satu produk AMDK yang dipercaya karena kualitas mutu dan kemurniannya.\n" +
                        "\n" +
                        "AMIDIS sangat memperhatikan kualitas dari produk, berawal dari proses pengolahan air baku melalui kombinasi proses demineralisasi, penyaringan Reverse Osmosis (RO), pemurnian dengan proses distilasi (penyulingan mencapai suhu 110°C) dan sterilisasi dengan proses ozonisasi dan proses pengisian yang higienis sehingga menghasilkan air sehat yang terjaga hingga dapat dikonsumsi oleh konsumen.";
                String descs3 = "Aqua adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia, Singapura, dan Brunei. Aqua adalah merek AMDK dengan penjualan terbesar di Indonesia dan merupakan salah satu merek AMDK yang paling terkenal di Indonesia, sehingga telah menjadi seperti merek generik untuk AMDK.\n" +
                        "\n" +
                        "Saat ini, terdapat 14 pabrik yang memproduksi Aqua dengan kepemilikan berbeda-beda (3 pabrik dimiliki oleh PT Tirta Investama, 10 pabrik dimiliki oleh PT Aqua Golden Mississippi, dan pabrik di Berastagi, Sumatera Utara dimiliki oleh PT Tirta Sibayakindo).\n" +
                        "\n" +
                        "Sejak tahun 1998, Aqua sudah dimiliki oleh perusahaan multinasional dalam bidang makanan dan minuman asal Prancis, Grup Danone, hasil dari penggabungan PT Aqua Golden Mississippi dengan Danone.\n" +
                        "\n" +
                        "Aqua didirikan oleh Tirto Utomo (1930-1994), warga asli Wonosobo yang setelah keluar bekerja dari Pertamina, dan bekerja di Petronas, mendirikan usaha air minum dalam kemasan (AMDK).\n" +
                        "\n" +
                        "Tirto berjasa besar atas perkembangan bisnis atau usaha AMDK di Indonesia, karena sebagai seorang pionir maka Almarhum berhasil menanamkan nilai-nilai dan cara pandang bisnis AMDK di Indonesia.";
                String descs4 = "Tanobel adalah identitas perusahaan PT Sariguna Primatirta, pertama kali beroperasi pada tanggal 17 September 2003 dengan memproduksi Air Minum dalam Kemasan (AMDK) dengan merk Anda.\n" +
                        "\n" +
                        "Pada 7 Maret 2004, diluncurkan produk Air Murni Cleo sebagai salah satu produk andalan Tanobel dalam kemasan cup 250 mL, botol 330 mL, 550 mL, 1.200 mL, 6 L dan galon 19 L. Setelah itu, Tanobel melebarkan sayap produksi Air Murni Cleo ke berbagai daerah di Indonesia.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "Saat ini, Tanobel memiliki pabrik yang dilengkapi dengan proses terintegrasi dari penyediaan bahan baku, pengemasan cup, botol dan galon, hingga produk jadi. Dengan proses pengawasan kualitas yang ketat dan standar produksi yang tinggi, PT Sariguna Primatirta pada Oktober 2008 mendapat pengakuan internasional berupa ISO 9001:2000 dan pada Oktober 2008 mendapatkan ISO 22000:2005.\n" +
                        "\n" +
                        "PT Sariguna Primatirta, adalah salah satu perusahaan yang mendapatkan pengakuan dari REBI sebagai Pelopor air minum dalam kemasan dengan oksigen di Indonesia (CLEO).\n" +
                        "\n" +
                        "PT Sariguna Primatirta juga mendapatkan penghargaan sebagai berikut : REKOR Muri 2013, WOW Brand 2014, TOP Brand 2014, TOP Brand 2015, TOP Brand 2016, TOP Brand 2017.";
                String descs5 = "Club adalah merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur. Club diproduksi oleh PT Tirta Sukses Perkasa (dahulu PT Tirta Bahagia) sejak tahun 1986. Pada bulan November 2013, merek Club diakuisisi oleh PT Indofood CBP Sukses Makmur Tbk.";
                String descs6 = "EQUIL  was first bottled in 1998 at the source, Villa D’Equilibrium, and launched to the market which was then predominantly monopolized by few European brands. Although drinking natural mineral water is embedded in the European fine dining culture, the gourmet and exclusivity of the concept has been accepted by the local Socialites.";
                String descs7 = "Evian (pengucapan bahasa Perancis: [evjɑ̃ ]) adalah sebuah merek air mineral Perancis yang berasal dari berbagai sumber dekat Évian-les-Bains, di pesisir selatan Lac Léman.\n" +
                        "\n" +
                        "Saat ini Evian dimiliki oleh Groupe Danone, sebuah perusahaan multinasional Perancis. Selain air mineral, Groupe Danone memakai nama Evian untuk jajaran produk perawatan kulit organik serta sebuah resor mewah di Perancis.\n" +
                        "\n" +
                        "Dalam budaya masyarakat, Evian ditampilkan sebagai produk air kemasan mewah dan mahal. Produk ini disebutkan dalam Murder on the Orient Express karya Agatha Christie. Air kemasan ini populer di kalangan selebriti Hollywood.[1] David LaChapelle membuat foto kampanye Evian yang mempersandingkan seorang supermodel dengan air mancur Evian yang keluar dari patung Yunani; aktor film Sebastian Siegel dicat agar menyerupai patung tersebut oleh Joanne Gair. Selain itu, desainer mode tinggi Jean-Paul Gaultier menjadi perancang botol edisi terbatas tahun 2009.";
                String descs8 = "Le Minerale adalah air mineral baru dari Mayora, berupa air mineral pegunungan yang mengandung mineral alami yang dibutuhkan tubuh sehari-hari. Le Minerale, diolah dari sumber mata air pegunungan terpilih, sehingga memiliki kesegaran khas yang ditandai dengan sedikit rasa manis. Kesegaran khas ini berasal dari seimbangnya jumlah kandungan mineral alami dalam Le Minerale. Le Minerale menjaga kandungan mineral tersebut tetap utuh dengan  menggunakan teknologi perlindungan mineral pertama di Indonesia, yaitu Mineral Protection System. Kandungan mineral alami diproteksi dengan sempurna,  ditandai dengan botol kemasan Le Minerale akan tetap keras sebelum dibuka. Teknologi ini membuat kesegaran khas yang dimiliki Le Minerale tetap terjaga utuh sampai ke tangan konsumen.\n" +
                        "\n"
                        ;
                String descs9 = "Siapa yang tidak tahu AMDK (Air Minum Dalam Kemasan) Nestle Pure Life. Produk ini bisa kita temukan dengan mudah di berbagai jaringan ritel modern hingga tradisional sekalipun. Saya adalah salah satu konsumen Loyal (Karena saya konsumsi hampir setiap hari, saya merekomendasikan ke orang lain dan melakukan pembelian berulang) dari produk ini.";
                String descs10 = "Pristine 8+ merupakan Air minum Alkaline dengan kandungan pH 8+ (Melebihi 8) yang memberikan manfaat detoxifikasi bagi tubuh kita. Buat yang belum tau nih gan, air alkaline memilik banyak manfaat dan pastinya sangat baik untuk tubuh yang bisa menjaga keseimbangan kadar pH dan efektif untuk membantu proses detoxifikasi. Pristine 8+ berasal dari sumber mata air terbaik di kawasan konservasi Gunung Gede Pangrango dan diproses dengan teknologi Ionisasi dari Nihon Trim Jepang sehingga menjadikan Pristine 8+ tentu berbeda dibanding dengan air mineral lainnya. \n";
                String descs11 = "VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta. Pada tanggal 17 Juli 1987 kepemilikan PT Varia Industri Tirta beralih kepada Tirto Utomo. Sebelas tahun kemudian, setelah melakukan merger dengan PT Varia Industri Tirta, PT Tirta Investama menjadi pemilik merek VIT.";

                switch (position){
                    case 0:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs1);
                        v.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs2);
                        v.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs3);
                        v.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs4);
                        v.getContext().startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs5);
                        v.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs6);
                        v.getContext().startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs7);
                        v.getContext().startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs8);
                        v.getContext().startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs9);
                        v.getContext().startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs10);
                        v.getContext().startActivity(intent);
                        break;
                    case 10:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs11);
                        v.getContext().startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListTitle.size();
    }
}

