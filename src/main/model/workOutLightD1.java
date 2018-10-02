package main.model;


 public class workOutLightD1 implements workOutD1 {
     int restCompound = 240;
     int restAccessories = 120;
     int sets = 8;

     @Override
     public void squats() {
         System.out.println("You will be doing squats! ");
         chrono squatRest = new chrono(restCompound);

     }

     @Override
     public void reverseCurls() {
         System.out.println("You will be doing Reverse Curls! ");
         chrono reverseCurlsRest = new chrono(restAccessories);

     }

     @Override
     public void benchPress() {
         System.out.println("You will be doing Bench Press!");
         chrono benchPressRest = new chrono(restCompound);

     }

     @Override
     public void doubleLegKneeExtensions() {
         System.out.println("You will be doing double leg knee extentions!");
         chrono doubleLegKneeExtentionsRest = new chrono(restAccessories);

     }
 }



