package com.dhanashri;

public class CustomException extends Throwable {
   private String invalidField;
   private int invalidValue;

   public CustomException(String invalidField, int invalidValue) {
      this.invalidField = invalidField;
      this.invalidValue = invalidValue;

   }

   public void displayError() {
      System.out.println(" Invalid Field = " + invalidField);
      System.out.println("InvalidValue = " + invalidValue);
   }

}
