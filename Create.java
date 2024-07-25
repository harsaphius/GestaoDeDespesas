
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class Create {
    
    public String nome, password;

    public String data, descricao, morada,dataadd,nporta,concelho,nfatura,codigo,entidade,codentidade,contacto,categoria,tipopagamento;
    public int nif, categoriaId, useradd_id, tipopagamentoId;
    public float valor;
    public boolean estadodesp, pago,estado,estadocat;
    
    
       BDconnection bdconnection = new BDconnection();
       
       
    public boolean CreateNewUser(){
        
       try{
            bdconnection.OpenConnection();
            PreparedStatement ps = bdconnection.connect.prepareStatement("Insert into user (nome, password) Values (?,?)");
            ps.setString(1,nome);
            ps.setString(2,password);
       
            int i = ps.executeUpdate();

            if(i>0){
                JOptionPane.showMessageDialog(null, "Utilizador registado com sucesso.");
                 return true;
            }else{ 
                JOptionPane.showMessageDialog(null, "Erro no registo do Utilizador!");
                return false;
            }
       
        }catch (HeadlessException | SQLException e){System.err.println(e);return false;}
              

    }
    
    public boolean CreateLogin(){
        boolean status = false;
       
       try{
            BDconnection bdconnection = new BDconnection();
            bdconnection.OpenConnection();
            PreparedStatement ps = bdconnection.connect.prepareStatement("Select nome, password from user where nome = ? and password = ?");
            ps.setString(1,nome);
            ps.setString(2,password);
            
            ResultSet resultset = ps.executeQuery();
            status = resultset.next();
            

        }
        catch (Exception e)
        {
            System.err.println(e);
        }
      
        return status;
    
    }
    
    
    
    public boolean CreateNewDespesa(){
        
       try{
            bdconnection.OpenConnection();
            PreparedStatement ps = bdconnection.connect.prepareStatement("Insert into despesas (Data, NIF, Valor, Descricao, Morada, CategoriaId, UserAdd_id, DataAdd, EstadoDesp, Pago, NPorta, Concelho, NFatura, TipoPagamentoId, Codigo) Values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,data);
            ps.setInt(2,nif);
            ps.setFloat(3,valor);
            ps.setString(4,descricao);
            ps.setString(5,morada);
            ps.setInt(6,categoriaId);
            ps.setInt(7,useradd_id);
            ps.setString(8,dataadd);
            ps.setBoolean(9,estadodesp);
            ps.setBoolean(10,pago);
            ps.setString(11,nporta);            
            ps.setString(12,concelho);
            ps.setString(13,nfatura);
            ps.setInt(14,tipopagamentoId);
            ps.setString(15,codigo);

            int i = ps.executeUpdate();

            if(i>0){
                JOptionPane.showMessageDialog(null, "Despesa registada com sucesso.");
                 return true;
            }else{ 
                JOptionPane.showMessageDialog(null, "Erro no registo da Despesa!");
                return false;
            }
       
        }catch (HeadlessException | SQLException e){System.err.println(e);return false;}
              

    }
    
    public boolean CreateNewEntidade(){
        
       try{
            bdconnection.OpenConnection();
            PreparedStatement ps = bdconnection.connect.prepareStatement("Insert into entidades (NIF, Entidade, CodEntidade, Contacto, Estado) Values (?,?,?,?,?)");
            ps.setInt(1,nif);
            ps.setString(2,entidade);
            ps.setString(3,codentidade);
            ps.setString(4,contacto);
            ps.setBoolean(5,estado);


            int i = ps.executeUpdate();

            if(i>0){
                JOptionPane.showMessageDialog(null, "Entidade registada com sucesso.");
                 return true;
            }else{ 
                JOptionPane.showMessageDialog(null, "Erro no registo da Entidade!");
                return false;
            }
       
        }catch (HeadlessException | SQLException e){System.err.println(e);return false;}
  
    }
    
    public boolean CreateNewCategoria(){
        
       try{
            bdconnection.OpenConnection();
            PreparedStatement ps = bdconnection.connect.prepareStatement("Insert into categorias (EstadoCat, Categoria) Values (?,?)");
            ps.setBoolean(1,estadocat);
            ps.setString(2,categoria);


            int i = ps.executeUpdate();

            if(i>0){
                JOptionPane.showMessageDialog(null, "Categoria registada com sucesso.");
                 return true;
            }else{ 
                JOptionPane.showMessageDialog(null, "Erro no registo da Categoria!");
                return false;
            }
       
        }catch (HeadlessException | SQLException e){System.err.println(e);return false;}

    }

    public boolean CreateNewPagamentos(){
        
       try{
            bdconnection.OpenConnection();
            PreparedStatement ps = bdconnection.connect.prepareStatement("Insert into pagamentos (Codigo, Descricao, Estado) Values (?,?,?)");
            ps.setString(1,codigo);
            ps.setString(2,descricao);
            ps.setBoolean(3,estado);


            int i = ps.executeUpdate();

            if(i>0){
                JOptionPane.showMessageDialog(null, "Código do tipo de pagamento registado com sucesso.");
                 return true;
            }else{ 
                JOptionPane.showMessageDialog(null, "Erro no registo do Código do tipo de pagamento!");
                return false;
            }
       
        }catch (HeadlessException | SQLException e){System.err.println(e);return false;}

    }    

    public boolean CreateNewTipoPagamento(){
        
       try{
            bdconnection.OpenConnection();
            PreparedStatement ps = bdconnection.connect.prepareStatement("Insert into tipo_pagamento (TipoPagamento, Estado) Values (?,?)");
            ps.setString(1,tipopagamento);
            ps.setBoolean(2,estado);


            int i = ps.executeUpdate();

            if(i>0){
                JOptionPane.showMessageDialog(null, "Tipo de Pagamento registado com sucesso.");
                 return true;
            }else{ 
                JOptionPane.showMessageDialog(null, "Erro no registo do Tipo de Pagamento!");
                return false;
            }
       
        }catch (HeadlessException | SQLException e){System.err.println(e);return false;}

    }

    public int getTipoPagamentoId(String tp){
        
        int tpId=0; 
        String tpselected = "'"+tp+"'";
      
         try{
            bdconnection.OpenConnection();
            PreparedStatement ps = bdconnection.connect.prepareStatement("SELECT id FROM tipo_pagamento where TipoPagamento =" + tpselected + "");
            ResultSet resultset = ps.executeQuery();
            resultset.next();
            
            tpId = resultset.getInt("ID");
            
        }catch (SQLException e)
        {
            System.err.println(e);
        }return tpId;
    }

    public int getCategoriaId(String Cat){
        
        int CatId=0; 
        String Catselected = "'"+Cat+"'";
      
         try{
            bdconnection.OpenConnection();
            PreparedStatement ps = bdconnection.connect.prepareStatement("SELECT id FROM categorias where Categoria =" + Catselected + "");
            ResultSet resultset = ps.executeQuery();
            resultset.next();
            
            CatId = resultset.getInt("ID");
            
        }catch (SQLException e)
        {
            System.err.println(e);
        }return CatId;
    }
    
    
    public boolean UpdateCategoria(int CatId, String cat, boolean status){
        
       try{
            bdconnection.OpenConnection();
            PreparedStatement ps = bdconnection.connect.prepareStatement("Update categorias Set Categoria = ?, EstadoCat = ? where ID ="+CatId+"");
            ps.setString(1,cat);
            ps.setBoolean(2,status);


            int i = ps.executeUpdate();

            if(i>0){
                JOptionPane.showMessageDialog(null, "Categoria actualizada com sucesso.");
                 return true;
            }else{ 
                JOptionPane.showMessageDialog(null, "Erro na actualização da categoria!");
                return false;
            }
       
        }catch (HeadlessException | SQLException e){System.err.println(e);return false;}

    }
    
    
    
}