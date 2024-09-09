/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.library_management.gui;

import com.mycompany.library_management.AccessFile;
import com.mycompany.library_management.Book;
import com.mycompany.library_management.Category;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author merrai
 */
public class Dashboard extends javax.swing.JFrame {
    static String bookPath = "./save/books";
    static String categoryPath = "./save/category";
    
    private List<Book> listBook = new ArrayList<>();
    private List<Category> listCategory = new ArrayList<>();
    private int bookSelectIndex = -1;
    
    private DefaultTableModel model;
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        this.model = (DefaultTableModel) bookTable.getModel();
        readCategoryFile();
        bookTableInit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        categoryList = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        addBook = new javax.swing.JButton();
        labelBookDetail = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bookNameTextField = new javax.swing.JTextField();
        bookCategoryLabel = new javax.swing.JLabel();
        bookCategoryList = new javax.swing.JComboBox<>();
        authorLabel = new javax.swing.JLabel();
        bookAuthorTextField = new javax.swing.JTextField();
        bookEditCheckBox = new javax.swing.JCheckBox();
        bookDeleteBtn = new javax.swing.JButton();
        bookSaveBtn = new javax.swing.JButton();
        bookAlertLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        bookStatusList = new javax.swing.JComboBox<>();
        addCategory = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        deleteCategory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library management");
        setMaximumSize(new java.awt.Dimension(615, 500));
        setMinimumSize(new java.awt.Dimension(615, 500));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("Library management");

        searchBar.setForeground(new java.awt.Color(204, 204, 204));
        searchBar.setText("Search by name or id");
        searchBar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchBarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchBarFocusLost(evt);
            }
        });
        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
            }
        });

        categoryList.setPreferredSize(new java.awt.Dimension(100, 24));
        categoryList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                categoryListItemStateChanged(evt);
            }
        });

        bookTable.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Category", "Author", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookTable.setMaximumSize(new java.awt.Dimension(444, 1000000));
        bookTable.setMinimumSize(new java.awt.Dimension(444, 0));
        bookTable.setPreferredSize(new java.awt.Dimension(440, 400));
        bookTable.setRowHeight(30);
        bookTable.setShowGrid(false);
        bookTable.getTableHeader().setReorderingAllowed(false);
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookTable);
        if (bookTable.getColumnModel().getColumnCount() > 0) {
            bookTable.getColumnModel().getColumn(0).setResizable(false);
            bookTable.getColumnModel().getColumn(0).setPreferredWidth(40);
            bookTable.getColumnModel().getColumn(1).setResizable(false);
            bookTable.getColumnModel().getColumn(1).setPreferredWidth(190);
            bookTable.getColumnModel().getColumn(2).setResizable(false);
            bookTable.getColumnModel().getColumn(2).setPreferredWidth(90);
            bookTable.getColumnModel().getColumn(3).setResizable(false);
            bookTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            bookTable.getColumnModel().getColumn(4).setResizable(false);
        }

        addBook.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        addBook.setText("Add Book");
        addBook.setPreferredSize(new java.awt.Dimension(100, 23));
        addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookActionPerformed(evt);
            }
        });

        labelBookDetail.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        labelBookDetail.setText("Book detail");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        bookNameTextField.setEnabled(false);

        bookCategoryLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        bookCategoryLabel.setText("Category");

        bookCategoryList.setEnabled(false);

        authorLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        authorLabel.setText("Author");

        bookAuthorTextField.setEnabled(false);

        bookEditCheckBox.setText("Edit");
        bookEditCheckBox.setEnabled(false);
        bookEditCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bookEditCheckBoxStateChanged(evt);
            }
        });

        bookDeleteBtn.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        bookDeleteBtn.setText("Delete");
        bookDeleteBtn.setEnabled(false);
        bookDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookDeleteBtnActionPerformed(evt);
            }
        });

        bookSaveBtn.setText("Save");
        bookSaveBtn.setEnabled(false);
        bookSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookSaveBtnActionPerformed(evt);
            }
        });

        bookAlertLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        bookAlertLabel.setForeground(new java.awt.Color(255, 51, 51));
        bookAlertLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookAlertLabel.setPreferredSize(new java.awt.Dimension(0, 18));
        bookAlertLabel.setRequestFocusEnabled(false);

        statusLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        statusLabel.setText("Status");

        bookStatusList.setEnabled(false);
        bookStatusList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                bookStatusListItemStateChanged(evt);
            }
        });

        addCategory.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        addCategory.setText("Add Category");
        addCategory.setPreferredSize(new java.awt.Dimension(100, 23));
        addCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCategoryActionPerformed(evt);
            }
        });

        jLabel3.setText("Methi 116530462029-7 | Audomsak 116530462031-3");

        deleteCategory.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        deleteCategory.setText("Del. Category");
        deleteCategory.setPreferredSize(new java.awt.Dimension(100, 23));
        deleteCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(searchBar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoryList, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bookSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bookStatusList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bookNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bookAlertLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(labelBookDetail)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bookEditCheckBox))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(bookCategoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(authorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bookCategoryList, 0, 143, Short.MAX_VALUE)
                                        .addComponent(bookAuthorTextField)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(addBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelBookDetail)
                            .addComponent(bookEditCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bookCategoryLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookCategoryList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(authorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookAuthorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookSaveBtn)
                        .addGap(37, 37, 37)
                        .addComponent(statusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookStatusList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(bookAlertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookDeleteBtn)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchBarFocusGained
        if(searchBar.getText().equals("Search by name or id")){
            searchBar.setText("");
            searchBar.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_searchBarFocusGained

    private void searchBarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchBarFocusLost
        // TODO add your handling code here:
        if(searchBar.getText().isEmpty()){
            searchBar.setText("Search by name or id");
            searchBar.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_searchBarFocusLost

    private void addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookActionPerformed
        new AddBook(listBook, this, this.listCategory).setVisible(true);
    }//GEN-LAST:event_addBookActionPerformed

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        if(this.bookSelectIndex == -1){
            bookStatusList.setEnabled(true);
            bookStatusList.addItem("Available");
            bookStatusList.addItem("Not available");
            bookStatusList.addItem("Borrowed");
        }
        this.bookSelectIndex = bookTable.getSelectedRow();
        bookAlertLabel.setText("");
        bookEditCheckBox.setEnabled(true);
        bookEditCheckBox.setSelected(false);
        bookNameTextField.setText(this.listBook.get(this.bookSelectIndex).getName());
        bookAuthorTextField.setText(this.listBook.get(this.bookSelectIndex).getAuthor());
        bookCategoryList.setSelectedItem(this.listBook.get(this.bookSelectIndex).getCategory());
        bookStatusList.setSelectedItem(this.listBook.get(this.bookSelectIndex).getStatus());
    }//GEN-LAST:event_bookTableMouseClicked

    private void bookEditCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bookEditCheckBoxStateChanged
        if(bookEditCheckBox.isSelected()){
            bookNameTextField.setEnabled(true);
            bookCategoryList.setEnabled(true);
            bookAuthorTextField.setEnabled(true);
            bookDeleteBtn.setEnabled(true);
            bookSaveBtn.setEnabled(true);
        }
        else{
            bookNameTextField.setEnabled(false);
            bookCategoryList.setEnabled(false);
            bookAuthorTextField.setEnabled(false);
            bookDeleteBtn.setEnabled(false);
            bookSaveBtn.setEnabled(false);
        }
    }//GEN-LAST:event_bookEditCheckBoxStateChanged

    private void bookDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookDeleteBtnActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "Are you sure to remove book id "+String.valueOf(listBook.get(this.bookSelectIndex).getId()), "Remove book", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(res == 0){
            listBook.remove(this.bookSelectIndex);
            this.bookTableRerender();
            this.bookWriteFile();
        }
    }//GEN-LAST:event_bookDeleteBtnActionPerformed

    private void bookSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookSaveBtnActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "Are you sure to save book id "+String.valueOf(this.listBook.get(this.bookSelectIndex).getId()), "Save book", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(res == 0){
            if(bookCategoryList.getSelectedIndex() == 0){
                bookAlertLabel.setText("Please select category");
                return;
            }
            if(bookNameTextField.getText().equals("")){
                bookAlertLabel.setText("Please enter book name");
                return;
            }
            if(bookAuthorTextField.getText().equals("")){
                bookAlertLabel.setText("Please enter author");
                return;
            }
            Book temp = this.listBook.get(this.bookSelectIndex);
            temp.setName(bookNameTextField.getText());
            temp.setCategory(String.valueOf(bookCategoryList.getSelectedItem()));
            temp.setAuthor(bookAuthorTextField.getText());
            this.bookTableRerender();
            
            bookAlertLabel.setText("");
            bookEditCheckBox.setSelected(false);
            bookNameTextField.setEnabled(false);
            bookCategoryList.setEnabled(false);
            bookAuthorTextField.setEnabled(false);
            bookDeleteBtn.setEnabled(false);
            bookSaveBtn.setEnabled(false);
            this.bookWriteFile();
        }
    }//GEN-LAST:event_bookSaveBtnActionPerformed

    private void addCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCategoryActionPerformed
        new AddCategory(this, this.listCategory).setVisible(true);
    }//GEN-LAST:event_addCategoryActionPerformed

    private void bookStatusListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_bookStatusListItemStateChanged
        if(this.bookSelectIndex == -1)
            return;
        this.listBook.get(this.bookSelectIndex).setStatus(String.valueOf(bookStatusList.getSelectedItem()));
        this.bookTableRerender();
    }//GEN-LAST:event_bookStatusListItemStateChanged

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased
        String text = searchBar.getText().equals("Search by name or id") ? "" : searchBar.getText().toLowerCase();
        model.setRowCount(0);
        for(Book b : listBook){
            if(b.getName().toLowerCase().startsWith(text) || b.getId().toLowerCase().startsWith(text)){
                if(categoryList.getSelectedIndex() != 0){
                    if(b.getCategory().equals(String.valueOf(categoryList.getSelectedItem())))
                        model.addRow(b.getTableArray());
                }
                else
                    model.addRow(b.getTableArray());
            }
        }
    }//GEN-LAST:event_searchBarKeyReleased

    private void categoryListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoryListItemStateChanged
        model.setRowCount(0);
        if(categoryList.getSelectedIndex() == 0){
            this.bookTableRerender();
            return;
        }
        String sb = searchBar.getText().equals("Search by name or id") ? "" : searchBar.getText().toLowerCase();
        for(Book b : listBook){
            if(b.getCategory().equals(String.valueOf(categoryList.getSelectedItem()))){
                if(b.getName().toLowerCase().startsWith(sb))
                    model.addRow(b.getTableArray());
            }
        }
    }//GEN-LAST:event_categoryListItemStateChanged

    private void deleteCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCategoryActionPerformed
        new deleteCategory(this, this.listCategory).setVisible(true);
    }//GEN-LAST:event_deleteCategoryActionPerformed
    
    private void readCategoryFile(){
        String[] categoryText = AccessFile.readFileByLine(categoryPath);
        for(String t : categoryText)
            listCategory.add(new Category(t));
        this.categoryRerender();
    }
    
    private void bookTableInit(){
        String[] bookText = AccessFile.readFileByLine(bookPath);
        for(String bt : bookText)
            listBook.add(new Book(bt));
        this.bookTableRerender();
    }
    
    protected void bookTableRerender(){
        model.setRowCount(0);
        for(Book b : this.listBook)
            model.addRow(b.getTableArray());
    }
    protected void bookTableRenderOne(Book b){
        model.addRow(b.getTableArray());
    }
    
    protected void categoryRerender(){
        categoryList.removeAllItems();
        bookCategoryList.removeAllItems();
        for(Category c : listCategory){
            categoryList.addItem(c.getName());
            if(c.getName().equals("-- Category --"))
                categoryList.addItem("none");
            bookCategoryList.addItem(c.getName());
        }
    }
    protected void categoryRenderOne(Category c){
        categoryList.addItem(c.getName());
        bookCategoryList.addItem(c.getName());
    }
    
    private void bookWriteFile(){
        String fileText = "";
        for(Book b : listBook){
            fileText += b.getTextFile()+"\n";
        }
        AccessFile.writeFile(fileText, bookPath);
    }
    
    protected void setFrameEnable(boolean f){
        this.setEnabled(f);
    }
    
    protected void bookListRenameDelCategory(String cat){
        for(Book b : this.listBook){
            if(b.getCategory().equals(cat)){
                b.setCategory("none");
            }
        }
        this.bookTableRerender();
        this.bookWriteFile();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBook;
    private javax.swing.JButton addCategory;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JLabel bookAlertLabel;
    private javax.swing.JTextField bookAuthorTextField;
    private javax.swing.JLabel bookCategoryLabel;
    private javax.swing.JComboBox<String> bookCategoryList;
    private javax.swing.JButton bookDeleteBtn;
    private javax.swing.JCheckBox bookEditCheckBox;
    private javax.swing.JTextField bookNameTextField;
    private javax.swing.JButton bookSaveBtn;
    private javax.swing.JComboBox<String> bookStatusList;
    private javax.swing.JTable bookTable;
    private javax.swing.JComboBox<String> categoryList;
    private javax.swing.JButton deleteCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBookDetail;
    private javax.swing.JTextField searchBar;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}
