
package RestaurantIS;

//import javax.swing.JFrame;


public class ParentClass {
    
    //Meals
    double CognacShrimp;
    double BeefTapa;
    double PorkSteak;
    double ChickenAlfredo;
    
    //Drinks
    double MangoShake;
    double Milktea;
    double CoffeeJelly;
    double CokeFloat;
    
    double Meals;
    double Drinks;
    double TotalMD;
    double wTax;
    
    public double GetAmount() {
        Meals = CognacShrimp + BeefTapa + PorkSteak + ChickenAlfredo;
        Drinks = MangoShake + Milktea + CoffeeJelly + CokeFloat;
        
        TotalMD = Meals + Drinks;
                
        wTax = TotalMD;
        return wTax;
    }
    
    //TAX
    public double TaxRate = 0.03;
    public Double findTax(double cAmount){
        double FindT = cAmount - (cAmount * TaxRate);
        return FindT;
    }
   
    //PRICES
     //Meals
    double pCognacShrimp = 350;
    double pBeefTapa = 570;
    double pPorkSteak = 550;
    double pChickenAlfredo = 460;
    
    //Drinks
    double pMangoShake = 80;
    double pMilktea = 70;
    double pCoffeeJelly = 40;
    double pCokeFloat = 55;

    
    
    
}
