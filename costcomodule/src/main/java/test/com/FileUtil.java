/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

/**
 *
 * @author ShraddhaGanesh
 */
public class FileUtil {
   
    
    LoginPage login;
    
    private void loadFile()
    {try
    {
        FileReader fr = new FileReader("c:\\data\\loginpass.csv");
        BufferedReader br = new BufferedReader(fr);
        //username
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line, ",");
        st.nextToken();
        String username = (String)st.nextToken();
        
        //password
        line = br.readLine();
        st = new StringTokenizer(line, ",");
        st.nextToken();
        String password = (String)st.nextToken();
    
        //populate value
    login = new LoginPage();
    login.setLogin(username);
    login.setPassword(password);
    
    
    } catch (Exception e){
     e.printStackTrace(System.out);
    }
    }
    
    public FileUtil() {
    loadFile();
    }

    

    
    public String getLogin()
    {
    return login.getLogin();
    }
    
    public String getPassword()
    {
    return login.getPassword();
    }
    
}
    
    
    
