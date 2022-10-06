/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.User;
import javax.swing.*;

/**
 *
 * @author nirajanp
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    User user;
    JFrame frame;
    JLabel displayField;
    ImageIcon image;
    
    public ViewJPanel(User user) {
        this.user = user;
        initComponents();
        displayDetails();
        displayImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFirstNameLabel = new javax.swing.JLabel();
        jTxtFName = new javax.swing.JTextField();
        jLastNameLabel = new javax.swing.JLabel();
        jTxtLName = new javax.swing.JTextField();
        jDobLabel = new javax.swing.JLabel();
        jTxtDob = new javax.swing.JTextField();
        jAgeLabel = new javax.swing.JLabel();
        jTxtAge = new javax.swing.JTextField();
        jTelNumLabel = new javax.swing.JLabel();
        jTxtTelNum = new javax.swing.JTextField();
        jEmailLabel = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jStreetLine1Label = new javax.swing.JLabel();
        jTxtStreetLine1 = new javax.swing.JTextField();
        jStreetLine2Label = new javax.swing.JLabel();
        jTxtStreetLine2 = new javax.swing.JTextField();
        jCityLabel = new javax.swing.JLabel();
        jTxtCity = new javax.swing.JTextField();
        jCountryLabel = new javax.swing.JLabel();
        jTxtCountry = new javax.swing.JTextField();
        jAffiliationLabel = new javax.swing.JLabel();
        jTxtAffiliation = new javax.swing.JTextField();
        jMajorLabel = new javax.swing.JLabel();
        jTxtMajor = new javax.swing.JTextField();
        jCareerLabel = new javax.swing.JLabel();
        jTxtCareer = new javax.swing.JTextField();
        jDegree1Label = new javax.swing.JLabel();
        jTxtDegree1 = new javax.swing.JTextField();
        jDegree1StartLabel = new javax.swing.JLabel();
        jTxtDegree1Start = new javax.swing.JTextField();
        jDegree1EndLabel = new javax.swing.JLabel();
        jTxtDegree1End = new javax.swing.JTextField();
        jDegree2Label = new javax.swing.JLabel();
        jTxtDegreeTwo = new javax.swing.JTextField();
        jDegree2StartLabel = new javax.swing.JLabel();
        jTxtDegree2Start = new javax.swing.JTextField();
        jDegree2EndLabel = new javax.swing.JLabel();
        jTxtDegree2End = new javax.swing.JTextField();
        jLabelCreateUser = new javax.swing.JLabel();

        jFirstNameLabel.setText("First Name");

        jLastNameLabel.setText("Last Name");

        jDobLabel.setText("DOB");

        jAgeLabel.setText("Age");

        jTelNumLabel.setText("Telephone Number");

        jEmailLabel.setText("Email");

        jStreetLine1Label.setText("Street Line 1");

        jStreetLine2Label.setText("Street Line 2");

        jCityLabel.setText("City");

        jCountryLabel.setText("Country");

        jAffiliationLabel.setText("Affiliation");

        jMajorLabel.setText("Major");

        jCareerLabel.setText("Career");

        jDegree1Label.setText("Degree 1");

        jTxtDegree1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDegree1ActionPerformed(evt);
            }
        });

        jDegree1StartLabel.setText("Degree 1 Start");

        jDegree1EndLabel.setText("Degree 1 End");

        jDegree2Label.setText("Degree 2");

        jDegree2StartLabel.setText("Degree 2 Start");

        jDegree2EndLabel.setText("Degree 2 End");

        jLabelCreateUser.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabelCreateUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCreateUser.setText("View User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLastNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDobLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jAgeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTelNumLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFirstNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jEmailLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jStreetLine1Label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jStreetLine2Label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCityLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCountryLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jAffiliationLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jMajorLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCareerLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDegree1Label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDegree1StartLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDegree1EndLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDegree2Label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDegree2StartLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDegree2EndLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTxtLName, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jTxtFName)
                    .addComponent(jTxtDob)
                    .addComponent(jTxtAge)
                    .addComponent(jTxtTelNum, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTxtEmail)
                    .addComponent(jTxtStreetLine1)
                    .addComponent(jTxtStreetLine2)
                    .addComponent(jTxtCity)
                    .addComponent(jTxtCountry)
                    .addComponent(jTxtAffiliation)
                    .addComponent(jTxtMajor)
                    .addComponent(jTxtCareer)
                    .addComponent(jTxtDegree1)
                    .addComponent(jTxtDegree1Start)
                    .addComponent(jTxtDegree1End)
                    .addComponent(jTxtDegreeTwo)
                    .addComponent(jTxtDegree2Start)
                    .addComponent(jTxtDegree2End))
                .addContainerGap(380, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCreateUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFirstNameLabel)
                    .addComponent(jTxtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLastNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDobLabel)
                    .addComponent(jTxtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAgeLabel)
                    .addComponent(jTxtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTelNumLabel)
                    .addComponent(jTxtTelNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmailLabel)
                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jStreetLine1Label)
                    .addComponent(jTxtStreetLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jStreetLine2Label)
                    .addComponent(jTxtStreetLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCityLabel)
                    .addComponent(jTxtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCountryLabel)
                    .addComponent(jTxtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAffiliationLabel)
                    .addComponent(jTxtAffiliation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMajorLabel)
                    .addComponent(jTxtMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCareerLabel)
                    .addComponent(jTxtCareer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDegree1Label)
                    .addComponent(jTxtDegree1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDegree1StartLabel)
                    .addComponent(jTxtDegree1Start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDegree1EndLabel)
                    .addComponent(jTxtDegree1End, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDegree2Label)
                    .addComponent(jTxtDegreeTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDegree2StartLabel)
                    .addComponent(jTxtDegree2Start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDegree2EndLabel)
                    .addComponent(jTxtDegree2End, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public void displayDetails() {
        jTxtFName.setText(user.getFirstName());
        jTxtLName.setText(user.getLastName());
        jTxtDob.setText(user.getDateOfBirth());
        jTxtAge.setText(user.getAge());
        jTxtTelNum.setText(user.getTelNumber());
        jTxtEmail.setText(user.getEmail());
        jTxtStreetLine1.setText(user.getStreetLineOne());
        jTxtStreetLine2.setText(user.getStreetLineTwo());
        jTxtCity.setText(user.getCity());
        jTxtCountry.setText(user.getCountry());
        jTxtAffiliation.setText(user.getAffiliation());
        jTxtMajor.setText(user.getMajor());
        jTxtCareer.setText(user.getCareer());
        jTxtDegree1.setText(user.getDegreeOne());
        jTxtDegree1Start.setText(user.getDegreeStart());
        jTxtDegree1End.setText(user.getDegreeEnd());
        jTxtDegreeTwo.setText(user.getDegreeTwo());
        jTxtDegree2Start.setText(user.getDegreeTwoStart());
        jTxtDegree2End.setText(user.getDegreeTwoEnd());
        
    }
    
    public void displayImage(){
        frame = new JFrame("User Image");
        
        try {
            image = new ImageIcon(getClass().getResource("1647441883606.jpeg"));
            displayField = new JLabel(image);
            frame.add(displayField);
        } catch (Exception ex) {
            System.out.println("Image not found!");
        }
        
        frame.pack();
        frame.setVisible(true);
    }
    private void jTxtDegree1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDegree1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDegree1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAffiliationLabel;
    private javax.swing.JLabel jAgeLabel;
    private javax.swing.JLabel jCareerLabel;
    private javax.swing.JLabel jCityLabel;
    private javax.swing.JLabel jCountryLabel;
    private javax.swing.JLabel jDegree1EndLabel;
    private javax.swing.JLabel jDegree1Label;
    private javax.swing.JLabel jDegree1StartLabel;
    private javax.swing.JLabel jDegree2EndLabel;
    private javax.swing.JLabel jDegree2Label;
    private javax.swing.JLabel jDegree2StartLabel;
    private javax.swing.JLabel jDobLabel;
    private javax.swing.JLabel jEmailLabel;
    private javax.swing.JLabel jFirstNameLabel;
    private javax.swing.JLabel jLabelCreateUser;
    private javax.swing.JLabel jLastNameLabel;
    private javax.swing.JLabel jMajorLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jStreetLine1Label;
    private javax.swing.JLabel jStreetLine2Label;
    private javax.swing.JLabel jTelNumLabel;
    private javax.swing.JTextField jTxtAffiliation;
    private javax.swing.JTextField jTxtAge;
    private javax.swing.JTextField jTxtCareer;
    private javax.swing.JTextField jTxtCity;
    private javax.swing.JTextField jTxtCountry;
    private javax.swing.JTextField jTxtDegree1;
    private javax.swing.JTextField jTxtDegree1End;
    private javax.swing.JTextField jTxtDegree1Start;
    private javax.swing.JTextField jTxtDegree2End;
    private javax.swing.JTextField jTxtDegree2Start;
    private javax.swing.JTextField jTxtDegreeTwo;
    private javax.swing.JTextField jTxtDob;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtFName;
    private javax.swing.JTextField jTxtLName;
    private javax.swing.JTextField jTxtMajor;
    private javax.swing.JTextField jTxtStreetLine1;
    private javax.swing.JTextField jTxtStreetLine2;
    private javax.swing.JTextField jTxtTelNum;
    // End of variables declaration//GEN-END:variables
}