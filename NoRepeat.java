
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class NoRepeat {
    
    public String nome, categoria, entidades, tipopagamento;
    
    public boolean verifyRepetedUseres(){
        
        BDconnection bdconnection = new BDconnection();
        boolean status = false;
        
        try{
            bdconnection.OpenConnection();
            PreparedStatement ps = bdconnection.connect.prepareStatement("Select nome from user Where nome =?");
            ps.setString(1, nome);
            
            ResultSet resultset = ps.executeQuery();
            status = resultset.next();

            }
        catch (Exception e){System.err.println(e);status = false;}
        return status;
   
    }
    
    public boolean verifyRepetedCategorias(){
        
        BDconnection bdconnection = new BDconnection();
        boolean status = false;
        
        try{
            bdconnection.OpenConnection();
            PreparedStatement ps = bdconnection.connect.prepareStatement("Select Categoria from categorias Where Categoria =?");
            ps.setString(1, categoria);
            
            ResultSet resultset = ps.executeQuery();
            status = resultset.next();

            }
        catch (Exception e){System.err.println(e);status = false;}
        return status;
   
    }
    
    public boolean verifyRepetedEntidades(){
        
        BDconnection bdconnection = new BDconnection();
        boolean status = false;
        
        try{
            bdconnection.OpenConnection();
            PreparedStatement ps = bdconnection.connect.prepareStatement("Select Entidade from entidades Where Entidade =?");
            ps.setString(1, entidades);
            
            ResultSet resultset = ps.executeQuery();
            status = resultset.next();

            }
        catch (Exception e){System.err.println(e);status = false;}
        return status;
   
    }

    public boolean verifyRepetedTipoPagamento(){
        
        BDconnection bdconnection = new BDconnection();
        boolean status = false;
        
        try{
            bdconnection.OpenConnection();
            PreparedStatement ps = bdconnection.connect.prepareStatement("Select TipoPagamento from tipo_pagamento Where TipoPagamento =?");
            ps.setString(1, tipopagamento);
            
            ResultSet resultset = ps.executeQuery();
            status = resultset.next();

            }
        catch (Exception e){System.err.println(e);status = false;}
        return status;
   
    }

    
}
