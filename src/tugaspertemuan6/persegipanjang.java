
package tugaspertemuan6;

public class persegipanjang {
        int panjang;
        int lebar;
        
        public persegipanjang(int panjangBaru,int lebarBaru )
        { 
            panjang=panjangBaru;
            lebar=lebarBaru;
        }
        
        int getLuas(){
            return panjang * lebar;
        }
        int getKeliling(){
            return 2 * (panjang + lebar);
        }
        void setpanjang(int panjangBaru){
            panjang=panjangBaru;
        }
        void setlebar(int lebarBaru){
            lebar=lebarBaru;
        }

    }