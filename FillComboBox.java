
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;


public class FillComboBox {
    
        BDconnection objcon = new BDconnection();
        String categoria []; 
    
    public String[] Categorias (){
    
        try{

            PreparedStatement ps = objcon.connect.prepareStatement("Select categoria from categorias");
            ResultSet resultset = ps.executeQuery();
            
            int i = 0;
            while(resultset.next()){
               i+=1; 
            }
            
            categoria = new String [i];  

            while(resultset.next())
            {
                for(int j=0; j<i; j++)
                    categoria [j] = resultset.getString(1);
            }
            
        }catch (SQLException e)
        {
            System.err.println(e);
        }
            return categoria;
    }
    
    public String[] getAllCategorias(){
        objcon.OpenConnection();
        ArrayList<String> strList = new ArrayList<String>();

        try {
        PreparedStatement ps = objcon.connect.prepareStatement("select Categoria from categorias");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
        strList.add(rs.getString(1));

        }
        } catch (Exception e) {
        System.out.println(e);
        }
        String [] x = strList.toArray(new String[0]);
        return x;
    }

    public String[] getAllTipoPag(){
        objcon.OpenConnection();
        ArrayList<String> strList = new ArrayList<String>();

        try {
        PreparedStatement ps = objcon.connect.prepareStatement("select TipoPagamento from tipo_pagamento");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
        strList.add(rs.getString(1));

        }
        } catch (Exception e) {
        System.out.println(e);
        }
        String [] x = strList.toArray(new String[0]);
        return x;
    }    
    
}
