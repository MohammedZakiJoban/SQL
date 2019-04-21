/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtabase_system;

/**
 *
 * @author mzj10
 */
public class TableData {
    
    private String username;
    private String password;
    public TableData(String name,String pass){
        
        
        username = name;
        password= pass;
        
    }
    
    public void setUsername(String name){
        username = name;
    }
    public void setPassword(String pass){
        password = pass;
    }
    public String getUsername(){
        
        return username;
    }
    public String getPassword(){
        
        return password;
    }
    
    
}
