
package RestaurantIS;
import java.awt.Component;
import java.awt.TextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class Restaurant_IS extends javax.swing.JFrame {

    double[] items = new double[8];
    public Restaurant_IS() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RestoPanel = new javax.swing.JPanel();
        RestoLabel = new javax.swing.JLabel();
        MealsPanel = new javax.swing.JPanel();
        MealLabel = new javax.swing.JLabel();
        LMeal4 = new javax.swing.JLabel();
        LMeal1 = new javax.swing.JLabel();
        LMeal2 = new javax.swing.JLabel();
        LMeal3 = new javax.swing.JLabel();
        FMeal4 = new javax.swing.JTextField();
        FMeal1 = new javax.swing.JTextField();
        FMeal2 = new javax.swing.JTextField();
        FMeal3 = new javax.swing.JTextField();
        TotalPanel = new javax.swing.JPanel();
        STotalField = new javax.swing.JTextField();
        DrinksField = new javax.swing.JTextField();
        CTotalField = new javax.swing.JTextField();
        TaxField = new javax.swing.JTextField();
        STotalLabel = new javax.swing.JLabel();
        CDrinksLabel = new javax.swing.JLabel();
        TCostLabel = new javax.swing.JLabel();
        TaxLabel = new javax.swing.JLabel();
        CMealLabel = new javax.swing.JLabel();
        MealField = new javax.swing.JTextField();
        TotalLabel = new javax.swing.JLabel();
        TotalField = new javax.swing.JTextField();
        DrinksPanel = new javax.swing.JPanel();
        DrinksLabel = new javax.swing.JLabel();
        LDrinks1 = new javax.swing.JLabel();
        LDrinks2 = new javax.swing.JLabel();
        LDrinks3 = new javax.swing.JLabel();
        LDrinks4 = new javax.swing.JLabel();
        FDrinks1 = new javax.swing.JTextField();
        FDrinks2 = new javax.swing.JTextField();
        FDrinks3 = new javax.swing.JTextField();
        FDrinks4 = new javax.swing.JTextField();
        TotalButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RestoPanel.setBackground(new java.awt.Color(204, 204, 204));
        RestoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 7));
        RestoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RestoLabel.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        RestoLabel.setForeground(new java.awt.Color(102, 102, 102));
        RestoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RestoLabel.setText("RESTAURANT MANAGEMENT SYSTEM");
        RestoPanel.add(RestoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 20, 880, -1));

        getContentPane().add(RestoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 880, 90));

        MealsPanel.setBackground(new java.awt.Color(204, 204, 204));
        MealsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        MealsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MealLabel.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        MealLabel.setForeground(new java.awt.Color(102, 102, 102));
        MealLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MealLabel.setText("MEALS");
        MealsPanel.add(MealLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));

        LMeal4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LMeal4.setForeground(new java.awt.Color(0, 0, 0));
        LMeal4.setText("Chicken Alfredo");
        MealsPanel.add(LMeal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 220, 40));

        LMeal1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LMeal1.setForeground(new java.awt.Color(0, 0, 0));
        LMeal1.setText("Cognac Shrimp");
        MealsPanel.add(LMeal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, 40));

        LMeal2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LMeal2.setForeground(new java.awt.Color(0, 0, 0));
        LMeal2.setText("Beef Tapa");
        MealsPanel.add(LMeal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 220, 40));

        LMeal3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LMeal3.setForeground(new java.awt.Color(0, 0, 0));
        LMeal3.setText("Pork Steak");
        MealsPanel.add(LMeal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 220, 40));

        FMeal4.setBackground(new java.awt.Color(255, 255, 255));
        FMeal4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        FMeal4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MealsPanel.add(FMeal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 150, 50));

        FMeal1.setBackground(new java.awt.Color(255, 255, 255));
        FMeal1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        FMeal1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MealsPanel.add(FMeal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 150, 50));

        FMeal2.setBackground(new java.awt.Color(255, 255, 255));
        FMeal2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        FMeal2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MealsPanel.add(FMeal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 150, 50));

        FMeal3.setBackground(new java.awt.Color(255, 255, 255));
        FMeal3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        FMeal3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MealsPanel.add(FMeal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 150, 50));

        getContentPane().add(MealsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 450, 290));

        TotalPanel.setBackground(new java.awt.Color(204, 204, 204));
        TotalPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        TotalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        STotalField.setBackground(new java.awt.Color(255, 255, 255));
        STotalField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        STotalField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TotalPanel.add(STotalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 160, 50));

        DrinksField.setBackground(new java.awt.Color(255, 255, 255));
        DrinksField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DrinksField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TotalPanel.add(DrinksField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 160, 50));

        CTotalField.setBackground(new java.awt.Color(255, 255, 255));
        CTotalField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CTotalField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TotalPanel.add(CTotalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 160, 50));

        TaxField.setBackground(new java.awt.Color(255, 255, 255));
        TaxField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TaxField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TotalPanel.add(TaxField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 160, 50));

        STotalLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        STotalLabel.setForeground(new java.awt.Color(0, 0, 0));
        STotalLabel.setText("Sub Total:");
        TotalPanel.add(STotalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 220, 40));

        CDrinksLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CDrinksLabel.setForeground(new java.awt.Color(0, 0, 0));
        CDrinksLabel.setText("Cost of Drinks:");
        TotalPanel.add(CDrinksLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 220, 40));

        TCostLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TCostLabel.setForeground(new java.awt.Color(0, 0, 0));
        TCostLabel.setText("Total Cost:");
        TotalPanel.add(TCostLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 220, 40));

        TaxLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TaxLabel.setForeground(new java.awt.Color(0, 0, 0));
        TaxLabel.setText("Tax:");
        TotalPanel.add(TaxLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 220, 40));

        CMealLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CMealLabel.setForeground(new java.awt.Color(0, 0, 0));
        CMealLabel.setText("Cost of Meal:");
        TotalPanel.add(CMealLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 220, 40));

        MealField.setBackground(new java.awt.Color(255, 255, 255));
        MealField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MealField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TotalPanel.add(MealField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 160, 50));

        TotalLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TotalLabel.setForeground(new java.awt.Color(0, 0, 0));
        TotalLabel.setText("Total:");
        TotalPanel.add(TotalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 220, 40));

        TotalField.setBackground(new java.awt.Color(255, 255, 255));
        TotalField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TotalField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TotalPanel.add(TotalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 160, 50));

        getContentPane().add(TotalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 420, 400));

        DrinksPanel.setBackground(new java.awt.Color(204, 204, 204));
        DrinksPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        DrinksPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DrinksLabel.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        DrinksLabel.setForeground(new java.awt.Color(102, 102, 102));
        DrinksLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DrinksLabel.setText("DRINKS");
        DrinksPanel.add(DrinksLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));

        LDrinks1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LDrinks1.setForeground(new java.awt.Color(0, 0, 0));
        LDrinks1.setText("Mango Shake");
        DrinksPanel.add(LDrinks1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, 40));

        LDrinks2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LDrinks2.setForeground(new java.awt.Color(0, 0, 0));
        LDrinks2.setText("Milktea");
        DrinksPanel.add(LDrinks2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 220, 40));

        LDrinks3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LDrinks3.setForeground(new java.awt.Color(0, 0, 0));
        LDrinks3.setText("Coffee Jelly");
        DrinksPanel.add(LDrinks3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 220, 40));

        LDrinks4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LDrinks4.setForeground(new java.awt.Color(0, 0, 0));
        LDrinks4.setText("Coke Float");
        DrinksPanel.add(LDrinks4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 220, 40));

        FDrinks1.setBackground(new java.awt.Color(255, 255, 255));
        FDrinks1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        FDrinks1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DrinksPanel.add(FDrinks1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 150, 50));

        FDrinks2.setBackground(new java.awt.Color(255, 255, 255));
        FDrinks2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        FDrinks2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DrinksPanel.add(FDrinks2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 150, 50));

        FDrinks3.setBackground(new java.awt.Color(255, 255, 255));
        FDrinks3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        FDrinks3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DrinksPanel.add(FDrinks3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 150, 50));

        FDrinks4.setBackground(new java.awt.Color(255, 255, 255));
        FDrinks4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        FDrinks4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DrinksPanel.add(FDrinks4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 150, 50));

        getContentPane().add(DrinksPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 450, 280));

        TotalButton.setText("TOTAL");
        TotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalButtonActionPerformed(evt);
            }
        });
        getContentPane().add(TotalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 600, 110, 50));

        ClearButton.setText("CLEAR");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 110, 50));

        ExitButton.setText("EXIT");
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonMouseClicked(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 600, 110, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        if(JOptionPane.showConfirmDialog(null, "Are you user you want to close this application?", "Confirmation", JOptionPane.YES_OPTION)==0) {
            Restaurant_IS.this.dispose();
        }
        else {
            Restaurant_IS.this.show();
        }	
    }//GEN-LAST:event_ExitButtonMouseClicked

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        JTextField clearTxt = null;
        //Meals
        for (Component c:MealsPanel.getComponents()) {
            if (c.getClass().toString().contains("javax.swing.JTextField")) {
                clearTxt = (JTextField)c;
                clearTxt.setText("");
            }
        }
        //Drinks
        for (Component c:DrinksPanel.getComponents()) {
            if (c.getClass().toString().contains("javax.swing.JTextField")) {
                clearTxt = (JTextField)c;
                clearTxt.setText("");
            }
        }
        for (Component c:TotalPanel.getComponents()) {
            if (c.getClass().toString().contains("javax.swing.JTextField")) {
                clearTxt = (JTextField)c;
                clearTxt.setText("");
            }
        }
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void TotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalButtonActionPerformed
        ChildClass itemCost = new ChildClass();
        double iTax, iSubTotal, iTotal;
        
       itemCost.CognacShrimp = itemCost.pCognacShrimp * Double.parseDouble(FMeal1.getText());
        itemCost.BeefTapa = itemCost.pBeefTapa * Double.parseDouble(FMeal2.getText());
        itemCost.PorkSteak = itemCost.pPorkSteak * Double.parseDouble(FMeal3.getText());
        itemCost.ChickenAlfredo = itemCost.pChickenAlfredo * Double.parseDouble(FMeal4.getText());
        
        itemCost.MangoShake = itemCost.pMangoShake * Double.parseDouble(FDrinks1.getText());
        itemCost.Milktea = itemCost.pMilktea * Double.parseDouble(FDrinks2.getText());
        itemCost.CoffeeJelly = itemCost.pCoffeeJelly * Double.parseDouble(FDrinks3.getText());
        itemCost.CokeFloat = itemCost.pCokeFloat * Double.parseDouble(FDrinks4.getText());
        
        
        
       iSubTotal = itemCost.GetAmount();
        iTax = itemCost.findTax(iSubTotal);
        iTotal = iSubTotal + iTax;
        
        String SubTotal = String.format("₱ ",iSubTotal);
        STotalField.setText(SubTotal);       
        String Tax = String.format("₱ ", iTax);
        TaxField.setText(Tax);       
        String Total = String.format("₱ ", iTotal);
        TotalField.setText(Total);
        
        String Meal = String.format("₱ ", itemCost.Meals);
        MealField.setText(Meal);
        String Drink = String.format("₱ ", itemCost.Drinks);
        DrinksField.setText(Drink);
        String TotalCost = String.format("₱ ", itemCost.TotalMD);
        CTotalField.setText(TotalCost);
    }//GEN-LAST:event_TotalButtonActionPerformed

    
    public static void main(String args[]) { //throws ClassNotFoundException, IllegalAccessException, InstantiationException, UnsupportedLookAndFeelException {
       
        //UIManager.setLookAndFeel("com.jTattoo.plat.aluminum.AluminumLookandFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restaurant_IS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CDrinksLabel;
    private javax.swing.JLabel CMealLabel;
    private javax.swing.JTextField CTotalField;
    private javax.swing.JButton ClearButton;
    private javax.swing.JTextField DrinksField;
    private javax.swing.JLabel DrinksLabel;
    private javax.swing.JPanel DrinksPanel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField FDrinks1;
    private javax.swing.JTextField FDrinks2;
    private javax.swing.JTextField FDrinks3;
    private javax.swing.JTextField FDrinks4;
    private javax.swing.JTextField FMeal1;
    private javax.swing.JTextField FMeal2;
    private javax.swing.JTextField FMeal3;
    private javax.swing.JTextField FMeal4;
    private javax.swing.JLabel LDrinks1;
    private javax.swing.JLabel LDrinks2;
    private javax.swing.JLabel LDrinks3;
    private javax.swing.JLabel LDrinks4;
    private javax.swing.JLabel LMeal1;
    private javax.swing.JLabel LMeal2;
    private javax.swing.JLabel LMeal3;
    private javax.swing.JLabel LMeal4;
    private javax.swing.JTextField MealField;
    private javax.swing.JLabel MealLabel;
    private javax.swing.JPanel MealsPanel;
    private javax.swing.JLabel RestoLabel;
    private javax.swing.JPanel RestoPanel;
    private javax.swing.JTextField STotalField;
    private javax.swing.JLabel STotalLabel;
    private javax.swing.JLabel TCostLabel;
    private javax.swing.JTextField TaxField;
    private javax.swing.JLabel TaxLabel;
    private javax.swing.JButton TotalButton;
    private javax.swing.JTextField TotalField;
    private javax.swing.JLabel TotalLabel;
    private javax.swing.JPanel TotalPanel;
    // End of variables declaration//GEN-END:variables
}
