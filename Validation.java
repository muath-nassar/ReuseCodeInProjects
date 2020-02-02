/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author moadn
 */
abstract public class Validation {
  public  static boolean length(String text, int max){
      return text.length()<= max;
  }
  public  static  boolean length(String text,int min, int max){
      if(max>=min){
         if(text.length() >= min || text.length()<= max){
          return true;
      }  
      }
      return false;
  }
  public static boolean email(String email){
     String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      return email.matches(regex);
  }
  public static boolean hasNumber(String text){
     
       String regex = "(?=.*[0-9]).{1,}";
      return text.matches(regex);
  }
  public static boolean hasSpecialChar(String text){
       //"(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
       String regex = "(?=.*[@#$%^&+=]).{1,}";
      return text.matches(regex);
  }
    public static boolean hasUpperCase(String text){
   
       String regex = "(?=.*[A-Z]).{1,}";
      return text.matches(regex);
  }
    
        public static boolean hasLowerCase(String text){
    
       String regex = "(?=.*[a-z]).{1,}";
      return text.matches(regex);
  }

 
    public static boolean hasNoWhiteSpace(String text){
     
       String regex = "(?=\\S+$).{1,}";
      return text.matches(regex);
  }
    public static boolean passwordStrengthCheck(String password){
         String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}";
      return password.matches(regex);
    }
    
    public static boolean allUpperCAse(String text){
        return text.equalsIgnoreCase(text.toUpperCase());
    }
    
     public static boolean allLowerCAse(String text){
        return text.equalsIgnoreCase(text.toLowerCase());
    }
}
