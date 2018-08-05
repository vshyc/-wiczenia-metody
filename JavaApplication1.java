
package javaapplication1;

import static java.util.Arrays.equals;

/**
 *
 * @author RENT
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.3366,3.42223);
        // TODO code application logic here
    }
    
    public static boolean bark(boolean barking, int hourOfDay) {
        if (hourOfDay<0 || hourOfDay>23){
            return false;
            }
        if (hourOfDay<8 || hourOfDay>22){
            return true;
        }
        else
            return false;
        
        
    
}
    public static boolean isLeapYear( int year){
      if (year<0 || year> 9999){
          return false;
      }  
      if (year %400 == 0){
          return true;
      }
      else if (year%100==0){
          return false;
      }
      else if (year%4 == 0){
          return true;
          }
      return false;
    }
 //   pi *= 100; // pi = pi * 100;
 //   pi = Math.round(pi);
 //   pi /= 100; // pi = pi / 100;
    
    public static boolean areEqualByThreeDecimalPlaces(double first,double second){
        first *=  100;
        first = (int) first;
        first /= 100;
        second *= 100;
        second = Math.round(second);
        second /= 100;
        System.out.println(first +" "+ second);
        if (first==second){
        return true;
    }
        else
        return false;
    }
    public static double area (double radius){
        double PI = 3.14159;
        if (radius < 0 ){
            return -1.0;
        }
        else
            return (radius*radius*PI);
        }
    public static double area (double x,double y){
        if(x<0 || y<0){
            return -1.0;
        }
        else 
            return (x*y);
    }
    public static void printYearsAndDays (long minutes){
        if (minutes<0){
            System.out.println("Invalid Value");
        }
        long hour = minutes/60;
        long remainingMinutes = minutes%60;
        long days = hour/24;
        long year = days/365;
        long remainingDays = days%365;
        System.out.println(minutes+ " min = "+ year+" y and "+days+" d");
                
    }
    public static void printEqual (int first, int second, int third){
        if (first<0 || second<0 || third<0){
            System.out.println("Invalid Value");
            }
        else if (first==second && first==third){
            System.out.println("All numbers are equal");
        }
        else if (first!=second && first!=third && second!=third){
            System.out.println("All numbers are different");
        }
        else System.out.println("Neither all are equal or different");
    }
    public static boolean isCatPlaying (boolean summer, int temperature){
        if (summer==true && temperature > 25 && temperature <45){
            return true;
        }
        else if (summer==false && temperature > 25 && temperature <35){
            return true;
        }
        else
            return false;
        
    }
    public static void printNumberInWord(int first){
        if (first == 0){
            System.out.println("ZERO");
        }
        else if (first == 0){
            System.out.println("ZERO");
        }else if (first == 1){
            System.out.println("ONE");
        }else if (first == 2){
            System.out.println("TWO");
        }else if (first == 3){
            System.out.println("THREE");
        }else if (first == 4){
            System.out.println("FOUR");
        }else if (first == 5){
            System.out.println("FIVE");
        }else if (first == 6){
            System.out.println("SIX");
        }else if (first == 7){
            System.out.println("SEVEN");
        }else if (first == 8){
            System.out.println("EIGHT");
        }else if (first == 9){
            System.out.println("NINE");
        }else {
            System.out.println("OTHER");
        }
    }
    public static int getDaysInMonth(int month, int year){
        if (month<1 || month >12){
            return -1;
        }
        if (year<1 || month> 9999){
            return-1;
        }
        
       if (isLeapYear(year)){
        switch(month){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                return 31;
                
            case 2:
                return 29;
                
             default:
                 return 30;
        }}else{        
                switch(month){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                return 31;
                
            case 2:
                return 22;
              
             default:
                 return 30;
                
                }
        }

    }
    }
    

