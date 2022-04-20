import java.util.Scanner;
public class otomotif extends fashion{
    public otomotif(String nama, String size, int harga) {
        super(nama, size, harga);
      total=harga+ongkir;
    }
    void input(){
            Scanner x = new Scanner(System.in);
          System.out.print("Masukkan nama penerima   : ");
          penerima = x.nextLine();
          System.out.print("Masukkan Alamat penerima : " );
          alamat = x.nextLine();
          System.out.print("Masukkan kode pos        : ");
          pos = x.nextLine();
          System.out.print("Masukkan nomor telepon   : ");
          tlpn = x.nextLine();
          System.out.println("Pilih jasa pengiriman");
          System.out.println("1. J&T Express ");
          System.out.println("2. SiCepat REG");
          System.out.println("3. ID Express");
          System.out.println("4. Ninja Xpress");
          System.out.println("5. JNE regular");
          System.out.print("Masukkan pilihanmu : ");
          int jasa= x.nextInt();
          switch (jasa){
              case 1 :
                  jasaKirim = "J&T Express";
                  break;
              case 2 :
                  jasaKirim = "SiCepat REG";
                  break;
              case 3:
                  jasaKirim = "ID Express";
                  break;
              case 4:
                  jasaKirim = "Ninja Xpress";
                  break;
                        case 5:
                  jasaKirim = "JNE regular";
                  break;
                        default:
                            System.out.println("tidak ada");
          }
    }    
      void display(){
    System.out.println("");
    int voucher = 30000; 
    int bayar= total-voucher;
    int vcr =3;
    int pakai = 1;
    int sisa = vcr-pakai;
Scanner x = new Scanner(System.in);
          System.out.println("Kamu memiliki 3 voucher gratis ongkir");
    System.out.print("Apakah kamu ingin menggunakannya? ya / tidak : ");
    String vchr = x.nextLine();
    switch (vchr){
        case "ya":
            System.out.println("Sisa voucher gratis ongkir kamu tinggal "+sisa);
            System.out.println("");
            System.out.println("==================================================");
            System.out.println("<Checkout>");
       System.out.println("Nama penerima            : " +penerima);
       System.out.println("Alamat penerima          : " +alamat);
       System.out.println("Kode pos                 : " +pos);
       System.out.println("Nomor telepon            : " +tlpn);
            System.out.println("");
       System.out.println("Nama Barang              : " + nama);
       System.out.println("Size                     : " +size);
       System.out.println("Jasa Pengiriman          : " +jasaKirim);
            System.out.println("");
       System.out.println("Subtotal produk          : Rp " +harga);
       System.out.println("Subtotal pengiriman      : Rp " +ongkir);
       System.out.println("Total                    : Rp " +total);
       System.out.println("Subtotal Diskon Pengirim : Rp " +voucher);
       System.out.println("Jumlah pembayaran        : Rp " +bayar);
       int discount;
       int ttl;
       if(bayar>=100000){
            discount=bayar*30/100;
            ttl=bayar-discount;
            System.out.println(">Selamat anda mendapatkan diskon 30%<" );
      System.out.println("jadi totalnya            : Rp "+ttl);
      System.out.println("==================================================");
        }
        else if(bayar>= 50000){
            discount=total*20/100;
            ttl=total-discount;
            System.out.println(">Selamat anda mendapatkan diskon 20%<" );
    System.out.println("jadi totalnya            : Rp "+ttl);
    System.out.println("==================================================");
        }else{
            System.out.println("");
        }
      break;
        case "tidak":
                        System.out.println("");
                        System.out.println("==================================================");
                        System.out.println("<Checkout>");
       System.out.println("Nama Barang              : " + nama);
       System.out.println("Size                     : " +size);
       System.out.println("Jasa Pengiriman          : " +jasaKirim);
            System.out.println("");
       System.out.println("Subtotal produk          : Rp " +harga);
       System.out.println("Subtotal pengiriman      : Rp " +ongkir);
       System.out.println("Jumlah pembayaran        : Rp " +total);
              if(bayar>=100000){
            discount=bayar*30/100;
            ttl=bayar-discount;
            System.out.println(">Selamat anda mendapatkan diskon 30%<" );
       System.out.println("jadi totalnya            : Rp "+ttl);
       System.out.println("==================================================");
        }
        else if(bayar>= 50000){
            discount=total*20/100;
            ttl=total-discount;
            System.out.println(">Selamat anda mendapatkan diskon 20%<" );
       System.out.println("jadi totalnya            : Rp "+ttl);
       System.out.println("==================================================");
        }else{
            System.out.println("");
        }
        default:
            System.out.println("Pilihan yang anda masukkan tidak tersedia");
    }
          System.out.println("");
            System.out.print("Buat Pesanan ya / tidak : ");
            String psn = x.nextLine();
            switch (psn){
                case "ya":
                    System.out.println("*Pesanan anda telah diproses*\n*pesanan akan sampai paling lambat 3 hari setelah dikirim*");
                    break;
            case "tidak":
            System.out.println("Terimakasih telah menggunakan aplikasi ini");
            break;
            default:
                System.out.println("Pilihan yang anda masukkan tidak tersedia");
}
}
}