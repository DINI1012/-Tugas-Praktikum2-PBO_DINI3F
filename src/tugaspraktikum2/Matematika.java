package tugaspraktikum2;
public class Matematika implements OprasiMatematika{
    int a, b;
    int pertambahan = 0;
    int pengurangan = 0;
    int perkalian = 0;
    int pembagian = 0;
    
    public void pertambahan(int a,int b){
        pertambahan = a+b;
        System.out.println("Pertambahan :"+a+"+"+b+"="+pertambahan);
    }
    public void pengurangan(int a, int b){
        pengurangan = a-b;
        System.out.println("Pengurangan : "+a+"-"+b+"="+pengurangan);
    }
    public void perkalian(int a){
        perkalian = a*b;
        System.out.println("Perkalian : "+a+"*"+b+"="+perkalian);
    }
    public void pembagian(int a, int b){
        pembagian = a/b;
        System.out.println("Pembagian : "+a+"/"+b+"="+pembagian);
    }

    @Override
    public void perkalian(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
// disini saya menggunakan @Override dimana @override ini memastikan bahwa metode tersebut benar-benar menggantikan metode kelas dasar atau metode antarmuka

 

