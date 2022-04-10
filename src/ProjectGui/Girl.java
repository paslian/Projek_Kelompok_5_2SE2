/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectGui;

/**
 *
 * @author hp
 */
public class Girl extends IdealYoung{
    void hasilinfo(){
        if (getUmur() == 1) {
            this.info = "7 - 11,5 Kg";
        }else if (getUmur() == 2){
            this.info = "9 - 14,8 Kg";
        }else if (getUmur() == 3){
            this.info = "10,8 - 18,1 Kg";
        }else if (getUmur() == 4){
            this.info = "12,3 - 21,5 Kg";
        }else if (getUmur() == 5){
            this.info = "13,7 - 24,9 Kg";
        }else if (getUmur() == 6){
            this.info = "20 Kg dan 115Cm";
        }else if (getUmur() == 7){
            this.info = "23 Kg dan 122 Cm";
        }else if (getUmur() == 8){
            this.info = "26 Kg dan 128 Cm";
        }else if (getUmur() == 9){
            this.info = "29 Kg dan 133 Cm";
        }else if (getUmur() == 10){
            this.info = "33 Kg dan 138 Cm";
        }else if (getUmur() == 11){
            this.info = "37 Kg dan 144 Cm";
        }else if (getUmur() == 12){
            this.info = "42 Kg dan 152 Cm";
        }else if (getUmur() > 12){
            this.info = "Silahkan pilih menu 13 Tahun Keatas ";
}
}
}
