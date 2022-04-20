import java.util.Scanner;
public class main {
    String username;
    int password;
    public static void main(String[] args) {
        String user="rumahmu@gmail.com";
        int pass = 12345;

        Scanner input = new Scanner(System.in);
        System.out.println("==================================================");
       System.out.println("===================  SHOPEE  =====================");
        System.out.println("==================================================");
       System.out.println(" \t\t     *BIG*\n\t\t    RAMADHAN\n \t\t     *SALE*");
         System.out.println("--------------------------------------------------");
        System.out.println("COD GRATIS ONGKIR Rp0 | CASHBACK 50% | SERBA SERIBU");
        System.out.println("===================================================");
        System.out.println("");
        System.out.println("Silahkan login ke akun anda terlebih dahulu");
        System.out.println("Log In");
        System.out.print("Masukkan username : ");
        String username=input.nextLine();
        System.out.print("Masukkan password : ");
        int password=input.nextInt();
System.out.println("");
        if(username.equals(user)&&password==pass){
System.out.println("--------------------------------------------------");
        System.out.println("               Shopee Kategori");
System.out.println("--------------------------------------------------");
            System.out.println("1. Fashion");
            System.out.println("2. Elektronik 100% ori");
            System.out.println("3. Otomotif");
            System.out.println("4. Shopee Food");
            System.out.print("Masukkan pilihanmu : ");
        int pilih = input.nextInt();
            System.out.println("");
        switch(pilih){
            case 1:
            System.out.println("___________________  Fashion  ______________________");
            System.out.println("1. Celana Panjang Pria Chinos Cream ~ Rp 150000");
            System.out.println("2. Kemeja Koko Pria Cotton Lengan Pendek ~ Rp 120000");
            System.out.println("3. Sepatu Pantofel Pria Oxford Footstep ~ Rp 250000");
            System.out.print("Masukkan pilihanmu : ");
        int pilih1=input.nextInt();
 System.out.println("____________________________________________________");
            switch(pilih1){
            case 1:
             fashion a =new fashion("Celana Panjang Pria Chinos Cream","L",150000);
a.input();
             a.display();
               break;
             case 2:
             fashion b =new fashion("Kemeja Koko Pria Cotton Printing Lengan Pendek","XL",120000);
             b.input();
             b.display();
               break;
              case 3:
             fashion c =new fashion("Sepatu Pantofel Pria Oxford Footstep","32",250000);
             c.input();
             c.display();
               break;
              }
            break;
            case 2:
System.out.println("_____________  Elektronik 100% ori __________________");
            System.out.println("1. Samsung Digital Smart TV ~ Rp 1900000");
            System.out.println("2. Xiomi Digital Smart TV ~ Rp 12000000");
            System.out.println("3. Poltron Digital Smart TV ~ Rp 17500000");
            System.out.print("Masukkan pilihanmu : ");
        int pilih2=input.nextInt();
         System.out.println("____________________________________________________");
            switch(pilih2){
             case 1:
             Elektronik a =new Elektronik("Samsung Digital Smart TV","32 inch",1900000);
             a.input();
             a.display();
               break;
             case 2:

             Elektronik b =new Elektronik("Xiomi Digital TV","16 inch",1200000);
             b.input();
             b.display();
               break;
              case 3:
             Elektronik c =new Elektronik("Polytron Digital TV","32 inch",1750000);
             c.input();
             c.display();
               break;
            }
            break;
              case 3:
         System.out.println("__________________  Otomotif  ______________________");
            System.out.println("1. Helm cargloss CFM Retro ~ Rp 250000");
            System.out.println("2. Jas Hujan ASV ORI ~ Rp 20000");
            System.out.println("3. Helm Bogo Dewasa Retro ~ Rp 130000");
            System.out.print("Masukkan pilihanmu : ");
        int pilih3=input.nextInt();
         System.out.println("____________________________________________________");
            switch(pilih3){
            case 1:
             otomotif a=new otomotif ("Helm cargloss CFM Retro","L",250000);
             a.input();
             a.display();
               break;
             case 2:
             otomotif b =new otomotif("Jas Hujan ASV ORI","XL",20000);
             b.input();
             b.display();
               break;
              case 3:
             otomotif c =new otomotif("Helm Bogo Dewasa Retro","M",130000);
             c.input();
             c.display();
               break;
              }
            break;
                          case 4:
              System.out.println("__________________  Shopee Food  _____________________");
            System.out.println("1. Bakso Aci Pedas Mercon ~ Rp 50000");
            System.out.println("2. Champ Burger Daging Ayam ~ Rp 25000");
            System.out.println("3. Kebab turki ~ Rp 12000");
            System.out.print("Masukkan pilihanmu : ");
             int pilih4=input.nextInt();
             System.out.println("____________________________________________________");
            switch(pilih4){
            case 1:
             ShopeeFood a =new ShopeeFood("Bakso Aci Pedas Mercon","Jumbo",50000);
             a.input();
             a.display();
               break;
             case 2:
             ShopeeFood b =new ShopeeFood("Champ Burger Daging Ayam","medium",25000);
             b.input();
             b.display();
               break;
              case 3:
  ShopeeFood c =new ShopeeFood ("Kebab turki","Jumbo extra",12000);
  c.input();
             c.display();
               break;
              }
        }
       } else {
            System.out.println("login anda salah");
        }
    }   
}