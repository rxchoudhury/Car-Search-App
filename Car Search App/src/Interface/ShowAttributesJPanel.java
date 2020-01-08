/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rakesh
 */
public class ShowAttributesJPanel extends javax.swing.JPanel {
    
    private JPanel showAttributesJPanel;
    private List<Car> carList;

    /**
     * Creates new form ShowDetailsJPanel
     */

    ShowAttributesJPanel(JPanel searchJPanel, List<Car> carList) {
       initComponents();
       this.carList = carList;
       this.showAttributesJPanel = searchJPanel;
       
       populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableManageCar = new javax.swing.JTable();
        txtModelNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbCityBox = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        cmbValidityBox = new javax.swing.JComboBox<String>();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        tableManageCar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Year", "Model No", "Brand", "Available City", "Valid License", "Serial No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableManageCar);

        jLabel1.setText("Model Number:");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel2.setText("City Name:");

        cmbCityBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Boston", "New York", "Chicago", "Austin", "Seattle" }));
        cmbCityBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCityBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("License Validity:");

        cmbValidityBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Both", "Expired", "Available" }));
        cmbValidityBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbValidityBoxActionPerformed(evt);
            }
        });

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Search By Attributes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbValidityBox, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbCityBox, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(84, 84, 84)
                                .addComponent(btnSearch)))))
                .addContainerGap(312, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbCityBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbValidityBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnBack))
                .addContainerGap(287, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String modalSearch = "";
        String comboTextValue = "";
        modalSearch = txtModelNumber.getText();
            if(modalSearch==null || modalSearch.equals("")){
                 JOptionPane.showMessageDialog(null, "Model Number cannot be empty");
                 return;
            }
        List<Car> searchCarList = new ArrayList<Car>();
        for(Car car:carList){
            if(!modalSearch.equals("")){
            if(modalSearch.equals(car.getModel_num())){
                searchCarList.add(car);
            }}else{
                 searchCarList.add(car);
            }
           }
        DefaultTableModel dtm = (DefaultTableModel)tableManageCar.getModel();
        dtm.setRowCount(0);
        for(Car car : searchCarList){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=car.getManufactured_year();
            row[1]=car.getModel_num();
            row[2]=car.getBrand();
            row[3]=car.getAvailble_city();
            if(car.isMaintenance_certificate()){
            row[4]="Available";
            }else{
            row[4]="Expired";   
            }
            row[5]=car.getSerial_num();
            dtm.addRow(row);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cmbCityBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCityBoxActionPerformed
        String comboTextValue = "";
        comboTextValue = cmbCityBox.getItemAt(cmbCityBox.getSelectedIndex());
        List<Car> searchCarList = new ArrayList<Car>();
        for(Car car:carList){
            if(!comboTextValue.equals("All")){
            if(car.getAvailble_city().equals(comboTextValue)){
                searchCarList.add(car);
            }}else{
                searchCarList.add(car);
            }
        }
        DefaultTableModel dtm = (DefaultTableModel)tableManageCar.getModel();
        dtm.setRowCount(0);
        for(Car car : searchCarList){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=car.getManufactured_year();
            row[1]=car.getModel_num();
            row[2]=car.getBrand();
            row[3]=car.getAvailble_city();
            if(car.isMaintenance_certificate()){
            row[4]="Available";
            }else{
            row[4]="Expired";   
            }
            row[5]=car.getSerial_num();
            dtm.addRow(row);
        }
    }//GEN-LAST:event_cmbCityBoxActionPerformed

    private void cmbValidityBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbValidityBoxActionPerformed
        List<Car> searchCarList = new ArrayList<Car>();
        String validityCheck = "";
        String validFlag = "";
        validityCheck = cmbValidityBox.getItemAt(cmbValidityBox.getSelectedIndex());
        if(validityCheck.equals("Expired")){
            validFlag = "false";
        }else if(validityCheck.equals("Available")){
            validFlag = "true";
        }else{
            validFlag = "both";
        } 
        for(Car car:carList){
            switch(validFlag){
                case "true":
                    if(car.isMaintenance_certificate()){
                        searchCarList.add(car);
                    }
                    break;
                case "false":
                    if(!car.isMaintenance_certificate()){
                        searchCarList.add(car);
                    }
                    break;
                default:
                    searchCarList.add(car);
                    break;
            }    
        }
        DefaultTableModel dtm = (DefaultTableModel)tableManageCar.getModel();
        dtm.setRowCount(0);
        for(Car car : searchCarList){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=car.getManufactured_year();
            row[1]=car.getModel_num();
            row[2]=car.getBrand();
            row[3]=car.getAvailble_city();
            if(car.isMaintenance_certificate()){
            row[4]="Available";
            }else{
            row[4]="Expired";   
            }
            row[5]=car.getSerial_num();
            dtm.addRow(row);
        }
    }//GEN-LAST:event_cmbValidityBoxActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        showAttributesJPanel.remove(this);
        CardLayout layout = (CardLayout) showAttributesJPanel.getLayout();
        layout.previous(showAttributesJPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbCityBox;
    private javax.swing.JComboBox<String> cmbValidityBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableManageCar;
    private javax.swing.JTextField txtModelNumber;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
    DefaultTableModel dtm = (DefaultTableModel)tableManageCar.getModel();
         dtm.setRowCount(0);
        
        for(Car car : carList){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=car.getManufactured_year();
            row[1]=car.getModel_num();
            row[2]=car.getBrand();
            row[3]=car.getAvailble_city();
            if(car.isMaintenance_certificate()){
            row[4]="Available";
            }else{
            row[4]="Expired";   
            }
            row[5]=car.getSerial_num();
            
            dtm.addRow(row);
        }  
    
    }
}
