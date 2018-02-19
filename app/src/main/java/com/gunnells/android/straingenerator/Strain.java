package com.gunnells.android.straingenerator;


import android.util.Log;

import java.util.Random;
import java.util.Scanner;

public class Strain {

    Scanner scanner = new Scanner(System.in);

    static int number;




  public static int generator() {
      Random rand = new Random();
      number = rand.nextInt(35)+1;
      return number;
  }

  public static String strainMaker(){
      generator();
      if (number == 1) {
          MainActivity.strain = "RUDE BOY (I)" ;

      }

      if (number == 2) {
          MainActivity.strain = "PURPLE GLUE (I)" ;

      }
      if (number == 3) {
          MainActivity.strain = "GHOST O.G. (I)";

      }
      if (number == 4) {
          MainActivity.strain = "PURPLE ORANGE CRUSH (I)" ;

      }
      if (number == 5) {
          MainActivity.strain = "OH FUCK! (I)" ;

      }
      if (number == 6) {
          MainActivity.strain = " RASKAL BERRIES (I)";

      }
      if (number == 7) {
          MainActivity.strain = "BLUEBERRY BUBBLEGUM (I)";

      }
      if (number == 8) {
          MainActivity.strain = "GOD'S GIFT (I)";

      }
      if (number == 9) {
          MainActivity.strain = "GRANDADDY PURPLE (I)" ;

      }
      if (number == 10) {
          MainActivity.strain = "WIFI 43 (I)";

      }
      if (number == 11) {
          MainActivity.strain = "PURPLE MONSTER KUSH (I)";

      }
      if (number == 12) {
          MainActivity.strain = "P-91(FUCK YEAH!) (I)" ;

      }
      if (number == 13) {
          MainActivity.strain = "GORILLA GRAPES (I)";

      }
      if (number == 14) {
          MainActivity.strain = "MENDOCINO PURPLE (I)";

      }
      if (number == 15) {
          MainActivity.strain = "GRUNK (I)";

      }
      if (number == 16) {
          MainActivity.strain = "DEATH BLOSSOM (I)";

      }
      if (number == 17) {
          MainActivity.strain = " VINO O.G. (I)";

      }
      if (number == 18) {
          MainActivity.strain = "TRUE O.G. (I)";

      }
      if (number == 19) {
          MainActivity.strain = "O.G. CHEM (H)";

      }
      if (number == 20) {
          MainActivity.strain = "PANDA O.G. (H)";

      }
      if (number == 21) {
          MainActivity.strain = "OREGON DIESEL (H)" ;

      }
      if (number == 22) {
          MainActivity.strain = "ORIGINAL GLUE (H)" ;

      }
      if (number == 23) {
          MainActivity.strain = " THIN MINTS (H)";

      }
      if (number == 24) {
          MainActivity.strain = " SPACE QUEEN (H)";

      }
      if (number == 25) {
          MainActivity.strain =" WHITE FIRE (H)" ;

      }
      if (number == 26) {
          MainActivity.strain = "GSC FORUM (H)";

      }
      if (number == 27) {
          MainActivity.strain = "CENEX (S)";

      }
      if (number == 28) {
          MainActivity.strain = "PANDA GLUE (S)";

      }
      if (number == 29) {
          MainActivity.strain = "JACK HERER (S)" ;

      }
      if (number == 30) {
          MainActivity.strain = "DUTCH TREAT (S)" ;

      }
      if (number == 31) {
          MainActivity.strain = "SEATTLE SOUR COUGH (S)";

      }
      if (number == 32) {
          MainActivity.strain = "AJ'S SOUR DIESEL (S)";

      }
      if (number == 33) {
          MainActivity.strain = "HAWAIIN GOLDEN PINEAPPLE (S)";

      }
      if (number == 34) {
          MainActivity.strain = "BLUE DREAM (S)";

      }
      if (number == 35) {
          MainActivity.strain = "RAIN MAKER (S)" ;

      }
      if (number == 36) {
          MainActivity.strain = "GOLDEN PINEAPPLE (S)" ;

      }
      return MainActivity.strain;
  }





}
