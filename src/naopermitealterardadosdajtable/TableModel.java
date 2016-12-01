/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package naopermitealterardadosdajtable;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vitor Oliveira
 */
public class TableModel extends DefaultTableModel {

    public TableModel(){
    }
    
    public TableModel(String... cols) {
        super(cols, 0);
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        //return col != 0;
        return false;
    }
}
