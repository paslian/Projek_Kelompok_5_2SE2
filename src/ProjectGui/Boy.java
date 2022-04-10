/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectGui;

/**
 *
 * @author hp
 */
public class Boy extends IdealYoung{


void hasilinfo(){
        if (getUmur()== 1) {
            this.info = "7,7 - 12 Kg";
        }else if (getUmur() == 2){
            this.info = "9,7 - 15,3 Kg";
        }else if (getUmur() == 3){
            this.info = "11,3 - 18,3 Kg";
        }else if (getUmur() == 4){
            this.info = "12,7 - 21,2 Kg";
        }else if (getUmur() == 5){
            this.info = "14,1 - 24,2 Kg";
        }else if (getUmur() == 6){
            this.info = "21 Kg dan 116Cm";
        }else if (getUmur() == 7){
            this.info = "23 Kg dan 122 Cm";
        }else if (getUmur() == 8){
            this.info = "26 Kg dan 128 Cm";
        }else if (getUmur() == 9){
            this.info = "29 Kg dan 134 Cm";
        }else if (getUmur() == 10){
            this.info = "32 Kg dan 139 Cm";
        }else if (getUmur() == 11){
            this.info = "36 Kg dan 144 Cm";
        }else if (getUmur() == 12){
            this.info = "41 Kg dan 149 Cm";
        }else if (getUmur() > 12){
            this.info = "Silahkan pilih menu 13 Tahun Keatas ";
}
}
}
